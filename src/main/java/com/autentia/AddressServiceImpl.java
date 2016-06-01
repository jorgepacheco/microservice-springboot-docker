package com.autentia;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by jorgepacheco on 30/5/16.
 */
@Service
public class AddressServiceImpl implements AddressService {

    public String getServerAddress() throws Exception {

        final String serverAddress = InetAddress.getLocalHost().getHostAddress();

        return serverAddress;

    }

}
