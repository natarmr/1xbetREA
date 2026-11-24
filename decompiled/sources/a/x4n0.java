package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class x4n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2m0 f40275a = new y2m0((byte) 4);
    public static final Object b = new Object();

    public static final void a(mm40 mm40Var, Function2 function2, fet fetVar, int i, int i2) {
        int i3;
        fetVar.g0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.i(function2) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new b5n0(gqw0.v1);
                fetVar.o0(objP);
            }
            b((b5n0) objP, mm40Var, function2, fetVar, (i3 << 3) & 1008);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx(mm40Var2, (Object) function2, i, i2, (byte) 10);
        }
    }

    public static final void b(b5n0 b5n0Var, mm40 mm40Var, Function2 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-511989831);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(b5n0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(fetVar.T);
            androidx.compose.runtime.a aVarG = e3c.G(fetVar);
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            bh90 bh90VarM = fetVar.m();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, b5n0Var, b5n0Var.c);
            jpm0.o(fetVar, aVarG, b5n0Var.d);
            jpm0.o(fetVar, function2, b5n0Var.e);
            mkd.c0.getClass();
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            fetVar.r(true);
            if (fetVar.D()) {
                fetVar.e0(-1259187287);
                fetVar.r(false);
            } else {
                fetVar.e0(-1259245908);
                boolean zI = fetVar.i(b5n0Var);
                Object objP = fetVar.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new jfm0(b5n0Var, (byte) 8);
                    fetVar.o0(objP);
                }
                m0x0.D((Function0) objP, fetVar);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(b5n0Var, mm40Var, function2, i);
        }
    }
}
