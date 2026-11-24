package a;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes.dex */
public final class f6z extends Picture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfv f9036a;

    public f6z(dfv dfvVar) {
        this.f9036a = dfvVar;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = vw2.f38128a;
        uw2 uw2Var = new uw2();
        uw2Var.f36374a = canvas;
        this.f9036a.c(uw2Var, null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.f9036a.u & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.f9036a.u >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
