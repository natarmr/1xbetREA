package a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public abstract class geq {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, feq feqVar) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, feqVar, null);
    }

    public static FingerprintManager b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean c(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static FingerprintManager.CryptoObject e(cu cuVar) {
        if (cuVar == null) {
            return null;
        }
        Mac mac = (Mac) cuVar.d;
        Signature signature = (Signature) cuVar.b;
        Cipher cipher = (Cipher) cuVar.c;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}
