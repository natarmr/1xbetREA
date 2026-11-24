package a;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class o03 implements kft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f24402a;
    public final Surface b;

    public o03(OutputConfiguration outputConfiguration) {
        this.f24402a = outputConfiguration;
        this.b = outputConfiguration.getSurface();
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(OutputConfiguration.class))) {
            return this.f24402a;
        }
        return null;
    }

    public final void a(Surface surface) {
        surface.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            c99.v(ua80.e(i, "addSurface is not supported on API ", " (requires API 26)"));
        } else if (i >= 26) {
            this.f24402a.addSurface(surface);
        }
    }

    public final String toString() {
        return this.f24402a.toString();
    }
}
