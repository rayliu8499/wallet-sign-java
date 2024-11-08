package xyz.dapplink.server;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.dapplink.server.algorithm.*;
import xyz.dapplink.server.algorithm.dto.KeyPairDto;

@SpringBootTest
public class WalletSignServerTest {

    private static final Logger log = LoggerFactory.getLogger(WalletSignServerTest.class);


    @Autowired
    private EcDSAStrategy ecDSAStrategy;

    @Autowired
    private EdDSAStrategy edDSAStrategy;

//    @Autowired
//    private RSAStrategy rsaStrategy;
//
//    @Autowired
//    private BLSStrategy blsStrategy;
//
//    @Autowired
//    private SchnorStrategy schnorStrategy;

    @Test
    public void testEcDSAStrategy() throws Exception {
        KeyPairDto pair = ecDSAStrategy.generateKeygen();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>EcDSA pair: {}", pair);
    }

    @Test
    public void testEdDSAStrategy() throws Exception {
        KeyPairDto pair = edDSAStrategy.generateKeygen();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>EdDSA pair:{}", pair);
    }

//    @Test
//    public void testRSAStrategy() throws Exception {
//        KeyPairDto pair = rsaStrategy.generateKeygen();
//        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>RSA pair:{}", pair);
//    }
//
//    @Test
//    public void testBLSStrategy() throws Exception {
//        KeyPairDto pair = blsStrategy.generateKeygen();
//        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>BLS pair:{}", pair);
//    }
//
//    @Test
//    public void testSchnorStrategy() throws Exception {
//        KeyPairDto pair = schnorStrategy.generateKeygen();
//        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>Schnor pair:{}", pair);
//    }


}
