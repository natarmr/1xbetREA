package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/wcg;", "La/yx5;", "La/ycg;", "<init>", "()V", "a/usd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wcg extends yx5 implements ycg {
    public final boolean K1;
    public final e9o0 L1;
    public do20 M1;
    public eei N1;
    public wdk0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final a8z R1;
    public final khf0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(wcg.class, "binding", "getBinding()Lorg/xplatform/cyber/section/impl/databinding/MainChampFragmentMainBinding;", 0), new ez40(wcg.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;", 0)};
    public static final usd U1 = new usd();

    public wcg() {
        super(R.layout.main_champ_fragment_main);
        final byte b = 1;
        this.K1 = true;
        bp3 bp3Var = bp3.f2960a;
        this.L1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.ucg
            public final /* synthetic */ wcg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                wcg wcgVar = this.b;
                switch (b3) {
                    case 0:
                        eei eeiVar = wcgVar.N1;
                        if (eeiVar != null) {
                            return new q0h0(eeiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        usd usdVar = wcg.U1;
                        ComponentCallbacks2 application = wcgVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(xcg.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof xcg)) {
                                ze3Var = null;
                            }
                            xcg xcgVar = (xcg) ze3Var;
                            if (xcgVar != null) {
                                CyberChampParams cyberChampParamsH0 = wcgVar.H0();
                                rc3 rc3Var = new rc3(wcgVar.H0().d);
                                oeg0 oeg0Var = xcgVar.f40644a;
                                m1e m1eVar = xcgVar.b;
                                duj dujVar = xcgVar.c;
                                cad cadVar = xcgVar.d;
                                pyg pygVar = xcgVar.e;
                                xri xriVar = xcgVar.f;
                                iip iipVar = xcgVar.g;
                                vqc vqcVar = xcgVar.h;
                                lsn lsnVar = xcgVar.i;
                                g2v g2vVar = xcgVar.j;
                                ctf0 ctf0Var = xcgVar.k;
                                knf0 knf0Var = xcgVar.l;
                                gii0 gii0Var = xcgVar.m;
                                wdk0 wdk0Var = xcgVar.n;
                                pru pruVar = xcgVar.o;
                                n2u n2uVar = xcgVar.p;
                                gvt gvtVar = xcgVar.q;
                                vby vbyVar = xcgVar.r;
                                kt2 kt2Var = xcgVar.s;
                                zr1 zr1Var = xcgVar.t;
                                b3c0 b3c0Var = xcgVar.u;
                                gst0 gst0Var = xcgVar.v;
                                pmi pmiVar = xcgVar.w;
                                xcgVar.x.getClass();
                                oeg0Var.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                knf0Var.getClass();
                                gii0Var.getClass();
                                wdk0Var.getClass();
                                vbyVar.getClass();
                                kt2Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                pygVar.getClass();
                                xriVar.getClass();
                                iipVar.getClass();
                                return new fei(cadVar, pygVar, xriVar, iipVar, vqcVar, lsnVar, cyberChampParamsH0, rc3Var, oeg0Var, m1eVar, dujVar, g2vVar, ctf0Var, knf0Var, gii0Var, pruVar, wdk0Var, n2uVar, gvtVar, vbyVar, kt2Var, zr1Var, b3c0Var, gst0Var, pmiVar);
                            }
                        }
                        jf4.n(b1j.i(xcg.class, "Cannot create dependency "));
                        return null;
                }
            }
        };
        q7g q7gVar = new q7g(this, (byte) 10);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new q7g(q7gVar, (byte) 11));
        this.P1 = agc.G(this, sre0.f32672a.b(gdg.class), new r7g(a8zVarA, (byte) 10), new r7g(a8zVarA, (byte) 11), function0);
        this.Q1 = ltt0.o(this, vcg.f37185a);
        this.R1 = maz.a(wezVar, new Function0(this) { // from class: a.ucg
            public final /* synthetic */ wcg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                wcg wcgVar = this.b;
                switch (b3) {
                    case 0:
                        eei eeiVar = wcgVar.N1;
                        if (eeiVar != null) {
                            return new q0h0(eeiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        usd usdVar = wcg.U1;
                        ComponentCallbacks2 application = wcgVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(xcg.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof xcg)) {
                                ze3Var = null;
                            }
                            xcg xcgVar = (xcg) ze3Var;
                            if (xcgVar != null) {
                                CyberChampParams cyberChampParamsH0 = wcgVar.H0();
                                rc3 rc3Var = new rc3(wcgVar.H0().d);
                                oeg0 oeg0Var = xcgVar.f40644a;
                                m1e m1eVar = xcgVar.b;
                                duj dujVar = xcgVar.c;
                                cad cadVar = xcgVar.d;
                                pyg pygVar = xcgVar.e;
                                xri xriVar = xcgVar.f;
                                iip iipVar = xcgVar.g;
                                vqc vqcVar = xcgVar.h;
                                lsn lsnVar = xcgVar.i;
                                g2v g2vVar = xcgVar.j;
                                ctf0 ctf0Var = xcgVar.k;
                                knf0 knf0Var = xcgVar.l;
                                gii0 gii0Var = xcgVar.m;
                                wdk0 wdk0Var = xcgVar.n;
                                pru pruVar = xcgVar.o;
                                n2u n2uVar = xcgVar.p;
                                gvt gvtVar = xcgVar.q;
                                vby vbyVar = xcgVar.r;
                                kt2 kt2Var = xcgVar.s;
                                zr1 zr1Var = xcgVar.t;
                                b3c0 b3c0Var = xcgVar.u;
                                gst0 gst0Var = xcgVar.v;
                                pmi pmiVar = xcgVar.w;
                                xcgVar.x.getClass();
                                oeg0Var.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                knf0Var.getClass();
                                gii0Var.getClass();
                                wdk0Var.getClass();
                                vbyVar.getClass();
                                kt2Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                pygVar.getClass();
                                xriVar.getClass();
                                iipVar.getClass();
                                return new fei(cadVar, pygVar, xriVar, iipVar, vqcVar, lsnVar, cyberChampParamsH0, rc3Var, oeg0Var, m1eVar, dujVar, g2vVar, ctf0Var, knf0Var, gii0Var, pruVar, wdk0Var, n2uVar, gvtVar, vbyVar, kt2Var, zr1Var, b3c0Var, gst0Var, pmiVar);
                            }
                        }
                        jf4.n(b1j.i(xcg.class, "Cannot create dependency "));
                        return null;
                }
            }
        });
        this.S1 = new khf0("params");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        CoordinatorLayout coordinatorLayout = G0().f10044a;
        prc prcVar = new prc(this, (byte) 11);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(coordinatorLayout, prcVar);
        do20 do20Var = this.M1;
        yje yjeVar = null;
        if (do20Var == null) {
            Intrinsics.h("appBarToolbarDelegate");
            throw null;
        }
        dc3 dc3Var = G0().c;
        LinearLayout linearLayout = (LinearLayout) G0().b.b;
        gdg gdgVarI0 = I0();
        AppBarMotionLayout appBarMotionLayout = (AppBarMotionLayout) dc3Var.b;
        int dimensionPixelSize = appBarMotionLayout.getResources().getDimensionPixelSize(R.dimen.space_16);
        kie0 kie0Var = new kie0();
        int i = -dimensionPixelSize;
        kie0Var.f18333a = i;
        if (!appBarMotionLayout.isLaidOut() || appBarMotionLayout.isLayoutRequested()) {
            appBarMotionLayout.addOnLayoutChangeListener(new hc3(dc3Var, do20Var, linearLayout, i));
        } else if (appBarMotionLayout.getCurrentState() == R.id.start) {
            do20.q(linearLayout, i);
        }
        appBarMotionLayout.setOnProgressChangeCallback(new ec3(do20Var, kie0Var, dimensionPixelSize, linearLayout, (byte) 0));
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new ic3(kie0Var, (byte) 0));
        p7m0 p7m0Var = gdgVarI0.i.g;
        ee0 ee0Var = new ee0((Object) do20Var, (Object) dc3Var, yjeVar, (byte) 7);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new y51(p7m0Var, clzVarW, ee0Var, (yje) null), 3);
        h97.t((ComposeView) dc3Var.c, new owp0(this), new ugd(-1024843014, true, new ry2(gdgVarI0, this, do20Var, (byte) 5)));
        wdk0 wdk0Var = this.O1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.K1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        fei feiVar = (fei) this.R1.getValue();
        feiVar.getClass();
        this.M1 = new do20();
        this.N1 = (eei) feiVar.z.get();
        this.O1 = feiVar.s;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0Var = I0().t;
        d7e d7eVar = new d7e(2, this, wcg.class, "showFragment", "showFragment(Lorg/xplatform/cyber/section/impl/championships/regular/presentation/main/model/CyberChampScreenTypeState;)V", 4, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g8g(xae0Var, clzVarW, d7eVar, (yje) null), 3);
        p7m0 p7m0Var = I0().u;
        e9g e9gVar = new e9g(this, null, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g(p7m0Var, clzVarW2, e9gVar, (yje) null), 3);
    }

    public final fs10 G0() {
        Object objN = this.Q1.n(V1[0], this);
        objN.getClass();
        return (fs10) objN;
    }

    public final CyberChampParams H0() {
        return (CyberChampParams) this.S1.n(this, V1[1]);
    }

    public final gdg I0() {
        return (gdg) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        gdg gdgVarI0 = I0();
        e3c.n(gdgVarI0.v);
        e3c.n(gdgVarI0.w);
        e3c.n(gdgVarI0.x);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        ycm0 ziv0Var;
        super.e0();
        gdg gdgVarI0 = I0();
        c4m0 c4m0Var = gdgVarI0.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            gdgVarI0.v = slb.U(new fnq(new dnq(gdgVarI0.j.b(), new lo3(3, null, (byte) 9), (byte) 1), new fdg(gdgVarI0, null), (byte) 4), d5c.S(jiu0.a(gdgVarI0), gdgVarI0.k.f22085a));
        }
        if (this.M1 == null) {
            Intrinsics.h("appBarToolbarDelegate");
            throw null;
        }
        Window window = n0().getWindow();
        window.getClass();
        boolean zR = ((AppBarMotionLayout) G0().c.b).getCurrentState() == R.id.start ? true : qem0.r(window.getContext());
        ani0 ani0Var = new ani0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.w(!zR);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
