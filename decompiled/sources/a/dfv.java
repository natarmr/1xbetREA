package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dfv {
    public static final c6z C;
    public boolean A;
    public RectF B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffv f6018a;
    public Outline f;
    public float j;
    public x1x k;
    public w03 l;
    public w03 m;
    public boolean n;
    public a6a o;
    public ucs0 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public w6k b = dj8.h;
    public k6z c = k6z.f17794a;
    public Function1 d = fvr.w;
    public final s43 e = new s43(this, 6);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final td9 r = new td9();

    static {
        c6z c6zVar;
        if (Intrinsics.d(Build.FINGERPRINT, "robolectric")) {
            c6zVar = jtv.n;
        } else {
            c6zVar = Build.VERSION.SDK_INT >= 28 ? gqw0.q1 : rv00.r;
        }
        C = c6zVar;
    }

    public dfv(ffv ffvVar) {
        this.f6018a = ffvVar;
        ffvVar.x(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            ffv ffvVar = this.f6018a;
            if (z || ffvVar.T() > 0.0f) {
                w03 w03Var = this.l;
                if (w03Var != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = w03Var instanceof w03;
                    if (!z2) {
                        v4i0.p("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = w03Var.f38329a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                v4i0.p("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                v4i0.p("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = w03Var;
                    if (outline != null) {
                        outline.setAlpha(ffvVar.g());
                        outline2 = outline;
                    }
                    ffvVar.I(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        ffvVar.x(false);
                        ffvVar.k();
                    } else {
                        ffvVar.x(this.A);
                    }
                } else {
                    ffvVar.x(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jQ = n2x.Q(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jQ = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jQ >> 32);
                    int i5 = (int) (jQ & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(ffvVar.g());
                    ffvVar.I(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                ffvVar.x(false);
                ffvVar.I(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            td9 td9Var = this.r;
            dfv dfvVar = (dfv) td9Var.b;
            if (dfvVar != null) {
                dfvVar.q--;
                dfvVar.b();
                td9Var.b = null;
            }
            iz40 iz40Var = (iz40) td9Var.d;
            if (iz40Var != null) {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.f15620a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    dfv dfvVar2 = (dfv) objArr[(i << 3) + i3];
                                    dfvVar2.q--;
                                    dfvVar2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                iz40Var.b();
            }
            this.f6018a.k();
        }
    }

    public final void c(x5a x5aVar, dfv dfvVar) {
        ffv ffvVar;
        ffv ffvVar2;
        float f;
        if (this.s) {
            return;
        }
        long j = this.h;
        Canvas canvasB = vw2.b(x5aVar);
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        ffv ffvVar3 = this.f6018a;
        if (zIsHardwareAccelerated) {
            ffvVar = ffvVar3;
        } else {
            long j2 = this.t;
            float f2 = (int) (j2 >> 32);
            float f3 = f2 - this.v;
            float f4 = (int) (j2 & 4294967295L);
            float f5 = f4 - this.w;
            long j3 = this.u;
            ffvVar = ffvVar3;
            float f6 = f2 + ((int) (j3 >> 32)) + this.x;
            float f7 = f4 + ((int) (j3 & 4294967295L)) + this.y;
            float fG = ffvVar.g();
            a4d a4dVarM = ffvVar.m();
            int iD = ffvVar.D();
            if (fG < 1.0f || iD != 3 || a4dVarM != null || ffvVar.l() == 1) {
                ucs0 ucs0VarD = this.p;
                if (ucs0VarD == null) {
                    ucs0VarD = saj.D();
                    this.p = ucs0VarD;
                }
                ucs0VarD.q(fG);
                ucs0VarD.r(iD);
                ucs0VarD.t(a4dVarM);
                f = f3;
                canvasB.saveLayer(f, f5, f6, f7, (Paint) ucs0VarD.c);
            } else {
                canvasB.save();
                f = f3;
            }
            canvasB.translate(f, f5);
            Matrix matrixZ = ffvVar.z();
            matrixZ.preTranslate(this.v, this.w);
            canvasB.concat(matrixZ);
            this.h = ne60.e(this.h, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.v)) << 32));
        }
        a();
        if (ffvVar.p()) {
            ffvVar2 = ffvVar;
        } else {
            try {
                ffvVar2 = ffvVar;
                try {
                    ffvVar2.K(this.b, this.c, this, this.e);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                ffvVar2 = ffvVar;
            }
        }
        boolean z = false;
        boolean z2 = ffvVar2.T() > 0.0f;
        if (z2) {
            x5aVar.j();
        }
        boolean z3 = !zIsHardwareAccelerated && this.A;
        if (z3) {
            x5aVar.l();
            x1x x1xVarE = e();
            if (x1xVarE instanceof oe80) {
                x5a.h(x5aVar, ((oe80) x1xVarE).f25111a);
            } else if (x1xVarE instanceof pe80) {
                w03 w03VarA = this.m;
                if (w03VarA != null) {
                    w03VarA.i();
                } else {
                    w03VarA = z03.a();
                    this.m = w03VarA;
                }
                w03.b(w03VarA, ((pe80) x1xVarE).f26840a);
                x5aVar.c(w03VarA);
            } else {
                if (!(x1xVarE instanceof ne80)) {
                    t9f.b();
                    return;
                }
                x5aVar.c(((ne80) x1xVarE).f23373a);
            }
        }
        if (dfvVar != null) {
            td9 td9Var = dfvVar.r;
            if (!td9Var.f33756a) {
                wcx.a("Only add dependencies during a tracking");
            }
            iz40 iz40Var = (iz40) td9Var.d;
            if (iz40Var != null) {
                iz40Var.a(this);
            } else if (((dfv) td9Var.b) != null) {
                iz40 iz40Var2 = v1h0.f36630a;
                iz40 iz40Var3 = new iz40();
                dfv dfvVar2 = (dfv) td9Var.b;
                dfvVar2.getClass();
                iz40Var3.a(dfvVar2);
                iz40Var3.a(this);
                td9Var.d = iz40Var3;
                td9Var.b = null;
            } else {
                td9Var.b = this;
            }
            iz40 iz40Var4 = (iz40) td9Var.e;
            if (iz40Var4 != null) {
                z = !iz40Var4.l(this);
            } else if (((dfv) td9Var.c) != this) {
                z = true;
            } else {
                td9Var.c = null;
            }
            if (z) {
                this.q++;
            }
        }
        if (((uw2) x5aVar).f36374a.isHardwareAccelerated()) {
            ffvVar2.L(x5aVar);
        } else {
            a6a a6aVar = this.o;
            if (a6aVar == null) {
                a6aVar = new a6a();
                this.o = a6aVar;
            }
            nr nrVar = a6aVar.b;
            w6k w6kVar = this.b;
            k6z k6zVar = this.c;
            long jQ = n2x.Q(this.u);
            w6k w6kVarJ = nrVar.j();
            k6z k6zVarO = nrVar.o();
            x5a x5aVarI = nrVar.i();
            long jP = nrVar.p();
            dfv dfvVar3 = (dfv) nrVar.c;
            nrVar.F(w6kVar);
            nrVar.G(k6zVar);
            nrVar.E(x5aVar);
            nrVar.H(jQ);
            nrVar.c = this;
            x5aVar.l();
            try {
                d(a6aVar);
                x5aVar.i();
                nrVar.F(w6kVarJ);
                nrVar.G(k6zVarO);
                nrVar.E(x5aVarI);
                nrVar.H(jP);
                nrVar.c = dfvVar3;
            } catch (Throwable th) {
                x5aVar.i();
                nrVar.F(w6kVarJ);
                nrVar.G(k6zVarO);
                nrVar.E(x5aVarI);
                nrVar.H(jP);
                nrVar.c = dfvVar3;
                throw th;
            }
        }
        if (z3) {
            x5aVar.i();
        }
        if (z2) {
            x5aVar.n();
        }
        if (!zIsHardwareAccelerated) {
            canvasB.restore();
        }
        this.h = j;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void d(fhl fhlVar) {
        td9 td9Var = this.r;
        td9Var.c = (dfv) td9Var.b;
        iz40 iz40Var = (iz40) td9Var.d;
        if (iz40Var != null && iz40Var.h()) {
            iz40 iz40Var2 = (iz40) td9Var.e;
            if (iz40Var2 == null) {
                iz40 iz40Var3 = v1h0.f36630a;
                iz40Var2 = new iz40();
                td9Var.e = iz40Var2;
            }
            iz40Var2.j(iz40Var);
            iz40Var.b();
        }
        td9Var.f33756a = true;
        this.d.invoke(fhlVar);
        td9Var.f33756a = false;
        dfv dfvVar = (dfv) td9Var.c;
        if (dfvVar != null) {
            dfvVar.q--;
            dfvVar.b();
        }
        iz40 iz40Var4 = (iz40) td9Var.e;
        if (iz40Var4 == null || !iz40Var4.h()) {
            return;
        }
        Object[] objArr = iz40Var4.b;
        long[] jArr = iz40Var4.f15620a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            dfv dfvVar2 = (dfv) objArr[(i << 3) + i3];
                            dfvVar2.q--;
                            dfvVar2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        iz40Var4.b();
    }

    public final x1x e() {
        x1x oe80Var;
        x1x x1xVar = this.k;
        w03 w03Var = this.l;
        if (x1xVar != null) {
            return x1xVar;
        }
        if (w03Var != null) {
            ne80 ne80Var = new ne80(w03Var);
            this.k = ne80Var;
            return ne80Var;
        }
        long jQ = n2x.Q(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jQ = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jQ >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jQ & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            oe80Var = new pe80(r8x.v(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            oe80Var = new oe80(new jge0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = oe80Var;
        return oe80Var;
    }

    public final void f(w6k w6kVar, k6z k6zVar, long j, Function1 function1) {
        boolean zA = qkx.a(this.u, j);
        ffv ffvVar = this.f6018a;
        if (!zA) {
            this.u = j;
            long j2 = this.t;
            ffvVar.n((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = w6kVar;
        this.c = k6zVar;
        this.d = function1;
        ffvVar.K(w6kVar, k6zVar, this, this.e);
    }

    public final void g(float f) {
        ffv ffvVar = this.f6018a;
        if (ffvVar.g() == f) {
            return;
        }
        ffvVar.setAlpha(f);
    }

    public final void h(float f, long j, long j2) {
        float f2 = this.v;
        long jF = ne60.f(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (ne60.c(this.h, jF) && h7k0.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jF;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zje zjeVar) {
        cfv cfvVar;
        if (zjeVar instanceof cfv) {
            cfvVar = (cfv) zjeVar;
            int i = cfvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfvVar.k = i - Integer.MIN_VALUE;
            } else {
                cfvVar = new cfv(this, zjeVar);
            }
        } else {
            cfvVar = new cfv(this, zjeVar);
        }
        Object objB = cfvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cfvVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            cfvVar.k = 1;
            objB = C.b(this, cfvVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return new vz2((Bitmap) objB);
    }
}
