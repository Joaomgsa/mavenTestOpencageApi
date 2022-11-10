package org.example;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;

public class Main {
    public static void main(String[] args) {

        JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("4c8caa5760254a358c83cd5efe01daf5");

        JOpenCageForwardRequest request = new JOpenCageForwardRequest("22 Rua luis lemos caldas, Campo Grande, Rio de Janeiro, Brazil");


        JOpenCageResponse response = jOpenCageGeocoder.forward(request);
        JOpenCageLatLng firstResultLatLng = response.getFirstPosition();

        System.out.println(firstResultLatLng.getLat().toString() + "," + firstResultLatLng.getLng().toString());
    }
}