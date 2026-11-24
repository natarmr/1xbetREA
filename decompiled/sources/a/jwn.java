package a;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f17259a = true;

    public static SecureRandom a() {
        SecureRandom instanceStrong;
        try {
            instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        } catch (NoSuchAlgorithmException unused) {
            afn0.j("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                afn0.j("EncryptUtil", "NoSuchAlgorithmException");
                return instanceStrong;
            } catch (Throwable th) {
                if (f17259a) {
                    afn0.j("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                    f17259a = false;
                }
                return instanceStrong;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        instanceStrong.nextBytes(bArr);
        return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
    }

    public static byte[] b(int i) {
        SecureRandom secureRandomA = a();
        if (secureRandomA == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[i];
            secureRandomA.nextBytes(bArr);
            return bArr;
        } catch (NullPointerException e) {
            afn0.j("EncryptUtil", "secureRandom nextBytes error is : " + e.getMessage());
            return new byte[0];
        }
    }

    public static String c(int i) {
        return obc.M(b(i));
    }
}
