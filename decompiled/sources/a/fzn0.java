package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class fzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10416a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final jfk0 f;

    static {
        float f2 = mzn0.g;
        f10416a = f2;
        b = mzn0.n;
        c = mzn0.m;
        float f3 = mzn0.j;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new jfk0();
    }

    public static final void a(boolean z, Function1 function1, mm40 mm40Var, boolean z2, dzn0 dzn0Var, fet fetVar, int i) {
        int i2;
        mm40 mm40VarY;
        fetVar.g0(-263339167);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= fetVar.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.g(dzn0Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            fetVar.e0(1768604058);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            fetVar.r(false);
            if (function1 != null) {
                ykw ykwVar = rlx.f30719a;
                mm40VarY = lv00.Y(tg40.b, z, gy40Var, z2, new ucg0(2), function1);
            } else {
                mm40VarY = jm40.b;
            }
            int i5 = i4 << 3;
            int i6 = i4 >> 6;
            b(o7k0.j(o7k0.y(mm40Var.e(mm40VarY), gqw0.e, 2), c, d), z, z2, dzn0Var, gy40Var, elj0.a(mzn0.e, fetVar), fetVar, (i5 & 112) | (i6 & 896) | (i6 & 7168) | (i5 & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(z, function1, mm40Var, z2, dzn0Var, i);
        }
    }

    public static final void b(mm40 mm40Var, boolean z, boolean z2, dzn0 dzn0Var, gy40 gy40Var, yjj0 yjj0Var, fet fetVar, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        fetVar.g0(-670917213);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(dzn0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(gy40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(yjj0Var) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? dzn0Var.b : dzn0Var.f;
            } else {
                j = z ? dzn0Var.j : dzn0Var.n;
            }
            if (z2) {
                j2 = z ? dzn0Var.f6949a : dzn0Var.e;
            } else {
                j2 = z ? dzn0Var.i : dzn0Var.m;
            }
            yjj0 yjj0VarA = elj0.a(mzn0.l, fetVar);
            float f2 = mzn0.k;
            if (z2) {
                j3 = j2;
                j4 = z ? dzn0Var.c : dzn0Var.g;
            } else {
                j3 = j2;
                j4 = z ? dzn0Var.k : dzn0Var.o;
            }
            mm40 mm40VarQ = i120.Q(i120.S(mm40Var, f2, j4, yjj0VarA), j, yjj0VarA);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            shd shdVar3 = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar3);
            }
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarQ2 = i120.Q(a6x.a(jr8.f16991a.b(jm40.b, gqw0.d).e(new hdq0(gy40Var, z, d7x.P(yt40.b, fetVar))), gy40Var, lcg0.a(mzn0.i / 2.0f, 4)), j3, yjj0Var);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iX2 = e3c.x(fetVar);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX2))) {
                rw2.t(iX2, fetVar, iX2, shdVar3);
            }
            brm0.x(fetVar, mm40VarC1, shdVar4, 1236071411, false);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(mm40Var, z, z2, dzn0Var, gy40Var, yjj0Var, i);
        }
    }
}
