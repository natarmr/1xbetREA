package a;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class yrg0 implements qqg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f43120a = new Path();
    public float b;
    public float c;

    public yrg0(tyc tycVar) {
        if (tycVar == null) {
            return;
        }
        tycVar.z(this);
    }

    @Override // a.qqg0
    public final void a(float f, float f2, float f3, float f4) {
        this.f43120a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }

    @Override // a.qqg0
    public final void b(float f, float f2) {
        this.f43120a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // a.qqg0
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f43120a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    @Override // a.qqg0
    public final void close() {
        this.f43120a.close();
    }

    @Override // a.qqg0
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        esg0.n(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    @Override // a.qqg0
    public final void e(float f, float f2) {
        this.f43120a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }
}
