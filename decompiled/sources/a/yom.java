package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f42994a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        zcl zclVar = qmk.f28987a;
        f42994a = 40.0f;
        b = 10.0f;
        c = 20.0f;
        d = 2.0f;
        e = 30.0f / (((float) Math.sqrt(800.0d)) * 2.0f);
    }

    public static final void a(mm40 mm40Var, boolean z, boolean z2, utd0 utd0Var, Function0 function0, fet fetVar, int i) {
        float f;
        long j;
        l7m0 l7m0VarF;
        fetVar.g0(1628260990);
        byte b2 = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(utd0Var) ? 2048 : 1024) | (fetVar.g(null) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (z) {
                f = b / 2.0f;
            } else {
                zcl zclVar = qmk.f28987a;
                f = 0.0f;
            }
            l7m0 l7m0VarA = d43.a(f, ro4.g0(e, 800.0f, null, 4), null, fetVar, 48, 12);
            if (z2 && z) {
                j = utd0Var.f36251a;
            } else if (!z2 || z) {
                j = (z2 || !z) ? utd0Var.d : utd0Var.c;
            } else {
                j = utd0Var.b;
            }
            if (z2) {
                fetVar.e0(-2017432920);
                l7m0VarF = m5k0.b(j, null, fetVar, 0, 14);
                fetVar.r(false);
            } else {
                fetVar.e0(-2017384281);
                l7m0VarF = androidx.compose.runtime.e.f(new y3d(j), fetVar);
                fetVar.r(false);
            }
            mm40 mm40VarI = o7k0.i(o7k0.y(mm40Var.e(function0 != null ? rsr0.g0(z, lcg0.a(f42994a / 2.0f, 4), z2, new ucg0(3), function0) : jm40.b), gqw0.e, 2), c);
            boolean zG = fetVar.g(l7m0VarF) | fetVar.g(l7m0VarA);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new sz7(l7m0VarF, l7m0VarA, b2);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarI, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5((Object) mm40Var, z, z2, (Object) utd0Var, (wdr) function0, i, (byte) 2);
        }
    }

    public static final void b(mm40 mm40Var, final boolean z, boolean z2, Function0 function0, fet fetVar, final int i, final int i2) {
        int i3;
        final Function0 function1;
        final mm40 mm40Var2;
        final boolean z3;
        fetVar.g0(1378033753);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.h(z2) ? 256 : 128;
        }
        int i6 = i3 | 3072;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i6 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i6 & 1, (i6 & 9363) != 9362)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (i5 != 0) {
                z2 = true;
            }
            Function0 function2 = i7 != 0 ? null : function0;
            obc.d(rlx.c.a(new ycl(f42994a)), u1c.M(-1627630695, new yw(mm40Var, z, z2, function2), fetVar), fetVar, 56);
            function1 = function2;
            z3 = z2;
            mm40Var2 = mm40Var;
        } else {
            fetVar.X();
            function1 = function0;
            mm40Var2 = mm40Var;
            z3 = z2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xom
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yom.b(mm40Var2, z, z3, function1, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }
}
