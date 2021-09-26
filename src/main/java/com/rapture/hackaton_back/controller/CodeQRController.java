package com.rapture.hackaton_back.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.WriterException;
import com.rapture.hackaton_back.util.GenerateQR;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/generateQR")
public class CodeQRController {
	
	@GetMapping("")
	public @ResponseBody byte[] getFullImage(@PathVariable Long brandId, @PathVariable Long productId) throws MalformedURLException, IOException, WriterException {
	    String url = "http://localhost:3000/consumerForm/"+productId+"/"+brandId;
		BufferedImage image = GenerateQR.crearQR(url, 300, 300);
	    ByteArrayOutputStream os = new ByteArrayOutputStream();
	    ImageIO.write(image, "jpg", os);
	    return os.toByteArray();
	}

}
