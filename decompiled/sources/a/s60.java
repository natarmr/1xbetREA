package a;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f31679a = new ConcurrentHashMap();

    public static SecretKey a(String str, Boolean bool) throws k70 {
        afn0.k("GCMKS", "load key");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            if (!bool.booleanValue()) {
                return null;
            }
            afn0.k("GCMKS", "generate key");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            return keyGenerator.generateKey();
        } catch (IOException e) {
            afn0.j("GCMKS", "IOException : " + e.getMessage());
            throw new k70("IOException : " + e.getMessage());
        } catch (InvalidAlgorithmParameterException e2) {
            afn0.j("GCMKS", "InvalidAlgorithmParameterException : " + e2.getMessage());
            throw new k70("InvalidAlgorithmParameterException : " + e2.getMessage());
        } catch (KeyStoreException e3) {
            afn0.j("GCMKS", "KeyStoreException : " + e3.getMessage());
            throw new k70("KeyStoreException : " + e3.getMessage());
        } catch (NoSuchAlgorithmException e4) {
            afn0.j("GCMKS", "NoSuchAlgorithmException : " + e4.getMessage());
            throw new k70("NoSuchAlgorithmException : " + e4.getMessage());
        } catch (NoSuchProviderException e5) {
            afn0.j("GCMKS", "NoSuchProviderException : " + e5.getMessage());
            throw new k70("NoSuchProviderException : " + e5.getMessage());
        } catch (UnrecoverableKeyException e6) {
            afn0.j("GCMKS", "UnrecoverableKeyException : " + e6.getMessage());
            throw new k70("UnrecoverableKeyException : " + e6.getMessage());
        } catch (CertificateException e7) {
            afn0.j("GCMKS", "CertificateException : " + e7.getMessage());
            throw new k70("CertificateException : " + e7.getMessage());
        } catch (Exception e8) {
            afn0.j("GCMKS", "Exception: " + e8.getMessage());
            throw new k70("Exception : " + e8.getMessage());
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr) throws k70 {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e) {
            afn0.j("GCMKS", "InvalidAlgorithmParameterException : " + e.getMessage());
            throw new k70("InvalidAlgorithmParameterException : " + e.getMessage());
        } catch (InvalidKeyException e2) {
            afn0.j("GCMKS", "InvalidKeyException : " + e2.getMessage());
            throw new k70("InvalidKeyException : " + e2.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            afn0.j("GCMKS", "NoSuchAlgorithmException : " + e3.getMessage());
            throw new k70("NoSuchAlgorithmException : " + e3.getMessage());
        } catch (BadPaddingException e4) {
            afn0.j("GCMKS", "BadPaddingException : " + e4.getMessage());
            throw new k70("BadPaddingException : " + e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            afn0.j("GCMKS", "IllegalBlockSizeException : " + e5.getMessage());
            throw new k70("IllegalBlockSizeException : " + e5.getMessage());
        } catch (NoSuchPaddingException e6) {
            afn0.j("GCMKS", "NoSuchPaddingException : " + e6.getMessage());
            throw new k70("NoSuchPaddingException : " + e6.getMessage());
        } catch (Exception e7) {
            afn0.j("GCMKS", "Exception: " + e7.getMessage());
            throw new k70("Exception: " + e7.getMessage());
        }
    }

    public static SecretKey c(String str, Boolean bool) throws k70 {
        if (TextUtils.isEmpty(str)) {
            throw new k70("alias is null");
        }
        ConcurrentHashMap concurrentHashMap = f31679a;
        if (((SecretKey) concurrentHashMap.get(str)) == null) {
            synchronized (s60.class) {
                try {
                    if (((SecretKey) concurrentHashMap.get(str)) == null) {
                        SecretKey secretKeyA = a(str, bool);
                        if (secretKeyA == null) {
                            throw new k70("AES GCM is decrypt,but alias is null");
                        }
                        concurrentHashMap.put(str, secretKeyA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (SecretKey) concurrentHashMap.get(str);
    }

    public static byte[] d(SecretKey secretKey, byte[] bArr) throws k70 {
        byte[] bArr2 = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            afn0.j("GCMKS", "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e) {
            afn0.j("GCMKS", "InvalidKeyException : " + e.getMessage());
            throw new k70("InvalidKeyException : " + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            afn0.j("GCMKS", "NoSuchAlgorithmException : " + e2.getMessage());
            throw new k70("NoSuchAlgorithmException : " + e2.getMessage());
        } catch (BadPaddingException e3) {
            afn0.j("GCMKS", "BadPaddingException : " + e3.getMessage());
            throw new k70("BadPaddingException : " + e3.getMessage());
        } catch (IllegalBlockSizeException e4) {
            afn0.j("GCMKS", "IllegalBlockSizeException : " + e4.getMessage());
            throw new k70("IllegalBlockSizeException : " + e4.getMessage());
        } catch (NoSuchPaddingException e5) {
            afn0.j("GCMKS", "NoSuchPaddingException : " + e5.getMessage());
            throw new k70("NoSuchPaddingException : " + e5.getMessage());
        } catch (Exception e6) {
            afn0.j("GCMKS", "Exception: " + e6.getMessage());
            throw new k70("Exception : " + e6.getMessage());
        }
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            afn0.j("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(f(str, obc.R(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            afn0.j("GCMKS", "decrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static byte[] f(String str, byte[] bArr) {
        SecretKey secretKeyC;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str)) {
            afn0.j("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        if (bArr.length <= 12) {
            afn0.j("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
        try {
            secretKeyC = c(str, Boolean.FALSE);
        } catch (k70 e) {
            afn0.j("GCMKS", "e : " + e.getMessage());
            secretKeyC = null;
        }
        if (secretKeyC == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[0];
        if (bArr.length <= 12) {
            afn0.j("GCMKS", "Decrypt source data is invalid.");
            return bArr3;
        }
        try {
            return b(secretKeyC, bArr);
        } catch (k70 e2) {
            afn0.j("GCMKS", "e : " + e2.getMessage());
            return bArr3;
        }
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            afn0.j("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return obc.M(h(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            afn0.j("GCMKS", "encrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static byte[] h(String str, byte[] bArr) {
        SecretKey secretKeyC;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            afn0.j("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        try {
            secretKeyC = c(str, Boolean.TRUE);
        } catch (k70 e) {
            afn0.j("GCMKS", "e : " + e.getMessage());
            secretKeyC = null;
        }
        if (secretKeyC == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[0];
        try {
            return d(secretKeyC, bArr);
        } catch (k70 e2) {
            afn0.j("GCMKS", "e : " + e2.getMessage());
            return bArr3;
        }
    }
}
