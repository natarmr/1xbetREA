package a;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ijj0 extends t89 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zas0 f14877a;
    public long b = 9205357640488583168L;

    @Override // a.t89
    public final void a(float f, long j, ucs0 ucs0Var) {
        zas0 zas0Var = this.f14877a;
        if (zas0Var == null || !h7k0.b(this.b, j)) {
            if (h7k0.f(j)) {
                this.f14877a = null;
                this.b = 9205357640488583168L;
                zas0Var = null;
            } else {
                zas0Var = this.f14877a;
                if (zas0Var == null) {
                    zas0Var = new zas0((byte) 1, false);
                    this.f14877a = zas0Var;
                }
                zas0Var.b = b(j);
                this.f14877a = zas0Var;
                this.b = j;
            }
        }
        long jL = ucs0Var.l();
        long j2 = y3d.b;
        if (!h2t0.a(jL, j2)) {
            ucs0Var.s(j2);
        }
        if (!Intrinsics.d((Shader) ucs0Var.d, zas0Var != null ? (Shader) zas0Var.b : null)) {
            ucs0Var.w(zas0Var != null ? (Shader) zas0Var.b : null);
        }
        if (((Paint) ucs0Var.c).getAlpha() / 255.0f == f) {
            return;
        }
        ucs0Var.q(f);
    }

    public abstract Shader b(long j);
}
