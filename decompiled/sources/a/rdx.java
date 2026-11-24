package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rdx extends s460 {
    public static final ucs0 F1;
    public final wso0 D1;
    public qdx E1;

    static {
        ucs0 ucs0VarD = saj.D();
        int i = y3d.h;
        ucs0VarD.s(y3d.d);
        ucs0VarD.z(1.0f);
        ucs0VarD.A(1);
        F1 = ucs0VarD;
    }

    public rdx(e7z e7zVar) {
        super(e7zVar);
        wso0 wso0Var = new wso0();
        wso0Var.d = 0;
        this.D1 = wso0Var;
        wso0Var.h = this;
        this.E1 = e7zVar.i != null ? new qdx(this) : null;
    }

    @Override // a.pj30
    public final int D(int i) {
        u8u u8uVarU = this.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.a((s460) e7zVar.h1.e, e7zVar.n(), i);
    }

    @Override // a.pj30
    public final int L(int i) {
        u8u u8uVarU = this.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.d((s460) e7zVar.h1.e, e7zVar.n(), i);
    }

    @Override // a.pj30
    public final int P(int i) {
        u8u u8uVarU = this.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.e((s460) e7zVar.h1.e, e7zVar.n(), i);
    }

    @Override // a.pj30
    public final pu90 S(long j) {
        u0(j);
        e7z e7zVar = this.u;
        xz40 xz40VarA = e7zVar.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((e7z) objArr[i2]).i1.p.l = c7z.c;
        }
        A1(e7zVar.x.b(this, e7zVar.n(), j));
        r1();
        return this;
    }

    @Override // a.pj30
    public final int b(int i) {
        u8u u8uVarU = this.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.c((s460) e7zVar.h1.e, e7zVar.n(), i);
    }

    @Override // a.s460
    public final void b1() {
        if (this.E1 == null) {
            this.E1 = new qdx(this);
        }
    }

    @Override // a.s460
    public final e810 e1() {
        return this.E1;
    }

    @Override // a.s460
    public final lm40 g1() {
        return this.D1;
    }

    @Override // a.pu90
    public final void n0(long j, float f, Function1 function1) {
        x1(j, f, function1, null);
        if (this.n) {
            return;
        }
        this.u.i1.p.H0();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // a.s460
    public final void n1(r460 r460Var, long j, raw rawVar, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        e7z e7zVar;
        long jB;
        e7z e7zVar2 = this.u;
        boolean z3 = false;
        if (r460Var.c(e7zVar2)) {
            if (!I1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(Y0(j, f1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = rawVar.c;
                    xz40 xz40VarZ = e7zVar2.z();
                    objArr = xz40VarZ.f41739a;
                    i3 = xz40VarZ.c - 1;
                    while (i3 >= 0) {
                        e7zVar = (e7z) objArr[i3];
                        if (e7zVar.J()) {
                            r460Var.g(e7zVar, j, rawVar, i2, z2);
                            jB = rawVar.b();
                            if (acb.R(jB) >= 0.0f && acb.U(jB) && !acb.T(jB) && !r460Var.d(rawVar, e7zVar)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    rawVar.c = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = rawVar.c;
                xz40 xz40VarZ2 = e7zVar2.z();
                objArr = xz40VarZ2.f41739a;
                i3 = xz40VarZ2.c - 1;
                while (i3 >= 0) {
                    e7zVar = (e7z) objArr[i3];
                    if (e7zVar.J()) {
                        r460Var.g(e7zVar, j, rawVar, i2, z2);
                        jB = rawVar.b();
                        if (acb.R(jB) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                rawVar.c = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = rawVar.c;
            xz40 xz40VarZ3 = e7zVar2.z();
            objArr = xz40VarZ3.f41739a;
            i3 = xz40VarZ3.c - 1;
            while (i3 >= 0) {
                e7zVar = (e7z) objArr[i3];
                if (e7zVar.J()) {
                    r460Var.g(e7zVar, j, rawVar, i2, z2);
                    jB = rawVar.b();
                    if (acb.R(jB) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            rawVar.c = i6;
        }
    }

    @Override // a.c810
    public final int y0(w12 w12Var) {
        qdx qdxVar = this.E1;
        if (qdxVar != null) {
            return qdxVar.y0(w12Var);
        }
        sj30 sj30Var = this.u.i1.p;
        f7z f7zVar = sj30Var.y;
        if (!sj30Var.m) {
            if (sj30Var.f.d == a7z.f398a) {
                f7zVar.f = true;
                if (f7zVar.b) {
                    sj30Var.w = true;
                    sj30Var.x = true;
                }
            } else {
                f7zVar.g = true;
            }
        }
        rdx rdxVarH = sj30Var.H();
        boolean z = rdxVarH.o;
        rdxVarH.o = true;
        sj30Var.y();
        rdxVarH.o = z;
        Integer num = (Integer) f7zVar.i.get(w12Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
