package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ruv0 {
    public static final uts0 x = ro4.m0(300, 0, ihn.f14788a, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final duv0 f31144a;
    public final fht0 b;
    public final glt0 c;
    public final mkt0 d;
    public final muv0 e;
    public final fuj0 f;
    public jmv0 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public float n;
    public int o;
    public boolean p;
    public float q;
    public int r;
    public c4m0 s;
    public vne t;
    public c4m0 u;
    public final pz40 g = androidx.compose.runtime.e.e(null);
    public final t33 v = xf0.c(0.0f);
    public final pz40 w = androidx.compose.runtime.e.e(Float.valueOf(0.0f));

    public ruv0(duv0 duv0Var, fht0 fht0Var, glt0 glt0Var, mkt0 mkt0Var, muv0 muv0Var, fuj0 fuj0Var) {
        this.f31144a = duv0Var;
        this.b = fht0Var;
        this.c = glt0Var;
        this.d = mkt0Var;
        this.e = muv0Var;
        this.f = fuj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, zje zjeVar) {
        ouv0 ouv0Var;
        if (zjeVar instanceof ouv0) {
            ouv0Var = (ouv0) zjeVar;
            int i = ouv0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ouv0Var.l = i - Integer.MIN_VALUE;
            } else {
                ouv0Var = new ouv0(this, zjeVar);
            }
        } else {
            ouv0Var = new ouv0(this, zjeVar);
        }
        Object obj = ouv0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ouv0Var.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            c4m0 c4m0Var = this.s;
            if (c4m0Var != null) {
                ouv0Var.i = f;
                ouv0Var.l = 1;
                if (zvw.H(c4m0Var, ouv0Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = ouv0Var.i;
            z1x.P(obj);
        }
        vne vneVar = this.t;
        if (vneVar == null) {
            return Unit.f46060a;
        }
        this.s = qjj.W(vneVar, null, null, new puv0(this, f, yjeVar, (byte) 0), 3);
        return Unit.f46060a;
    }

    public final void b() {
        vne vneVar = this.t;
        float f = this.n;
        tly tlyVar = (tly) this.f31144a.b().getValue();
        float fMax = Math.max(f, Math.max(l(tlyVar.c), l(tlyVar.b)));
        c4m0 c4m0Var = this.u;
        byte b = 1;
        if ((c4m0Var == null || !c4m0Var.isActive()) && vneVar != null && fMax > 0.0f) {
            c4m0 c4m0Var2 = this.u;
            yje yjeVar = null;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            this.u = qjj.W(vneVar, null, null, new jy7(this, fMax, yjeVar, b), 3);
        }
    }

    public final void c() {
        if (this.c.f()) {
            this.m = true;
            b();
            if (f() != null) {
                this.l = true;
                k();
                jmv0 jmv0Var = this.h;
                if (jmv0Var != null) {
                    jmv0Var.invoke();
                }
            }
        }
    }

    public final Object d(zje zjeVar) {
        yuv0 yuv0VarF = f();
        if (yuv0VarF == null) {
            return Unit.f46060a;
        }
        cvv0 cvv0VarF = this.b.f();
        float fG = cvv0VarF == null ? yuv0VarF.b : ktt0.g(cvv0VarF, yuv0VarF.f43288a);
        k();
        this.o = 0;
        this.p = false;
        Object objA = a(fG, zjeVar);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final float e() {
        c4m0 c4m0Var = this.u;
        if (c4m0Var != null && c4m0Var.isActive()) {
            return ((Number) this.v.d()).floatValue();
        }
        float fL = l(((tly) this.f31144a.b().getValue()).b);
        if (a8k0.A()) {
            float f = this.n;
            if (fL > f) {
                return f;
            }
        }
        return fL;
    }

    public final yuv0 f() {
        return (yuv0) ((hgk0) this.g).getValue();
    }

    public final boolean g() {
        return f() != null;
    }

    public final float h(cvv0 cvv0Var) {
        cvv0 cvv0VarF;
        int i;
        float fMin;
        int i2 = cvv0Var.d;
        muv0 muv0Var = this.e;
        fht0 fht0Var = muv0Var.b;
        Integer numValueOf = null;
        if (!muv0Var.b()) {
            cvv0 cvv0VarF2 = fht0Var.f();
            if (cvv0VarF2 != null) {
                numValueOf = Integer.valueOf(cvv0VarF2.f);
            }
        } else if (muv0Var.a() != null && (cvv0VarF = fht0Var.f()) != null) {
            numValueOf = Integer.valueOf(cvv0VarF.f);
        }
        if (numValueOf == null) {
            fMin = ktt0.k(cvv0Var);
        } else {
            int iIntValue = (numValueOf.intValue() - i2) - (muv0Var.g ? ((zvv0) ((hgk0) ((l7m0) this.f.b)).getValue()).e.f24069a : 0);
            atv0 atv0Var = (atv0) ((hgk0) muv0Var.i).getValue();
            float f = 0.0f;
            if (atv0Var instanceof xsv0) {
                i = ((xsv0) atv0Var).d;
            } else if (atv0Var instanceof ysv0) {
                i = ((ysv0) atv0Var).c;
            } else {
                if (!Intrinsics.d(atv0Var, zsv0.f44926a)) {
                    t9f.b();
                    return 0.0f;
                }
                i = 0;
            }
            float f2 = iIntValue - i;
            tly tlyVar = (tly) this.f31144a.b().getValue();
            cvv0 cvv0VarF3 = this.b.f();
            float f3 = cvv0VarF3 != null ? cvv0VarF3.c : 0;
            tlyVar.getClass();
            if (tlyVar.f34169a) {
                float f4 = tlyVar.c - f3;
                if (f4 >= 0.0f) {
                    f = f4;
                }
            }
            fMin = Math.min(ktt0.k(cvv0Var), Math.max(f - cvv0Var.e, i2) + f2);
        }
        yuv0 yuv0VarF = f();
        if (yuv0VarF != null) {
            float f5 = yuv0VarF.b;
            if (fMin < f5) {
                return f5;
            }
        }
        return fMin;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
    
        if (d(r3) == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        if (a(r2, r3) == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
    
        r5 = r8;
        r8 = r7;
        r7 = r5;
        r5 = r9;
        r13 = r11;
        r12 = r14;
        r11 = r15;
        r14 = r19;
        r1 = r2;
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b5, code lost:
    
        if (r18.c.g(r2, r3) == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01de, code lost:
    
        if (d(r3) == r4) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(a.tly r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ruv0.i(a.tly, a.zje):java.lang.Object");
    }

    public final Unit j() {
        if (!this.m && !this.l && !this.k && f() == null) {
            glt0 glt0Var = this.c;
            if (glt0Var.f()) {
                cvv0 cvv0VarF = this.b.f();
                if (cvv0VarF == null) {
                    return Unit.f46060a;
                }
                c4m0 c4m0Var = this.u;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.u = null;
                this.i = false;
                this.j = false;
                tly tlyVar = (tly) this.f31144a.b().getValue();
                this.n = Math.max(l(tlyVar.c), l(tlyVar.b));
                this.o = cvv0VarF.f5049a;
                this.p = false;
                this.q = 0.0f;
                this.r = 0;
                ((hgk0) this.g).setValue(new yuv0(glt0Var.d(), ktt0.g(cvv0VarF, glt0Var.d()), this.n));
                return Unit.f46060a;
            }
        }
        return Unit.f46060a;
    }

    public final void k() {
        this.i = false;
        this.j = false;
        ((hgk0) this.w).setValue(Float.valueOf(0.0f));
        this.n = 0.0f;
        if (f() == null) {
            return;
        }
        ((hgk0) this.g).setValue(null);
        this.q = 0.0f;
        this.r = 0;
    }

    public final float l(float f) {
        cvv0 cvv0VarF = this.b.f();
        float f2 = f - (cvv0VarF != null ? cvv0VarF.c : 0);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public final void m(cvv0 cvv0Var) {
        yuv0 yuv0VarF = f();
        if (yuv0VarF != null) {
            ((hgk0) this.g).setValue(yuv0.a(yuv0VarF, null, ktt0.g(cvv0Var, yuv0VarF.f43288a), 0.0f, 5));
        }
        int i = this.o;
        int i2 = cvv0Var.f5049a;
        if (i != i2) {
            this.o = i2;
            this.n = 0.0f;
            this.p = true;
        } else {
            if (this.p) {
                return;
            }
            tly tlyVar = (tly) this.f31144a.b().getValue();
            this.n = Math.max(this.n, Math.max(l(tlyVar.c), l(tlyVar.b)));
        }
    }

    public final void n(lxv0 lxv0Var) {
        lxv0Var.getClass();
        yuv0 yuv0VarF = f();
        if (yuv0VarF == null) {
            return;
        }
        if (!((tly) this.f31144a.b().getValue()).f34169a) {
            k();
            return;
        }
        cvv0 cvv0VarF = this.b.f();
        if (cvv0VarF == null) {
            return;
        }
        ((hgk0) this.g).setValue(yuv0.a(yuv0VarF, lxv0Var, ktt0.g(cvv0VarF, lxv0Var), 0.0f, 4));
    }
}
