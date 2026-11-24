package a;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class s4w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final akh0 f31628a;
    public final vby b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final KeyStore d;

    public s4w0(akh0 akh0Var, vby vbyVar) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.f31628a = akh0Var;
        this.b = vbyVar;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.d = keyStore;
    }

    public final SecretKey a() throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = this.d;
        if (!keyStore.containsAlias("ec_master_key_v1")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("ec_master_key_v1", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
            keyGenParameterSpecBuild.getClass();
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("ec_master_key_v1", null);
        if (key != null) {
            return (SecretKey) key;
        }
        jf4.n("Failed to retrieve Master Key");
        return null;
    }

    public final KeyPair b(String str) {
        PrivateKey privateKeyGeneratePrivate;
        ConcurrentHashMap concurrentHashMap = this.c;
        KeyPair keyPair = (KeyPair) concurrentHashMap.get(str);
        if (keyPair != null) {
            return keyPair;
        }
        String string = ((SharedPreferences) this.f31628a.c.getValue()).getString(kng0.k("USER_KEYS_PAIR_KEY_", str), "");
        String str2 = string != null ? string : "";
        KeyPair keyPair2 = null;
        if (str2.length() == 0) {
            return null;
        }
        try {
            vby vbyVar = this.b;
            n8w0.Companion.getClass();
            n8w0 n8w0Var = (n8w0) vbyVar.b(e8w0.f7394a, str2);
            String str3 = n8w0Var.f23110a;
            String str4 = n8w0Var.d;
            byte[] bArrDecode = Base64.decode(str3, 2);
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode));
            String str5 = n8w0Var.c;
            if (str5 == null || str4 == null) {
                String str6 = n8w0Var.b;
                if (str6 == null) {
                    throw new IllegalStateException("No valid private key found in storage");
                }
                privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str6, 2)));
            } else {
                byte[] bArrDecode2 = Base64.decode(str5, 2);
                byte[] bArrDecode3 = Base64.decode(str4, 2);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, a(), new GCMParameterSpec(128, bArrDecode3));
                privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(cipher.doFinal(bArrDecode2)));
            }
            keyPair2 = new KeyPair(publicKeyGeneratePublic, privateKeyGeneratePrivate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (keyPair2 != null) {
            concurrentHashMap.put(str, keyPair2);
        }
        return keyPair2;
    }
}
