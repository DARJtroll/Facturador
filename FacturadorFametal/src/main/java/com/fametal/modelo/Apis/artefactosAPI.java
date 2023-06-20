
package com.fametal.modelo.Apis;

import com.fametal.modelo.ClienteRuc;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Arian
 */
public class artefactosAPI {
    
    public ClienteRuc consultar(String RUC) throws MalformedURLException, IOException{
        URL url = new URL("https://dniruc.apisperu.com/api/v1/ruc/"+RUC+"?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImZhbWV0YWxlc3RydWN0dXJhc0BnbWFpbC5jb20ifQ.LpWUHCpOi6djwvDf_KFPpr1xTSHA0I8O1nQ-pX-lrXI");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        
        int responseCode = conn.getResponseCode();
        
        if(responseCode != 200){
            JOptionPane.showMessageDialog(null,"Error Ruc no valido","Error: "+responseCode , JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Error, Codigo: " + responseCode);
        }else{
            StringBuilder informacionResponse = new StringBuilder();
            Scanner scan = new Scanner(url.openStream());
            while(scan.hasNext()){
                informacionResponse.append(scan.nextLine());
            }
            scan.close();
            Gson interprete = new Gson();
            Map <?,?> datosRuc = interprete.fromJson(informacionResponse.toString(), Map.class);
            String ruc = datosRuc.get("ruc").toString();
            String razonSocial = datosRuc.get("razonSocial").toString();
            String direccion = datosRuc.get("direccion").toString();
            String estado = datosRuc.get("estado").toString();
            String departamento = datosRuc.get("departamento").toString();
            String provincia = datosRuc.get("provincia").toString();
            String distrito = datosRuc.get("distrito").toString();
            String ubiego = datosRuc.get("ubigeo").toString();
            var telefono = datosRuc.get("telefonos");

            return new ClienteRuc(ruc, razonSocial,direccion,estado,departamento, provincia, distrito,ubiego);
        }
    }
}
