package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.javax.sip.message.Response;
import android.os.Build;
import android.text.Html;
import android.view.Window;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q8a implements uu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nz3 f28290a = new nz3();
    public static final ugd b = new ugd(804605990, false, new vgd(1));
    public static final ugd c = new ugd(-1365695171, false, new ahd(12));
    public static final ugd d = new ugd(1826929079, false, new jhd(5));
    public static final ugd e = new ugd(1997837014, false, new ohd(4));
    public static final ew3 f = new ew3((byte) 1);
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static final Object h = new Object();
    public static Method i;
    public static Method j;
    public static boolean k;

    public static final void A(mm40 mm40Var, l7m0 l7m0Var, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1222419572);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            bye0 bye0Var = (bye0) l7m0Var.getValue();
            Context context = (Context) fetVar.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            WeakHashMap weakHashMap = djv0.w;
            boolean z2 = zcm0.i(fetVar).c.e().d > 0;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new cqq();
                fetVar.o0(objP);
            }
            cqq cqqVar = (cqq) objP;
            iwe0 iwe0Var = (iwe0) bye0Var.c.getValue();
            boolean zG = fetVar.g(wpqVar) | fetVar.g(pkk0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ck60(wpqVar, pkk0Var, pz40VarF, (byte) 14);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = fetVar.h(z2) | fetVar.i(wpqVar) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zH || objP3 == cl5Var) {
                hxe0 hxe0Var = new hxe0(z2, cqqVar, wpqVar, pz40VarF, null, (byte) 0);
                fetVar.o0(hxe0Var);
                objP3 = hxe0Var;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            Boolean boolValueOf2 = Boolean.valueOf(iwe0Var.f15486a);
            boolean zI = fetVar.i(window) | fetVar.g(iwe0Var);
            Object objP4 = fetVar.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new xwe0(window, iwe0Var, (byte) 5);
                fetVar.o0(objP4);
            }
            s0x.d(boolValueOf2, null, (Function1) objP4, fetVar, 0);
            v3c.A(null, function0, null, fetVar, 0, 5);
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            mm40 mm40VarW = o050.W(mm40Var2.e(o7k0.c));
            mm40 mm40VarS = jm40.b;
            if (z) {
                mm40VarS = o050.S(mm40VarS);
            }
            z1x.i(ju70.J(y860.b0(i120.Q(mm40VarW.e(mm40VarS), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), cqqVar), null, (3 & 1) != 0), null, u1c.M(-537256548, new ba00(bye0Var, function1, iwe0Var, window, cqqVar), fetVar2), fetVar2, 384);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new az8(mm40Var2, l7m0Var, z, function1, i2, (byte) 1);
        }
    }

    public static final void B(int i2, fet fetVar) {
        fetVar.g0(515346558);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 96.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o240(i2, (byte) 3);
        }
    }

    public static final void C(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(956261111);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f2, 8.0f, f3, 32.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new tr20((byte) 28);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 817889286, 362);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o240(i2, (byte) 4);
        }
    }

    public static final void D(bzl bzlVar, uhe uheVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-2037071656);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bzlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(uheVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            d9z d9zVarA = f9z.a(fetVar);
            mm40 mm40VarV = cjx.V(jm40Var, bzlVar.a(new j6g0((byte) 17)), null);
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).d;
            fetVar2 = fetVar;
            uzb.y(mm40VarV, uheVar.f35673a, new lh80(f2, 12.0f, f2, 12.0f), d9zVarA, null, null, fetVar2, 0, 112);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n(bzlVar, uheVar, i2);
        }
    }

    public static final void E(ftp0 ftp0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(105086780);
        int i3 = i2 | (fetVar.g(ftp0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new LinkedHashMap();
                fetVar.o0(objP);
            }
            Map map = (Map) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            Object obj2 = (vne) objP2;
            fetVar.b0(-2090810869, Integer.valueOf(ftp0Var.d));
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP3 = fetVar.P();
            if (z || objP3 == obj) {
                objP3 = new nxo0(ftp0Var, (byte) 22);
                fetVar.o0(objP3);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP3, fetVar, 6, 2);
            fetVar.r(false);
            androidx.compose.runtime.d dVar = bmd.n;
            k6z k6zVar = (k6z) fetVar.k(dVar);
            pz40 pz40VarD = vcc.D(kwjVarB.p, fetVar);
            Object[] objArr = new Object[0];
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new mhp0((byte) 21);
                fetVar.o0(objP4);
            }
            Object obj3 = (cgk0) e9x.Q(objArr, (Function0) objP4, fetVar, 48);
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP5);
            }
            pz40 pz40Var = (pz40) objP5;
            Unit unit = Unit.f46060a;
            boolean zG = (i4 == 4) | fetVar.g(obj3);
            Object objP6 = fetVar.P();
            if (zG || objP6 == obj) {
                objP6 = new ssl0((Object) ftp0Var, obj3, (yje) null, (byte) 19);
                fetVar.o0(objP6);
            }
            m0x0.t(fetVar, unit, (Function2) objP6);
            Boolean bool = (Boolean) pz40VarD.getValue();
            bool.booleanValue();
            boolean zG2 = fetVar.g(pz40VarD) | fetVar.g(obj3) | fetVar.g(kwjVarB);
            Object objP7 = fetVar.P();
            if (zG2 || objP7 == obj) {
                Object ah0Var = new ah0((Object) kwjVarB, (Object) pz40VarD, (Object) pz40Var, obj3, (yje) null, (byte) 24);
                fetVar.o0(ah0Var);
                objP7 = ah0Var;
            }
            m0x0.t(fetVar, bool, (Function2) objP7);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8);
            a4x a4xVar = ftp0Var.b;
            boolean zG3 = fetVar.g(obj3);
            Object objP8 = fetVar.P();
            if (zG3 || objP8 == obj) {
                objP8 = new nxo0(obj3, (byte) 23);
                fetVar.o0(objP8);
            }
            Function0 function0 = (Function0) objP8;
            boolean zG4 = fetVar.g(obj3) | fetVar.i(obj2) | fetVar.g(kwjVarB);
            Object objP9 = fetVar.P();
            if (zG4 || objP9 == obj) {
                objP9 = new nej0(obj2, obj3, kwjVarB, b2);
                fetVar.o0(objP9);
            }
            ibc.n(mm40VarN, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP9, fetVar, 24960, 0);
            obc.d(dVar.a(k6z.f17794a), u1c.M(-802367630, new tvl0(kwjVarB, ftp0Var, k6zVar, map, function1, (byte) 4), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) ftp0Var, (Object) function1, i2, (byte) 8);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(250071605);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_teams_title, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((itp0) l7m0Var.getValue()).b().f4902a;
            j9m0 j9m0Var = ((itp0) l7m0Var.getValue()).b().b;
            boolean zA = ((itp0) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(-579339965, new dqz(l7m0Var, function1, (byte) 17), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 27);
        }
    }

    public static final void G(mm40 mm40Var, bkl bklVar, fet fetVar, int i2) {
        int i3;
        bkl bklVar2;
        boolean z;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(996858552);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(bklVar) : fetVar2.i(bklVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(0.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            String str = bklVar.c;
            String str2 = bklVar.d;
            int length = str.length();
            jm40 jm40Var2 = jm40.b;
            if (length > 0) {
                fetVar2.e0(1343182947);
                mm40 mm40VarE0 = o2e.e0(o7k0.g(jm40Var2, 18.0f, 0.0f, 2), "DS_BANNER_TITLE");
                int i4 = str2.length() > 0 ? 1 : 2;
                String str3 = bklVar.c;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                z = false;
                jm40Var = jm40Var2;
                v8q0.a(str3, mm40VarE0, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, i4, 0, null, g1t0.m(), fetVar, 0, 384, 110576);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = false;
                jm40Var = jm40Var2;
                fetVar2.e0(1343805024);
                fetVar2.r(false);
            }
            if (str2.length() > 0) {
                fetVar2.e0(1343875797);
                mm40 mm40VarE1 = o2e.e0(o7k0.g(jm40Var, 14.0f, 0.0f, 2), "DS_BANNER_SUBTITLE");
                bklVar2 = bklVar;
                String str4 = bklVar2.d;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str4, mm40VarE1, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                bklVar2 = bklVar;
                fetVar2.e0(1344265312);
                fetVar2.r(z);
            }
            fetVar2.r(true);
        } else {
            bklVar2 = bklVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tjl(mm40Var, bklVar2, i2, (byte) 3);
        }
    }

    public static final void H(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(109719171);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(o7k0.e(jm40Var, 80.0f), kt40.b);
            tj30 tj30VarC = zq8.c(gqw0.g, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK0);
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
            v8q0.a(str, o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar2).e, 0.0f, 0.0f, 6.0f, 6), "VIRTUAL_GAME_CATEGORY_MAIN_TOOLBAR_TITLE"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar, i3 & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 12, i2, str);
        }
    }

    public static final void I(mm40 mm40Var, ya0 ya0Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-304203597);
        byte b2 = 16;
        int i3 = i2 | (fetVar2.g(ya0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            if (ya0Var != null) {
                boolean z2 = ya0Var instanceof wa0;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar2.e0(-148135536);
                    wa0 wa0Var = (wa0) ya0Var;
                    ijl ijlVar = wa0Var.b;
                    jjl jjlVar = wa0Var.f38804a;
                    int i4 = i3 & 896;
                    boolean z3 = i4 == 256;
                    Object objP = fetVar2.P();
                    if (z3 || objP == cl5Var) {
                        objP = new dn(function1, (byte) 20);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean z4 = i4 == 256;
                    Object objP2 = fetVar2.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new dn(function1, (byte) 21);
                        fetVar2.o0(objP2);
                    }
                    Function0 function2 = (Function0) objP2;
                    z = i4 == 256;
                    Object objP3 = fetVar2.P();
                    if (z || objP3 == cl5Var) {
                        objP3 = new dn(function1, (byte) 14);
                        fetVar2.o0(objP3);
                    }
                    feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar2, 0, 4);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else if (ya0Var instanceof xa0) {
                    fetVar2.e0(-147574312);
                    mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                    xa0 xa0Var = (xa0) ya0Var;
                    String str = xa0Var.f40529a;
                    String str2 = xa0Var.b;
                    int i5 = i3 & 896;
                    boolean z5 = i5 == 256;
                    Object objP4 = fetVar2.P();
                    if (z5 || objP4 == cl5Var) {
                        objP4 = new dn(function1, (byte) 15);
                        fetVar2.o0(objP4);
                    }
                    Function0 function3 = (Function0) objP4;
                    z = i5 == 256;
                    Object objP5 = fetVar2.P();
                    if (z || objP5 == cl5Var) {
                        objP5 = new dn(function1, b2);
                        fetVar2.o0(objP5);
                    }
                    pzb.g(mm40VarK, str, str2, function3, (Function0) objP5, fetVar2, 0);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-281874836, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yf0(mm40Var, ya0Var, function1, i2, (byte) 0);
        }
    }

    public static final void J(mm40 mm40Var, wpu0 wpu0Var, l7m0 l7m0Var, float f2, float f3, float f4, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-466254809);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(wpu0Var) : fetVar.i(wpu0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            Object objP = fetVar.P();
            byte b2 = 9;
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new ybt0(l7m0Var, b2));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "VIRTUAL_GAME_CATEGORY_MAIN_TOOLBAR");
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new mqr0(l7m0Var2, b2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                Object fbnVar = new fbn(new ih10(f2, f4, (byte) 20));
                fetVar.o0(fbnVar);
                objP3 = fbnVar;
            }
            s3e s3eVar = (s3e) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                Object fbnVar2 = new fbn(new ih10(f3, f4, (byte) 19));
                fetVar.o0(fbnVar2);
                objP4 = fbnVar2;
            }
            s3e s3eVar2 = (s3e) objP4;
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP5);
            }
            pz40 pz40Var = (pz40) objP5;
            Object objP6 = fetVar.P();
            Object obj2 = objP6;
            if (objP6 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarA, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new e9o(pz40Var, lwfVar, nie0Var2, wpu0Var, l7m0Var, l7m0Var2, function0, (byte) 1), fetVar), fetVar, 24630);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new db3(mm40Var2, wpu0Var, l7m0Var, f2, f3, f4, function0, i2, (byte) 5);
        }
    }

    public static final ArrayList K(List list, List list2) {
        Object next;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cmg cmgVar = (cmg) it.next();
            long j2 = cmgVar.f4602a;
            String str = cmgVar.b;
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((ypl0) next).f43037a != j2);
            ypl0 ypl0Var = (ypl0) next;
            if (ypl0Var == null) {
                lel0.Companion.getClass();
                ypl0Var = new ypl0(0L, "", kel0.a());
            }
            arrayList.add(new ypl0(j2, str, ypl0Var.c));
        }
        return arrayList;
    }

    public static void M(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                d6a.b(canvas);
                return;
            } else {
                d6a.a(canvas);
                return;
            }
        }
        if (i2 == 28) {
            jf4.n("This method doesn't work on Pie!");
            return;
        }
        if (!k) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                j = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            k = true;
        }
        if (z) {
            try {
                Method method2 = i;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e2) {
                ohq.p(e2.getCause());
                return;
            }
        }
        if (z || (method = j) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static void O(Object obj, ArrayList arrayList, g5 g5Var) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) g5Var.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                O(it.next(), arrayList, g5Var);
            }
        }
    }

    public static final Object Q(zi80 zi80Var, int i2) {
        if (i2 < 0 || i2 >= zi80Var.f()) {
            hny.k(zi80Var.f(), b1j.m(i2, "Index: ", ", Size: "));
            return null;
        }
        int i3 = i2 - zi80Var.c;
        if (i3 < 0 || i3 >= zi80Var.b) {
            return null;
        }
        return zi80Var.c(i3);
    }

    public static final String R(String str) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Html.fromHtml(kotlin.text.c.r(str, Separators.RETURN, "<br />", false), 0);
            g0g0Var.getClass();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = "";
        }
        return g0g0Var.toString();
    }

    public static final String S(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((mlr) it.next()).f);
            sb.append(Separators.RETURN);
        }
        return sb.toString();
    }

    public static final void a(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        fetVar.g0(-1434421585);
        int i3 = (fetVar.g(str) ? 32 : 16) | i2 | (fetVar.g(str2) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1826917231, new g15(mm40Var, str, str2, b2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i2, (byte) 1);
        }
    }

    public static final void b(rd8 rd8Var, od8 od8Var, Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0VarC;
        fet fetVar2 = fetVar;
        rd8Var.getClass();
        od8Var.getClass();
        function1.getClass();
        fetVar2.g0(1998037440);
        int i3 = i2 | (fetVar2.g(rd8Var) ? 32 : 16) | (fetVar2.e(od8Var.ordinal()) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                int iOrdinal = od8Var.ordinal();
                if (iOrdinal == 0) {
                    float f2 = pd8.f26795a;
                    ugg0VarC = vgg0.c(f2, f2, 0.0f, 0.0f, 12);
                } else if (iOrdinal == 1) {
                    zcl zclVar = qmk.f28987a;
                    ugg0VarC = vgg0.a(0.0f);
                } else if (iOrdinal == 2) {
                    float f3 = pd8.f26795a;
                    ugg0VarC = vgg0.c(0.0f, 0.0f, f3, f3, 3);
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    ugg0VarC = vgg0.a(pd8.f26795a);
                }
                objP = ugg0VarC;
                fetVar2.o0(objP);
            }
            zcl zclVar2 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.g(jm40Var, 60.0f, 0.0f, 2), (yjj0) objP);
            float f4 = pd8.f26795a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            int i4 = i3 & 112;
            boolean zG = (i4 == 32) | fetVar2.g(pz40VarF);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new gj4(rd8Var, pz40VarF, (byte) 20);
                fetVar2.o0(objP2);
            }
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(phu0.F(mm40VarQ, null, null, false, null, (Function0) objP2, fetVar, 0, 15), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            mm40 mm40VarN = s5x0.N(jr8.f16991a.b(jm40Var, gqw0.d), 12.0f, 0.0f, 8.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            yx7 yx7Var = gqw0.k;
            s(rd8Var.c, 0, fetVar2, s5x0.L(new ecu0(yx7Var), 0.0f, 10.0f, 1));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            c(s5x0.N(s5x0.L(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).e(new ecu0(yx7Var)), 0.0f, 12.0f, 1), 8.0f, 0.0f, 0.0f, 0.0f, 14), rd8Var, fetVar2, i4);
            mm40 mm40VarL = twn.l(yx7Var, o7k0.n(jm40Var, 32.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL);
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
            yom.b(null, rd8Var.b, false, null, fetVar2, 0, 29);
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(rd8Var, od8Var, function1, i2, (byte) 2);
        }
    }

    public static final void c(mm40 mm40Var, rd8 rd8Var, fet fetVar, int i2) {
        int i3;
        y9q0 y9q0VarK;
        rd8 rd8Var2 = rd8Var;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        rd8Var2.getClass();
        fetVar2.g0(-834362835);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(rd8Var2) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = rd8Var2.b;
            if (z) {
                fetVar2.e0(-1527359839);
                afn0.v(fetVar2).getClass();
                y9q0VarK = g1t0.j();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1527302272);
                afn0.v(fetVar2).getClass();
                y9q0VarK = g1t0.k();
                fetVar2.r(false);
            }
            y9q0 y9q0Var = y9q0VarK;
            long jE = z ? cs0.e(fetVar2, -1527205428, fetVar2, false) : rz4.c(fetVar2, -1527158680, fetVar2, false);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(-1991983189);
                zcl zclVar = qmk.f28987a;
                j6n.h(rsm0.w(R.string.bonus_active, 0, fetVar2), bqo0.f3042a, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 2.0f, 6), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1991738785);
                fetVar2.r(false);
            }
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            v8q0.a(rd8Var2.d, s5x0.N(mm40VarD, 4.0f, 0.0f, 16.0f, 0.0f, 10), jE, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0Var, fetVar, 0, 24960, 110584);
            rd8Var2 = rd8Var;
            v8q0.a(rd8Var2.e, s5x0.N(o7k0.d(jm40Var, 1.0f), 4.0f, 2.0f, 16.0f, 0.0f, 8), afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, h97.g(fetVar), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var, (Object) rd8Var2, i2, (byte) 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [a.jm40] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(mm40 mm40Var, mua muaVar, Function1 function1, fet fetVar, int i2) {
        ?? r2;
        Object ee0Var;
        cgk0 cgk0Var;
        cgk0 cgk0Var2;
        pz40 pz40Var;
        pz40 pz40Var2;
        boolean z;
        cl5 cl5Var;
        fet fetVar2 = fetVar;
        muaVar.getClass();
        a4x a4xVar = muaVar.b;
        function1.getClass();
        fetVar2.g0(-70186448);
        int i3 = i2 | 6 | (fetVar2.g(muaVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(48.0f);
            omv omvVar = (omv) fetVar2.k(bmd.l);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP);
            }
            pz40 pz40Var3 = (pz40) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var2) {
                objP2 = androidx.compose.runtime.e.e(Float.valueOf(0.0f));
                fetVar2.o0(objP2);
            }
            pz40 pz40Var4 = (pz40) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var2) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP3);
            }
            cgk0 cgk0Var3 = (cgk0) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var2) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP4);
            }
            cgk0 cgk0Var4 = (cgk0) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var2) {
                objP5 = androidx.compose.runtime.e.e(a4xVar);
                fetVar2.o0(objP5);
            }
            pz40 pz40Var5 = (pz40) objP5;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            boolean z2 = (i3 & 112) == 32;
            Object objP6 = fetVar2.P();
            if (z2 || objP6 == cl5Var2) {
                cgk0Var = cgk0Var4;
                cgk0Var2 = cgk0Var3;
                pz40Var = pz40Var5;
                pz40Var2 = pz40Var3;
                ee0Var = new ee0(muaVar, pz40Var2, pz40Var, null, (byte) 22);
                fetVar2.o0(ee0Var);
            } else {
                cgk0Var2 = cgk0Var3;
                ee0Var = objP6;
                pz40Var = pz40Var5;
                cgk0Var = cgk0Var4;
                pz40Var2 = pz40Var3;
            }
            m0x0.t(fetVar2, a4xVar, (Function2) ee0Var);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            cgk0 cgk0Var5 = cgk0Var2;
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
            boolean z3 = muaVar.e;
            jm40 jm40Var = jm40.b;
            if (z3) {
                fetVar2.e0(-1247172555);
                z = false;
                y860.p(0, fetVar2, s5x0.N(n0qVar, 0.0f, w6kVar.r0(cgk0Var5.l()), 0.0f, w6kVar.r0(cgk0Var.l()), 5));
                fetVar2.r(false);
                cl5Var = cl5Var2;
            } else {
                z = false;
                fetVar2.e0(-1246714871);
                mm40 mm40VarJ = lgb.J(s5x0.K(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, w6kVar.r0(cgk0Var5.l()), 0.0f, w6kVar.r0(cgk0Var.l()), 5), qmk.a(fetVar2).d, 12.0f), vgg0.a(16.0f));
                boolean zI = fetVar2.i(omvVar) | fetVar2.d(fW0) | fetVar2.g(pz40VarF);
                Object objP7 = fetVar2.P();
                if (zI || objP7 == cl5Var2) {
                    vta vtaVar = new vta(pz40Var, omvVar, fW0, pz40VarF, pz40Var2, pz40Var4);
                    fetVar2.o0(vtaVar);
                    objP7 = vtaVar;
                }
                cl5Var = cl5Var2;
                b8k0.e(mm40VarJ, null, null, null, null, null, false, null, (Function1) objP7, fetVar, 0, 510);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarD = o7k0.d(jr8Var.b(jm40Var, zx7Var), 1.0f);
            Object objP8 = fetVar2.P();
            cl5 cl5Var3 = cl5Var;
            if (objP8 == cl5Var3) {
                objP8 = new nw6(cgk0Var5, (byte) 6);
                fetVar2.o0(objP8);
            }
            mm40 mm40VarY = fre0.Y(mm40VarD, (Function1) objP8);
            imm immVar = muaVar.f22406a;
            boolean z4 = muaVar.c;
            int i4 = i3 & 896;
            boolean z5 = i4 == 256 ? true : z;
            Object objP9 = fetVar2.P();
            if (z5 || objP9 == cl5Var3) {
                objP9 = new n19(function1, (byte) 20);
                fetVar2.o0(objP9);
            }
            Function0 function0 = (Function0) objP9;
            boolean z6 = i4 == 256 ? true : z;
            Object objP10 = fetVar2.P();
            if (z6 || objP10 == cl5Var3) {
                objP10 = new n19(function1, (byte) 21);
                fetVar2.o0(objP10);
            }
            ju70.k(mm40VarY, immVar, z4, function0, (Function0) objP10, fetVar2, 0);
            mm40 mm40VarD2 = o7k0.d(jr8Var.b(jm40Var, gqw0.h), 1.0f);
            Object objP11 = fetVar2.P();
            if (objP11 == cl5Var3) {
                objP11 = new nw6(cgk0Var, (byte) 7);
                fetVar2.o0(objP11);
            }
            mm40 mm40VarY2 = fre0.Y(mm40VarD2, (Function1) objP11);
            mtl mtlVar = muaVar.d;
            boolean z7 = i4 == 256 ? true : z;
            Object objP12 = fetVar2.P();
            if (z7 || objP12 == cl5Var3) {
                objP12 = new xz8(function1, (byte) 13);
                fetVar2.o0(objP12);
            }
            fet fetVar3 = fetVar2;
            bkb.f(mm40VarY2, mtlVar, null, false, null, (Function1) objP12, fetVar3, 0, 28);
            fetVar2 = fetVar3;
            fetVar2.r(true);
            r2 = jm40Var;
        } else {
            fetVar2.X();
            r2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(r2, muaVar, function1, i2, (byte) 28);
        }
    }

    public static final a7k e(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        hsq hsqVarA = isq.a(f2);
        if (hsqVarA == null) {
            hsqVarA = new d900(f2);
        }
        return new a7k(f3, f2, hsqVarA);
    }

    public static final String e0(x1w x1wVar, ctf0 ctf0Var) {
        x1wVar.getClass();
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j2 = x1wVar.l;
        return rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
    }

    public static final String f0(x1w x1wVar, boolean z) {
        if (cy7.c() && z) {
            return "";
        }
        String str = x1wVar.p;
        return str.length() == 0 ? x1wVar.j : str;
    }

    public static final void g(mm40 mm40Var, akl aklVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(1694219872);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(aklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (aklVar instanceof yjl) {
            fetVar.e0(-1951187998);
            h(mm40Var, (yjl) aklVar, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!(aklVar instanceof zjl)) {
                throw b1j.f(352698303, fetVar, false);
            }
            fetVar.e0(-1950941393);
            j(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ljl(mm40Var, aklVar, function1, i2, (byte) 4);
        }
    }

    public static final void h(mm40 mm40Var, yjl yjlVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(-787350187);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(yjlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-423318314);
            Iterator<E> it = yjlVar.f42744a.iterator();
            while (it.hasNext()) {
                i(null, (bkl) it.next(), function1, fetVar, i3 & 896);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njl(mm40Var, yjlVar, function1, i2, (byte) 4);
        }
    }

    public static final void i(mm40 mm40Var, bkl bklVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-911127560);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(bklVar) : fetVar2.i(bklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long jM95getGray0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m95getGray0d7_KjU();
            Object[] objArr = new Object[0];
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new j2l((byte) 12);
                fetVar2.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new xjl(b2);
                fetVar2.o0(objP2);
            }
            v0h0 v0h0VarT = x8x.t((Function1) objP2, function2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new xal((byte) 19);
                fetVar2.o0(objP3);
            }
            Map map = (Map) e9x.R(objArr, v0h0VarT, (Function0) objP3, fetVar2, 384);
            boolean zG = fetVar2.g(map);
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                y3d y3dVar = (y3d) map.get(Long.valueOf(bklVar.f2754a));
                if (y3dVar != null) {
                    jM95getGray0d7_KjU = y3dVar.f41946a;
                }
                objP4 = androidx.compose.runtime.e.e(new y3d(jM95getGray0d7_KjU));
                fetVar2.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Context context = (Context) fetVar2.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | (i4 == 32 || ((i3 & 64) != 0 && fetVar2.i(bklVar)));
            Object objP5 = fetVar2.P();
            if (z || objP5 == cl5Var) {
                objP5 = new ojl(function1, bklVar, (byte) 4);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarE0 = o2e.e0(i120.Q(y860.W(mm40VarE2, null, null, false, null, (Function0) objP5, 28), ((y3d) pz40Var.getValue()).f41946a, jd8.n), "DS_BANNER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            Object objA = bklVar.b.a();
            mm40 mm40VarE1 = o2e.e0(ny9.O(3.25f, jr8.f16991a.b(o7k0.e(jm40Var, 64.0f), gqw0.c), false), "DS_BANNER_IMAGE");
            boolean z2 = i4 == 32 || ((i3 & 64) != 0 && fetVar2.i(bklVar));
            Object objP6 = fetVar2.P();
            if (z2 || objP6 == cl5Var) {
                objP6 = new edl(bklVar, (byte) 6);
                fetVar2.o0(objP6);
            }
            boolean z3 = false;
            mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP6);
            pge pgeVar = gqw0.A;
            boolean zI = fetVar2.i(map);
            if (i4 == 32 || ((i3 & 64) != 0 && fetVar2.i(bklVar))) {
                z3 = true;
            }
            boolean zG2 = zI | z3 | fetVar2.g(pz40Var) | fetVar2.i(context);
            Object objP7 = fetVar2.P();
            if (zG2 || objP7 == cl5Var) {
                vjl vjlVar = new vjl(map, bklVar, context, pz40Var, (byte) 1);
                fetVar2.o0(vjlVar);
                objP7 = vjlVar;
            }
            k7x.b(objA, null, mm40VarA, null, null, null, null, (Function1) objP7, null, null, pgeVar, null, fetVar, 48, 6, 31608);
            fetVar2 = fetVar;
            G(s5x0.N(o7k0.c, 12.0f, 0.0f, 144.0f, 0.0f, 10), bklVar, fetVar2, i4);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjl(mm40Var2, bklVar, function1, i2, (byte) 2);
        }
    }

    public static final void j(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-729871917);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD2, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 64.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 64.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 64.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, (byte) 3);
        }
    }

    public static final void k(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(753604832);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new m040(function1, (byte) 13);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i2, (byte) 5);
        }
    }

    public static final mm40 k0(mm40 mm40Var, enx enxVar) {
        return mm40Var.e(new anx(enxVar, true));
    }

    public static final void l(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mdm mdmVar2;
        mm40 mm40Var2;
        fetVar.g0(1585194400);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            mdmVar2 = mdmVar;
            i3 |= fetVar.g(mdmVar2) ? 32 : 16;
        } else {
            mdmVar2 = mdmVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float fT = knm0.t(1, fetVar, false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, fT, 7);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mfp(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar2, false, (Function0) objP, fetVar, i3 & 112, 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 13);
        }
    }

    public static final void m(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(1027066599);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 13);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 14);
        }
    }

    public static final void n(bzl bzlVar, a4x a4xVar, boolean z, boolean z2, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object obj;
        boolean z3;
        Object en2Var;
        int i4;
        fetVar.g0(-1115422927);
        int i5 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i5 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bzlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            obj = a4xVar;
            i3 |= fetVar.g(obj) ? 256 : 128;
        } else {
            obj = a4xVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            i3 |= fetVar.h(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(bdzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            d9z d9zVarA = bdzVar.a("FAVORITES_X_GAMES_LIST", fetVar);
            mm40 mm40VarV = cjx.V(jm40Var, bzlVar.a(new j6g0((byte) 17)), null);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i6 = 3670016 & i3;
            boolean zG = ((i3 & 57344) == 16384) | fetVar.g(d9zVarA) | (i6 == 1048576);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                i4 = i6;
                en2Var = new en2(z2, d9zVarA, function1, null, (byte) 1);
                fetVar.o0(en2Var);
            } else {
                i4 = i6;
                en2Var = objP;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) en2Var);
            n0q n0qVar = o7k0.c;
            boolean z4 = i4 == 1048576;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == obj2) {
                objP2 = new mfp(function1, (byte) 3);
                fetVar.o0(objP2);
            }
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(-1674558340, new x2g((Object) mm40VarV, (Object) d9zVarA, obj, (Object) function1, (byte) 19), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2p(bzlVar, a4xVar, z, z2, bdzVar, function1, i2, (byte) 1);
        }
    }

    public static final void o(gtp0 gtp0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(2031610768);
        int i3 = (fetVar.g(gtp0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mdm mdmVar = gtp0Var.b;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, (byte) 21);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) gtp0Var, (Object) function1, i2, (byte) 7);
        }
    }

    public static final void p(boolean z, bzl bzlVar, khe kheVar, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(886375870);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        byte b2 = 2;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(kheVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(bdzVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            d9z d9zVarA = bdzVar.a("FAVORITES_X_GAMES_LIST", fetVar);
            mm40 mm40VarV = cjx.V(jm40Var, bzlVar.a(new j6g0((byte) 17)), null);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z2 = (458752 & i3) == 131072;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new mfp(function1, b2);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1771221293, new x2g((Object) mm40VarV, (Object) kheVar, (Object) d9zVarA, (Object) function1, (byte) 3), fetVar), fetVar, (i3 & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg(z, bzlVar, kheVar, bdzVar, function1, i2);
        }
    }

    public static final void q(mm40 mm40Var, bzl bzlVar, j9p j9pVar, bdz bdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        bdzVar.getClass();
        function1.getClass();
        fetVar.g0(856370731);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bzlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(j9pVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(bdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 57344;
            boolean z = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new s8o(function1, (byte) 29);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new mfp(function1, b2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            die dieVar = j9pVar.f16148a;
            if (dieVar instanceof rge) {
                fetVar.e0(-1661432445);
                l(null, ((rge) dieVar).f30430a, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else if (dieVar instanceof ahe) {
                fetVar.e0(-1661428541);
                l(null, ((ahe) dieVar).f871a, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else if (dieVar instanceof dhe) {
                fetVar.e0(35460423);
                int i5 = i3;
                int i6 = i5 & 126;
                int i7 = i5 << 6;
                n(bzlVar, ((dhe) dieVar).f6086a, j9pVar.c, j9pVar.d, bdzVar, function1, fetVar, (i7 & 3670016) | (458752 & i7) | i6);
                fetVar.r(false);
            } else {
                int i8 = i3;
                if (dieVar instanceof khe) {
                    fetVar.e0(35835678);
                    int i9 = i8 << 3;
                    p(j9pVar.c, bzlVar, (khe) dieVar, bdzVar, function1, fetVar, (i8 & 14) | (i9 & 896) | (57344 & i9) | (i9 & 458752));
                    fetVar.r(false);
                } else {
                    if (!(dieVar instanceof uhe)) {
                        throw b1j.f(-1661434061, fetVar, false);
                    }
                    fetVar.e0(-1661401951);
                    D(bzlVar, (uhe) dieVar, fetVar, i8 & 126);
                    fetVar.r(false);
                }
            }
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) bzlVar, (Object) j9pVar, (Object) bdzVar, (Object) function1, i2, (byte) 29);
        }
    }

    public static final void r(int i2, int i3, fet fetVar, String str) {
        fetVar.g0(482733488);
        int i4 = (fetVar.g(str) ? 4 : 2) | i3 | (fetVar.e(i2) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            mz3 mz3VarX = l7x.X(Integer.valueOf(i2), null, null, fetVar, (i4 >> 3) & 14, 30);
            k7x.b(str, null, o2e.e0(o7k0.c, "VIRTUAL_GAME_CATEGORY_MAIN_TOOLBAR_IMAGE"), mz3VarX, mz3VarX, null, null, null, null, gqw0.b, gqw0.A, null, fetVar, (i4 & 14) | 805306800, 6, 31200);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v(str, i2, i3, (byte) 15);
        }
    }

    public static Task r0(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        hi hiVar = new hi(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, (byte) 3);
        ew3 ew3Var = f;
        task.continueWithTask(ew3Var, hiVar);
        task2.continueWithTask(ew3Var, hiVar);
        return taskCompletionSource.getTask();
    }

    public static final void s(int i2, int i3, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2089692403);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3 | (fetVar.e(i2) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            zx7 zx7Var = gqw0.e;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(mm40VarN, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            j0x.b(a8k0.F(i2, (i4 >> 3) & 14, fetVar), null, i120.Q(o7k0.n(jm40.b, 24.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ugg0Var), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar)).getPrimary(), 5), fetVar, 56, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, i3, (byte) 11);
        }
    }

    public static final mm40 s0(jm40 jm40Var) {
        return new gnx(enx.f8115a, false);
    }

    public static final void t(int i2, fet fetVar) {
        fetVar.g0(-1933618799);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, xfn.a(fetVar).f, 0.0f, 2), 1.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), 32.0f), vbc.d0(null, fetVar, 0, 1)));
            xvw.d(7, 48, fetVar, s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i2, (byte) 15);
        }
    }

    public static final List t0(List list, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        gz8 gz8Var;
        List list2;
        int iOrdinal;
        List list3 = null;
        if (list != null) {
            int i2 = 10;
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tc0 tc0Var = (tc0) it.next();
                tc0Var.getClass();
                Long l = tc0Var.f33695a;
                iz8 iz8Var = tc0Var.m;
                String strValueOf = String.valueOf(l);
                String str2 = tc0Var.b;
                String str3 = str2 == null ? "" : str2;
                StringBuilder sb = new StringBuilder(ujn.h);
                if (!z2 ? (str = tc0Var.g) == null : (str = tc0Var.h) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str, '/'));
                }
                String string = sb.toString();
                String str4 = str2 == null ? "" : str2;
                if (iz8Var == null || (iOrdinal = iz8Var.ordinal()) == 0) {
                    gz8Var = gz8.f12169a;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return list3;
                    }
                    gz8Var = gz8.b;
                }
                gz8 gz8Var2 = gz8Var;
                if (z || iz8Var == iz8.CONTRACTED) {
                    List<fw80> list4 = tc0Var.o;
                    if (list4 != null) {
                        ArrayList arrayList3 = new ArrayList(r3d.q(list4, i2));
                        for (fw80 fw80Var : list4) {
                            Long l2 = fw80Var.f10247a;
                            tc0 tc0Var2 = tc0Var;
                            long jLongValue = l2 != null ? l2.longValue() : 0L;
                            String str5 = fw80Var.b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            arrayList3.add(new gw80(jLongValue, str5));
                            tc0Var = tc0Var2;
                        }
                        list2 = arrayList3;
                    } else {
                        list2 = null;
                    }
                    tc0 tc0Var3 = tc0Var;
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    tc0Var = tc0Var3;
                } else {
                    list2 = iun.f15405a;
                }
                List list5 = list2;
                String str6 = tc0Var.l;
                if (str6 == null) {
                    str6 = "";
                }
                Integer num = tc0Var.k;
                int iIntValue = num != null ? num.intValue() : 0;
                String str7 = tc0Var.i;
                arrayList2.add(new s5d0(strValueOf, str3, string, str4, gz8Var2, list5, str6, iIntValue, str7 == null ? "" : str7));
                list3 = null;
                i2 = 10;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final void u(w740 w740Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1655633507);
        int i3 = (fetVar.g(w740Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "MESSAGES_LIST_COLUMN");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bw20((Object) w740Var, (Object) function1, (byte) 20);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(w740Var, function1, i2, (byte) 6);
        }
    }

    public static final ff6 u0(xm5 xm5Var, ctf0 ctf0Var, double d2, ko7 ko7Var, boolean z) {
        w30 h30Var;
        ctf0Var.getClass();
        ql5 ql5Var = xm5Var.c;
        double d3 = ql5Var.b;
        String str = ql5Var.f;
        String strA = ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0));
        h40 h40Var = xm5Var.d;
        f40 f40Var = h40Var.b;
        double d4 = h40Var.f12411a;
        if (f40Var == f40.f8887a || !(ko7Var instanceof jo7)) {
            h30Var = new h30();
        } else if (z) {
            h30Var = new e30(strA);
        } else if (f40Var == f40.b) {
            h30Var = new k30(strA);
        } else if (f40Var == f40.c) {
            str.getClass();
            if (d4 == -1.0d) {
                h30Var = new b30(strA);
            } else {
                int i2 = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                h30Var = new t30(strA, cy7.e(pn40.c(d4, p3u0.c)), str);
            }
        } else if (f40Var == f40.d) {
            int i3 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            h30Var = new q30(strA, cy7.e(pn40.c(d4, p3u0.c)), str);
        } else if (f40Var == f40.f) {
            int i4 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            h30Var = new n30(strA, cy7.e(pn40.c(d4, p3u0.c)), str);
        } else {
            h30Var = f40Var == f40.e ? new e30(strA) : new h30();
        }
        pn40 pn40Var4 = pn40.f27267a;
        return new ff6(h30Var, new sw7(pn40.c(d3, p3u0.c), str, (d3 == 0.0d || d2 > d3) && ql5Var.f28916a != 0 && ctf0Var.i(), false));
    }

    public static final void v(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-2067047161);
        byte b2 = 4;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new m040(function1, (byte) 9);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new m040(function1, (byte) 11);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
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
            imm immVar = ((e940) l7m0Var.getValue()).f7403a;
            boolean z3 = i4 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new m040(function1, (byte) 12);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z4 = i4 == 256;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new rp30(function1, b2);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function3, null, (Function1) objP4, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            z740 z740Var = ((e940) l7m0Var.getValue()).b;
            if (z740Var instanceof y740) {
                fetVar.e0(1713464779);
                C(0, fetVar);
                fetVar.r(false);
                function2 = function1;
            } else if (z740Var instanceof x740) {
                fetVar.e0(1713466799);
                function2 = function1;
                k(((x740) z740Var).f40396a, function2, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            } else {
                function2 = function1;
                if (!(z740Var instanceof w740)) {
                    throw b1j.f(1713462313, fetVar, false);
                }
                fetVar.e0(1577967937);
                z(((e940) l7m0Var.getValue()).c, function2, u1c.M(671158447, new ngz(z740Var, function2, (byte) 19), fetVar), fetVar, ((i3 >> 3) & 112) | 384);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function2, i2, (byte) 25);
        }
    }

    public static final ob7 v0(dao daoVar) {
        daoVar.getClass();
        long j2 = daoVar.c;
        String str = daoVar.l;
        long j3 = daoVar.e;
        long j4 = daoVar.b;
        double d2 = daoVar.f;
        long j5 = daoVar.m.f32198a;
        String str2 = daoVar.k;
        return new ob7(j2, j3, j4, false, d2, j5, (str2.length() <= 0 || str.length() <= 0) ? "" : kng0.l(str2, ": ", str), daoVar.h, false, daoVar.d, daoVar.i, iun.f15405a);
    }

    public static final void w(mm40 mm40Var, pq5 pq5Var, g3b g3bVar, b3b b3bVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(235082696);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(pq5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar2.g(g3bVar) : fetVar2.i(g3bVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar2.g(b3bVar) : fetVar2.i(b3bVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            mm40 mm40VarI = hne.i(1.0f, true, "AGGREGATOR_CATEGORY_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar2);
            boolean z = ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && fetVar2.i(g3bVar))) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && fetVar2.i(b3bVar)));
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                bg0 bg0Var = new bg0(pq5Var, mdmVar, g3bVar, function1, mm40Var, b3bVar, (byte) 0);
                fetVar2.o0(bg0Var);
                objP = bg0Var;
            }
            b8k0.e(mm40VarI, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) pq5Var, (Object) g3bVar, (Object) b3bVar, (Object) mdmVar, (Object) function1, i2, (byte) 0);
        }
    }

    public static final void x(mm40 mm40Var, pq5 pq5Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        fetVar.g0(-1163695219);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(pq5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mdmVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var.e(n0qVar), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            boolean z4 = (i5 & 112) == 32;
            Object objP = fetVar.P();
            boolean z5 = z4;
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = pq5Var instanceof nq5 ? ((nq5) pq5Var).b : lak0.c;
                fetVar.o0(objP);
            }
            i4 i4Var = (i4) objP;
            if (!i4Var.isEmpty() || (pq5Var instanceof oq5)) {
                fetVar.e0(-1013304696);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 8.0f, 1);
                lq5 lq5VarA = pq5Var.a();
                boolean z6 = pq5Var instanceof oq5;
                i4 = i5;
                boolean z7 = (i4 & 7168) == 2048;
                Object objP2 = fetVar.P();
                if (z7 || objP2 == cl5Var) {
                    objP2 = new ag0(function1, (byte) 1);
                    fetVar.o0(objP2);
                }
                etl.e(mm40VarL, i4Var, lq5VarA, z6, null, 0.0f, 0, null, (Function2) objP2, fetVar, 0, 240);
                z = false;
                fetVar.r(false);
            } else {
                fetVar.e0(-1012902037);
                fetVar.r(false);
                z = false;
                i4 = i5;
            }
            if (mdmVar != null) {
                fetVar.e0(-1012853770);
                tj30 tj30VarC = zq8.c(gqw0.e, z);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
                mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
                boolean z8 = (i4 & 7168) == 2048;
                Object objP3 = fetVar.P();
                if (z8 || objP3 == cl5Var) {
                    objP3 = new dn(function1, (byte) 19);
                    fetVar.o0(objP3);
                }
                z2 = true;
                jcb.l(mm40VarN, mdmVar, false, (Function0) objP3, fetVar, (i4 >> 3) & 112, 4);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                boolean z9 = z;
                z2 = true;
                fetVar.e0(-1012403061);
                fetVar.r(z9);
            }
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 0, i2, (Object) mm40Var, (Object) pq5Var, (Object) mdmVar, (Object) function1);
        }
    }

    public static final void x0() {
        throw new UnsupportedOperationException();
    }

    public static final void y(wpu0 wpu0Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        Object objJ;
        Object objJ2;
        byte b2;
        qja qjaVar = qja.j;
        fetVar.g0(-1513955967);
        byte b3 = 2;
        int i3 = i2 | (fetVar.g(wpu0Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            oms0 oms0VarZ = phu0.Z(l7m0Var.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, 1131814666, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qjaVar, new s43(objF, b3), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, 1131814666, fetVar), ((Number) objJ).floatValue(), false));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new tx50(oms0VarZ, (byte) 26));
                fetVar.o0(objP2);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, 1131814666, fetVar), ((Number) ((l7m0) objP2).getValue()).floatValue(), false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objP3 = jgk0.b(new tx50(oms0VarZ, (byte) 27));
                fetVar.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar, -481658966, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, 757060924, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == obj) {
                objP4 = kng0.d(qjaVar, new s43(objF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == obj) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, 757060924, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new tx50(oms0VarZ, (byte) 28));
                fetVar.o0(objP5);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP5).getValue()).floatValue(), twn.h(fetVar, 757060924, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new tx50(oms0VarZ, (byte) 29));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, -1068112420, false), lxs0Var2, fetVar, 0);
            mm40 mm40VarX = yyw.X(o7k0.d(jm40.b, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var2.getValue()).booleanValue());
            Object objP7 = fetVar.P();
            if (zH || objP7 == obj) {
                objP7 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, jM121getTransparent0d7_KjU, !((Boolean) l7m0Var2.getValue()).booleanValue(), null);
                fetVar.o0(objP7);
            }
            imm immVar = (imm) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                b2 = 1;
                objP8 = new vkm(1);
                fetVar.o0(objP8);
            } else {
                b2 = 1;
            }
            function1 = function0;
            hlm.c(mm40VarX, immVar, (vkm) objP8, null, null, null, null, null, null, u1c.M(1842073853, new cb3(function1, cms0VarE, cms0VarE2, (byte) 7), fetVar), u1c.M(1303419503, new onu0(l7m0Var, wpu0Var, b2), fetVar), nnw0.i, fetVar, 805309824, 54, 496);
        } else {
            function1 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 27, i2, wpu0Var, l7m0Var, l7m0Var2, function1);
        }
    }

    public static final mm40 y0(mm40 mm40Var, enx enxVar) {
        return mm40Var.e(new gnx(enxVar, true));
    }

    public static final void z(boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1052625935);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new m040(function1, (byte) 10);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, ((i3 << 3) & 112) | 6 | ((i3 << 18) & 234881024), 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx(z, (Object) function1, (Object) ugdVar, i2, (byte) 4);
        }
    }

    public g5 L(aty atyVar, List list, pys0 pys0Var, boolean z) {
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        p860 p860Var;
        boolean z3;
        wx40 wx40Var;
        iay iayVar;
        iay iayVar2;
        aty atyVar2;
        p860 p860VarH0;
        wx40 wx40VarG0;
        t8y t8yVar;
        atyVar.getClass();
        list.getClass();
        ArrayList arrayListW0 = w0(atyVar);
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(w0((aty) it.next()));
        }
        byte b2 = 0;
        boolean z4 = true;
        if (!m0() || list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (!n0(atyVar, (aty) it2.next())) {
                z2 = true;
                break;
            }
        }
        int size = arrayListW0.size();
        iay[] iayVarArr = new iay[size];
        int i2 = 0;
        while (i2 < size) {
            a8z a8zVarA = maz.a(wez.b, new i5(this, arrayListW0, i2, b2));
            if (i2 <= 0 || !z2) {
                iay iayVarN = N((j5) arrayListW0.get(i2), (t8y) a8zVarA.getValue());
                p860 p860Var2 = iayVarN.f14460a;
                boolean z5 = iayVarN.d;
                ArrayList<iay> arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    j5 j5Var = (j5) CollectionsKt.W(i2, (List) it3.next());
                    if (j5Var == null || (atyVar2 = j5Var.f15909a) == null) {
                        arrayList3 = arrayList3;
                        iayVar2 = null;
                    } else {
                        p860 p860VarH1 = h0(atyVar2);
                        if (p860VarH1 == null) {
                            aty atyVarC0 = c0(atyVar2);
                            p860VarH0 = atyVarC0 != null ? h0(atyVarC0) : null;
                        } else {
                            p860VarH0 = p860VarH1;
                        }
                        wx40 wx40VarG1 = g0(atyVar2);
                        wx40 wx40VarG2 = g0(atyVar2);
                        if (wx40VarG2 == null) {
                            aty atyVarC1 = c0(atyVar2);
                            wx40VarG0 = atyVarC1 != null ? g0(atyVarC1) : null;
                        } else {
                            wx40VarG0 = wx40VarG2;
                        }
                        iayVar2 = new iay(p860VarH0, wx40VarG0, j0().P(atyVar2) || q0(atyVar2), p860VarH0 != p860VarH1, wx40VarG0 != wx40VarG1);
                    }
                    if (iayVar2 != null) {
                        arrayList4.add(iayVar2);
                    }
                    arrayListW0 = arrayListW0;
                    arrayList3 = arrayList3;
                }
                arrayList = arrayListW0;
                arrayList2 = arrayList3;
                boolean z6 = i2 == 0 && m0();
                boolean z7 = i2 == 0 && Z();
                ArrayList arrayList5 = new ArrayList();
                for (iay iayVar3 : arrayList4) {
                    p860 p860Var3 = iayVar3.d ? null : iayVar3.f14460a;
                    if (p860Var3 != null) {
                        arrayList5.add(p860Var3);
                    }
                }
                Set setP0 = CollectionsKt.P0(arrayList5);
                p860 p860Var4 = z5 ? null : p860Var2;
                wx40 wx40Var2 = iayVarN.b;
                p860 p860Var5 = p860.f26540a;
                if (p860Var4 != p860Var5) {
                    p860Var5 = (p860) ipm0.p(setP0, p860.c, p860.b, p860Var4, z6);
                }
                if (p860Var5 == null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        p860 p860Var6 = ((iay) it4.next()).f14460a;
                        if (p860Var6 != null) {
                            arrayList6.add(p860Var6);
                        }
                    }
                    Set setP1 = CollectionsKt.P0(arrayList6);
                    p860Var = p860.f26540a;
                    if (p860Var2 != p860Var) {
                        p860Var = (p860) ipm0.p(setP1, p860.c, p860.b, p860Var2, z6);
                    }
                } else {
                    p860Var = p860Var5;
                }
                if (p860Var == null || z || (z7 && p860Var == p860.b)) {
                    p860Var = null;
                }
                boolean z8 = p860Var != null && p860Var5 == null;
                if (p860Var != p860.c) {
                    z3 = false;
                } else {
                    if (z5 != z8 || !iayVarN.c) {
                        if (!arrayList4.isEmpty()) {
                            Iterator it5 = arrayList4.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    iay iayVar4 = (iay) it5.next();
                                    if (iayVar4.d != z8 || !iayVar4.c) {
                                    }
                                }
                            }
                        }
                        z3 = false;
                    }
                    z3 = true;
                }
                ArrayList arrayList7 = new ArrayList();
                for (iay iayVar5 : arrayList4) {
                    wx40 wx40Var3 = iayVar5.e ? null : iayVar5.b;
                    if (wx40Var3 != null) {
                        arrayList7.add(wx40Var3);
                    }
                }
                wx40 wx40Var4 = (wx40) ipm0.p(CollectionsKt.P0(arrayList7), wx40.b, wx40.f39914a, iayVarN.e ? null : wx40Var2, z6);
                if (wx40Var4 == null) {
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        wx40 wx40Var5 = ((iay) it6.next()).b;
                        if (wx40Var5 != null) {
                            arrayList8.add(wx40Var5);
                        }
                    }
                    wx40Var = (wx40) ipm0.p(CollectionsKt.P0(arrayList8), wx40.b, wx40.f39914a, wx40Var2, z6);
                } else {
                    wx40Var = wx40Var4;
                }
                iayVar = new iay(p860Var, wx40Var, z3, z8, wx40Var != null && wx40Var4 == null);
            } else {
                iayVar = (p0() && (t8yVar = (t8y) a8zVarA.getValue()) != null && t8yVar.e == z4) ? N((j5) arrayListW0.get(i2), (t8y) a8zVarA.getValue()) : iay.f;
                arrayList = arrayListW0;
                arrayList2 = arrayList3;
            }
            iayVarArr[i2] = iayVar;
            i2++;
            arrayListW0 = arrayList;
            arrayList3 = arrayList2;
            b2 = 0;
            z4 = true;
        }
        return new g5(pys0Var, iayVarArr, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:156:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    public iay N(j5 j5Var, t8y t8yVar) {
        Iterable iterableO0;
        lov0 lov0VarV;
        boolean z;
        lov0 lov0VarJ;
        boolean z2;
        jys0 jys0VarN0;
        aty atyVar = j5Var.f15909a;
        jzs0 jzs0Var = j5Var.c;
        if (atyVar == null) {
            if ((jzs0Var != null ? j0().B0(jzs0Var) : null) == f0t0.IN) {
                return iay.f;
            }
        }
        byte b2 = 0;
        boolean z3 = jzs0Var == null;
        if (atyVar == null || (iterableO0 = U(atyVar)) == null) {
            iterableO0 = iun.f15405a;
        }
        yzs0 yzs0VarJ0 = j0();
        jzs0 jzs0VarC = (atyVar == null || (jys0VarN0 = yzs0VarJ0.n0(atyVar)) == null) ? null : yzs0VarJ0.C(jys0VarN0);
        boolean z4 = X() == x83.TYPE_PARAMETER_BOUNDS;
        if (z3) {
            if (z4 || !b0() || atyVar == null || !l0(atyVar)) {
                iterableO0 = CollectionsKt.o0(W(), iterableO0);
            } else {
                Iterable iterableW = W();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableW) {
                    if (!T().i(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableO0 = CollectionsKt.q0(arrayList, iterableO0);
            }
        }
        u0 u0VarT = T();
        u0VarT.getClass();
        iterableO0.getClass();
        t0 t0Var = new t0(1, u0VarT, u0.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/WithMigrationStatus;", 0, (byte) 0);
        Iterator it = iterableO0.iterator();
        lov0 lov0Var = null;
        while (it.hasNext()) {
            lov0 lov0Var2 = (lov0) t0Var.invoke(it.next());
            if (lov0Var != null) {
                boolean z5 = lov0Var.b;
                if (lov0Var2 != null && !lov0Var2.equals(lov0Var) && (!(z2 = lov0Var2.b) || z5)) {
                    if (z2 || !z5) {
                        lov0Var = null;
                        break;
                    }
                }
            }
            lov0Var = lov0Var2;
        }
        u0 u0VarT2 = T();
        g5 g5Var = new g5(this, j5Var, b2);
        u0VarT2.getClass();
        lov0 lov0Var3 = null;
        for (Object obj2 : iterableO0) {
            obj2.getClass();
            lov0 lov0VarJ2 = u0VarT2.j(obj2, ((Boolean) g5Var.invoke(obj2)).booleanValue());
            if (lov0VarJ2 == null) {
                Object objL = u0VarT2.l(obj2);
                if (objL != null) {
                    zlf0 zlf0VarK = u0VarT2.k(obj2);
                    if (zlf0VarK == null) {
                        zlf0VarK = ((ydy) u0VarT2.f34829a.c).f42462a;
                    }
                    if (zlf0VarK == zlf0.IGNORE || (lov0VarJ = u0VarT2.j(objL, ((Boolean) g5Var.invoke(objL)).booleanValue())) == null) {
                        lov0VarJ2 = null;
                    } else {
                        lov0VarJ2 = lov0.a(lov0VarJ, null, zlf0VarK.a(), 1);
                    }
                } else {
                    lov0VarJ2 = null;
                }
            }
            if (lov0Var3 != null) {
                boolean z6 = lov0Var3.b;
                if (lov0VarJ2 != null && !lov0VarJ2.equals(lov0Var3) && (!(z = lov0VarJ2.b) || z6)) {
                    if (z || !z6) {
                        lov0Var3 = null;
                        break;
                    }
                }
            }
            lov0Var3 = lov0VarJ2;
        }
        if (lov0Var3 != null) {
            Object obj3 = lov0Var3.f20409a;
            return new iay((p860) obj3, lov0Var != null ? (wx40) lov0Var.f20409a : null, obj3 == p860.c && jzs0VarC != null, lov0Var3.b, lov0Var != null && lov0Var.b);
        }
        lov0 lov0VarV2 = jzs0VarC != null ? V(jzs0VarC) : null;
        lov0 lov0VarA0 = a0(lov0VarV2, t8yVar);
        boolean z7 = (lov0VarV2 != null ? (p860) lov0VarV2.f20409a : null) == p860.c || !(jzs0VarC == null || t8yVar == null || !t8yVar.c);
        if (jzs0Var == null || (lov0VarV = V(jzs0Var)) == null) {
            lov0VarV = null;
        } else if (lov0VarV.f20409a == p860.b) {
            lov0VarV = lov0.a(lov0VarV, p860.f26540a, false, 2);
        }
        if (lov0VarV != null) {
            Object obj4 = lov0VarV.f20409a;
            if (lov0VarA0 == null) {
                lov0VarA0 = lov0VarV;
            } else {
                Object obj5 = lov0VarA0.f20409a;
                boolean z8 = lov0VarA0.b;
                boolean z9 = lov0VarV.b;
                if (!z9 || z8) {
                    if (z9 || !z8) {
                        p860 p860Var = (p860) obj4;
                        Enum r2 = (Enum) obj5;
                        if (p860Var.compareTo(r2) >= 0 && p860Var.compareTo(r2) > 0) {
                            lov0VarA0 = lov0VarV;
                        }
                    } else {
                        lov0VarA0 = lov0VarV;
                    }
                }
            }
        }
        return new iay(lov0VarA0 != null ? (p860) lov0VarA0.f20409a : null, lov0Var != null ? (wx40) lov0Var.f20409a : null, z7, lov0VarA0 != null && lov0VarA0.b, lov0Var != null && lov0Var.b);
    }

    public boolean P(Object obj, aty atyVar) {
        return false;
    }

    public u0 T() {
        return aqe0.d;
    }

    public Iterable U(aty atyVar) {
        atyVar.getClass();
        return ((v2) atyVar).getAnnotations();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lov0 V(jzs0 jzs0Var) {
        List list;
        p860 p860Var;
        yzs0 yzs0VarJ0 = j0();
        if (!o0(jzs0Var)) {
            return null;
        }
        List listG0 = yzs0VarJ0.g0(jzs0Var);
        if (listG0 != null && listG0.isEmpty()) {
            return null;
        }
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            if (!yzs0VarJ0.H((aty) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG0) {
                    if (h0((aty) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                a8z a8zVarA = maz.a(wez.b, new h5((Object) listG0, (Object) this, (byte) (0 == true ? 1 : 0)));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            ((aty) it2.next()).getClass();
                            list = listG0;
                        }
                    }
                    return new lov0(p860.f26540a, false);
                }
                if (((List) a8zVarA.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) a8zVarA.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        ((aty) it3.next()).getClass();
                        list = (List) a8zVarA.getValue();
                    }
                }
                return new lov0(p860.f26540a, true);
                if (list != null && list.isEmpty()) {
                    p860Var = p860.b;
                    break;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        p860Var = p860.b;
                        break;
                    }
                    if (!yzs0VarJ0.M((aty) it4.next())) {
                        p860Var = p860.c;
                        break;
                    }
                }
                return new lov0(p860Var, list != listG0);
            }
        }
        return null;
    }

    public Iterable W() {
        return iun.f15405a;
    }

    public abstract x83 X();

    public jay Y() {
        return null;
    }

    public abstract boolean Z();

    public lov0 a0(lov0 lov0Var, t8y t8yVar) {
        lov0 lov0Var2 = null;
        lov0 lov0Var3 = t8yVar != null ? t8yVar.f33535a : null;
        if (lov0Var3 != null) {
            lov0 lov0Var4 = t8yVar.d ? lov0Var3 : null;
            if (lov0Var4 != null) {
                return lov0Var4;
            }
        }
        if (lov0Var != null) {
            if (lov0Var.f20409a != p860.c) {
                lov0Var = null;
            }
            lov0Var2 = lov0Var;
        }
        return lov0Var2 == null ? lov0Var3 : lov0Var2;
    }

    public boolean b0() {
        return true;
    }

    public aty c0(aty atyVar) {
        atyVar.getClass();
        return null;
    }

    public abstract twq d0(dcg0 dcg0Var);

    public wx40 g0(aty atyVar) {
        yzs0 yzs0VarJ0 = j0();
        String str = bay.f2281a;
        if (bay.k.containsKey(d0(yzs0VarJ0.m0(atyVar)))) {
            return wx40.f39914a;
        }
        if (bay.j.containsKey(d0(yzs0VarJ0.W(atyVar)))) {
            return wx40.b;
        }
        return null;
    }

    public p860 h0(aty atyVar) {
        yzs0 yzs0VarJ0 = j0();
        if (yzs0VarJ0.l0(yzs0VarJ0.m0(atyVar))) {
            return p860.b;
        }
        if (yzs0VarJ0.l0(yzs0VarJ0.W(atyVar))) {
            return null;
        }
        return p860.c;
    }

    public boolean i0() {
        return false;
    }

    public yzs0 j0() {
        return jtv.u;
    }

    public boolean l0(aty atyVar) {
        atyVar.getClass();
        wsy wsyVar = (wsy) atyVar;
        if (wsyVar != null) {
            return ary.z(wsyVar) || ary.G(wsyVar);
        }
        ary.a(90);
        throw null;
    }

    public abstract boolean m0();

    public boolean n0(aty atyVar, aty atyVar2) {
        atyVar.getClass();
        atyVar2.getClass();
        return n6x.m((kiy) atyVar, (kiy) atyVar2);
    }

    public boolean o0(jzs0 jzs0Var) {
        jzs0Var.getClass();
        return jzs0Var instanceof gaz;
    }

    public boolean p0() {
        return true;
    }

    public boolean q0(aty atyVar) {
        atyVar.getClass();
        return false;
    }

    public ArrayList w0(aty atyVar) {
        yzs0 yzs0VarJ0 = j0();
        j5 j5Var = new j5(atyVar, u0.b(T(), Y(), U(atyVar)), null);
        g5 g5Var = new g5(this, yzs0VarJ0, (byte) 2);
        ArrayList arrayList = new ArrayList(1);
        O(j5Var, arrayList, g5Var);
        return arrayList;
    }
}
