package a;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i4x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f14165a = new Object();

    public static g4x0 a(String str) throws GeneralSecurityException {
        g4x0 g4x0Var;
        try {
            synchronized (f14165a) {
                try {
                    g4x0Var = new g4x0(cem0.w(str));
                    byte[] bArrA = s7x0.a(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrA, g4x0Var.b(g4x0Var.c(bArrA, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g4x0Var;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static boolean b(String str) {
        synchronized (f14165a) {
            try {
                String strW = cem0.w(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strW)) {
                        return false;
                    }
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strW, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    return true;
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
