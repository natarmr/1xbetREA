package a;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.javax.sip.message.Response;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f7685a = new ugd(1576309473, false, new vgd(2));
    public static final ugd b = new ugd(1507559052, false, new zgd(2));
    public static final ugd c = new ugd(-93240146, false, new i5b(20));
    public static final ugd d = new ugd(1226322756, false, new zgd(3));
    public static final ugd e = new ugd(-1110783937, false, new zgd(4));
    public static final ugd f = new ugd(621820585, false, new qbd((byte) 16));
    public static final ugd g = new ugd(-1332458597, false, new qbd((byte) 17));
    public static final ugd h = new ugd(-1877551690, false, new bhd(22));
    public static final ugd i = new ugd(-839081236, false, new jhd(12));
    public static final ugd j = new ugd(-316275731, false, new jhd(13));
    public static final ugd k = new ugd(-258393852, false, new ihd(17));
    public static final ugd l = new ugd(338116438, false, new jhd(14));
    public static final ugd m = new ugd(-464889270, false, new ohd(10));
    public static final Object n = new Object();
    public static Method o;
    public static boolean p;

    public static final void A(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1755103681);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "PLAYER_TRANSFERS_SCREEN_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            vdx.q(((jea0) l7m0Var.getValue()).f16365a, function1, fetVar, i3 & 112);
            B(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 11);
        }
    }

    public static final void B(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        fet fetVar2;
        fetVar.g0(2005843929);
        byte b2 = 2;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 1;
        byte b4 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new wda0(l7m0Var, b4));
                fetVar.o0(objP);
            }
            vda0 vda0Var = (vda0) ((l7m0) objP).getValue();
            if (Intrinsics.d(vda0Var, tda0.f33759a)) {
                fetVar.e0(216824938);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = jgk0.b(new wda0(l7m0Var, b3));
                    fetVar.o0(objP2);
                }
                l7m0 l7m0Var2 = (l7m0) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = jgk0.b(new wda0(l7m0Var, b2));
                    fetVar.o0(objP3);
                }
                function2 = function1;
                fetVar2 = fetVar;
                D(l7m0Var2, (l7m0) objP3, ddz.a(0, 0, fetVar, 0, 3), function2, fetVar2, ((i3 << 6) & 7168) | 54);
                fetVar2.r(false);
            } else {
                function2 = function1;
                fetVar2 = fetVar;
                if (!(vda0Var instanceof uda0)) {
                    throw b1j.f(-824292083, fetVar2, false);
                }
                fetVar2.e0(217288140);
                Object objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new l3a0((uda0) vda0Var, (byte) 9));
                    fetVar2.o0(objP4);
                }
                p((l7m0) objP4, function2, fetVar2, (i3 & 112) | 6);
                fetVar2.r(false);
            }
        } else {
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function2, i2, (byte) 12);
        }
    }

    public static final void C(mm40 mm40Var, xcz xczVar, boolean z, l7m0 l7m0Var, Function1 function1, Function1 function2, Function2 function3, fet fetVar, int i2) {
        fetVar.g0(2129496366);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(l7m0Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536) | (fetVar.i(function3) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            zcl zclVar = qmk.f28987a;
            hh80 lh80Var = new lh80(xfn.a(fetVar).d, 6.0f, xfn.a(fetVar).d, z ? 150.0f : 28.0f);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            if (z) {
                fetVar.e0(2041598268);
            } else {
                fetVar.e0(2041599392);
                lh80Var = knm0.g(lh80Var, fetVar);
            }
            fetVar.r(false);
            b8k0.d(mm40VarE, xczVar, l7m0Var, null, lh80Var, false, null, u1c.M(1217921200, new qb((Object) function1, (Object) function2, (Object) function3, (byte) 25, (byte) 0), fetVar), fetVar, (i3 & 112) | 100663296 | ((i3 >> 3) & 896), 216);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, (Object) xczVar, z, (Object) l7m0Var, function1, function2, function3, i2, (byte) 1);
        }
    }

    public static final void D(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var3;
        int i3;
        l7m0 l7m0Var4;
        fetVar.g0(425022134);
        if ((i2 & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i3 = (fetVar.g(l7m0Var3) ? 4 : 2) | i2;
        } else {
            l7m0Var3 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 32 : 16;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = xfn.a(fetVar).c;
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var3, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(f2, 8.0f, f2, 28.0f, fetVar), z, null, u1c.M(1084427252, new nc40(function1, (byte) 9), fetVar), fetVar, ((i3 >> 3) & 112) | 100663302 | ((i3 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgz(l7m0Var, l7m0Var4, xczVar, function1, i2, (byte) 1);
        }
    }

    public static final void E(final ye60 ye60Var, final boolean z, final xsf0 xsf0Var, final boolean z2, long j2, final float f2, final mm40 mm40Var, fet fetVar, final int i2) {
        int i3;
        long j3;
        int i4;
        long j4;
        boolean z3;
        fetVar.g0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(ye60Var) : fetVar.i(ye60Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(xsf0Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.g(mm40Var) ? 1048576 : 524288;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (533651 & i3) != 533650)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                fetVar.X();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            fetVar.s();
            if (z) {
                zai0 zai0Var = h5i0.f12481a;
                z3 = (xsf0Var == xsf0.f41414a && !z2) || (xsf0Var == xsf0.b && z2);
            } else {
                zai0 zai0Var2 = h5i0.f12481a;
                z3 = (xsf0Var != xsf0.f41414a || z2) && !(xsf0Var == xsf0.b && z2);
            }
            wx7 wx7Var = z3 ? aad.c : aad.b;
            int i5 = i4 & 14;
            boolean zH = ((i4 & 112) == 32) | (i5 == 4 || ((i4 & 8) != 0 && fetVar.i(ye60Var))) | fetVar.h(z3);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new cj(b2, ye60Var, z, z3);
                fetVar.o0(objP);
            }
            wx7 wx7Var2 = wx7Var;
            j3 = j4;
            x(ye60Var, wx7Var2, u1c.M(1365123137, new u13((wgu0) fetVar.k(bmd.t), j3, z3, pai0.a(mm40Var, false, (Function1) objP), ye60Var), fetVar), fetVar, i5 | 384);
        } else {
            fetVar.X();
            j3 = j2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final long j5 = j3;
            yfe0VarU.d = new Function2() { // from class: a.v13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eeq.E(ye60Var, z, xsf0Var, z2, j5, f2, mm40Var, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void F(int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i3;
        fetVar.g0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.i(function0) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            zai0 zai0Var = h5i0.f12481a;
            qxw.o(fetVar, kbc.O(o7k0.p(mm40Var, 25.0f, 25.0f), new f0(function0, z)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13(mm40Var, function0, z, i2);
        }
    }

    public static final void G(mm40 mm40Var, String str, String str2, Function0 function0, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2;
        fetVar.g0(584112903);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i6 & 1, (i6 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.k(), fetVar), fetVar, (i6 >> 3) & 14, 24960, 110590);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i6 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new dbn(function0, (byte) 10);
                fetVar.o0(objP2);
            }
            v8q0.a(str2, y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(g1t0.k(), fetVar), fetVar, (i6 >> 6) & 14, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        mm40 mm40Var3 = mm40Var2;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j4q(mm40Var3, str, str2, function0, i2, i3);
        }
    }

    public static final void H(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1034189146);
        int i3 = i2 | 6;
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(vqm.f37862a, fetVar2, 6, 0);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP = vgg0.a(16.0f);
                fetVar2.o0(objP);
            }
            ugg0 ugg0Var = (ugg0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                fetVar2.o0(objP2);
            }
            ugg0 ugg0Var2 = (ugg0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                fetVar2.o0(objP3);
            }
            ugg0 ugg0Var3 = (ugg0) objP3;
            mm40 mm40VarL = s5x0.L(wha0.a0(o7k0.c, wha0.T(fetVar2), false, 14), xfn.a(fetVar2).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            ijm ijmVar = new ijm();
            kjm kjmVar = kjm.b;
            zcl zclVar4 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            nkb.h(s5x0.L(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), xfn.a(fetVar2).e, 0.0f, 2), ijmVar, kjmVar, null, null, null, fetVar, 384, 56);
            O(null, ugg0Var, true, fqj0VarD0, false, fetVar, 25008);
            nkb.h(s5x0.L(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).e, 0.0f, 2), new ijm(), kjmVar, null, null, null, fetVar, 384, 56);
            O(null, ugg0Var2, true, fqj0VarD0, true, fetVar, 25008);
            ljc ljcVar = jd8.n;
            O(null, ljcVar, false, fqj0VarD0, true, fetVar, 25008);
            O(null, ugg0Var3, true, fqj0VarD0, false, fetVar, 25008);
            nkb.h(s5x0.L(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).e, 0.0f, 2), new ijm(), kjmVar, null, null, null, fetVar, 384, 56);
            fetVar2 = fetVar;
            O(null, ugg0Var2, true, fqj0VarD0, true, fetVar2, 25008);
            O(null, ljcVar, false, fqj0VarD0, true, fetVar2, 25008);
            O(null, ugg0Var3, true, fqj0VarD0, false, fetVar2, 25008);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tsu0(mm40Var2, i2, b2);
        }
    }

    public static final void I(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1221120521);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 136.0f), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundGroup(), vgg0.a(8.0f)), vgg0.a(8.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i2, (byte) 14);
        }
    }

    public static final void J(mm40 mm40Var, float f2, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-236543104);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.d(f2) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            nkb.h(s5x0.L(jm40Var, 8.0f + f2, 0.0f, 2), new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new ejk0((byte) 28);
                fetVar2.o0(objP);
            }
            fetVar2 = fetVar;
            b8k0.f(mm40VarD2, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 805306374, 490);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f2, i2, (byte) 8);
        }
    }

    public static final void K(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(760871043);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 64.0f), 56.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC0 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 18);
        }
    }

    public static final void L(mm40 mm40Var, ssm ssmVar, float f2, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i2, int i3) {
        ssmVar.getClass();
        if ((i3 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        if ((i3 & 16) != 0) {
            function0 = null;
        }
        if ((i3 & 32) != 0) {
            function2 = null;
        }
        if (!(ssmVar instanceof qsm)) {
            mm40 mm40Var2 = mm40Var;
            if (!(ssmVar instanceof rsm)) {
                throw b1j.f(1393444899, fetVar, false);
            }
            fetVar.e0(247604991);
            J(mm40Var2, f2, fetVar, (i2 & 14) | ((i2 >> 3) & 112));
            fetVar.r(false);
            return;
        }
        fetVar.e0(247191606);
        Function0 function3 = function2;
        mm40 mm40Var3 = mm40Var;
        t(mm40Var3, (qsm) ssmVar, f2, function1, function0, function3, xdrVar, fetVar, 4194302 & i2);
        fetVar.r(false);
    }

    public static final void M(v4q v4qVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1935568623);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar2.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(v4qVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(i120.Q(o7k0.e(jm40Var, 112.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 16.0f, 22.0f);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarK, zx7Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String strW = rsm0.w(R.string.season_header, 0, fetVar2);
            u4q u4qVar = v4qVar.b;
            String str = u4qVar.b;
            int i5 = i3 & 896;
            boolean z2 = i5 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new mfp(function1, (byte) 24);
                fetVar2.o0(objP);
            }
            G(null, strW, str, (Function0) objP, fetVar2, 0, 1);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 28.0f, 0.0f, 0.0f, 13);
            String strW2 = rsm0.w(R.string.tennis_math_type_header, 0, fetVar2);
            String str2 = u4qVar.f35063a;
            boolean z3 = i5 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new mfp(function1, (byte) 25);
                fetVar2.o0(objP2);
            }
            G(mm40VarN, strW2, str2, (Function0) objP2, fetVar, 0, 0);
            fetVar.r(true);
            mm40 mm40VarB2 = jr8Var.b(s5x0.N(s5x0.K(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 12.0f), 0.0f, 0.0f, 0.0f, 28.0f, 7), gqw0.g);
            wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.apply_settings, 0, fetVar)), u4qVar.c, false, false);
            boolean z4 = i5 == 256;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new mfp(function1, (byte) 26);
                fetVar.o0(objP3);
            }
            qzb.n(mm40VarB2, wulVar, (Function0) objP3, fetVar, 0, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n(v4qVar, function1, i2);
        }
    }

    public static final void N(mm40 mm40Var, final c8r0 c8r0Var, final Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        ljc ljcVar = jd8.n;
        fetVar2.g0(-778809230);
        int i3 = i2 | (fetVar2.g(c8r0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        final byte b2 = 1;
        final byte b3 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = c8r0Var instanceof a8r0;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar2.e0(-92215015);
                mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(o7k0.w(s5x0.L(mm40VarQ, 0.0f, 8.0f, 1), null, false, 3), 1.0f);
                int i4 = i3 & 112;
                int i5 = i3 & 896;
                boolean z2 = (i4 == 32) | (i5 == 256);
                Object objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new Function1() { // from class: a.q450
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b3;
                            Function1 function2 = function1;
                            c8r0 c8r0Var2 = c8r0Var;
                            switch (b4) {
                                case 0:
                                    Context context = (Context) obj;
                                    context.getClass();
                                    DsAccountSelection dsAccountSelection = new DsAccountSelection(new ContextThemeWrapper(context, R.style.Widget_DSAccountSelection_Primary), null, 6);
                                    eeq.V(dsAccountSelection, (a8r0) c8r0Var2, function2);
                                    return dsAccountSelection;
                                default:
                                    DsAccountSelection dsAccountSelection2 = (DsAccountSelection) obj;
                                    dsAccountSelection2.getClass();
                                    eeq.V(dsAccountSelection2, (a8r0) c8r0Var2, function2);
                                    return Unit.f46060a;
                            }
                        }
                    };
                    fetVar2.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean z3 = (i4 == 32) | (i5 == 256);
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new Function1() { // from class: a.q450
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b2;
                            Function1 function3 = function1;
                            c8r0 c8r0Var2 = c8r0Var;
                            switch (b4) {
                                case 0:
                                    Context context = (Context) obj;
                                    context.getClass();
                                    DsAccountSelection dsAccountSelection = new DsAccountSelection(new ContextThemeWrapper(context, R.style.Widget_DSAccountSelection_Primary), null, 6);
                                    eeq.V(dsAccountSelection, (a8r0) c8r0Var2, function3);
                                    return dsAccountSelection;
                                default:
                                    DsAccountSelection dsAccountSelection2 = (DsAccountSelection) obj;
                                    dsAccountSelection2.getClass();
                                    eeq.V(dsAccountSelection2, (a8r0) c8r0Var2, function3);
                                    return Unit.f46060a;
                            }
                        }
                    };
                    fetVar2.o0(objP2);
                }
                dwi0.b(function2, mm40VarD, (Function1) objP2, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                if (!(c8r0Var instanceof b8r0)) {
                    throw b1j.f(-1111354866, fetVar2, false);
                }
                fetVar2.e0(-91409294);
                mm40 mm40VarQ2 = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ2, 12.0f, 8.0f);
                b8r0 b8r0Var = (b8r0) c8r0Var;
                String str = b8r0Var.f2171a;
                String str2 = b8r0Var.b;
                int i6 = i3 & 896;
                boolean z4 = i6 == 256;
                Object objP3 = fetVar2.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new w250(function1, (byte) 8);
                    fetVar2.o0(objP3);
                }
                Function0 function0 = (Function0) objP3;
                b2 = i6 != 256 ? (byte) 0 : (byte) 1;
                Object objP4 = fetVar2.P();
                if (b2 != 0 || objP4 == cl5Var) {
                    objP4 = new w250(function1, (byte) 2);
                    fetVar2.o0(objP4);
                }
                pzb.g(mm40VarK, str, str2, function0, (Function0) objP4, fetVar2, 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, c8r0Var, function1, i2, (byte) 25);
        }
    }

    public static final void O(mm40 mm40Var, yjj0 yjj0Var, boolean z, fqj0 fqj0Var, boolean z2, fet fetVar, int i2) {
        yjj0 yjj0Var2;
        mm40 mm40Var2;
        fqj0 fqj0Var2 = fqj0Var;
        fetVar.g0(-110436658);
        int i3 = i2 | 6 | (fetVar.g(fqj0Var2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            yjj0Var2 = yjj0Var;
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.d(o7k0.e(mm40Var2, 60.0f), 1.0f), yjj0Var2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
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
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarL = s5x0.L(mm40Var2, 12.0f, 0.0f, 2);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarL, zx7Var);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fqj0Var2 = fqj0Var;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.n(mm40Var2, 40.0f), vgg0.f37379a), fqj0Var2));
            qxw.o(fetVar, o7k0.s(mm40Var2, 12.0f));
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var2, 16.0f), z ? 128.0f : 96.0f);
            zcl zclVar2 = qmk.e;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), fqj0Var2, fetVar, 0, true);
            if (z2) {
                fetVar.e0(-610421227);
                mbc.o(agi0.f827a, s5x0.N(jr8Var.b(mm40Var2, gqw0.h), 60.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(-610181938);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            yjj0Var2 = yjj0Var;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5(mm40Var2, yjj0Var2, z, fqj0Var2, z2, i2);
        }
    }

    public static final void P(final n0v0 n0v0Var, final Function1 function1, fet fetVar, int i2) {
        n0v0Var.getClass();
        function1.getClass();
        fetVar.g0(1509380300);
        int i3 = i2 | (fetVar.g(n0v0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            final long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            m8x.y(jm40.b, u1c.M(1587651472, new qzu0(n0v0Var, function1, b2), fetVar), u1c.M(1780582673, new qzu0(n0v0Var, function1, b3), fetVar), null, null, 0, background, 0L, null, u1c.M(1371153627, new xdr() { // from class: a.rzu0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    hh80 hh80Var = (hh80) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    hh80Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        n0q n0qVar = o7k0.c;
                        mm40 mm40VarQ = i120.Q(s5x0.I(n0qVar, hh80Var), background, jd8.n);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                        n0v0 n0v0Var2 = n0v0Var;
                        if (n0v0Var2 != null) {
                            if (n0v0Var2 instanceof m0v0) {
                                fetVar2.e0(1902079765);
                                eeq.H(0, fetVar2, null);
                                fetVar2.r(false);
                            } else {
                                boolean z = n0v0Var2 instanceof l0v0;
                                Function1 function2 = function1;
                                cl5 cl5Var = ukd.f35823a;
                                if (z) {
                                    fetVar2.e0(1902183646);
                                    mdm mdmVar = ((l0v0) n0v0Var2).f19220a;
                                    boolean zG = fetVar2.g(function2);
                                    Object objP = fetVar2.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new ntu0(function2, (byte) 3);
                                        fetVar2.o0(objP);
                                    }
                                    jcb.l(null, mdmVar, false, (Function0) objP, fetVar2, 0, 5);
                                    fetVar2.r(false);
                                } else if (n0v0Var2 instanceof k0v0) {
                                    fetVar2.e0(1902526351);
                                    wom womVarF = mom.f(fetVar2);
                                    boolean z2 = ((k0v0) n0v0Var2).b;
                                    boolean zG2 = fetVar2.g(function2);
                                    Object objP2 = fetVar2.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new ntu0(function2, (byte) 4);
                                        fetVar2.o0(objP2);
                                    }
                                    mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP2, null, u1c.M(1194713706, new ri1(n0v0Var2, function2, (byte) 13), fetVar2), fetVar2, 100663302, 184);
                                    fetVar2 = fetVar2;
                                    fetVar2.r(false);
                                }
                            }
                            fetVar2.r(true);
                        }
                        throw b1j.f(1446832288, fetVar2, false);
                    }
                    fetVar2.X();
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 805306806, 440);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qzu0(n0v0Var, function1, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final vz2 Q(pi9 pi9Var, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        vz2 vz2VarC = lgb.f20000a;
        uw2 uw2VarA = lgb.b;
        a6a a6aVar = lgb.c;
        if (vz2VarC == null || uw2VarA == null) {
            vz2VarC = azw.c(iCeil, iCeil, 1);
            lgb.f20000a = vz2VarC;
            uw2VarA = vw2.a(vz2VarC);
            lgb.b = uw2VarA;
        } else {
            Bitmap bitmap = vz2VarC.f38278a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                vz2VarC = azw.c(iCeil, iCeil, 1);
                lgb.f20000a = vz2VarC;
                uw2VarA = vw2.a(vz2VarC);
                lgb.b = uw2VarA;
            }
        }
        vz2 vz2Var = vz2VarC;
        uw2 uw2Var = uw2VarA;
        if (a6aVar == null) {
            a6aVar = new a6a();
            lgb.c = a6aVar;
        }
        a6a a6aVar2 = a6aVar;
        z5a z5aVar = a6aVar2.f308a;
        k6z layoutDirection = pi9Var.f27033a.getLayoutDirection();
        Bitmap bitmap2 = vz2Var.f38278a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        w6k w6kVar = z5aVar.f43806a;
        k6z k6zVar = z5aVar.b;
        x5a x5aVar = z5aVar.c;
        long j2 = z5aVar.d;
        z5aVar.f43806a = pi9Var;
        z5aVar.b = layoutDirection;
        z5aVar.c = uw2Var;
        z5aVar.d = jFloatToRawIntBits;
        uw2Var.l();
        fhl.u(a6aVar2, y3d.b, 0L, a6aVar2.d(), 0.0f, null, null, 0, 58);
        fhl.u(a6aVar2, fbc.f(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, null, null, 0, 120);
        fhl.E(a6aVar2, fbc.f(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, null, 120);
        uw2Var.i();
        z5aVar.f43806a = w6kVar;
        z5aVar.b = k6zVar;
        z5aVar.c = x5aVar;
        z5aVar.d = j2;
        return vz2Var;
    }

    public static final String R(Date date, boolean z, boolean z2, cw1 cw1Var, Locale locale) {
        int iOrdinal = cw1Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            rdj rdjVar = rdj.f30294a;
            efj efjVar = efj.UNIVERSAL;
            return rdj.d(rdjVar, date, Boolean.valueOf(z2), locale, 24);
        }
        if (iOrdinal != 3) {
            t9f.b();
            return null;
        }
        if (!z) {
            return rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, locale, 28);
        }
        rdj rdjVar2 = rdj.f30294a;
        ykq0 ykq0Var = ykq0.UNIVERSAL;
        Locale localeM = rdj.m(locale);
        if (date.getTime() <= 0) {
            return "";
        }
        String str = new SimpleDateFormat(!z2 ? "hh:mm a" : "HH:mm", localeM).format(date);
        str.getClass();
        return rdj.j(str, localeM);
    }

    public static final String S(Date date, ctf0 ctf0Var, cw1 cw1Var, Locale locale) {
        int iOrdinal = cw1Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return R(date, false, ctf0Var.h(), cw1Var, locale);
        }
        if (iOrdinal == 3) {
            return R(date, false, ctf0Var.h(), cw1Var, locale);
        }
        t9f.b();
        return null;
    }

    public static final esr T(Integer num) {
        if (num != null && num.intValue() == 0) {
            return esr.NOTHING;
        }
        if (num != null && num.intValue() == 1) {
            return esr.DOUBLE_BONUS;
        }
        if (num != null && num.intValue() == 2) {
            return esr.RETURN_HALF;
        }
        if (num != null && num.intValue() == 3) {
            return esr.FREE_BET;
        }
        if (num != null && num.intValue() == 4) {
            return esr.FREE_SPIN;
        }
        if (num != null && num.intValue() == 5) {
            return esr.WILD_FREE_BET;
        }
        if (num != null && num.intValue() == 666) {
            return esr.SPECIAL_BONUS;
        }
        jf4.k("Not supported bonus type");
        return null;
    }

    public static final Object U(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        eeo eeoVarA;
        CoroutineContext coroutineContextA;
        long jH;
        kotlin.coroutines.f fVar = kotlin.coroutines.d.d1;
        if (((kotlin.coroutines.d) coroutineContext.get(fVar)) == null) {
            eeoVarA = gcq0.a();
            coroutineContextA = jne.a(kotlin.coroutines.g.f46065a, coroutineContext.plus(eeoVarA), true);
            rwj rwjVar = tvk.f34603a;
            if (coroutineContextA != rwjVar && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(rwjVar);
            }
        } else {
            eeoVarA = (eeo) gcq0.f11075a.get();
            coroutineContextA = jne.a(kotlin.coroutines.g.f46065a, coroutineContext, true);
            rwj rwjVar2 = tvk.f34603a;
            if (coroutineContextA != rwjVar2 && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(rwjVar2);
            }
        }
        ta8 ta8Var = new ta8(coroutineContextA, Thread.currentThread(), eeoVarA);
        ta8Var.d0(yne.f42936a, ta8Var, function2);
        eeo eeoVar = ta8Var.f;
        if (eeoVar != null) {
            int i2 = eeo.f;
            eeoVar.F(false);
        }
        while (true) {
            if (eeoVar != null) {
                try {
                    jH = eeoVar.H();
                } catch (Throwable th) {
                    if (eeoVar != null) {
                        int i3 = eeo.f;
                        eeoVar.x(false);
                    }
                    throw th;
                }
            } else {
                jH = Long.MAX_VALUE;
            }
            if (ta8Var.isCompleted()) {
                break;
            }
            LockSupport.parkNanos(ta8Var, jH);
            if (Thread.interrupted()) {
                ta8Var.r(new InterruptedException());
            }
        }
        if (eeoVar != null) {
            int i4 = eeo.f;
            eeoVar.x(false);
        }
        Object objA = qby.a(ta8Var.H());
        udd uddVar = objA instanceof udd ? (udd) objA : null;
        if (uddVar == null) {
            return objA;
        }
        throw uddVar.f35472a;
    }

    public static final void V(DsAccountSelection dsAccountSelection, a8r0 a8r0Var, Function1 function1) {
        dsAccountSelection.setStyle(a8r0Var.a());
        if (!(a8r0Var instanceof x7r0)) {
            dsAccountSelection.setAccountTitle("");
            dsAccountSelection.setTopUpButtonTitle("");
            dsAccountSelection.x("", "");
            return;
        }
        DsAccountSelection.v(dsAccountSelection, new w250(function1, (byte) 3), 3);
        dsAccountSelection.A(ivb0.b, new w250(function1, (byte) 4));
        DsAccountSelection.z(dsAccountSelection, new w250(function1, (byte) 5));
        x7r0 x7r0Var = (x7r0) a8r0Var;
        dsAccountSelection.setAccountTitle(x7r0Var.b);
        dsAccountSelection.setTopUpButtonTitle(x7r0Var.e);
        pn40 pn40Var = pn40.f27267a;
        dsAccountSelection.x(pn40.c(x7r0Var.c, p3u0.c), x7r0Var.d);
    }

    public static final mm40 W(mm40 mm40Var, hcp0 hcp0Var, bu buVar, f7q0 f7q0Var, sme smeVar) {
        return mm40Var.e(new i5q0(hcp0Var, buVar, f7q0Var, smeVar));
    }

    public static final so30 X(HistoryMenuItem historyMenuItem, boolean z) {
        int iN;
        historyMenuItem.getClass();
        if (historyMenuItem == HistoryMenuItem.b) {
            return new so30(R.drawable.ic_glyph_hide, historyMenuItem);
        }
        if (historyMenuItem == HistoryMenuItem.f46392a) {
            iN = z ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new;
        } else {
            iN = kkb.N(historyMenuItem);
        }
        return new so30(iN, historyMenuItem);
    }

    public static final void a(di0 di0Var, Function1 function1, fet fetVar, int i2) {
        ArrayList arrayList;
        di0Var.getClass();
        fetVar.g0(-1582372210);
        byte b2 = 2;
        int i3 = (i2 & 6) == 0 ? (fetVar.g(di0Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (di0Var instanceof bi0) {
                arrayList = ((bi0) di0Var).f2634a;
            } else {
                if (!di0Var.equals(ci0.f4388a)) {
                    t9f.b();
                    return;
                }
                arrayList = new ArrayList(6);
                for (int i4 = 0; i4 < 6; i4++) {
                    arrayList.add(oh0.f25241a);
                }
            }
            int size = arrayList.size();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, ((size - 1) * 8.0f) + (64.0f * size)), 1.0f);
            int i5 = i3;
            ngv ngvVar = new ngv(1);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zI = fetVar.i(arrayList) | ((i5 & 112) == 32);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new rb(arrayList, function1, b2);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarD, null, null, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rh0(di0Var, function1, i2, (byte) 2);
        }
    }

    public static final void b(uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        fet fetVar2 = fetVar;
        fetVar2.g0(1172932355);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(uzhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function4) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 74899) != 74898)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            q7n q7nVar = uzhVar.s;
            ovl ovlVar = uzhVar.r;
            String str5 = ovlVar.b;
            tzh tzhVar = uzhVar.t;
            fetVar2.e0(-770060634);
            String str6 = q7nVar.f28259a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            cwr0.o(null, str6, g1t0.n(), q7nVar.b, new qol(null, 15), tol.d, null, function4, fetVar2, 1572864 | ((i4 << 9) & 234881024));
            fetVar2 = fetVar2;
            fetVar2.r(false);
            if ((str5 == null || str5.length() == 0) && ((str = ovlVar.c) == null || str.length() == 0)) {
                fetVar2.e0(-769051243);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-769452290);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String str7 = ovlVar.f25931a;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                e3c.f(mm40VarD, str7, g1t0.n(), str5 == null ? "" : str5, tzhVar.f34803a, ovlVar.c, fetVar, 6);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            a4x a4xVar = uzhVar.j;
            qro0 qro0Var = qro0.f29220a;
            if (a4xVar == null || a4xVar.isEmpty()) {
                fetVar2.e0(-768571115);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-768971201);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                String str8 = uzhVar.f;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarD2, str8, g1t0.n(), uzhVar.j, qro0Var, tzhVar.b, function0, fetVar2, ((i4 << 15) & 3670016) | 24582);
                fetVar2.r(false);
            }
            a4x a4xVar2 = uzhVar.k;
            if (a4xVar2 == null || a4xVar2.isEmpty()) {
                fetVar2.e0(-768112811);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-768496560);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                String str9 = uzhVar.g;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarD3, str9, g1t0.n(), uzhVar.k, qro0Var, tzhVar.c, function1, fetVar2, ((i4 << 12) & 3670016) | 24582);
                fetVar2.r(false);
            }
            String str10 = uzhVar.h;
            if (str10 == null || str10.length() == 0 || (str4 = uzhVar.m) == null || str4.length() == 0) {
                fetVar2.e0(-767741803);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-768005117);
                String str11 = uzhVar.h;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str11, g1t0.n(), uzhVar.m, tzhVar.d, fetVar2, 0);
                fetVar2.r(false);
            }
            String str12 = uzhVar.i;
            if (str12 == null || str12.length() == 0 || (str3 = uzhVar.n) == null || str3.length() == 0) {
                fetVar2.e0(-767365835);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-767632032);
                String str13 = uzhVar.i;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str13, g1t0.n(), uzhVar.n, false, fetVar2, 0);
                fetVar2.r(false);
            }
            String str14 = uzhVar.o;
            if ((str14 == null || str14.length() == 0) && ((str2 = uzhVar.p) == null || str2.length() == 0)) {
                fetVar2.e0(-766982923);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-767256808);
                pzb.l(uzhVar.o, uzhVar.p, function2, function3, fetVar2, (i4 >> 3) & 8064);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new anl(uzhVar, function0, function1, function2, function3, function4, i2, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(uzh uzhVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        Function0 function1;
        byte b2;
        fet fetVar2;
        fet fetVar3;
        boolean z;
        boolean z2;
        boolean z3;
        fet fetVar4;
        uzh uzhVar2 = uzhVar;
        fet fetVar5 = fetVar;
        String str = uzhVar2.d;
        zx7 zx7Var = gqw0.c;
        fetVar5.g0(266199375);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar5.g(uzhVar2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar5.i(function0) ? 32 : 16;
        }
        if (fetVar5.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = bmd.n;
            Object objK = fetVar5.k(zfnVar);
            k6z k6zVar = k6z.b;
            boolean z4 = objK == k6zVar;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 100.0f), 1.0f);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarD);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z5 = fetVar5.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar5, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar3);
            jpm0.n(fetVar5);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar4);
            n0q n0qVar = o7k0.c;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar5, 48);
            int iHashCode2 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM2 = fetVar5.m();
            mm40 mm40VarC1 = kbc.c0(fetVar5, n0qVar);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, shdVar);
            jpm0.o(fetVar5, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar5, shdVar3, fetVar5);
            mm40 mm40VarM = s5x0.M(o7k0.c(ohs0.i(fetVar5, mm40VarC1, shdVar4, 1.0f, true), 1.0f), 8.0f, 24.0f, 8.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
            int iHashCode3 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM3 = fetVar5.m();
            mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarM);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, x5dVarA, shdVar);
            jpm0.o(fetVar5, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC2, shdVar4);
            zx7 zx7Var3 = z4 ? zx7Var : zx7Var2;
            zx7 zx7Var4 = z4 ? gqw0.i : gqw0.g;
            mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var3, false);
            int iHashCode4 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM4 = fetVar5.m();
            mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarD2);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC2, shdVar);
            jpm0.o(fetVar5, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC3, shdVar4);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            String str2 = uzhVar2.b;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar5.k(zfnVar2)).getClass();
            y9q0 y9q0VarN = g1t0.n();
            long j2 = qmk.t;
            zfn zfnVar3 = zaq0.b;
            y9q0 y9q0VarA = y9q0.a(y9q0VarN, ((ThemeColors) fetVar5.k(zfnVar3)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, j2, null, null, 16646142);
            long j3 = qmk.q;
            long j4 = qmk.r;
            long j5 = qmk.n;
            aad.e(str2, mm40VarD3, y9q0VarA, null, 2, false, 2, 0, null, new n05(j3, j4, j5), fetVar, 1597488, 424);
            fetVar.r(true);
            mm40 mm40VarD4 = o7k0.d(new x7z(1.0f, true), 1.0f);
            tj30 tj30VarC3 = zq8.c(zx7Var4, false);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD4);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
            String str3 = uzhVar.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            aad.e(str3, mm40VarD5, y9q0.a(g1t0.w(), ((ThemeColors) fetVar.k(zfnVar3)).getTextPrimary(), 0L, null, null, null, 0L, null, null, z4 ? 2 : 1, 1, 0L, null, null, 16678910), null, 2, false, 1, 0, null, new n05(j3, qmk.y, j5), fetVar, 1597488, 424);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var, 164.0f), 1.0f);
            tj30 tj30VarC4 = zq8.c(z4 ? gqw0.d : gqw0.f, false);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarC);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            if (str.length() > 0) {
                fetVar.e0(-1737123862);
                fetVar3 = fetVar;
                k7x.a(str, null, yyw.V(n0qVar, fetVar.k(zfnVar) == k6zVar), gqw0.h1, null, fetVar3, 1572912, 1976);
                z = false;
                fetVar3.r(false);
            } else {
                fetVar3 = fetVar;
                z = false;
                fetVar3.e0(-1736743709);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            fetVar3.r(true);
            uzhVar2 = uzhVar;
            if (uzhVar2.l) {
                fetVar3.e0(250120535);
                mm40 mm40VarJ = s5x0.J(jr8.f16991a.b(jm40Var, zx7Var), 8.0f);
                long background = ((ThemeColors) fetVar3.k(zfnVar3)).getBackground();
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                boolean z6 = z;
                z2 = true;
                function1 = function0;
                fet fetVar6 = fetVar3;
                dww.c(a8k0.F(R.drawable.ic_glyph_cancel, z6 ? 1 : 0, fetVar3), null, y860.Y(o7k0.n(i120.Q(mm40VarJ, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 24.0f), false, null, null, function0, 15), ((ThemeColors) fetVar3.k(zfnVar3)).getSecondary(), fetVar6, 56, 0);
                fetVar6.r(z6);
                fetVar4 = fetVar6;
                z3 = z6;
            } else {
                function1 = function0;
                z2 = true;
                boolean z7 = z;
                fet fetVar7 = fetVar3;
                fetVar7.e0(250797389);
                fetVar7.r(z7);
                fetVar4 = fetVar7;
                z3 = z7;
            }
            fetVar4.r(z2);
            fetVar2 = fetVar4;
            b2 = z3;
        } else {
            function1 = function0;
            b2 = 0;
            i2 = i2;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yml(uzhVar2, function1, i2, b2);
        }
    }

    public static final void d(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        uzh uzhVar2;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        fetVar.g0(980078276);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            uzhVar2 = uzhVar;
            i3 |= fetVar.g(uzhVar2) ? 32 : 16;
        } else {
            uzhVar2 = uzhVar;
        }
        if ((i2 & 384) == 0) {
            function5 = function0;
            i3 |= fetVar.i(function5) ? 256 : 128;
        } else {
            function5 = function0;
        }
        if ((i2 & 3072) == 0) {
            function6 = function1;
            i3 |= fetVar.i(function6) ? 2048 : 1024;
        } else {
            function6 = function1;
        }
        if ((i2 & 24576) == 0) {
            function7 = function2;
            i3 |= fetVar.i(function7) ? 16384 : 8192;
        } else {
            function7 = function2;
        }
        if ((196608 & i2) == 0) {
            function8 = function3;
            i3 |= fetVar.i(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i2) == 0) {
            function9 = function4;
            i3 |= fetVar.i(function9) ? 1048576 : 524288;
        } else {
            function9 = function4;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(uzhVar2, function5, function6, function7, function8, function9, fetVar, (i3 >> 3) & 524286);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zml(mm40Var, uzhVar, function0, function1, function2, function3, function4, i2, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1114545785);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE2 = o7k0.e(jr8Var.b(mm40VarD2, zx7Var), 2.0f);
            boolean zF = fetVar.f(background);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 13, background);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE2, (Function1) objP, fetVar, 0);
            mm40 mm40VarR = ffb0.R(jr8Var.b(o7k0.n(jm40Var, 12.0f), gqw0.d), -6.0f, 0.0f, 2);
            long background2 = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, i120.S(i120.Q(mm40VarR, background2, ugg0Var), 2.0f, background, ugg0Var));
            qxw.o(fetVar, i120.S(i120.Q(ffb0.R(jr8Var.b(o7k0.n(jm40Var, 12.0f), gqw0.f), 6.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ugg0Var), 2.0f, background, ugg0Var));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, false, i2, 0 == true ? 1 : 0);
        }
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(964734411);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((StaticColors) fetVar.k(m8m0.f21378a)).m70getBlack200d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            zx7 zx7Var = gqw0.e;
            jm40 jm40Var = jm40.b;
            kpb.j(jr8Var.b(jm40Var, zx7Var), null, fetVar, 0, 2);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 10);
        }
    }

    public static final void g(mm40 mm40Var, boolean z, fet fetVar, int i2, int i3) {
        int i4;
        int i5;
        fetVar.g0(-1765211392);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4 | (fetVar.h(z) ? 32 : 16);
        }
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            if (i6 != 0) {
                mm40Var = jm40Var;
            }
            if (i7 != 0) {
                z = false;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var, 60.0f), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 16.0f), z ? 96.0f : 128.0f);
            zcl zclVar3 = qmk.e;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s84(i2, i3, mm40Var, z);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ydr ydrVar, ydr ydrVar2, fet fetVar, int i2) {
        ydr ydrVar3;
        ugd ugdVar4;
        fetVar.g0(-275071489);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(ydrVar) ? 16384 : 8192) | (fetVar.i(ydrVar2) ? 131072 : 65536);
        byte b3 = 0;
        byte b4 = 1;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o050.S(jm40Var);
            n0q n0qVar = o7k0.c;
            ugdVar4 = ugdVar3;
            y860.h(432, u1c.M(-318951006, new uis(ugdVar, b2), fetVar), u1c.M(734085761, new ab4(ugdVar4, ydrVar2, b4), fetVar), fetVar, mm40VarS.e(n0qVar));
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarK0 = j120.k0(mm40VarD, new dnz(zcm0.i(fetVar).l, 16));
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            ydrVar3 = ugdVar2;
            ydrVar3.j(jr8Var, jr8Var.b(mm40VarK0, zx7Var), fetVar, 390);
            if (ydrVar == null) {
                fetVar.e0(-509385102);
                fetVar.r(false);
            } else {
                fetVar.e0(537757551);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new ij4(b3);
                    fetVar.o0(objP);
                }
                ydrVar.j(jr8Var, rq8.K(n0qVar, (Function1) objP), fetVar, Integer.valueOf(((i3 >> 6) & 896) | 6));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            ydrVar3 = ugdVar2;
            ugdVar4 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, ugdVar, ydrVar3, ugdVar4, ydrVar, ydrVar2, i2, (byte) 3);
        }
    }

    public static final void i(qa5 qa5Var, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        fet fetVar2;
        qa5Var.getClass();
        function0.getClass();
        fetVar.g0(1897033832);
        int i3 = (fetVar.g(qa5Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            function1 = function0;
            fetVar2 = fetVar;
            agc.r(null, qa5Var.b, function1, null, null, null, null, fetVar2, (i3 << 3) & 896, 121);
        } else {
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(qa5Var, function1, i2, (byte) 22);
        }
    }

    public static final void j(mm40 mm40Var, cws cwsVar, boolean z, Function1 function1, fet fetVar, int i2) {
        final Function1 function2;
        mm40 mm40Var2;
        uba ubaVar;
        final cws cwsVar2;
        final byte b2;
        uba sbaVar;
        cwsVar.getClass();
        function1.getClass();
        fetVar.g0(-1488843443);
        int i3 = i2 | 6 | (fetVar.g(cwsVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            v5l0 v5l0Var = cwsVar.b;
            List list = cwsVar.l;
            List list2 = cwsVar.k;
            String str = cwsVar.g;
            String str2 = cwsVar.o;
            String str3 = cwsVar.h;
            String str4 = cwsVar.n;
            String str5 = cwsVar.f;
            String str6 = cwsVar.m;
            boolean z2 = cwsVar.p;
            int i4 = cwsVar.e;
            String str7 = cwsVar.j.c;
            String str8 = cwsVar.i.c;
            int iOrdinal = v5l0Var.ordinal();
            opm opmVar = opm.f25648a;
            if (iOrdinal == 0) {
                i3 = i3;
                fetVar.e0(-7464720);
                y1i y1iVar = new y1i(uvw.A(cwsVar, fetVar), uvw.H(cwsVar, fetVar));
                String str9 = (String) CollectionsKt.firstOrNull(list2);
                bca bcaVar = new bca(new c280(str9 == null ? "" : str9, R.drawable.ic_glyph_placeholder_player), str8);
                String str10 = (String) CollectionsKt.firstOrNull(list);
                if (str10 == null) {
                    str10 = "";
                }
                pba pbaVar = new pba(0L, y1iVar, new vba(bcaVar, new bca(new c280(str10, R.drawable.ic_glyph_placeholder_player), str7), new lpm(opmVar, new hpm(0L, 3)), uvw.w(i4, z2)), new mem(0L, dyb.g0(new yem(0L, 0L, dyb.g0(new a4n(dyb.g0(uvw.I(str6, str5), uvw.I(str4, str3), uvw.I(str2, str)), new zgl0(), 14)), new lfm(rsm0.w(R.string.win_match_text, 0, fetVar), new tfm())))));
                fetVar.r(false);
                ubaVar = pbaVar;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    c2m c2mVar = c2m.f3631a;
                    if (iOrdinal == 3) {
                        i3 = i3;
                        fetVar.e0(-7095851);
                        a2i a2iVar = new a2i(uvw.A(cwsVar, fetVar), uvw.H(cwsVar, fetVar), new c4i(cwsVar.d, false, new n0x(cwsVar.c), (m0x) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), 42), new b4i(uvw.w(i4, z2), 2));
                        String str11 = (String) CollectionsKt.firstOrNull(list2);
                        if (str11 == null) {
                            str11 = "";
                        }
                        cca ccaVar = new cca(new c280(str11, R.drawable.ic_glyph_placeholder_player), str8);
                        String str12 = (String) CollectionsKt.firstOrNull(list);
                        if (str12 == null) {
                            str12 = "";
                        }
                        rba rbaVar = new rba(a2iVar, new xba(ccaVar, new cca(new c280(str12, R.drawable.ic_glyph_placeholder_player), str7), new z1m(c2mVar)), new mem(0L, dyb.g0(new bfm(0L, 0L, dyb.g0(new z3n(dyb.g0(uvw.I(str6, str5), uvw.I(str4, str3), uvw.I(str2, str)), new zgl0(), new dil0((y9q0) null, (y9q0) null, new zgl0(), 7), 14)), new lfm(rsm0.w(R.string.win_match_text, 0, fetVar), new vfm())))));
                        fetVar.r(false);
                        ubaVar = rbaVar;
                    } else {
                        if (iOrdinal != 4) {
                            throw b1j.f(-554432416, fetVar, false);
                        }
                        fetVar.e0(-6973711);
                        z1i z1iVar = new z1i(uvw.A(cwsVar, fetVar), uvw.H(cwsVar, fetVar));
                        String str13 = (String) CollectionsKt.firstOrNull(list2);
                        dca dcaVar = new dca(new c280(str13 == null ? "" : str13, R.drawable.ic_glyph_placeholder_player), str8);
                        String str14 = (String) CollectionsKt.firstOrNull(list);
                        if (str14 == null) {
                            str14 = "";
                        }
                        sbaVar = new qba(z1iVar, new wba(dcaVar, new dca(new c280(str14, R.drawable.ic_glyph_placeholder_player), str7), new z1m(c2mVar), uvw.w(i4, z2)), new mem(0L, dyb.g0(new bfm(0L, 0L, dyb.g0(new z3n(dyb.g0(uvw.I(str6, str5), uvw.I(str4, str3), uvw.I(str2, str)), new zgl0(), new dil0((y9q0) null, (y9q0) null, new zgl0(), 7), 14)), new lfm(rsm0.w(R.string.win_match_text, 0, fetVar), new wfm())))));
                        fetVar.r(false);
                    }
                } else {
                    fetVar.e0(-7216720);
                    z1i z1iVar2 = new z1i(uvw.A(cwsVar, fetVar), uvw.H(cwsVar, fetVar));
                    String str15 = (String) CollectionsKt.firstOrNull(list2);
                    bca bcaVar2 = new bca(new c280(str15 == null ? "" : str15, R.drawable.ic_glyph_placeholder_player), str8);
                    String str16 = (String) CollectionsKt.firstOrNull(list);
                    if (str16 == null) {
                        str16 = "";
                    }
                    sbaVar = new sba(z1iVar2, new yba(bcaVar2, new bca(new c280(str16, R.drawable.ic_glyph_placeholder_player), str7), new lpm(opmVar, new hpm(0L, 3)), uvw.w(i4, z2)), new mem(0L, dyb.g0(new afm(0L, 0L, dyb.g0(new b4n(dyb.g0(uvw.I(str6, str5), uvw.I(str4, str3), uvw.I(str2, str)), new zgl0(), 14)), new lfm(rsm0.w(R.string.win_match_text, 0, fetVar), new vfm())))));
                    fetVar.r(false);
                }
                ubaVar = sbaVar;
            } else {
                i3 = i3;
                fetVar.e0(-7340844);
                tba tbaVar = new tba(new z1i(uvw.A(cwsVar, fetVar), uvw.H(cwsVar, fetVar)), new zba(new bca(null, str8), new bca(null, str7), new lpm(opmVar, new hpm(0L, 3)), uvw.w(i4, z2)), new mem(0L, dyb.g0(new zem(0L, 0L, dyb.g0(new c4n(dyb.g0(uvw.I(str6, str5), uvw.I(str4, str3), uvw.I(str2, str)), new zgl0(), 14)), new lfm(rsm0.w(R.string.win_match_text, 0, fetVar), new ufm())))));
                fetVar.r(false);
                ubaVar = tbaVar;
            }
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new h26((byte) 10);
                fetVar.o0(objP);
            }
            Function1 function3 = (Function1) objP;
            int i5 = i3;
            int i6 = i5 & 7168;
            int i7 = i5 & 112;
            boolean z3 = (i6 == 2048) | (i7 == 32);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                cwsVar2 = cwsVar;
                function2 = function1;
                b2 = 0;
                objP2 = new Function0() { // from class: a.aq6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        cws cwsVar3 = cwsVar2;
                        Function1 function4 = function2;
                        switch (b3) {
                            case 0:
                                function4.invoke(cwsVar3.i);
                                break;
                            default:
                                function4.invoke(cwsVar3.j);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                cwsVar2 = cwsVar;
                function2 = function1;
                b2 = 0;
            }
            Function0 function0 = (Function0) objP2;
            byte b3 = i6 == 2048 ? (byte) 1 : b2;
            if (i7 == 32) {
                b2 = 1;
            }
            int i8 = b3 | b2;
            Object objP3 = fetVar.P();
            if (i8 != 0 || objP3 == cl5Var) {
                final byte b4 = 1;
                objP3 = new Function0() { // from class: a.aq6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b4;
                        cws cwsVar3 = cwsVar2;
                        Function1 function4 = function2;
                        switch (b5) {
                            case 0:
                                function4.invoke(cwsVar3.i);
                                break;
                            default:
                                function4.invoke(cwsVar3.j);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP3);
            }
            zjb.j(ubaVar, z, function3, function0, (Function0) objP3, fetVar, 3078 | (i5 & 896), 0);
            mm40Var2 = jm40.b;
        } else {
            function2 = function1;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var2, (Object) cwsVar, z, function2, i2, (byte) 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    public static final void k(mm40 mm40Var, on5 on5Var, Function1 function1, fet fetVar, int i2) {
        ?? r11;
        ?? r13;
        int i3;
        int i4;
        cl5 cl5Var;
        fet fetVar2 = fetVar;
        on5Var.getClass();
        function1.getClass();
        fetVar2.g0(-183226964);
        int i5 = i2 | (fetVar2.g(on5Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zF || objP == cl5Var2) {
                objP = new bx((byte) 11, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarK, 12.0f, 0.0f, 12.0f, 8.0f, 2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            v8q0.a(on5Var.b(), o7k0.d(jm40Var, 1.0f).e(new wkw(xx7Var)), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            ?? r12 = fetVar;
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, r12, 54);
            int iHashCode2 = Long.hashCode(r12.T);
            bh90 bh90VarM2 = r12.m();
            mm40 mm40VarC1 = kbc.c0(r12, mm40VarN2);
            r12.i0();
            if (r12.S) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            jpm0.o(r12, thg0VarA, shdVar);
            jpm0.o(r12, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, r12, shdVar3, r12);
            jpm0.o(r12, mm40VarC1, shdVar4);
            if (on5Var instanceof cn5) {
                r12.e0(2068234032);
                mm40 mm40VarP = o7k0.p(jm40Var, 128.0f, 32.0f);
                zcl zclVar2 = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                r13 = 1;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, r12, 0, 1), r12, 0, false);
                i3 = i5;
                cl5Var = cl5Var2;
                i4 = 256;
            } else {
                r13 = 1;
                if (!(on5Var instanceof dn5)) {
                    throw b1j.f(-764568161, r12, false);
                }
                mm40 mm40VarN3 = s5x0.N(rz4.f(r12, 2068631452, 1.0f, true), 0.0f, 0.0f, 4.0f, 0.0f, 11);
                i3 = i5;
                boolean z2 = (i3 & 896) == 256;
                Object objP2 = r12.P();
                if (z2 || objP2 == cl5Var2) {
                    objP2 = new to6(function1, (byte) 13);
                    r12.o0(objP2);
                }
                dn5 dn5Var = (dn5) on5Var;
                i4 = 256;
                cl5Var = cl5Var2;
                uc9.e(y860.W(mm40VarN3, null, null, false, null, (Function0) objP2, 28), dn5Var.f6351a, dn5Var.b, ((ThemeColors) r12.k(zfnVar)).getTextPrimary(), qmk.y, r12, 3072);
                r12.r(false);
            }
            mm40 mm40VarL = s5x0.L(o7k0.u(jm40Var, 0.0f, 160.0f, r13), 0.0f, 2.0f, r13);
            wul wulVar = new wul(iul.e, oe9.b, new ve9(on5Var.a(), R.drawable.ic_glyph_plus_small), true, false, false);
            ?? r6 = (i3 & 896) == i4 ? r13 : 0;
            Object objP3 = r12.P();
            if (r6 != 0 || objP3 == cl5Var) {
                objP3 = new to6(function1, (byte) 14);
                r12.o0(objP3);
            }
            qzb.n(mm40VarL, wulVar, (Function0) objP3, r12, 0, 0);
            r12.r(r13);
            r12.r(r13);
            r11 = r12;
        } else {
            function1 = function1;
            fetVar2.X();
            r11 = fetVar2;
        }
        yfe0 yfe0VarU = r11.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) mm40Var, (Object) on5Var, (Object) function1, i2, (byte) 21);
        }
    }

    public static final void l(oba obaVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1693164258);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(obaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ags.a(obaVar.f24969a, fetVar, 0);
            aac.u(obaVar.b, fetVar, 8);
            fetVar.r(true);
            wdx.w(obaVar.c, fetVar, 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(obaVar, i2, (byte) 13);
        }
    }

    public static final void m(mm40 mm40Var, aoa aoaVar, Function1 function1, fet fetVar, int i2) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        yx7 yx7Var = gqw0.j;
        function1.getClass();
        fetVar.g0(388575045);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(aoaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = aoaVar instanceof yna;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.e0(1102538384);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), "CARD_STACK_DEFAULT_ROW");
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                fetVar.e0(980409663);
                for (ona onaVar : CollectionsKt.D0(((yna) aoaVar).f42930a, 4)) {
                    fetVar.b0(-175819049, Long.valueOf(onaVar.f25538a));
                    qjj.f(new x7z(1.0f, true), onaVar, function1, fetVar, i3 & 896);
                    fetVar.r(false);
                }
                ohs0.x(fetVar, false, true, false);
            } else {
                if (!aoaVar.equals(zna.f44666a)) {
                    throw b1j.f(-241530331, fetVar, false);
                }
                fetVar.e0(1103286011);
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40VarD2, 8.0f, 0.0f, 2);
                thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(798213128);
                for (int i4 = 0; i4 < 4; i4++) {
                    qjj.g(0, fetVar, new x7z(1.0f, true));
                }
                ohs0.x(fetVar, false, true, false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 19, i2, (Object) mm40Var, (Object) aoaVar, function1);
        }
    }

    public static final void n(mm40 mm40Var, usm usmVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(512280197);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(usmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 64.0f), 56.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0k0((Object) function1, (Object) usmVar, (byte) 10);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1654693435, new edk0(usmVar, (byte) 7), fetVar), fetVar, 56);
            mm40 mm40VarE2 = s5x0.K(jm40.b, 2.0f, 4.0f).e(o7k0.c);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            kc5.N(usmVar.c, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, null, 0L, qmk.o, g1t0.e().f42262a.b, null, null, 0L, zx7Var, 2, false, 2, 0, false, null, g1t0.e(), 0.0f, fetVar, 0, 1600512, 0, 3055418);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, usmVar, function1, i2, (byte) 11);
        }
    }

    public static final void o(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-2142007842);
        int i3 = i2 | 6 | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qdzVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(16.0f, true, new jf4((byte) 14)), knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 20.0f, 5), fetVar), false, null, u1c.M(1355362400, new rkb(qdzVar, function1, b2), fetVar), fetVar, ((i3 >> 3) & 112) | 113246592, 72);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new skb(mm40Var2, l7m0Var, xczVar, qdzVar, function1, i2, (byte) 0);
        }
    }

    public static final void p(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1092745623);
        int i3 = (fetVar.i(function1) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 9);
                fetVar.o0(objP);
            }
            jcb.l(jm40.b, mdmVar, false, (Function0) objP, fetVar, 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 13);
        }
    }

    public static final void q(i3t0 i3t0Var, Fragment fragment, kei keiVar, fet fetVar, int i2) {
        Fragment fragment2;
        fet fetVar2;
        fetVar.g0(-1731145211);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(i3t0Var) ? 4 : 2) | (fetVar.i(fragment) ? 32 : 16) | (fetVar.g(keiVar) ? 256 : 128);
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Unit unit = Unit.f46060a;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objP = fetVar.P();
            byte b3 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new vi6(i3t0Var, b3);
                fetVar.o0(objP);
            }
            m0x0.o(unit, (Function1) objP, fetVar);
            boolean z3 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new ui6(i3t0Var, b2);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z4 = i4 == 4;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new ui6(i3t0Var, b3);
                fetVar.o0(objP3);
            }
            v3c.z(function0, (Function0) objP3, fragment, fetVar, (i3 << 3) & 896, 0);
            fragment2 = fragment;
            fetVar2 = fetVar;
            boolean zI = ((i3 & 896) == 256) | fetVar2.i(fragment2);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new v4f(keiVar, fragment2, (byte) 19);
                fetVar2.o0(objP4);
            }
            clz clzVar = (clz) fetVar2.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar2);
            if (((i4 ^ 6) <= 4 || !fetVar2.i(i3t0Var)) && (i3 & 6) != 4) {
                z = false;
            }
            boolean zI2 = fetVar2.i(clzVar) | z | fetVar2.e(3) | fetVar2.g(pz40VarF);
            Object objP5 = fetVar2.P();
            if (zI2 || objP5 == cl5Var) {
                xfc xfcVar = new xfc(i3t0Var, clzVar, pz40VarF, null, (byte) 1);
                fetVar2.o0(xfcVar);
                objP5 = xfcVar;
            }
            m0x0.t(fetVar2, clzVar, (Function2) objP5);
        } else {
            fragment2 = fragment;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(i3t0Var, fragment2, keiVar, i2, (byte) 27);
        }
    }

    public static final void r(tig tigVar, Function1 function1, fet fetVar, int i2) {
        boolean z;
        n0q n0qVar;
        mm40 mm40VarN;
        boolean z2;
        kgg kggVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1222318232);
        byte b2 = 4;
        int i3 = i2 | (fetVar2.g(tigVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            String str = tigVar.c;
            kgg kggVar2 = tigVar.b;
            lgg lggVar = tigVar.f34008a;
            Object[] objArr = {Boolean.valueOf(!StringsKt.W(str))};
            v0h0 v0h0Var = xcz.y;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new jcg((byte) 14);
                fetVar2.o0(objP);
            }
            xcz xczVar = (xcz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar2, 384);
            pkk0 pkk0Var = (pkk0) fetVar2.k(bmd.q);
            boolean zG = fetVar2.g(xczVar) | fetVar2.g(pkk0Var);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new pig(xczVar, pkk0Var, null, b3);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, xczVar, (Function2) objP2);
            if (kggVar2.f18237a) {
                fetVar2.e0(-1349084040);
                n0qVar = o7k0.c;
                mm40 mm40VarR = knm0.r(n0qVar);
                w6k w6kVar = (w6k) fetVar2.k(bmd.h);
                WeakHashMap weakHashMap = djv0.w;
                int i4 = zcm0.i(fetVar2).c.e().d;
                Object objP3 = fetVar2.P();
                float f2 = 0.0f;
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.a(0.0f);
                    fetVar2.o0(objP3);
                }
                agk0 agk0Var = (agk0) objP3;
                int height = ((View) fetVar2.k(dy2.f)).getRootView().getHeight();
                if (i4 != 0 && height != 0 && agk0Var.l() != 0.0f) {
                    float fL = agk0Var.l() - (height - i4);
                    if (fL >= 0.0f) {
                        f2 = fL;
                    }
                }
                float fS0 = w6kVar.s0(f2);
                Object objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = new fc3(agk0Var, b2);
                    fetVar2.o0(objP4);
                }
                mm40VarN = s5x0.N(ro4.d0(mm40VarR, (Function1) objP4), 0.0f, 0.0f, 0.0f, fS0, 7);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-1348951980);
                fetVar2.r(false);
                n0qVar = o7k0.c;
                mm40VarN = n0qVar;
            }
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
            n0q n0qVar2 = n0qVar;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            ogg oggVar = lggVar.b;
            byte b4 = 17;
            if (oggVar instanceof ngg) {
                x7z x7zVarF = rz4.f(fetVar2, 1126608738, 1.0f, true);
                mdm mdmVar = ((ngg) oggVar).f23484a;
                boolean z4 = (i3 & 112) == 32;
                Object objP5 = fetVar2.P();
                if (z4 || objP5 == cl5Var) {
                    objP5 = new afd(function1, (byte) 18);
                    fetVar2.o0(objP5);
                }
                z2 = false;
                v(x7zVarF, mdmVar, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
                kggVar = kggVar2;
            } else {
                z2 = false;
                if (!(oggVar instanceof mgg)) {
                    throw b1j.f(-1349133103, fetVar2, false);
                }
                x7z x7zVarF2 = rz4.f(fetVar2, 1126994564, 1.0f, true);
                Object[] objArr2 = {lggVar.f20007a};
                boolean z5 = (i3 & 14) == 4;
                Object objP6 = fetVar2.P();
                if (z5 || objP6 == cl5Var) {
                    objP6 = new e8g(tigVar, (byte) 9);
                    fetVar2.o0(objP6);
                }
                l7m0 l7m0VarY = v3c.Y(objArr2, (Function0) objP6, fetVar2);
                boolean z6 = kggVar2.f18237a;
                int i5 = i3 & 112;
                boolean z7 = i5 == 32;
                Object objP7 = fetVar2.P();
                if (z7 || objP7 == cl5Var) {
                    objP7 = new omf(function1, (byte) 19);
                    fetVar2.o0(objP7);
                }
                Function1 function2 = (Function1) objP7;
                boolean z8 = i5 == 32;
                Object objP8 = fetVar2.P();
                if (z8 || objP8 == cl5Var) {
                    objP8 = new omf(function1, b4);
                    fetVar2.o0(objP8);
                }
                Function1 function3 = (Function1) objP8;
                boolean z9 = i5 == 32;
                Object objP9 = fetVar2.P();
                if (z9 || objP9 == cl5Var) {
                    objP9 = new ag0(function1, (byte) 24);
                    fetVar2.o0(objP9);
                }
                kggVar = kggVar2;
                C(x7zVarF2, xczVar, z6, l7m0VarY, function2, function3, (Function2) objP9, fetVar2, 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.h);
            int i6 = i3 & 112;
            boolean z10 = i6 == 32 ? true : z2;
            Object objP10 = fetVar2.P();
            if (z10 || objP10 == cl5Var) {
                objP10 = new afd(function1, (byte) 16);
                fetVar2.o0(objP10);
            }
            Function0 function0 = (Function0) objP10;
            boolean z11 = i6 == 32 ? true : z2;
            Object objP11 = fetVar2.P();
            if (z11 || objP11 == cl5Var) {
                objP11 = new afd(function1, b4);
                fetVar2.o0(objP11);
            }
            jcb.w(mm40VarB, kggVar, function0, (Function0) objP11, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(tigVar, function1, i2, (byte) 21);
        }
    }

    public static final void s(CyberChampsMainParams cyberChampsMainParams, sip sipVar, fet fetVar, int i2) {
        cyberChampsMainParams.getClass();
        sipVar.getClass();
        fetVar.g0(972617079);
        int i3 = (fetVar.i(cyberChampsMainParams) ? 4 : 2) | i2 | (fetVar.e(sipVar.ordinal()) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            cog cogVar = (cog) fetVar.k(jgg.b);
            String strK = kng0.k("CYBER_CHAMPS_SCREEN", sipVar.name());
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new qig(application, cyberChampsMainParams, sipVar, cogVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(strK);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, b2);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP2 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), strK);
                fetVar.o0(objP2);
            }
            Object obj2 = ((kgd) objP2).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.cyber.section.impl.championships.champs.di.CyberChampsTabComponent");
                return;
            }
            kei keiVar = (kei) obj2;
            sgy sgyVarB = sre0.f32672a.b(xig.class);
            q0h0 q0h0Var = new q0h0((jei) keiVar.t.get());
            int i4 = xig.J;
            i3t0 i3t0Var = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            q(i3t0Var, (Fragment) fetVar.k(mr00.f22246a), keiVar, fetVar, 0);
            tig tigVar = (tig) pz40VarY.getValue();
            boolean zI = fetVar.i(i3t0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                Object x6fVar = new x6f(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                fetVar.o0(x6fVar);
                objP3 = x6fVar;
            }
            r(tigVar, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(cyberChampsMainParams, sipVar, i2, (byte) 20);
        }
    }

    public static final void t(mm40 mm40Var, qsm qsmVar, float f2, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        ngk0 ngk0Var;
        xcz xczVar;
        int i4;
        Object v3l0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1247456535);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(qsmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar2.U(i3 & 1, (599187 & i3) != 599186)) {
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ngk0();
                fetVar2.o0(objP);
            }
            ngk0 ngk0Var2 = (ngk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(0L);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            if (xdrVar != null) {
                fetVar2.e0(1375026098);
                boolean zG = ((i3 & 3670016) == 1048576) | fetVar2.g(xczVarA);
                Object objP3 = fetVar2.P();
                if (zG || objP3 == cl5Var) {
                    ngk0Var = ngk0Var2;
                    v3l0Var = new v3l0(pz40Var, xczVarA, ngk0Var, xdrVar, null, (byte) 4);
                    xczVar = xczVarA;
                    fetVar2.o0(v3l0Var);
                } else {
                    xczVar = xczVarA;
                    v3l0Var = objP3;
                    ngk0Var = ngk0Var2;
                }
                m0x0.t(fetVar2, xczVar, (Function2) v3l0Var);
                i4 = 0;
                fetVar2.r(false);
            } else {
                pz40Var = pz40Var;
                ngk0Var = ngk0Var2;
                xczVar = xczVarA;
                i4 = 0;
                fetVar2.e0(1375432601);
                fetVar2.r(false);
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, i4);
            xcz xczVar2 = xczVar;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            ngk0 ngk0Var3 = ngk0Var;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            int i5 = i3;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            pz40 pz40Var2 = pz40Var;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            nkb.h(dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), new hjm(qsmVar.f29265a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            int i6 = i5 & 3670016;
            boolean z2 = i6 == 1048576;
            Object objP4 = fetVar2.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new nej0((Object) xdrVar, (Object) pz40Var2, (Object) ngk0Var3, (byte) 7);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarD0 = ro4.d0(mm40VarN, (Function1) objP4);
            wul wulVar = new wul(mul.e, oe9.d, new ue9(qsmVar.b), true, false, false);
            boolean z3 = (i5 & 57344) == 16384;
            Object objP5 = fetVar2.P();
            if (z3 || objP5 == cl5Var) {
                objP5 = new l3c0(function0, (byte) 17);
                fetVar2.o0(objP5);
            }
            qzb.n(mm40VarD0, wulVar, (Function0) objP5, fetVar2, 0, 0);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1267872911, new dfc0((Object) xdrVar, (Object) function2, (Object) pz40Var2, (Object) ngk0Var3, (byte) 26), fetVar), fetVar, 56);
            fetVar.r(true);
            mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 64.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z4 = (i6 == 1048576) | ((i5 & 112) == 32) | ((i5 & 7168) == 2048);
            Object objP6 = fetVar.P();
            if (z4 || objP6 == cl5Var) {
                dg dgVar = new dg(qsmVar, xdrVar, function1, ngk0Var3, pz40Var2, (byte) 26);
                fetVar.o0(dgVar);
                objP6 = dgVar;
            }
            b8k0.f(mm40VarD2, xczVar2, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP6, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb3(mm40Var, qsmVar, f2, function1, function0, function2, xdrVar, i2, (byte) 6);
        }
    }

    public static final void u(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        String str = uzhVar.c;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar2.g0(894924704);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(uzhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.i(function5) ? 8388608 : 4194304;
        }
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.K(lgb.J(jm40Var, ugg0Var2)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 100.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            int i4 = i3 >> 3;
            c(uzhVar, function2, fetVar2, (i4 & 14) | ((i3 >> 9) & 112));
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            e(0, fetVar2, ffb0.R(jr8Var.b(jm40Var, zx7Var2), 0.0f, 6.0f, 1));
            fetVar2.r(true);
            d(o7k0.d(jm40Var, 1.0f), uzhVar, function0, function1, function3, function4, function5, fetVar2, (i4 & 3670016) | (i3 & 7168) | (i3 & 112) | 6 | (i3 & 896) | (57344 & i4) | (458752 & i4));
            fetVar2 = fetVar2;
            fetVar2.r(true);
            if (str.length() > 0) {
                fetVar2.e0(-24032808);
                j6n.h(str, new uqo0(d4d.BACKGROUND), o7k0.A(ffb0.R(s5x0.N(jr8Var.b(jm40Var, zx7Var), 2.0f, 0.0f, 164.0f, 0.0f, 10), 0.0f, -8.0f, 1), null, 3), 0, 0, fetVar2, 0, 24);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-23638488);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wml(mm40Var, uzhVar, function0, function1, function2, function3, function4, function5, i2, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(267341527);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarS = o050.S(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jcb.l(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 56.0f, 7), mdmVar, false, function0, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 2);
        }
    }

    public static final void w(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1429329274);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwy(function1, (byte) 9);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 11);
        }
    }

    public static final void x(ye60 ye60Var, u12 u12Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(ye60Var) : fetVar.i(ye60Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(u12Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !fetVar.g(ye60Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new cmv(u12Var, ye60Var);
                fetVar.o0(objP);
            }
            k13.a((cmv) objP, null, new wmb0(false, pnh0.f27287a, false, 0), ugdVar, fetVar, ((i3 << 3) & 7168) | 384, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) ye60Var, (Object) u12Var, (Object) ugdVar, i2, (byte) 24);
        }
    }

    public static final void y(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        Unit unit;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(394516713);
        int i4 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.player_info_last_games, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xwy(function1, (byte) 8);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mdm mdmVar = ((vzy) l7m0Var.getValue()).f38320a;
            if (mdmVar == null) {
                fetVar.e0(962370850);
                fetVar.r(false);
                unit = null;
                i3 = i5;
            } else {
                fetVar.e0(962370851);
                i3 = i5;
                w(mdmVar, function1, fetVar, i3);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(-2047161164);
                boolean z2 = (i3 == 32) | ((i4 & 14) == 4);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP2 = new ys4(l7m0Var2, function1, (byte) 12);
                    fetVar.o0(objP2);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP2, fetVar, 6, 508);
                fetVar.r(false);
            } else {
                l7m0Var2 = l7m0Var;
                fetVar.e0(-2047165163);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var2, function1, i2, (byte) 3);
        }
    }

    public static final void z(mm40 mm40Var, i4 i4Var, boolean z, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        mdm mdmVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1064035954);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(i4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            mdmVar2 = mdmVar;
            i3 |= fetVar2.g(mdmVar2) ? 2048 : 1024;
        } else {
            mdmVar2 = mdmVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar2.e0(-1363559256);
                mm40 mm40VarB = jr8.f16991a.b(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7), gqw0.e);
                boolean z2 = (57344 & i3) == 16384;
                Object objP = fetVar2.P();
                byte b2 = 6;
                if (z2 || objP == cl5Var) {
                    objP = new w250(function1, b2);
                    fetVar2.o0(objP);
                }
                jcb.l(mm40VarB, mdmVar2, false, (Function0) objP, fetVar2, (i3 >> 6) & 112, 4);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1362742902);
                mm40 mm40VarE0 = o2e.e0(n0qVar, "MY_AGGREGATOR_LAZY_COLUMN");
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5), fetVar2);
                boolean z3 = ((i3 & 57344) == 16384) | ((i3 & 112) == 32);
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new ktz(i4Var, function1, (byte) 11);
                    fetVar2.o0(objP2);
                }
                b8k0.e(mm40VarE0, null, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 6, 506);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) i4Var, z, (Object) mdmVar, (Object) function1, i2, (byte) 26);
        }
    }
}
