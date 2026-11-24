package a;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class jfx {
    public static final y50 b = new y50((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f16451a;

    public jfx(byte[] bArr) throws GeneralSecurityException {
        if (!brm0.b(2)) {
            hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        twt0.a(bArr.length);
        this.f16451a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = utt0.f36272a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
