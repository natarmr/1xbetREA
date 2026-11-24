package a;

import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class xxj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wmb0 f41661a = new wmb0(30);

    public static final void a(g5q0 g5q0Var, u4q0 u4q0Var, fet fetVar, int i) {
        fet fetVar2;
        Context context;
        fetVar.g0(1904307118);
        byte b = 2;
        int i2 = (fetVar.g(g5q0Var) ? 4 : 2) | i | (fetVar.i(u4q0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                fetVar.e0(-1009482584);
                context = (Context) fetVar.k(dy2.b);
                fetVar.r(false);
            } else {
                fetVar.e0(-1009433480);
                fetVar.r(false);
                context = null;
            }
            boolean zI = fetVar.i(u4q0Var) | ((i2 & 14) == 4) | fetVar.i(context);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new sw8(u4q0Var, context, g5q0Var, (byte) 23);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            rje.b(null, null, (Function1) objP, fetVar2, 0, 3);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(g5q0Var, u4q0Var, i, b);
        }
    }

    public static final void b(final int i, final long j, fet fetVar, final int i2) {
        final int i3;
        int i4;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (fetVar.e(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.f(j) ? 32 : 16;
        }
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) fetVar.k(dy2.b);
            boolean zG = ((i4 & 14) == 4) | fetVar.g(context);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            if (iIntValue == -1) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 1;
                function2 = new Function2() { // from class: a.wxj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = b;
                        fet fetVar2 = (fet) obj2;
                        ((Integer) obj3).getClass();
                        switch (b2) {
                            case 0:
                                xxj.b(i3, j, fetVar2, x8x.L(i2 | 1));
                                break;
                            default:
                                xxj.b(i3, j, fetVar2, x8x.L(i2 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                pm80 pm80VarF = a8k0.F(iIntValue, 0, fetVar);
                boolean z = (i4 & 112) == 32;
                Object objP2 = fetVar.P();
                if (z || objP2 == obj) {
                    objP2 = j == 16 ? null : new m78(j, 5);
                    fetVar.o0(objP2);
                }
                zq8.a(0, fetVar, wb.K(o7k0.n(jm40.b, qje.e), pm80VarF, null, gqw0.B, 0.0f, (a4d) objP2, 22));
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 0;
            function2 = new Function2() { // from class: a.wxj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    fet fetVar2 = (fet) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            xxj.b(i, j, fetVar2, x8x.L(i2 | 1));
                            break;
                        default:
                            xxj.b(i, j, fetVar2, x8x.L(i2 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void c(g5q0 g5q0Var, v4q0 v4q0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(g5q0Var) : fetVar.i(g5q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(v4q0Var) : fetVar.i(v4q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        boolean z = false;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.g(v4q0Var));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new x220(new clc(new vef(v4q0Var, function0, (byte) 25), (byte) 13));
                fetVar.o0(objP);
            }
            x220 x220Var = (x220) objP;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(g5q0Var))) {
                z = true;
            }
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ucj(g5q0Var, (byte) 8);
                fetVar.o0(objP2);
            }
            k13.a(x220Var, (Function0) objP2, f41661a, u1c.M(1315155414, new cxj(v4q0Var, g5q0Var, b), fetVar), fetVar, 3456, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(g5q0Var, v4q0Var, function0, i, (byte) 29);
        }
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1392105195);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            cy2.p(mm40Var, e5q0.f7246a, ugdVar, fetVar, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i, (byte) 4);
        }
    }
}
