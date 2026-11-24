package a;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes.dex */
public final class rlo implements seu0, d1a, x8a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public seu0 f30707a;
    public d1a b;
    public seu0 c;
    public d1a d;

    @Override // a.d1a
    public final void a(long j, float[] fArr) {
        d1a d1aVar = this.d;
        if (d1aVar != null) {
            d1aVar.a(j, fArr);
        }
        d1a d1aVar2 = this.b;
        if (d1aVar2 != null) {
            d1aVar2.a(j, fArr);
        }
    }

    @Override // a.d1a
    public final void b() {
        d1a d1aVar = this.d;
        if (d1aVar != null) {
            d1aVar.b();
        }
        d1a d1aVar2 = this.b;
        if (d1aVar2 != null) {
            d1aVar2.b();
        }
    }

    @Override // a.x8a0
    public final void c(int i, Object obj) {
        if (i == 7) {
            this.f30707a = (seu0) obj;
            return;
        }
        if (i == 8) {
            this.b = (d1a) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        qxk0 qxk0Var = (qxk0) obj;
        if (qxk0Var == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = qxk0Var.getVideoFrameMetadataListener();
            this.d = qxk0Var.getCameraMotionListener();
        }
    }

    @Override // a.seu0
    public final void d(long j, long j2, androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        seu0 seu0Var = this.c;
        if (seu0Var != null) {
            seu0Var.d(j, j2, bVar, mediaFormat);
        }
        seu0 seu0Var2 = this.f30707a;
        if (seu0Var2 != null) {
            seu0Var2.d(j, j2, bVar, mediaFormat);
        }
    }
}
