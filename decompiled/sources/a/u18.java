package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f34891a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final long e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    static {
        zcl zclVar = qmk.f28987a;
        f34891a = 42.0f;
        b = 100.0f;
        c = 12.0f;
        d = 2.0f;
        e = osm0.e(0.5f, 0.0f);
        f = 54.0f;
        g = 70.0f;
        h = 6.0f;
        i = 4.0f;
    }

    public static final void a(mm40 mm40Var, rz7 rz7Var, boolean z, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        rz7Var.getClass();
        fetVar2.g0(-365585204);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(rz7Var) : fetVar2.i(rz7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 896) == 256) | fetVar2.i(t33Var);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new pw7((byte) 2, t33Var, null, z);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP2);
            boolean zI2 = fetVar2.i(t33Var);
            Object objP3 = fetVar2.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fu7(t33Var, (byte) 7);
                fetVar2.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            mm40 mm40VarP = o7k0.p(mm40Var, tz7.b, tz7.c);
            boolean zG = fetVar2.g(function0);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new y(function0, (byte) 14);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarT = i4w0.T(mm40VarP, (Function1) objP4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k7x.a(rz7Var.d, null, o7k0.c, null, null, fetVar2, 432, 2040);
            String str = rz7Var.f;
            zx7 zx7Var = gqw0.d;
            boolean zI3 = fetVar2.i(t33Var);
            Object objP5 = fetVar2.P();
            if (zI3 || objP5 == cl5Var) {
                objP5 = new fu7(t33Var, (byte) 8);
                fetVar2.o0(objP5);
            }
            phu0.c(str, zx7Var, f, g, 0.0f, h, 0L, null, null, (Function0) objP5, null, null, fetVar, 1797510, 0, 7104);
            String str2 = rz7Var.e;
            zx7 zx7Var2 = gqw0.i;
            boolean zG2 = fetVar.g(function0);
            Object objP6 = fetVar.P();
            if (zG2 || objP6 == cl5Var) {
                objP6 = new tq(function0, (byte) 24);
                fetVar.o0(objP6);
            }
            phu0.c(str2, zx7Var2, f34891a, b, c, d, e, null, null, (Function0) objP6, null, null, fetVar, 14380422, 0, 7040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s18(mm40Var, rz7Var, z, i2, (byte) 1);
        }
    }
}
