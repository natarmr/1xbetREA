package a;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: loaded from: classes.dex */
public final class ww2 implements qmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureFailure f39866a;
    public final int b;
    public final boolean c;

    public ww2(gnf0 gnf0Var, CaptureFailure captureFailure) {
        gnf0Var.getClass();
        captureFailure.getClass();
        this.f39866a = captureFailure;
        captureFailure.getFrameNumber();
        this.b = captureFailure.getReason();
        this.c = captureFailure.wasImageCaptured();
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(CaptureFailure.class))) {
            return this.f39866a;
        }
        return null;
    }

    @Override // a.qmf0
    public final int L() {
        return this.b;
    }

    @Override // a.qmf0
    public final boolean k() {
        return this.c;
    }
}
