package com.cdc.apihub.pe.calificaentel.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cdc.apihub.pe.calificaentel.client.ApiClient;
import com.cdc.apihub.pe.calificaentel.client.ApiException;
import com.cdc.apihub.pe.calificaentel.model.Peticion;
import com.cdc.apihub.pe.calificaentel.model.Respuesta;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;



public class EntelRuc20ApiTest {
	
    private final EntelRuc20Api api = new EntelRuc20Api();
    
    private String keystoreFile = "/Users/globatos/Documents/LLAVES_APIGEE/qa/keystore.jks";
	private String cdcCertFile = "/Users/globatos/Documents/LLAVES_APIGEE/qa/cdc_cert.pem";
	private String keystorePassword = "p@stgres";
	private String keyAlias = "cdc";
	private String keyPassword = "p@stgres";
    
	
	
	@Before()
    public void setUp() {
    	
    	ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("the_url");
		
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
		apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void entelRuc20Test() throws ApiException {
    	
       
        String xApiKey = "your_api_key";
        String username = "your_username";
        String password = "your_password";
        
        Peticion request = new Peticion();
        request.setFolio("XX");
        request.setTipoDocumento("XX");
        request.setNumeroDocumento("XX");
        request.setIdUsuario("XX");
        request.setIdTipoOperacion("XX");
        
        Respuesta response = api.entelRuc20( xApiKey, username, password, request);
        Assert.assertTrue(response !=null);
    }
    
}
