package a;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v2n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f36694a = true;
    public static Method b;
    public static boolean c;

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-925406956);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 96.0f), 12.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            f(6, fetVar, ua80.d(jm40Var, 12.0f, fetVar, jm40Var, 1.0f));
            f(6, fetVar, ua80.d(jm40Var, 4.0f, fetVar, jm40Var, 1.0f));
            rz4.t(jm40Var, 16.0f, fetVar, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2 A[PHI: r3 r4
  0x00c2: PHI (r3v16 int) = (r3v10 int), (r3v7 int), (r3v17 int) binds: [B:75:0x00d8, B:69:0x00be, B:70:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r4v15 long) = (r4v4 long), (r4v3 long), (r4v3 long) binds: [B:75:0x00d8, B:69:0x00be, B:70:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void b(final mm40 mm40Var, final w2d w2dVar, long j, float f, final ugd ugdVar, final ugd ugdVar2, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        long backgroundContent;
        float f2;
        ugd ugdVar3;
        boolean z;
        final long j2;
        final float f3;
        yfe0 yfe0VarU;
        float f4;
        long j3;
        int i4;
        int i5;
        fetVar.g0(-1217682237);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(w2dVar) : fetVar.i(w2dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                backgroundContent = j;
                int i6 = fetVar.f(backgroundContent) ? 256 : 128;
                i3 |= i6;
            } else {
                backgroundContent = j;
            }
            i3 |= i6;
        } else {
            backgroundContent = j;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i3 |= fetVar.d(f2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (fetVar.i(ugdVar)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                ugdVar3 = ugdVar2;
                if (fetVar.i(ugdVar3)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            } else {
                ugdVar3 = ugdVar2;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if ((i2 & 4) != 0) {
                        backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                        i3 &= -897;
                    }
                    if (i7 != 0) {
                        f4 = 32.0f;
                        j3 = backgroundContent;
                    }
                    fetVar.s();
                    gmn0.a(mm40Var2, null, j3, 0L, 0.0f, 0.0f, null, u1c.M(-1975772834, new mwq0(ugdVar, f4, 1.0f - w2dVar.f38442a.a(), ugdVar3, (byte) 0), fetVar), fetVar, (i3 & 14) | 12582912 | (i3 & 896), 122);
                    j2 = j3;
                    f3 = f4;
                } else {
                    fetVar.X();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                j3 = backgroundContent;
                f4 = f2;
                fetVar.s();
                gmn0.a(mm40Var2, null, j3, 0L, 0.0f, 0.0f, null, u1c.M(-1975772834, new mwq0(ugdVar, f4, 1.0f - w2dVar.f38442a.a(), ugdVar3, (byte) 0), fetVar), fetVar, (i3 & 14) | 12582912 | (i3 & 896), 122);
                j2 = j3;
                f3 = f4;
            } else {
                fetVar.X();
                j2 = backgroundContent;
                f3 = f2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.nwq0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        v2n0.b(mm40Var, w2dVar, j2, f3, ugdVar, ugdVar2, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        f2 = f;
        if ((i & 24576) == 0) {
            if (fetVar.i(ugdVar)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            ugdVar3 = ugdVar2;
            if (fetVar.i(ugdVar3)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        } else {
            ugdVar3 = ugdVar2;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    i3 &= -897;
                }
                if (i7 != 0) {
                    f4 = 32.0f;
                    j3 = backgroundContent;
                } else {
                    j3 = backgroundContent;
                    f4 = f2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    i3 &= -897;
                }
                if (i7 != 0) {
                    f4 = 32.0f;
                    j3 = backgroundContent;
                } else {
                    j3 = backgroundContent;
                    f4 = f2;
                }
            }
            fetVar.s();
            gmn0.a(mm40Var2, null, j3, 0L, 0.0f, 0.0f, null, u1c.M(-1975772834, new mwq0(ugdVar, f4, 1.0f - w2dVar.f38442a.a(), ugdVar3, (byte) 0), fetVar), fetVar, (i3 & 14) | 12582912 | (i3 & 896), 122);
            j2 = j3;
            f3 = f4;
        } else {
            fetVar.X();
            j2 = backgroundContent;
            f3 = f2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.nwq0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v2n0.b(mm40Var, w2dVar, j2, f3, ugdVar, ugdVar2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x0131  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void c(mm40 mm40Var, w2d w2dVar, long j, float f, ugd ugdVar, Function2 function2, ugd ugdVar2, fet fetVar, int i, int i2) {
        int i3;
        Function2 function3;
        boolean z;
        yfe0 yfe0VarU;
        Object objP;
        cl5 cl5Var;
        Object objP2;
        Object objP3;
        Object objP4;
        int i4;
        fetVar.g0(-1732212812);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(w2dVar) : fetVar.i(w2dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                function3 = function2;
                i3 |= fetVar.i(function3) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (fetVar.i(ugdVar2)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                fetVar.Z();
                if ((i & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                } else if (i5 != 0) {
                    function3 = null;
                }
                fetVar.s();
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = jgk0.b(new ok7(w2dVar, (byte) 8));
                    fetVar.o0(objP);
                }
                l7m0 l7m0Var = (l7m0) objP;
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    fetVar.o0(ugdVar);
                    objP2 = ugdVar;
                }
                Function2 function4 = (Function2) objP2;
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    fetVar.o0(ugdVar2);
                    objP3 = ugdVar2;
                }
                xdr xdrVar = (xdr) objP3;
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    fetVar.o0(function3);
                    objP4 = function3;
                }
                gmn0.a(mm40Var, null, j, 0L, 0.0f, 0.0f, null, u1c.M(-1283943943, new en80(f, (Function2) objP4, function4, xdrVar, l7m0Var), fetVar), fetVar, (i3 & 14) | 12582912 | (i3 & 896), 122);
            } else {
                fetVar.X();
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new f0l0(mm40Var, w2dVar, j, f, ugdVar, function3, ugdVar2, i, i2);
            }
        }
        i3 |= 196608;
        function3 = function2;
        if ((1572864 & i) == 0) {
            if (fetVar.i(ugdVar2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            fetVar.Z();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                    function3 = null;
                }
            } else if (i5 != 0) {
                function3 = null;
            }
            fetVar.s();
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ok7(w2dVar, (byte) 8));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                fetVar.o0(ugdVar);
                objP2 = ugdVar;
            }
            Function2 function5 = (Function2) objP2;
            objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                fetVar.o0(ugdVar2);
                objP3 = ugdVar2;
            }
            xdr xdrVar2 = (xdr) objP3;
            objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                fetVar.o0(function3);
                objP4 = function3;
            }
            gmn0.a(mm40Var, null, j, 0L, 0.0f, 0.0f, null, u1c.M(-1283943943, new en80(f, (Function2) objP4, function5, xdrVar2, l7m0Var2), fetVar), fetVar, (i3 & 14) | 12582912 | (i3 & 896), 122);
        } else {
            fetVar.X();
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f0l0(mm40Var, w2dVar, j, f, ugdVar, function3, ugdVar2, i, i2);
        }
    }

    public static final r1o d(o1x o1xVar, Throwable th) {
        dyw dywVar;
        if (th instanceof j860) {
            Function1 function1 = o1xVar.q;
            l1x l1xVar = o1xVar.w;
            dywVar = (dyw) function1.invoke(o1xVar);
            if (dywVar == null) {
                dywVar = (dyw) l1xVar.j.invoke(o1xVar);
            }
            if (dywVar == null && (dywVar = (dyw) o1xVar.p.invoke(o1xVar)) == null) {
                dywVar = (dyw) l1xVar.i.invoke(o1xVar);
            }
        } else {
            dywVar = (dyw) o1xVar.p.invoke(o1xVar);
            if (dywVar == null) {
                dywVar = (dyw) o1xVar.w.i.invoke(o1xVar);
            }
        }
        return new r1o(dywVar, o1xVar, th);
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(62089144);
        int i2 = i | 6 | (fetVar.d(156.0f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 156.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(mm40VarE, vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 8);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1945504432);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 138.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 23);
        }
    }

    public static final void g(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1684646611);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            g1x.l(s5x0.L(mm40Var, qmk.a(fetVar).d, 0.0f, 2), i4w0.e, fetVar, 48, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s84(mm40Var, i, i2, (byte) 8);
        }
    }

    public static final void h(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        mm40 mm40VarA;
        a4xVar.getClass();
        fetVar.g0(1693412452);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1646379878, a4xVar);
            while (itO.hasNext()) {
                x7s0 x7s0Var = (x7s0) itO.next();
                int iOrdinal = x7s0Var.b.ordinal();
                if (iOrdinal == 0) {
                    mm40VarA = o7k0.A(jm40.b, null, 3);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    mm40VarA = new x7z(1.0f, true);
                }
                iym0.h(mm40VarA, x7s0Var.f40429a, x7s0Var.b, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iqh(i, a4xVar, mm40Var);
        }
    }

    public static final void i(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4x a4xVar2;
        Pair pair;
        a4xVar.getClass();
        fetVar.g0(803611782);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            boolean z2 = i3 == 4;
            Object objP2 = fetVar.P();
            float f = 0.0f;
            Object obj2 = objP2;
            if (z2 || objP2 == obj) {
                int size = a4xVar.size();
                ArrayList arrayList = new ArrayList(size);
                int i4 = 0;
                while (i4 < size) {
                    arrayList.add(androidx.compose.runtime.e.e(new g43(i4 < cgk0Var.l() ? 1.0f : 0.0f, 0.0f, 0.0f)));
                    i4++;
                }
                fetVar.o0(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            boolean zG = (i3 == 4) | fetVar.g(cgk0Var) | fetVar.i(list);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP3 == obj) {
                Object otp0Var = new otp0(a4xVar, list, cgk0Var, yjeVar, (byte) 5);
                a4xVar2 = a4xVar;
                fetVar.o0(otp0Var);
                objP3 = otp0Var;
            } else {
                a4xVar2 = a4xVar;
            }
            m0x0.t(fetVar, a4xVar2, (Function2) objP3);
            fetVar.e0(-823163594);
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                pz40 pz40Var = (pz40) next;
                int size2 = a4xVar2.size();
                zcl zclVar = qmk.f28987a;
                if (size2 <= 5) {
                    pair = new Pair(new ycl((28.0f * i5) + ((146.0f - (((size2 - 1) * 28.0f) + 34.0f)) / 2.0f)), new ycl(11.0f));
                } else if (size2 <= 5) {
                    pair = new Pair(new ycl(f), new ycl(f));
                } else if (i5 < 5) {
                    pair = new Pair(new ycl(i5 * 28.0f), new ycl(f));
                } else {
                    pair = new Pair(new ycl((28.0f * (i5 - 5)) + ((146.0f - (((size2 - 6) * 28.0f) + 34.0f)) / 2.0f)), new ycl(22.0f));
                }
                arrayList2.add(new g43(((Number) d43.b(((g43) pz40Var.getValue()).f10643a, ro4.m0(500, 0, null, 6), null, null, fetVar, 48, 28).getValue()).floatValue(), ((Number) d43.b(pkd.b(((ycl) pair.f46059a).f42389a, fetVar), ro4.m0(500, 0, null, 6), null, null, fetVar, 48, 28).getValue()).floatValue(), ((Number) d43.b(pkd.b(((ycl) pair.b).f42389a, fetVar), ro4.m0(500, 0, null, 6), null, null, fetVar, 48, 28).getValue()).floatValue()));
                i5 = i6;
                it = it;
                f = 0.0f;
            }
            int i7 = 6;
            fetVar.r(false);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 68.0f), 146.0f);
            boolean zI = fetVar.i(arrayList2);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new qf6(arrayList2, (byte) 8);
                fetVar.o0(objP4);
            }
            tj30 tj30Var = (tj30) objP4;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1199976468, a4xVar2);
            int i8 = 0;
            while (itO.hasNext()) {
                Object next2 = itO.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    q3d.p();
                    throw null;
                }
                r2x r2xVarT = jpm0.t(((una0) next2).f35951a, i7, fetVar);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarU = i4w0.U(o7k0.s(o7k0.e(jm40.b, 46.0f), 34.0f), 0.0f, 0.0f, ((g43) arrayList2.get(i8)).f10643a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571);
                long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                j0x.a(r2xVarT, o2e.e0(rq8.K(mm40VarU, new uli0(fbc.U(y3d.c(y3d.d(jM73getBlack400d7_KjU) * 0.5f, jM73getBlack400d7_KjU)), (byte) 7)), "TWENTY_ONE_DOTA_CARD_IMAGE"), 0.0f, fetVar, 120);
                i8 = i9;
                itO = itO;
                i7 = 6;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(i, a4xVar2, mm40Var);
        }
    }

    public static final void j(lc00 lc00Var, String str) {
        pz40 pz40Var = s6t0.f31722a;
        lc00Var.add(new p2n0(new hjm(str, null, new y3d(s6t0.b().f33626a.getSecondary()), null, null, null, false, null, null, false, null, null, 8186)));
    }

    public static final q2n0 k(lc00 lc00Var, m0n0 m0n0Var, String str, wui0 wui0Var, pvi0 pvi0Var, boolean z) {
        pz40 pz40Var = s6t0.f31722a;
        q2n0 q2n0Var = new q2n0(new rqm(new tui0(str, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, pvi0Var, (d4d) null, (tvi0) null, wui0Var, z, (e900) null, 314), m0n0Var);
        lc00Var.add(q2n0Var);
        return q2n0Var;
    }

    public static /* synthetic */ void l(lc00 lc00Var, m0n0 m0n0Var, String str, wui0 wui0Var, pvi0 pvi0Var, int i) {
        if ((i & 8) != 0) {
            pvi0Var = null;
        }
        k(lc00Var, m0n0Var, str, wui0Var, pvi0Var, true);
    }

    public static final r2n0 m(lc00 lc00Var, e1n0 e1n0Var, String str, String str2, wui0 wui0Var, boolean z) {
        r2n0 r2n0Var = new r2n0(new c6q0(str, e6q0.f7299a, o6q0.f24750a, r7q0.f29989a, z, false, null, str2, null, false, 0, null, 261504), e1n0Var, wui0Var);
        lc00Var.add(r2n0Var);
        return r2n0Var;
    }

    public static void n(lc00 lc00Var, e1n0 e1n0Var, String str, String str2, g0n0 g0n0Var, String str3, boolean z, boolean z2, int i) {
        lc00Var.add(new s2n0(new c6q0(str, e6q0.f7299a, (i & 32) != 0 ? o6q0.f24750a : g6q0.f10780a, r7q0.f29989a, true, (i & 256) != 0 ? false : z2, null, str2, null, false, 0, null, 261504), e1n0Var, g0n0Var, new wul(lul.e, oe9.f25112a, new ue9(str3), (i & 128) != 0 ? true : z, false, false)));
    }

    public static void o(fhl fhlVar, a9q0 a9q0Var, long j, long j2, int i) {
        long jB = (i & 2) != 0 ? y3d.g : j;
        smk0 smk0Var = a9q0Var.f491a.b.f42262a;
        ljj0 ljj0Var = smk0Var.n;
        k5q0 k5q0Var = smk0Var.m;
        agc agcVar = smk0Var.o;
        nr nrVarA0 = fhlVar.A0();
        long jP = nrVarA0.p();
        nrVarA0.i().l();
        try {
            fvt0 fvt0Var = (fvt0) nrVarA0.b;
            fvt0Var.A(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            boolean zF = a9q0Var.f();
            bw40 bw40Var = a9q0Var.b;
            z8q0 z8q0Var = a9q0Var.f491a;
            if (zF && z8q0Var.f != 3) {
                long j3 = a9q0Var.c;
                fvt0.m(fvt0Var, (int) (j3 >> 32), (int) (j3 & 4294967295L), 16);
            }
            y9q0 y9q0Var = z8q0Var.b;
            t89 t89VarL = y9q0Var.f42262a.f32451a.l();
            if (t89VarL == null || jB != 16) {
                x5a x5aVarI = fhlVar.A0().i();
                if (jB == 16) {
                    jB = y9q0Var.b();
                }
                bw40Var.i(x5aVarI, jtt0.o(Float.NaN, jB), ljj0Var, k5q0Var, agcVar);
            } else {
                x8f.X(bw40Var, fhlVar.A0().i(), t89VarL, Float.isNaN(Float.NaN) ? y9q0Var.f42262a.f32451a.g() : Float.NaN, ljj0Var, k5q0Var, agcVar);
            }
        } finally {
            defpackage.c.g(nrVarA0, jP);
        }
    }

    public static final r0n p(d0t d0tVar) {
        boolean zJ0 = kpb.j0(d0tVar);
        rqs rqsVar = d0tVar.p;
        Date date = d0tVar.P;
        if (zJ0) {
            return new p0n(TimeUnit.SECONDS.toMillis(d0tVar.t), fgm.b, date.getTime(), kpb.j0(d0tVar), 16);
        }
        if (!d0tVar.C || d0tVar.z || rqsVar.j == 0) {
            return o0n.f24435a;
        }
        return new p0n(kpb.r0(d0tVar), rqsVar.k == -1 ? fgm.b : fgm.f9498a, date.getTime(), false, 24);
    }

    public static void q(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            khu0.b(viewGroup, z);
        } else if (f36694a) {
            try {
                khu0.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f36694a = false;
            }
        }
    }

    public static final kjo0 r(Integer num) {
        if (num != null && num.intValue() == 1) {
            return kjo0.BATSMAN;
        }
        if (num != null && num.intValue() == 2) {
            return kjo0.BOWLER;
        }
        return (num != null && num.intValue() == 3) ? kjo0.PARTNERSHIP : kjo0.UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final ahp0 s(ugp0 ugp0Var) {
        ?? arrayList;
        List<ehp0> list;
        Integer num;
        Integer num2;
        php0 php0Var = ugp0Var.c;
        int iIntValue = (php0Var == null || (num2 = php0Var.f27010a) == null) ? -1 : num2.intValue();
        int iIntValue2 = (php0Var == null || (num = php0Var.b) == null) ? -1 : num.intValue();
        if (php0Var == null || (list = php0Var.c) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (ehp0 ehp0Var : list) {
                ehp0Var.getClass();
                Integer num3 = ehp0Var.f7818a;
                int iIntValue3 = num3 != null ? num3.intValue() : -1;
                Integer num4 = ehp0Var.b;
                arrayList.add(new bhp0(iIntValue3, num4 != null ? num4.intValue() : -1));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new ahp0(iIntValue, iIntValue2, arrayList);
    }

    public static final vhv0 t(j0w0 j0w0Var, cwk cwkVar) {
        t9o0 t9o0Var = (t9o0) ((hgk0) cwkVar.b()).getValue();
        if (Intrinsics.d(j0w0Var, c0w0.f3544a)) {
            return new niq(0);
        }
        if (Intrinsics.d(j0w0Var, e0w0.f7010a)) {
            return new ciq(obb.d0(cwkVar), obb.f0(cwkVar), obb.e0(cwkVar), obb.c0(cwkVar));
        }
        if (Intrinsics.d(j0w0Var, zzv0.f45274a)) {
            return i120.N(obb.d0(cwkVar), 0.0f, obb.e0(cwkVar), 0.0f, 10);
        }
        if (Intrinsics.d(j0w0Var, i0w0.f13967a)) {
            return i120.N(0.0f, obb.f0(cwkVar), 0.0f, obb.c0(cwkVar), 5);
        }
        if (Intrinsics.d(j0w0Var, f0w0.f8736a)) {
            return i120.N(0.0f, t9o0Var.f33576a, 0.0f, 0.0f, 13);
        }
        if (Intrinsics.d(j0w0Var, b0w0.f1780a)) {
            return i120.N(t9o0Var.c, 0.0f, t9o0Var.d, t9o0Var.b, 2);
        }
        if (Intrinsics.d(j0w0Var, g0w0.f10480a)) {
            return new ciq(t9o0Var.c, t9o0Var.f33576a, t9o0Var.d, t9o0Var.b);
        }
        if (Intrinsics.d(j0w0Var, a0w0.f40a)) {
            return i120.N(obb.d0(cwkVar), 0.0f, 0.0f, 0.0f, 14);
        }
        if (Intrinsics.d(j0w0Var, d0w0.f5285a)) {
            return i120.N(0.0f, 0.0f, obb.e0(cwkVar), 0.0f, 11);
        }
        if (Intrinsics.d(j0w0Var, h0w0.f12254a)) {
            return i120.N(0.0f, obb.f0(cwkVar), 0.0f, 0.0f, 13);
        }
        if (Intrinsics.d(j0w0Var, xzv0.f41773a)) {
            return i120.N(0.0f, 0.0f, 0.0f, obb.c0(cwkVar), 7);
        }
        if (j0w0Var instanceof yzv0) {
            yzv0 yzv0Var = (yzv0) j0w0Var;
            return new ciq(yzv0Var.f43535a, 0.0f, yzv0Var.b, yzv0Var.c);
        }
        t9f.b();
        return null;
    }

    public static int u(int i, Context context) {
        SizeF sizeF;
        context.getClass();
        Bundle appWidgetOptions = AppWidgetManager.getInstance(context).getAppWidgetOptions(i);
        n0o0 n0o0VarB = maz.b(new qev0(appWidgetOptions, (byte) 0));
        if (Build.VERSION.SDK_INT < 31) {
            return a4n0.i(((Number) n0o0VarB.getValue()).intValue(), context);
        }
        ArrayList parcelableArrayList = appWidgetOptions.getParcelableArrayList("appWidgetSizes");
        return (parcelableArrayList == null || (sizeF = (SizeF) CollectionsKt.f0(parcelableArrayList)) == null) ? a4n0.i(((Number) n0o0VarB.getValue()).intValue(), context) : a4n0.i((int) sizeF.getWidth(), context);
    }

    public static final mm40 v(mm40 mm40Var, j0w0[] j0w0VarArr, fet fetVar) {
        mm40Var.getClass();
        List listG0 = tx3.g0(j0w0VarArr);
        listG0.getClass();
        cwk cwkVar = (cwk) fetVar.k(jr00.b);
        vhv0 niqVar = new niq(0);
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            niqVar = new y7t0(niqVar, t((j0w0) it.next(), cwkVar));
        }
        return j120.k0(mm40Var, niqVar);
    }

    public static final bgx w(j0w0[] j0w0VarArr, fet fetVar) {
        List listG0 = tx3.g0(j0w0VarArr);
        listG0.getClass();
        cwk cwkVar = (cwk) fetVar.k(jr00.b);
        vhv0 niqVar = new niq(0);
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            niqVar = new xw(niqVar, t((j0w0) it.next(), cwkVar));
        }
        return i120.O(niqVar, fetVar);
    }

    public static fcw0 x(fck0 fck0Var, n7x0 n7x0Var) throws GeneralSecurityException {
        icw0 icw0VarV;
        List arrayList;
        if (!x7x0.a(fck0Var)) {
            hny.o("keyset doesn't contain a valid primary key");
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) fck0Var.b).size(); i++) {
            dow0 dow0VarQ = fck0Var.q(i);
            if (dow0VarQ.c == pfw.g) {
                atm0 atm0Var = dow0VarQ.f6432a;
                if (atm0Var instanceof qqw0) {
                    icw0VarV = ((qqw0) atm0Var).u();
                } else {
                    if (!(atm0Var instanceof o5x0)) {
                        throw new GeneralSecurityException(ua80.i("Cannot get output prefix for key of class ", atm0Var.getClass().getName(), " with parameters ", String.valueOf(atm0Var.s())));
                    }
                    icw0VarV = ((o5x0) atm0Var).v();
                }
                sxw0 sxw0Var = new sxw0((tmw0) n7x0Var.d(dow0VarQ), dow0VarQ.d);
                byte[] bArr = icw0VarV.f14556a;
                if (bArr.length != 0 && bArr.length != 5) {
                    hny.o("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (map.containsKey(icw0VarV)) {
                    arrayList = (List) map.get(icw0VarV);
                } else {
                    arrayList = new ArrayList();
                    map.put(icw0VarV, arrayList);
                }
                arrayList.add(sxw0Var);
            }
        }
        fck0Var.x();
        return new fcw0(new sxw0((tmw0) n7x0Var.d(fck0Var.D()), fck0Var.D().d), new b7x0(map));
    }
}
