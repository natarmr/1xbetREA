package a;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
public final class a03 {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KeyStore f6a;

    public a03() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f6a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            itt0.o(e);
            throw null;
        }
    }

    public static boolean a(String str) {
        a03 a03Var = new a03();
        synchronized (b) {
            try {
                if (a03Var.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = twt0.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized r60 c(String str) {
        r60 r60Var;
        r60Var = new r60(twt0.b(str), this.f6a);
        byte[] bArrA = g1e0.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, r60Var.b(r60Var.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return r60Var;
    }

    public final synchronized boolean d(String str) {
        String strB;
        strB = twt0.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("a03", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f6a = keyStore;
                keyStore.load(null);
                return this.f6a.containsAlias(strB);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.f6a.containsAlias(strB);
    }
}
