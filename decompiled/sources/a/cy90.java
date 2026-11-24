package a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cy90 implements pfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b4x f5162a;
    public androidx.media3.common.b b;
    public long c;
    public int d;
    public Executor e;
    public final /* synthetic */ gy90 f;

    public cy90(gy90 gy90Var, Context context) {
        this.f = gy90Var;
        vtt0.J(context);
        v3x v3xVar = b4x.b;
        this.f5162a = rcf0.e;
        this.e = gy90.q;
    }

    @Override // a.pfu0
    public final boolean a() {
        return false;
    }

    @Override // a.pfu0
    public final boolean b() {
        return false;
    }

    @Override // a.pfu0
    public final boolean c(long j, tm30 tm30Var) {
        int i;
        x0x.K(false);
        long j2 = j + this.c;
        gy90 gy90Var = this.f;
        veu0 veu0Var = gy90Var.i;
        long j3 = veu0Var.f37301a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * veu0Var.c) + veu0Var.b);
        if (j4 != -9223372036854775807L) {
            long j5 = gy90Var.h;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.d) < 2) {
                this.d = i + 1;
                xm30 xm30Var = tm30Var.c;
                dm30 dm30Var = tm30Var.f34175a;
                int i2 = tm30Var.b;
                Trace.beginSection("dropVideoBuffer");
                dm30Var.k(i2);
                Trace.endSection();
                xm30Var.U0(0, 1);
                return true;
            }
        }
        int i3 = gy90Var.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // a.pfu0
    public final void d(long j) {
        this.c = j;
    }

    @Override // a.pfu0
    public final void e() {
        gy90 gy90Var = this.f;
        if (gy90Var.o >= -9223372036854775807L) {
            gy90Var.e.e();
        }
    }

    @Override // a.pfu0
    public final void f(androidx.media3.common.b bVar, long j, int i, List list) {
        x0x.K(false);
        this.f5162a = b4x.o(list);
        this.b = bVar;
        awq awqVarA = bVar.a();
        c4d c4dVar = bVar.H;
        if (c4dVar == null || !c4dVar.d()) {
            c4dVar = c4d.h;
        }
        awqVarA.G = c4dVar;
        new androidx.media3.common.b(awqVarA);
        throw null;
    }

    @Override // a.pfu0
    public final void g(List list) {
        if (this.f5162a.equals(list)) {
            return;
        }
        this.f5162a = b4x.o(list);
        androidx.media3.common.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        awq awqVarA = bVar.a();
        c4d c4dVar = bVar.H;
        if (c4dVar == null || !c4dVar.d()) {
            c4dVar = c4d.h;
        }
        awqVarA.G = c4dVar;
        new androidx.media3.common.b(awqVarA);
        throw null;
    }

    @Override // a.pfu0
    public final Surface getInputSurface() {
        x0x.K(false);
        throw null;
    }

    @Override // a.pfu0
    public final boolean h(boolean z) {
        return this.f.e.f5226a.b(false);
    }

    @Override // a.pfu0
    public final void i(sm30 sm30Var) {
        this.e = ank.f1158a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: p7v -> 0x0036, TryCatch #0 {p7v -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[Catch: p7v -> 0x0036, TryCatch #0 {p7v -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0051 A[Catch: p7v -> 0x0036, TryCatch #0 {p7v -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[Catch: p7v -> 0x0036, TryCatch #0 {p7v -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082 A[Catch: p7v -> 0x0036, TRY_LEAVE, TryCatch #0 {p7v -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    @Override // a.pfu0
    public final boolean k(androidx.media3.common.b bVar) throws ofu0 {
        gy90 gy90Var = this.f;
        boolean zM = true;
        x0x.K(gy90Var.n == 0);
        c4d c4dVar = bVar.H;
        if (c4dVar == null || !c4dVar.d()) {
            c4dVar = c4d.h;
        }
        int i = c4dVar.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    if (i == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !n4c.M("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zM = false;
                        }
                    } else if (i == 7) {
                        zM = n4c.M("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (zM && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        f1t0.g0("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        c4d c4dVar2 = c4d.h;
                    } else if (i != 2 || i == 10) {
                        c4d c4dVar3 = c4d.h;
                    }
                } else {
                    if (!(i2 >= 33 && n4c.M("EGL_EXT_gl_colorspace_bt2020_pq"))) {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                zM = false;
                            } else {
                                zM = false;
                            }
                        } else if (i == 7) {
                            zM = n4c.M("EGL_EXT_gl_colorspace_bt2020_hlg");
                        }
                        if (zM) {
                            if (i != 2) {
                                c4d c4dVar4 = c4d.h;
                            } else {
                                c4d c4dVar5 = c4d.h;
                            }
                        } else if (i != 2) {
                            c4d c4dVar6 = c4d.h;
                        } else {
                            c4d c4dVar7 = c4d.h;
                        }
                    }
                }
            } catch (p7v e) {
                throw new ofu0(e, bVar);
            }
        } else {
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zM = false;
                } else {
                    zM = false;
                }
            } else if (i == 7) {
                zM = n4c.M("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (zM) {
                if (i != 2) {
                    c4d c4dVar8 = c4d.h;
                } else {
                    c4d c4dVar9 = c4d.h;
                }
            } else if (i != 2) {
                c4d c4dVar10 = c4d.h;
            } else {
                c4d c4dVar11 = c4d.h;
            }
        }
        l9o0 l9o0Var = gy90Var.f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        gy90Var.k = l9o0Var.a(looperMyLooper, null);
        gy90Var.b.a();
        throw null;
    }

    @Override // a.pfu0
    public final void l(Surface surface, e7k0 e7k0Var) {
        gy90 gy90Var = this.f;
        Pair pair = gy90Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e7k0) gy90Var.l.second).equals(e7k0Var)) {
            return;
        }
        gy90Var.l = Pair.create(surface, e7k0Var);
        int i = e7k0Var.f7331a;
    }

    @Override // a.pfu0
    public final void m() {
        gy90 gy90Var = this.f;
        if (gy90Var.j.f0() == 0) {
            gy90Var.e.m();
            return;
        }
        tyc tycVar = new tyc((byte) 7);
        if (gy90Var.j.f0() <= 0) {
            gy90Var.j = tycVar;
        } else {
            ((fy90) gy90Var.j.X()).getClass();
            throw null;
        }
    }

    @Override // a.pfu0
    public final void n() {
        gy90 gy90Var = this.f;
        if (gy90Var.d) {
            gy90Var.e.n();
        }
    }

    @Override // a.pfu0
    public final void o() {
        gy90 gy90Var = this.f;
        if (gy90Var.d) {
            gy90Var.e.o();
        }
    }

    @Override // a.pfu0
    public final void p(int i) {
        this.f.e.p(i);
    }

    @Override // a.pfu0
    public final void q(float f) {
        gy90 gy90Var = this.f;
        gy90Var.i.c(f);
        gy90Var.e.q(f);
    }

    @Override // a.pfu0
    public final void r() {
        int i = e7k0.c.f7331a;
        this.f.l = null;
    }

    @Override // a.pfu0
    public final void release() {
        gy90 gy90Var = this.f;
        if (gy90Var.n == 2) {
            return;
        }
        q9o0 q9o0Var = gy90Var.k;
        if (q9o0Var != null) {
            q9o0Var.f();
        }
        gy90Var.l = null;
        gy90Var.n = (byte) 2;
    }

    @Override // a.pfu0
    public final void s(boolean z) {
        tyc tycVar;
        gy90 gy90Var = this.f;
        czj czjVar = gy90Var.e;
        if (gy90Var.n == 1) {
            gy90Var.m++;
            czjVar.s(z);
            while (true) {
                int iF0 = gy90Var.j.f0();
                tycVar = gy90Var.j;
                if (iF0 <= 1) {
                    break;
                } else {
                    tycVar.X();
                }
            }
            if (tycVar.f0() == 1) {
                ((fy90) gy90Var.j.X()).getClass();
                throw null;
            }
            gy90Var.o = -9223372036854775807L;
            q9o0 q9o0Var = gy90Var.k;
            q9o0Var.getClass();
            q9o0Var.e(new wss(gy90Var, (byte) 14));
        }
    }

    @Override // a.pfu0
    public final void t(long j, long j2) throws ofu0 {
        this.f.e.t(j + this.c, j2);
    }

    @Override // a.pfu0
    public final void u(seu0 seu0Var) {
        this.f.e.k = seu0Var;
    }

    @Override // a.pfu0
    public final void v(boolean z) {
        gy90 gy90Var = this.f;
        if (gy90Var.d) {
            gy90Var.e.v(z);
        }
    }

    @Override // a.pfu0
    public final void j() {
    }
}
