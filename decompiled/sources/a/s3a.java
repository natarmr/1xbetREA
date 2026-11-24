package a;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class s3a extends q3a {
    public static final s3a b = new s3a();

    @Override // a.q3a
    public final void a(nzw nzwVar, ucs0 ucs0Var) {
        super.a(nzwVar, ucs0Var);
        wy40 wy40VarL = wy40.l();
        if (((ImageCapturePixelHDRPlusQuirk) mhk.a().b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
            u15 u15Var = nzw.b;
            if (nzwVar.f(u15Var)) {
                int iIntValue = ((Integer) nzwVar.d(u15Var)).intValue();
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    key.getClass();
                    wy40VarL.y(s5x0.C(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    key2.getClass();
                    wy40VarL.y(s5x0.C(key2), Boolean.FALSE);
                }
            }
        }
        ucs0Var.g(new hx9(b780.j(wy40VarL), (byte) 20));
    }
}
