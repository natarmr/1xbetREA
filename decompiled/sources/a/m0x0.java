package a;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.UserManager;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f20978a = null;
    public static volatile boolean b = false;
    public static final ugd c = new ugd(1747728910, false, new i5b(5));
    public static final ugd d = new ugd(-592169601, false, new chd(3));
    public static final ugd e = new ugd(-1493816650, false, new chd(4));
    public static final ugd f = new ugd(2054532836, false, new fhd(17));
    public static final ugd g = new ugd(-121022756, false, new mhd(11));
    public static final ugd h = new ugd(-1970899745, false, new qhd(23));
    public static final vt5 i = new vt5(25);
    public static final lwk j = new lwk();
    public static final Object k = new Object();
    public static Thread l;
    public static volatile Handler m;

    public static final void A(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(800501826);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarH = k7n0.H(mm40Var.e(o7k0.c), 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new i280((byte) 10);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarQ = i120.Q(mm40VarW, staticColors.m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(staticColors.m131getWhite800d7_KjU()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i2, (byte) 13);
        }
    }

    public static final void B(bxc0 bxc0Var, FixedWebView fixedWebView, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        Function1 function2;
        FixedWebView fixedWebView2;
        bxc0 bxc0Var2 = bxc0Var;
        bxc0Var2.getClass();
        fixedWebView.getClass();
        function1.getClass();
        fetVar.g0(-964842750);
        int i3 = i2 | (fetVar.g(bxc0Var2) ? 4 : 2) | (fetVar.i(fixedWebView) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(o050.S(o050.W(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n))), "PROMO_WEB_AGGREGATOR_SCREEN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            imm immVar = bxc0Var2.a().f12854a;
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 23);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i4 = FixedWebView.e;
            int i5 = i3 >> 3;
            fixedWebView2 = fixedWebView;
            l(fixedWebView2, fetVar2, (i5 & 14) | 8);
            bxc0Var2 = bxc0Var;
            if (bxc0Var2 instanceof axc0) {
                fetVar2.e0(791328150);
                x(0, fetVar2);
                fetVar2.r(false);
                function2 = function1;
            } else if (bxc0Var2 instanceof zwc0) {
                fetVar2.e0(791330464);
                function2 = function1;
                r(((zwc0) bxc0Var2).b, function2, fetVar2, i5 & 112);
                fetVar2.r(false);
            } else {
                function2 = function1;
                if (!(bxc0Var2 instanceof ywc0)) {
                    throw b1j.f(791326075, fetVar2, false);
                }
                fetVar2.e0(791334090);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            function2 = function1;
            fixedWebView2 = fixedWebView;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(bxc0Var2, fixedWebView2, function2, i2, (byte) 0);
        }
    }

    public static final void C(k3t0 k3t0Var, fet fetVar, int i2) {
        k3t0Var.getClass();
        fetVar.g0(-1932387957);
        int i3 = i2 | (fetVar.g(k3t0Var) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new dbh(k3t0Var, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new dbh(k3t0Var, (byte) 22);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            int i5 = hfv.b;
            afv afvVar = (afv) fetVar.k(bmd.g);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new bfv(afvVar);
                fetVar.o0(objP3);
            }
            dfv dfvVar = ((bfv) objP3).b;
            boolean zG = fetVar.g(dfvVar);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new x7a(dfvVar);
                fetVar.o0(objP4);
            }
            x7a x7aVar = (x7a) objP4;
            byte b2 = 11;
            m8x.y(o7k0.c, u1c.M(1852797519, new kqh0(i3t0Var, pz40VarY, (byte) 21), fetVar), u1c.M(1887621456, new fzi0(pz40VarY, x7aVar, i3t0Var, b2), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(2107591706, new sqc0(pz40VarY, x7aVar, i3t0Var, b2), fetVar), fetVar, 805306806, 440);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i2, (byte) 5);
        }
    }

    public static final void D(Function0 function0, fet fetVar) {
        a180 a180Var = fetVar.M.b.f29108a;
        a180Var.c0(g080.d);
        c9x.L(a180Var, 0, function0);
    }

    public static final void E(mm40 mm40Var, l7m0 l7m0Var, boolean z, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-2096907894);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(16.0f, true, new jf4((byte) 14)), h97.f(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, 24.0f, fetVar), false, null, u1c.M(2022659912, new l4m(function1, z, xczVar, (byte) 5), fetVar), fetVar, ((i3 >> 6) & 112) | 113246208 | ((i3 << 3) & 896), 72);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var2, (Object) l7m0Var, z, (Object) xczVar, (wdr) function1, i2, (byte) 11);
        }
    }

    public static final void F(mm40 mm40Var, xno0 xno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        a4x a4xVar = xno0Var.f41179a;
        function1.getClass();
        fetVar2.g0(1918451185);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = xno0Var.c;
            int i4 = xno0Var.b;
            if (a4xVar.isEmpty()) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new o1l0(xno0Var, function1, i2);
                    return;
                }
                return;
            }
            int size = a4xVar.size() - 1;
            if (size < 0) {
                size = 0;
            }
            int iD = l1e0.d(i4, 0, size);
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object objP = fetVar2.P();
            byte b3 = 27;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new jfm0(xno0Var, b3);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(iD, (Function0) objP, fetVar2, 0, 2);
            boolean zH = fetVar2.h(z);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.valueOf(!z));
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Integer numValueOf = Integer.valueOf(i4);
            boolean zG = (i5 == 32) | fetVar2.g(kwjVarB);
            Object objP3 = fetVar2.P();
            yje yjeVar = null;
            if (zG || objP3 == cl5Var) {
                objP3 = new wbl0(kwjVarB, xno0Var, yjeVar, (byte) 6);
                fetVar2.o0(objP3);
            }
            t(fetVar2, numValueOf, (Function2) objP3);
            int i6 = i3 & 896;
            boolean zG2 = fetVar2.g(kwjVarB) | (i6 == 256);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new jno0(kwjVarB, function1, yjeVar, b2);
                fetVar2.o0(objP4);
            }
            t(fetVar2, kwjVarB, (Function2) objP4);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            int iR = kwjVarB.r();
            a4x a4xVar2 = xno0Var.f41179a;
            aoo0 aoo0Var = xno0Var.f;
            b2 = i6 == 256 ? (byte) 1 : (byte) 0;
            Object objP5 = fetVar2.P();
            if (b2 != 0 || objP5 == cl5Var) {
                objP5 = new zbm0(function1, b3);
                fetVar2.o0(objP5);
            }
            z5n.h(iR, a4xVar2, aoo0Var, null, null, false, (Function1) objP5, fetVar2, 0, 56);
            q5x.e(kwjVarB, n0qVar, null, null, 1, 0.0f, null, null, false, null, null, null, null, u1c.M(-1936863398, new g54((Object) xno0Var, (Object) kwjVarB, (Object) pz40Var, (Object) function1, (byte) 1), fetVar2), fetVar, 24624, 24576, 16364);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new s0n0(mm40Var2, xno0Var, function1, i2, (byte) 4);
        }
    }

    public static final void G(u5t0 u5t0Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        u5t0Var.getClass();
        function2.getClass();
        fetVar2.g0(634054998);
        byte b2 = 16;
        int i3 = i2 | (fetVar2.g(u5t0Var) ? 4 : 2) | (fetVar2.i(function2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new nas0(function2, b2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new nas0(function2, (byte) 17);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            fetVar2 = fetVar;
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            o050.I(0, fetVar2, null, u5t0Var.b);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarX = yyw.X(n0qVar, null, fetVar2, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            o5n0.k((i3 << 3) & 896, fetVar2, null, u5t0Var.f35112a, function2);
            l7m0 l7m0Var = u5t0Var.c;
            boolean z5 = i4 == 32;
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new xar0(function2, (byte) 24);
                fetVar2.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            boolean z6 = i4 == 32;
            Object objP4 = fetVar2.P();
            if (z6 || objP4 == cl5Var) {
                objP4 = new xar0(function2, (byte) 25);
                fetVar2.o0(objP4);
            }
            fww.f(null, l7m0Var, function3, (Function1) objP4, fetVar2, 0);
            k5t0 k5t0Var = (k5t0) u5t0Var.d.getValue();
            if (k5t0Var != null) {
                boolean z7 = k5t0Var instanceof j5t0;
                jm40 jm40Var = jm40.b;
                if (z7) {
                    fetVar2.e0(-2074879475);
                    mm40 mm40VarR = knm0.r(n0qVar);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarR);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    jcb.l(knm0.r(jm40Var), ((j5t0) k5t0Var).f15950a, false, null, fetVar2, 0, 12);
                    fetVar2.r(true);
                    fetVar2.r(false);
                    function2 = function1;
                } else if (k5t0Var instanceof i5t0) {
                    fetVar2.e0(-2074865508);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, n0qVar);
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
                    mm40 mm40VarR2 = knm0.r(jm40Var);
                    mdm mdmVar = ((i5t0) k5t0Var).f14209a;
                    boolean z8 = i4 == 32;
                    Object objP5 = fetVar2.P();
                    if (z8 || objP5 == cl5Var) {
                        function2 = function1;
                        objP5 = new nas0(function2, (byte) 18);
                        fetVar2.o0(objP5);
                    } else {
                        function2 = function1;
                    }
                    jcb.l(mm40VarR2, mdmVar, false, (Function0) objP5, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    function2 = function1;
                    if (k5t0Var instanceof h5t0) {
                        fetVar2.e0(104124071);
                        h5t0 h5t0Var = (h5t0) k5t0Var;
                        E(null, h5t0Var.f12498a, h5t0Var.b, xczVarA, function2, fetVar2, (i3 << 9) & 57344);
                        fetVar2.r(false);
                    } else {
                        z = false;
                    }
                }
                fetVar2.r(true);
            } else {
                z = false;
            }
            throw b1j.f(-2074882069, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(u5t0Var, function2, i2, (byte) 22);
        }
    }

    public static final void H(int i2) {
        new Integer(i2);
    }

    public static final vne I(kotlin.coroutines.g gVar, fet fetVar) {
        gVar.getClass();
        return new lff0(fetVar.R, gVar);
    }

    public static final boolean J(View view) {
        view.getClass();
        Object obj = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            for (Object obj2 : new ihu0(viewGroup)) {
                if (((View) obj2) instanceof DsAccordion) {
                    obj = obj2;
                    break;
                }
            }
            obj = (View) obj;
        }
        return obj != null;
    }

    public static final bbk0 K(um3 um3Var, bb6 bb6Var, ctf0 ctf0Var) {
        iy3 iy3Var = um3Var.f35902a;
        return new bbk0(iy3Var, new y0x(L(bb6Var, ctf0Var, iy3Var, false), ctf0.b(R.attr.uikitSplashBackground, ctf0Var)));
    }

    public static final uyw L(bb6 bb6Var, ctf0 ctf0Var, iy3 iy3Var, boolean z) {
        int iM;
        String strA;
        if (z) {
            if (iy3Var instanceof ey3) {
                strA = ctf0Var.b.a(R.string.app_update_background_lottie_image_1_17, Arrays.copyOf(new Object[0], 0));
            } else if (iy3Var instanceof gy3) {
                strA = ctf0Var.b.a(R.string.app_update_background_lottie_image_1_2, Arrays.copyOf(new Object[0], 0));
            } else if (iy3Var instanceof hy3) {
                strA = ctf0Var.b.a(R.string.app_update_background_lottie_image_1_12, Arrays.copyOf(new Object[0], 0));
            } else {
                if (!(iy3Var instanceof fy3)) {
                    t9f.b();
                    return null;
                }
                strA = ctf0Var.b.a(R.string.app_update_background_lottie_image_1_12, Arrays.copyOf(new Object[0], 0));
            }
            iM = bb6Var.a(strA, dkq.DRAWABLE);
        } else {
            iM = M(bb6Var, ctf0Var, iy3Var);
        }
        return iM != 0 ? new syw(iM) : new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
    }

    public static final int M(bb6 bb6Var, ctf0 ctf0Var, iy3 iy3Var) {
        String strA;
        if (iy3Var instanceof ey3) {
            strA = ctf0Var.b.a(R.string.app_update_background_image_1_17, Arrays.copyOf(new Object[0], 0));
        } else if (iy3Var instanceof gy3) {
            strA = ctf0Var.b.a(R.string.app_update_background_image_1_2, Arrays.copyOf(new Object[0], 0));
        } else if (iy3Var instanceof hy3) {
            strA = ctf0Var.b.a(R.string.app_update_background_image_1_12, Arrays.copyOf(new Object[0], 0));
        } else {
            if (!(iy3Var instanceof fy3)) {
                t9f.b();
                return 0;
            }
            strA = ctf0Var.b.a(R.string.app_update_background_image_1_12, Arrays.copyOf(new Object[0], 0));
        }
        return bb6Var.a(strA, dkq.DRAWABLE);
    }

    public static final String N(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.properties");
            Object objInvoke = clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, Arrays.copyOf(new Object[]{str}, 1));
            objInvoke.getClass();
            return (String) objInvoke;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static final Object O(RecyclerView recyclerView, int i2) {
        List listZ;
        Object objW;
        yge0 adapter = recyclerView.getAdapter();
        zz3 zz3Var = adapter instanceof zz3 ? (zz3) adapter : null;
        return (zz3Var == null || (listZ = zz3Var.z()) == null || (objW = CollectionsKt.W(i2, listZ)) == null) ? Unit.f46060a : objW;
    }

    public static t58 P(Fragment fragment, boolean z) {
        riu0 riu0VarB = z ? fragment.B() : null;
        if (riu0VarB == null) {
            riu0VarB = fragment.y;
        }
        if (riu0VarB == null) {
            jf4.n("view model not found");
            return null;
        }
        piu0 piu0VarG = riu0VarB.g();
        miu0 miu0VarP = u4n0.p(riu0VarB);
        wbf wbfVarO = u4n0.o(riu0VarB);
        piu0VarG.getClass();
        miu0VarP.getClass();
        wbfVarO.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, miu0VarP, wbfVarO);
        sgy sgyVarB = sre0.f32672a.b(t58.class);
        String strV = sgyVarB.v();
        if (strV != null) {
            return (t58) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV));
        }
        jf4.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final boolean Q(m9b m9bVar, Object obj) {
        List listA = m9bVar.a();
        if (listA != null && listA.isEmpty()) {
            return false;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((Class) it.next(), obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean R(Object obj, List list) {
        obj.getClass();
        list.getClass();
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((Class) it.next(), obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public static final void S(Context context, String str, String str2) {
        OutputStream fileOutputStream;
        str.getClass();
        str2.getClass();
        byte[] bArrDecode = Base64.decode(StringsKt.m0(str, "base64,", str), 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        if (bitmapDecodeByteArray == null) {
            return;
        }
        try {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
            String str3 = "payment" + System.currentTimeMillis() + extensionFromMimeType;
            if (Build.VERSION.SDK_INT >= 29) {
                ContentResolver contentResolver = context.getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str3);
                contentValues.put("mime_type", str2);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert == null || (fileOutputStream = contentResolver.openOutputStream(uriInsert)) == null) {
                    fileOutputStream = new FileOutputStream(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str3));
                }
            } else {
                fileOutputStream = new FileOutputStream(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str3));
            }
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final nu9 T(ht9 ht9Var) {
        String str = ht9Var.f13624a;
        if (str == null) {
            str = "";
        }
        Integer num = ht9Var.b;
        if (num != null) {
            return new nu9(str, num.intValue());
        }
        jf4.k(null);
        return null;
    }

    public static boolean U(Thread thread) {
        Thread thread2 = l;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            l = thread2;
        }
        return thread == thread2;
    }

    public static Handler V() {
        if (m == null) {
            synchronized (k) {
                try {
                    if (m == null) {
                        m = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public static l2 W(Context context, Callable callable, Executor executor) {
        zas0 zas0Var = new zas0((Object) callable, (byte) 19);
        if (X(context)) {
            trs0 trs0Var = new trs0();
            trs0Var.i = new srs0(trs0Var, zas0Var);
            executor.execute(trs0Var);
            return trs0Var;
        }
        fui0 fui0Var = new fui0();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        k0x0 k0x0Var = new k0x0(atomicBoolean, context, fui0Var, zas0Var, executor);
        context.registerReceiver(k0x0Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!X(context) || !atomicBoolean.compareAndSet(false, true)) {
            fui0Var.a(new pb90(fui0Var, atomicBoolean, context, k0x0Var, (byte) 10), ank.f1158a);
            return fui0Var;
        }
        try {
            context.unregisterReceiver(k0x0Var);
        } catch (IllegalArgumentException e2) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
        }
        trs0 trs0Var2 = new trs0();
        trs0Var2.i = new srs0(trs0Var2, zas0Var);
        executor.execute(trs0Var2);
        fui0Var.o(trs0Var2);
        return fui0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:31:0x004e, B:32:0x0050, B:21:0x0029, B:23:0x002f, B:27:0x003c, B:29:0x004a), top: B:38:0x0009, inners: #0 }] */
    public static boolean X(Context context) {
        if (b) {
            return true;
        }
        synchronized (m0x0.class) {
            try {
                if (b) {
                    return true;
                }
                int i2 = 1;
                while (true) {
                    boolean z = false;
                    if (i2 <= 2) {
                        UserManager userManager = f20978a;
                        if (userManager == null) {
                            userManager = (UserManager) context.getSystemService(UserManager.class);
                            f20978a = userManager;
                        }
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e2) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                                f20978a = null;
                                i2++;
                            }
                        }
                        if (z) {
                            b = true;
                        }
                        return z;
                    }
                    if (z) {
                        f20978a = null;
                    }
                    if (z) {
                        b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(mm40 mm40Var, Function2 function2, Function2 function3, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1562981684);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function3) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            if (function3 == null) {
                fetVar.e0(1741812347);
                fetVar.r(false);
            } else {
                fetVar.e0(-1052191162);
                h97.q((i3 >> 6) & 14, fetVar, function3, false);
            }
            if (function2 == null) {
                fetVar.e0(1741847067);
                fetVar.r(false);
            } else {
                fetVar.e0(-1052190042);
                h97.q((i3 >> 3) & 14, fetVar, function2, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e61(mm40Var, function2, function3, i2, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, p3w p3wVar, fet fetVar, int i2) {
        ugd ugdVarM;
        fetVar.g0(137835398);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(p3wVar) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ugd ugdVarM2 = null;
            if (p3wVar.u.length() > 0) {
                fetVar.e0(265873971);
                ugdVarM = u1c.M(-321446797, new c61(p3wVar, b2), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(266135456);
                fetVar.r(false);
                ugdVarM = null;
            }
            if (p3wVar.s.length() > 0) {
                fetVar.e0(266245909);
                ugdVarM2 = u1c.M(1190334076, new c61(p3wVar, b3), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(266505472);
                fetVar.r(false);
            }
            a(mm40Var, ugdVarM2, ugdVarM, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d61(mm40Var, p3wVar, i2, b2);
        }
    }

    public static final void c(mm40 mm40Var, v72 v72Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1994109697);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(v72Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(v72Var.b, fetVar2);
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarW, qmk.a(fetVar2).e, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            x5d x5dVarA = w5d.a(uc9.d, gqw0.m, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            String str = v72Var.f36902a;
            pz40 pz40Var = s6t0.f31722a;
            y9q0 y9q0VarS = g1t0.s();
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            long j2 = qmk.t;
            long j3 = qmk.A;
            long j4 = qmk.n;
            v8q0.a(str, mm40VarN2, jM123getWhite0d7_KjU, new n05(j2, j3, j4), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarS, fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            String str2 = (String) pz40VarF.getValue();
            if (str2 == null) {
                fetVar2.e0(-333869317);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-333869316);
                v8q0.a(str2, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), staticColors.m123getWhite0d7_KjU(), new n05(qmk.q, j2, j4), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var, (Object) v72Var, i2, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x015e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0178  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x0191  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:128:0x0212  */
    /* JADX WARN: Code duplicated, block: B:131:0x021e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x0245  */
    /* JADX WARN: Code duplicated, block: B:140:0x025a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0269  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:150:0x029b  */
    /* JADX WARN: Code duplicated, block: B:151:0x029d  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x0388  */
    /* JADX WARN: Code duplicated, block: B:170:0x039a  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0147  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a  */
    public static final void d(mm40 mm40Var, final float f2, final long j2, final long j3, final boolean z, final float f3, ycl yclVar, long j4, float f4, l7m0 l7m0Var, Function1 function1, final ugd ugdVar, final ugd ugdVar2, fet fetVar, final int i2, final int i3, final int i4) {
        int i5;
        final ycl yclVar2;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        final mm40 mm40Var2;
        final l7m0 l7m0Var2;
        final Function1 function2;
        final float f6;
        final long j5;
        yfe0 yfe0VarU;
        int i11;
        Object obj;
        mm40 mm40Var3;
        long j6;
        l7m0 l7m0VarE;
        Function1 function3;
        mm40 mm40Var4;
        l7m0 l7m0Var3;
        ycl yclVar3;
        long j7;
        Object objP;
        float fW0;
        boolean zD;
        Object objP2;
        agk0 agk0Var;
        Object objP3;
        vtj vtjVar;
        Object objP4;
        rv2 rv2Var;
        Object objP5;
        final l7m0 l7m0Var4;
        Object objP6;
        final l7m0 l7m0Var5;
        Object objP7;
        boolean zG;
        Object objP8;
        boolean z3;
        Object objP9;
        boolean zG2;
        Object objP10;
        Object objP11;
        Object objP12;
        fetVar.g0(-121348687);
        int i12 = i4 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i13 = i5 | (fetVar.d(f2) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128) | (fetVar.f(j3) ? 2048 : 1024) | (fetVar.d(f3) ? 131072 : 65536);
        int i14 = i4 & 64;
        if (i14 != 0) {
            i6 = i13 | 1572864;
            yclVar2 = yclVar;
        } else {
            yclVar2 = yclVar;
            i6 = i13 | (fetVar.g(yclVar2) ? 1048576 : 524288);
        }
        int i15 = i6 | (((i4 & 128) == 0 && fetVar.f(j4)) ? 8388608 : 4194304);
        if ((i4 & 256) == 0) {
            f5 = f4;
            int i16 = fetVar.d(f5) ? 67108864 : 33554432;
            i7 = i15 | i16;
            if ((i2 & 805306368) != 0) {
                i7 |= ((i4 & 512) == 0 || !fetVar.g(l7m0Var)) ? 268435456 : 536870912;
            }
            i8 = i4 & 1024;
            if (i8 != 0) {
                i9 = 438;
            } else if ((i3 & 6) == 0) {
                if (fetVar.i(function1)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i3 | i10;
            } else {
                i9 = i3;
            }
            if ((i7 & 306783379) == 306783378 || (i9 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i7 & 1, z2)) {
                fetVar.Z();
                i11 = i2 & 1;
                obj = ukd.f35823a;
                if (i11 != 0 || fetVar.B()) {
                    if (i12 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i14 != 0) {
                        yclVar2 = null;
                    }
                    if ((i4 & 128) != 0) {
                        i7 &= -29360129;
                        j6 = j3;
                    } else {
                        j6 = j4;
                    }
                    if ((i4 & 256) != 0) {
                        i7 &= -234881025;
                        f5 = f3;
                    }
                    if ((i4 & 512) != 0) {
                        l7m0VarE = androidx.compose.runtime.e.e(Boolean.FALSE);
                        i7 &= -1879048193;
                    } else {
                        l7m0VarE = l7m0Var;
                    }
                    if (i8 != 0) {
                        objP = fetVar.P();
                        if (objP == obj) {
                            objP = new xd2((byte) 17);
                            fetVar.o0(objP);
                        }
                        function3 = (Function1) objP;
                    } else {
                        i9 = i9;
                        function3 = function1;
                    }
                    mm40Var4 = mm40Var3;
                    l7m0Var3 = l7m0VarE;
                    yclVar3 = yclVar2;
                    j7 = j6;
                } else {
                    fetVar.X();
                    if ((i4 & 128) != 0) {
                        i7 &= -29360129;
                    }
                    if ((i4 & 256) != 0) {
                        i7 &= -234881025;
                    }
                    if ((i4 & 512) != 0) {
                        i7 &= -1879048193;
                    }
                    j7 = j4;
                    l7m0Var3 = l7m0Var;
                    function3 = function1;
                    i9 = i9;
                    yclVar3 = yclVar2;
                    mm40Var4 = mm40Var;
                }
                int i17 = i7;
                final float f7 = f5;
                fetVar.s();
                final ycl yclVar4 = yclVar3;
                fetVar.b0(-651943832, new ycl(f2));
                w6k w6kVar = (w6k) fetVar.k(bmd.h);
                fW0 = w6kVar.w0(f2) + w6kVar.w0(f7);
                Object[] objArr = new Object[0];
                zD = fetVar.d(fW0);
                final l7m0 l7m0Var6 = l7m0Var3;
                objP2 = fetVar.P();
                if (zD || objP2 == obj) {
                    objP2 = new rt2(fW0, (byte) 1);
                    fetVar.o0(objP2);
                }
                agk0Var = (agk0) e9x.Q(objArr, (Function0) objP2, fetVar, 0);
                objP3 = fetVar.P();
                if (objP3 == obj) {
                    pel pelVar = new pel();
                    pelVar.a(mt2.f22349a, fW0);
                    pelVar.a(mt2.b, 0.0f);
                    float[] fArr = pelVar.b;
                    ArrayList arrayList = pelVar.f26860a;
                    int size = arrayList.size();
                    nx3.a(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    Object vtjVar2 = new vtj(arrayList, fArrCopyOfRange);
                    fetVar.o0(vtjVar2);
                    objP3 = vtjVar2;
                }
                vtjVar = (vtj) objP3;
                objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new rv2(vtjVar, mt2.f22349a);
                    fetVar.o0(objP4);
                }
                rv2Var = (rv2) objP4;
                objP5 = fetVar.P();
                if (objP5 == obj) {
                    objP5 = jgk0.b(new st2(rv2Var, (byte) 2));
                    fetVar.o0(objP5);
                }
                l7m0Var4 = (l7m0) objP5;
                objP6 = fetVar.P();
                if (objP6 == obj) {
                    objP6 = jgk0.b(new tt2(l7m0Var4, fW0, (byte) 3));
                    fetVar.o0(objP6);
                }
                l7m0Var5 = (l7m0) objP6;
                objP7 = fetVar.P();
                if (objP7 == obj) {
                    objP7 = jgk0.b(new zt2(z, f3, l7m0Var5));
                    fetVar.o0(objP7);
                }
                final l7m0 l7m0Var7 = (l7m0) objP7;
                Unit unit = Unit.f46060a;
                zG = fetVar.g(agk0Var);
                objP8 = fetVar.P();
                if (zG || objP8 == obj) {
                    objP8 = new du2(rv2Var, agk0Var, null, (byte) 1);
                    fetVar.o0(objP8);
                }
                t(fetVar, unit, (Function2) objP8);
                if ((i9 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP9 = fetVar.P();
                if (z3 || objP9 == obj) {
                    objP9 = new qa(function3, rv2Var, null, (byte) 27);
                    fetVar.o0(objP9);
                }
                t(fetVar, unit, (Function2) objP9);
                zG2 = fetVar.g(agk0Var);
                objP10 = fetVar.P();
                if (zG2 || objP10 == obj) {
                    objP10 = new ut2(agk0Var, rv2Var, (byte) 2);
                    fetVar.o0(objP10);
                }
                o(unit, (Function1) objP10, fetVar);
                objP11 = fetVar.P();
                if (objP11 == obj) {
                    objP11 = new gu2(rv2Var);
                    fetVar.o0(objP11);
                }
                gu2 gu2Var = (gu2) objP11;
                mm40 mm40VarE = mm40Var4.e(o7k0.c);
                ma80 ma80Var = ma80.f21447a;
                uts0 uts0Var = nu2.f24127a;
                objP12 = fetVar.P();
                if (objP12 == obj) {
                    objP12 = new xd2((byte) 20);
                    fetVar.o0(objP12);
                }
                mm40 mm40VarV = cjx.V(dv2.b(mm40VarE, rv2Var, !((Boolean) l7m0Var6.getValue()).booleanValue(), nu2.a(rv2Var, (Function1) objP12, ro4.m0(0, 0, null, 7), fetVar, 3510), 48), gu2Var, null);
                niq niqVar = i120.m;
                ugd ugdVarM = u1c.M(-1122411495, new vt2(ugdVar, l7m0Var5, l7m0Var4, f7, (byte) 2), fetVar);
                final long j8 = j7;
                kc5.J(mm40VarV, j3, j2, niqVar, ugdVarM, u1c.M(918248157, new xdr() { // from class: a.bu2
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        mm40 mm40VarN;
                        hh80 hh80Var = (hh80) obj2;
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        hh80Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            n0q n0qVar = o7k0.c;
                            ycl yclVar5 = yclVar4;
                            int i18 = iIntValue;
                            l7m0 l7m0Var8 = l7m0Var5;
                            jm40 jm40Var = jm40.b;
                            if (yclVar5 != null) {
                                mm40VarN = knx.Q(jm40Var, new ez20(l7m0Var6, l7m0Var8, f2, yclVar5.f42389a));
                            } else {
                                float fD = hh80Var.d() - f7;
                                ycl yclVar6 = new ycl(fD);
                                zcl zclVar = qmk.f28987a;
                                if (ycl.a(fD, 0.0f) < 0) {
                                    yclVar6 = null;
                                }
                                mm40VarN = s5x0.N(jm40Var, 0.0f, yclVar6 != null ? yclVar6.f42389a : 0.0f, 0.0f, 0.0f, 13);
                            }
                            mm40 mm40VarE2 = n0qVar.e(mm40VarN);
                            l7m0 l7m0Var9 = l7m0Var7;
                            mm40 mm40VarQ = i120.Q(k7n0.H(lgb.J(mm40VarE2, vgg0.c(((ycl) l7m0Var9.getValue()).f42389a, ((ycl) l7m0Var9.getValue()).f42389a, 0.0f, 0.0f, 12)), 1.0f), j8, jd8.n);
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
                            ugdVar2.O(hh80Var, l7m0Var8, l7m0Var4, fetVar2, Integer.valueOf((i18 & 14) | 432));
                            fetVar2.r(true);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, ((i17 >> 6) & 112) | 221184 | (i17 & 896));
                fetVar.r(false);
                f6 = f7;
                function2 = function3;
                mm40Var2 = mm40Var4;
                l7m0Var2 = l7m0Var6;
                yclVar2 = yclVar4;
                j5 = j8;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                l7m0Var2 = l7m0Var;
                function2 = function1;
                f6 = f5;
                j5 = j4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.yt2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iL = x8x.L(i2 | 1);
                        int iL2 = x8x.L(i3);
                        m0x0.d(mm40Var2, f2, j2, j3, z, f3, yclVar2, j5, f6, l7m0Var2, function2, ugdVar, ugdVar2, (fet) obj2, iL, iL2, i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        f5 = f4;
        i7 = i15 | i16;
        if ((i2 & 805306368) != 0) {
            i7 |= ((i4 & 512) == 0 || !fetVar.g(l7m0Var)) ? 268435456 : 536870912;
        }
        i8 = i4 & 1024;
        if (i8 != 0) {
            i9 = 438;
        } else if ((i3 & 6) == 0) {
            if (fetVar.i(function1)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i3 | i10;
        } else {
            i9 = i3;
        }
        if ((i7 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (fetVar.U(i7 & 1, z2)) {
            fetVar.Z();
            i11 = i2 & 1;
            obj = ukd.f35823a;
            if (i11 != 0) {
                if (i12 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i14 != 0) {
                    yclVar2 = null;
                }
                if ((i4 & 128) != 0) {
                    i7 &= -29360129;
                    j6 = j3;
                } else {
                    j6 = j4;
                }
                if ((i4 & 256) != 0) {
                    i7 &= -234881025;
                    f5 = f3;
                }
                if ((i4 & 512) != 0) {
                    l7m0VarE = androidx.compose.runtime.e.e(Boolean.FALSE);
                    i7 &= -1879048193;
                } else {
                    l7m0VarE = l7m0Var;
                }
                if (i8 != 0) {
                    objP = fetVar.P();
                    if (objP == obj) {
                        objP = new xd2((byte) 17);
                        fetVar.o0(objP);
                    }
                    function3 = (Function1) objP;
                } else {
                    i9 = i9;
                    function3 = function1;
                }
                mm40Var4 = mm40Var3;
                l7m0Var3 = l7m0VarE;
                yclVar3 = yclVar2;
                j7 = j6;
            } else {
                if (i12 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i14 != 0) {
                    yclVar2 = null;
                }
                if ((i4 & 128) != 0) {
                    i7 &= -29360129;
                    j6 = j3;
                } else {
                    j6 = j4;
                }
                if ((i4 & 256) != 0) {
                    i7 &= -234881025;
                    f5 = f3;
                }
                if ((i4 & 512) != 0) {
                    l7m0VarE = androidx.compose.runtime.e.e(Boolean.FALSE);
                    i7 &= -1879048193;
                } else {
                    l7m0VarE = l7m0Var;
                }
                if (i8 != 0) {
                    objP = fetVar.P();
                    if (objP == obj) {
                        objP = new xd2((byte) 17);
                        fetVar.o0(objP);
                    }
                    function3 = (Function1) objP;
                } else {
                    i9 = i9;
                    function3 = function1;
                }
                mm40Var4 = mm40Var3;
                l7m0Var3 = l7m0VarE;
                yclVar3 = yclVar2;
                j7 = j6;
            }
            int i18 = i7;
            final float f8 = f5;
            fetVar.s();
            final ycl yclVar5 = yclVar3;
            fetVar.b0(-651943832, new ycl(f2));
            w6k w6kVar2 = (w6k) fetVar.k(bmd.h);
            fW0 = w6kVar2.w0(f2) + w6kVar2.w0(f8);
            Object[] objArr2 = new Object[0];
            zD = fetVar.d(fW0);
            final l7m0 l7m0Var8 = l7m0Var3;
            objP2 = fetVar.P();
            if (zD) {
                objP2 = new rt2(fW0, (byte) 1);
                fetVar.o0(objP2);
            } else {
                objP2 = new rt2(fW0, (byte) 1);
                fetVar.o0(objP2);
            }
            agk0Var = (agk0) e9x.Q(objArr2, (Function0) objP2, fetVar, 0);
            objP3 = fetVar.P();
            if (objP3 == obj) {
                pel pelVar2 = new pel();
                pelVar2.a(mt2.f22349a, fW0);
                pelVar2.a(mt2.b, 0.0f);
                float[] fArr2 = pelVar2.b;
                ArrayList arrayList2 = pelVar2.f26860a;
                int size2 = arrayList2.size();
                nx3.a(size2, fArr2.length);
                float[] fArrCopyOfRange2 = Arrays.copyOfRange(fArr2, 0, size2);
                fArrCopyOfRange2.getClass();
                Object vtjVar3 = new vtj(arrayList2, fArrCopyOfRange2);
                fetVar.o0(vtjVar3);
                objP3 = vtjVar3;
            }
            vtjVar = (vtj) objP3;
            objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new rv2(vtjVar, mt2.f22349a);
                fetVar.o0(objP4);
            }
            rv2Var = (rv2) objP4;
            objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = jgk0.b(new st2(rv2Var, (byte) 2));
                fetVar.o0(objP5);
            }
            l7m0Var4 = (l7m0) objP5;
            objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = jgk0.b(new tt2(l7m0Var4, fW0, (byte) 3));
                fetVar.o0(objP6);
            }
            l7m0Var5 = (l7m0) objP6;
            objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = jgk0.b(new zt2(z, f3, l7m0Var5));
                fetVar.o0(objP7);
            }
            final l7m0 l7m0Var9 = (l7m0) objP7;
            Unit unit2 = Unit.f46060a;
            zG = fetVar.g(agk0Var);
            objP8 = fetVar.P();
            if (zG) {
                objP8 = new du2(rv2Var, agk0Var, null, (byte) 1);
                fetVar.o0(objP8);
            } else {
                objP8 = new du2(rv2Var, agk0Var, null, (byte) 1);
                fetVar.o0(objP8);
            }
            t(fetVar, unit2, (Function2) objP8);
            if ((i9 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP9 = fetVar.P();
            if (z3) {
                objP9 = new qa(function3, rv2Var, null, (byte) 27);
                fetVar.o0(objP9);
            } else {
                objP9 = new qa(function3, rv2Var, null, (byte) 27);
                fetVar.o0(objP9);
            }
            t(fetVar, unit2, (Function2) objP9);
            zG2 = fetVar.g(agk0Var);
            objP10 = fetVar.P();
            if (zG2) {
                objP10 = new ut2(agk0Var, rv2Var, (byte) 2);
                fetVar.o0(objP10);
            } else {
                objP10 = new ut2(agk0Var, rv2Var, (byte) 2);
                fetVar.o0(objP10);
            }
            o(unit2, (Function1) objP10, fetVar);
            objP11 = fetVar.P();
            if (objP11 == obj) {
                objP11 = new gu2(rv2Var);
                fetVar.o0(objP11);
            }
            gu2 gu2Var2 = (gu2) objP11;
            mm40 mm40VarE2 = mm40Var4.e(o7k0.c);
            ma80 ma80Var2 = ma80.f21447a;
            uts0 uts0Var2 = nu2.f24127a;
            objP12 = fetVar.P();
            if (objP12 == obj) {
                objP12 = new xd2((byte) 20);
                fetVar.o0(objP12);
            }
            mm40 mm40VarV2 = cjx.V(dv2.b(mm40VarE2, rv2Var, !((Boolean) l7m0Var8.getValue()).booleanValue(), nu2.a(rv2Var, (Function1) objP12, ro4.m0(0, 0, null, 7), fetVar, 3510), 48), gu2Var2, null);
            niq niqVar2 = i120.m;
            ugd ugdVarM2 = u1c.M(-1122411495, new vt2(ugdVar, l7m0Var5, l7m0Var4, f8, (byte) 2), fetVar);
            final long j9 = j7;
            kc5.J(mm40VarV2, j3, j2, niqVar2, ugdVarM2, u1c.M(918248157, new xdr() { // from class: a.bu2
                @Override // a.xdr
                public final Object F(Object obj2, Object obj3, Object obj4) {
                    mm40 mm40VarN;
                    hh80 hh80Var = (hh80) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    hh80Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        n0q n0qVar = o7k0.c;
                        ycl yclVar6 = yclVar5;
                        int i19 = iIntValue;
                        l7m0 l7m0Var10 = l7m0Var5;
                        jm40 jm40Var = jm40.b;
                        if (yclVar6 != null) {
                            mm40VarN = knx.Q(jm40Var, new ez20(l7m0Var8, l7m0Var10, f2, yclVar6.f42389a));
                        } else {
                            float fD = hh80Var.d() - f8;
                            ycl yclVar7 = new ycl(fD);
                            zcl zclVar = qmk.f28987a;
                            if (ycl.a(fD, 0.0f) < 0) {
                                yclVar7 = null;
                            }
                            mm40VarN = s5x0.N(jm40Var, 0.0f, yclVar7 != null ? yclVar7.f42389a : 0.0f, 0.0f, 0.0f, 13);
                        }
                        mm40 mm40VarE3 = n0qVar.e(mm40VarN);
                        l7m0 l7m0Var11 = l7m0Var9;
                        mm40 mm40VarQ = i120.Q(k7n0.H(lgb.J(mm40VarE3, vgg0.c(((ycl) l7m0Var11.getValue()).f42389a, ((ycl) l7m0Var11.getValue()).f42389a, 0.0f, 0.0f, 12)), 1.0f), j9, jd8.n);
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
                        ugdVar2.O(hh80Var, l7m0Var10, l7m0Var4, fetVar2, Integer.valueOf((i19 & 14) | 432));
                        fetVar2.r(true);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i18 >> 6) & 112) | 221184 | (i18 & 896));
            fetVar.r(false);
            f6 = f8;
            function2 = function3;
            mm40Var2 = mm40Var4;
            l7m0Var2 = l7m0Var8;
            yclVar2 = yclVar5;
            j5 = j9;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            l7m0Var2 = l7m0Var;
            function2 = function1;
            f6 = f5;
            j5 = j4;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.yt2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    m0x0.d(mm40Var2, f2, j2, j3, z, f3, yclVar2, j5, f6, l7m0Var2, function2, ugdVar, ugdVar2, (fet) obj2, iL, iL2, i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, q84 q84Var, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1912263272);
        int i3 = i2 | 6 | (fetVar.g(q84Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = phu0.H(jm40Var, null, 1);
            rqm rqmVar = q84Var.b;
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gj4(function1, q84Var, (byte) 4);
                fetVar.o0(objP);
            }
            obc.q(mm40VarH, rqmVar, z, null, null, null, (Function0) objP, null, fetVar, i3 & 896, 184);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var2, (Object) q84Var, z, function1, i2, (byte) 4);
        }
    }

    public static final void f(mm40 mm40Var, yy6 yy6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i2) {
        yy6Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(1258516418);
        int i3 = i2 | 6 | (fetVar.g(yy6Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function3) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            if (yy6Var instanceof sy6) {
                fetVar.e0(-1746489142);
                u7x.d((sy6) yy6Var, function0, function1, function2, function3, fetVar, i3 & 524286);
                fetVar.r(false);
            } else if (yy6Var instanceof oy6) {
                fetVar.e0(-1746477702);
                mrv.p((oy6) yy6Var, fetVar, i3 & 126);
                fetVar.r(false);
            } else if (yy6Var instanceof qy6) {
                fetVar.e0(-1746471956);
                tdc.p((qy6) yy6Var, fetVar, i3 & 126);
                fetVar.r(false);
            } else {
                if (!(yy6Var instanceof vy6)) {
                    throw b1j.f(-1746491323, fetVar, false);
                }
                fetVar.e0(-1746466746);
                pym0.e((vy6) yy6Var, fetVar, i3 & 126);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, yy6Var, function0, function1, function2, function3, i2, (byte) 6);
        }
    }

    public static final void g(mtl mtlVar, x7a x7aVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-771345690);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mtlVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(x7aVar) : fetVar.i(x7aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean zI = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(x7aVar))) | fetVar.i(vneVar) | ((i3 & 896) == 256);
            Object objP2 = fetVar.P();
            byte b2 = 3;
            if (zI || objP2 == cl5Var) {
                objP2 = new nej0(vneVar, x7aVar, function1, b2);
                fetVar.o0(objP2);
            }
            bkb.f(mm40VarD, mtlVar, null, false, null, (Function1) objP2, fetVar, ((i3 << 3) & 112) | 6, 28);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mtlVar, (Object) x7aVar, (Object) function1, i2, (byte) 15);
        }
    }

    public static final void h(mm40 mm40Var, l7m0 l7m0Var, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z2;
        ch80 ch80VarF;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(-1211754837);
        int i3 = i2 | 6 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarQ = i120.Q(s5x0.N(o7k0.c, 0.0f, fbc.T(fetVar2), 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((dz8) l7m0Var.getValue()).f6929a;
            boolean z3 = (i3 & 7168) == 2048;
            Object objP = fetVar2.P();
            byte b2 = 26;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new tk8(function1, b2);
                fetVar2.o0(objP);
            }
            mm40Var2 = jm40Var;
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 805306374, 54, 500);
            fetVar2 = fetVar;
            mm40 mm40VarL = s5x0.L(mm40Var2, xfn.a(fetVar2).e, 0.0f, 2);
            fetVar2.e0(1363007888);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 24.0f, 5);
            if (z) {
                fetVar2.e0(1139915611);
                ch80VarF = knm0.g(lh80VarU, fetVar2);
                z2 = false;
                fetVar2.r(false);
            } else {
                z2 = false;
                fetVar2.e0(1139979316);
                ch80VarF = knm0.f(lh80VarU, fetVar2);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            if ((i3 & 112) == 32) {
                z2 = true;
            }
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new yd1(l7m0Var, (byte) 26);
                fetVar2.o0(objP2);
            }
            b8k0.e(mm40VarL, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar2, 0, 490);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new az8(mm40Var2, l7m0Var, z, function1, i2, (byte) 0);
        }
    }

    public static final void i(j83 j83Var, pz40 pz40Var, fet fetVar) {
        l7m0 l7m0VarB = m5k0.b(((Boolean) pz40Var.getValue()).booleanValue() ? cs0.D(fetVar, 1435501065, fetVar, false) : b1j.e(fetVar, 1435502191, fetVar, false), null, fetVar, 0, 14);
        thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
        jpm0.o(fetVar, thg0VarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        zcl zclVar = qmk.f28987a;
        zdx.d(0, fetVar, o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 10.0f), l7m0VarB);
        mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 144.0f, 1);
        afn0.v(fetVar).getClass();
        aad.d(j83Var, mm40VarU, y9q0.a(g1t0.i(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), null, 2, false, 1, 0, null, new n05(idm0.t(10), idm0.t(16), idm0.t(1)), fetVar, 1597440, 0, 936);
        fetVar.r(true);
    }

    public static final void j(l7m0 l7m0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1756594515);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Activity activity = (Activity) fetVar.k(cr00.f4820a);
            Object window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            Object[] objArr = {Float.valueOf(fFloatValue)};
            boolean zD = fetVar.d(fFloatValue) | fetVar.h(zC);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zD || objP == obj) {
                objP = new c5d(fFloatValue, zC, (byte) 1);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object value = l7m0VarY.getValue();
            boolean zI = fetVar.i(window) | fetVar.i(activity) | fetVar.g(l7m0VarY) | fetVar.h(zC);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                Object t13Var = new t13(window, (Object) activity, (Object) l7m0VarY, zC, (byte) 13);
                fetVar.o0(t13Var);
                objP2 = t13Var;
            }
            s0x.d(value, null, (Function1) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xg10(l7m0Var, i2, b2);
        }
    }

    public static final void k(final mm40 mm40Var, final l7m0 l7m0Var, final x7a x7aVar, final Function1 function1, fet fetVar, final int i2) {
        int i3;
        l7m0 l7m0Var2;
        yfe0 yfe0VarU;
        Function2 function2;
        Object g0g0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1959108307);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar2.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar2.g(x7aVar) : fetVar2.i(x7aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = ((wlj0) l7m0Var2.getValue()).f39357a;
            a4x a4xVar = ((wlj0) l7m0Var2.getValue()).e;
            String str = (String) ((i4 < 0 || i4 >= a4xVar.size()) ? "" : a4xVar.get(i4));
            int dimensionPixelSize = ((Context) fetVar2.k(dy2.b)).getResources().getDimensionPixelSize(R.dimen.size_256);
            boolean zG = fetVar2.g(str);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    x23 x23Var = new x23(str);
                    x23Var.f40148a = dimensionPixelSize;
                    x23Var.b = dimensionPixelSize;
                    g0g0Var = x23Var.b();
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                objP = (Bitmap) g0g0Var;
                fetVar2.o0(objP);
            }
            Bitmap bitmap = (Bitmap) objP;
            vz2 vz2Var = bitmap != null ? new vz2(bitmap) : null;
            if (vz2Var == null) {
                function1.invoke(ilj0.f14983a);
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function2 = new Function2() { // from class: a.slj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                m0x0.k(mm40Var, l7m0Var, x7aVar, function1, (fet) obj, x8x.L(i2 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                m0x0.k(mm40Var, l7m0Var, x7aVar, function1, (fet) obj, x8x.L(i2 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40 mm40VarA0 = wha0.a0(mm40Var, wha0.T(fetVar2), false, 14);
                xx7 xx7Var = gqw0.n;
                mw3 mw3Var = uc9.c;
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
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
                mm40 mm40VarD = o7k0.d(hp4.D(x7aVar), 1.0f);
                zfn zfnVar = zaq0.b;
                mm40 mm40VarQ = i120.Q(mm40VarD, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarQ2 = i120.Q(qcc.F(o7k0.n(s5x0.N(jm40Var, 0.0f, 24.0f, 0.0f, 0.0f, 13), 256.0f), ((ThemeColors) fetVar2.k(zfnVar)).getShadowSoft(), 36.0f, 32.0f, 8.0f, 0.1f, 80), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), vgg0.a(36.0f));
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                j0x.c(vz2Var, lgb.J(jm40Var, vgg0.a(36.0f)), fetVar2, 48, 248);
                fetVar2.r(true);
                dww.a(a8k0.F(((wlj0) l7m0Var.getValue()).i, 0, fetVar2), null, s5x0.L(jm40Var, 0.0f, 20.0f, 1), fetVar, 440, 0);
                fetVar.r(true);
                String strS = xsm0.s(R.string.share_app_by_qr_description, fetVar);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                v8q0.a(strS, s5x0.K(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).e, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            function2 = new Function2() { // from class: a.slj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b3) {
                        case 0:
                            ((Integer) obj2).getClass();
                            m0x0.k(mm40Var, l7m0Var, x7aVar, function1, (fet) obj, x8x.L(i2 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            m0x0.k(mm40Var, l7m0Var, x7aVar, function1, (fet) obj, x8x.L(i2 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void l(FixedWebView fixedWebView, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-442709937);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(fixedWebView) : fetVar.i(fixedWebView) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        boolean z = false;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE0 = o2e.e0(n0qVar, "PROMO_WEB_AGGREGATOR_CONTENT");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && fetVar.i(fixedWebView))) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eib(fixedWebView, (byte) 2);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            dwi0.b((Function1) objP, n0qVar, null, fetVar2, 48, 4);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fib(fixedWebView, i2, b2);
        }
    }

    public static final void m(Object obj, Object obj2, Boolean bool, Function1 function1, fet fetVar) {
        boolean zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(bool);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new jwk(function1);
            fetVar.o0(objP);
        }
    }

    public static final void n(Object obj, Object obj2, Function1 function1, fet fetVar) {
        boolean zG = fetVar.g(obj) | fetVar.g(obj2);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new jwk(function1);
            fetVar.o0(objP);
        }
    }

    public static final void o(Object obj, Function1 function1, fet fetVar) {
        boolean zG = fetVar.g(obj);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new jwk(function1);
            fetVar.o0(objP);
        }
    }

    public static final void p(Object[] objArr, Function1 function1, fet fetVar) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE = fetVar.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= fetVar.g(obj);
        }
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            fetVar.o0(new jwk(function1));
        }
    }

    public static final void q(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(991054836);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new w7i0(function1, (byte) 23);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var, mdmVar, function1, i2, (byte) 6);
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1694191603);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 6;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mm40 mm40VarY = o7k0.y(jm40.b, null, 3);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarY, mdmVar, false, (Function0) objP, fetVar, ((i3 << 3) & 112) | 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i2, b2);
        }
    }

    public static final void s(final idw idwVar, final Function1 function1, final Function1 function2, final Function0 function0, fet fetVar, final int i2) {
        idw idwVar2;
        Function1 function3;
        yfe0 yfe0VarU;
        Function2 function4;
        fet fetVar2 = fetVar;
        idwVar.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        fetVar2.g0(699458611);
        int i3 = i2 | (fetVar2.g(idwVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (idwVar.d.isEmpty()) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function4 = new Function2(idwVar, function1, function2, function0, i2, b2) { // from class: a.gdw

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f11123a;
                    public final /* synthetic */ idw b;
                    public final /* synthetic */ Function1 c;
                    public final /* synthetic */ Function1 d;
                    public final /* synthetic */ Function0 e;

                    {
                        this.f11123a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f11123a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(1);
                                m0x0.s(this.b, this.c, this.d, this.e, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(1);
                                m0x0.s(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
                idwVar2 = idwVar;
                nkb.h(s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2), idwVar.c, kjm.f18392a, null, function0, null, fetVar2, ((i3 << 3) & 57344) | 384, 40);
                mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "HLTV_AWARDS_MAIN_NOMINATION_LAZY_ROW");
                lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
                qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object objP = fetVar2.P();
                if (z || objP == ukd.f35823a) {
                    function3 = function2;
                    objP = new k9v((Object) idwVar2, (Object) function1, (Object) function3, (byte) 3);
                    fetVar2.o0(objP);
                } else {
                    function3 = function2;
                }
                fetVar2 = fetVar;
                b8k0.f(mm40VarE0, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 6, 490);
                fetVar2.r(true);
            }
            yfe0VarU.d = function4;
        }
        idwVar2 = idwVar;
        function3 = function2;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final Function1 function5 = function3;
            final idw idwVar3 = idwVar2;
            function4 = new Function2(idwVar3, function1, function5, function0, i2, b3) { // from class: a.gdw

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f11123a;
                public final /* synthetic */ idw b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;

                {
                    this.f11123a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f11123a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            m0x0.s(this.b, this.c, this.d, this.e, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            m0x0.s(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function4;
        }
    }

    public static final void t(fet fetVar, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = fetVar.R;
        boolean zG = fetVar.g(obj);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new x5z(coroutineContext, function2);
            fetVar.o0(objP);
        }
    }

    public static final void u(Object obj, Object obj2, Object obj3, Function2 function2, fet fetVar) {
        CoroutineContext coroutineContext = fetVar.R;
        boolean zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(obj3);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new x5z(coroutineContext, function2);
            fetVar.o0(objP);
        }
    }

    public static final void v(Object obj, Object obj2, Function2 function2, fet fetVar) {
        CoroutineContext coroutineContext = fetVar.R;
        boolean zG = fetVar.g(obj) | fetVar.g(obj2);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new x5z(coroutineContext, function2);
            fetVar.o0(objP);
        }
    }

    public static final void w(Object[] objArr, Function2 function2, fet fetVar) {
        CoroutineContext coroutineContext = fetVar.R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE = fetVar.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= fetVar.g(obj);
        }
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            fetVar.o0(new x5z(coroutineContext, function2));
        }
    }

    public static final void x(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1472730708);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            fetVar2 = fetVar;
            p3c0.a(null, 0L, 0.0f, 0L, 0, 0.0f, fetVar2, 0, 63);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 6);
        }
    }

    public static final void y(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Object obj;
        boolean z;
        Object obj2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(637491569);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float fT = fbc.T(fetVar);
            if (fT == 0.0f) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 11);
                    return;
                }
                return;
            }
            Object[] objArr = {new ycl(fT)};
            boolean zD = fetVar.d(fT);
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            Object obj4 = objP;
            if (zD || objP == obj3) {
                Object rt2Var = new rt2(fT, (byte) 6);
                fetVar.o0(rt2Var);
                obj4 = rt2Var;
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) obj4, fetVar);
            Object[] objArr2 = {new ycl(fT)};
            boolean zD2 = fetVar.d(fT);
            Object objP2 = fetVar.P();
            byte b3 = 7;
            Object obj5 = objP2;
            if (zD2 || objP2 == obj3) {
                Object rt2Var2 = new rt2(fT, b3);
                fetVar.o0(rt2Var2);
                obj5 = rt2Var2;
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) obj5, fetVar);
            final int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            zcl zclVar = qmk.f28987a;
            final float fB = pkd.b(210.0f, fetVar);
            final w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object[] objArr3 = {Integer.valueOf(iB)};
            boolean zG = fetVar.g(w6kVar) | fetVar.e(iB) | fetVar.d(fB);
            Object objP3 = fetVar.P();
            Object obj6 = objP3;
            if (zG || objP3 == obj3) {
                Object obj7 = new Function0() { // from class: a.zg10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new ycl(w6kVar.s0((iB - fB) / 2.0f));
                    }
                };
                fetVar.o0(obj7);
                obj6 = obj7;
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) obj6, fetVar);
            int i4 = ((mh10) l7m0Var.getValue()).b;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object objP4 = fetVar.P();
            Object obj8 = objP4;
            if (z2 || objP4 == obj3) {
                Object x000Var = new x000(l7m0Var, b3);
                fetVar.o0(x000Var);
                obj8 = x000Var;
            }
            bwj bwjVarC = j0x.C(i4, fetVar, (Function0) obj8);
            int i6 = ((mh10) l7m0Var.getValue()).b;
            boolean z3 = i5 == 4;
            Object objP5 = fetVar.P();
            Object obj9 = objP5;
            if (z3 || objP5 == obj3) {
                Object x000Var2 = new x000(l7m0Var, (byte) 8);
                fetVar.o0(x000Var2);
                obj9 = x000Var2;
            }
            bwj bwjVarC2 = j0x.C(i6, fetVar, (Function0) obj9);
            boolean zG2 = fetVar.g(bwjVarC2) | fetVar.g(bwjVarC);
            Object objP6 = fetVar.P();
            yje yjeVar = null;
            Object obj10 = objP6;
            if (zG2 || objP6 == obj3) {
                Object ch10Var = new ch10(bwjVarC2, bwjVarC, yjeVar, b2);
                fetVar.o0(ch10Var);
                obj10 = ch10Var;
            }
            t(fetVar, bwjVarC2, (Function2) obj10);
            boolean zG3 = fetVar.g(bwjVarC) | fetVar.g(bwjVarC2);
            Object objP7 = fetVar.P();
            if (zG3 || objP7 == obj3) {
                Object ch10Var2 = new ch10(bwjVarC, bwjVarC2, yjeVar, (byte) 1);
                fetVar.o0(ch10Var2);
                obj = ch10Var2;
            } else {
                obj = objP7;
            }
            t(fetVar, bwjVarC, (Function2) obj);
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, background, ljcVar);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z4) {
                fetVar.l(function0);
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
            float f2 = ((ycl) l7m0VarY.getValue()).f42389a;
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            y0x0.e(null, f2, ((StaticColors) fetVar.k(dVar)).m121getTransparent0d7_KjU(), ((StaticColors) fetVar.k(dVar)).m121getTransparent0d7_KjU(), 0.0f, 0L, 48.0f, u1c.M(1631813904, new rpu0(l7m0Var, bwjVarC, l7m0VarY, l7m0VarY2, function1, l7m0VarY3), fetVar), u1c.M(122716012, new ah10(bwjVarC2, l7m0Var, function1), fetVar), fetVar, 905994240, 65);
            if (((mh10) l7m0Var.getValue()).c) {
                fetVar.e0(792650479);
                Object objP8 = fetVar.P();
                if (objP8 == obj3) {
                    z = true;
                    Object gf10Var = new gf10(true ? 1 : 0);
                    fetVar.o0(gf10Var);
                    obj2 = gf10Var;
                } else {
                    z = true;
                    obj2 = objP8;
                }
                mm40 mm40VarQ2 = i120.Q(y860.W(n0qVar, null, null, false, null, (Function0) obj2, 28), ((StaticColors) fetVar.k(dVar)).m70getBlack200d7_KjU(), ljcVar);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                kpb.j(jr8.f16991a.b(jm40.b, gqw0.e), null, fetVar, 0, 2);
                fetVar.r(z);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(793107915);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new s000(l7m0Var, function1, i2, (byte) 12);
        }
    }

    public static final void z(mm40 mm40Var, hdw hdwVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1139647766);
        int i3 = i2 | 6 | (fetVar2.i(hdwVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 120.0f, 100.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
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
            String str = hdwVar.b;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.B;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarP2 = o7k0.p(jm40Var, 58.0f, 58.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            lgb.v(n0qVar, jr8Var.b(mm40VarP2, zx7Var), str, R.drawable.ic_glyph_placeholder_player, jM126getWhite200d7_KjU, pgeVar, fetVar2, 196614, 0);
            zq8.a(0, fetVar2, i120.P(n0qVar, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(kkg.I)), 0.0f, Float.POSITIVE_INFINITY, 8), null, 6));
            v8q0.a(hdwVar.c, jr8Var.b(s5x0.L(jm40Var, 2.0f, 0.0f, 2), gqw0.h), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, hdwVar, i2, (byte) 14);
        }
    }
}
