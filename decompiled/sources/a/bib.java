package a;

import android.content.ComponentCallbacks2;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/bib;", "La/yx5;", "La/cg60;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bib extends yx5 implements cg60 {
    public final s0r K1;
    public fiu0 L1;
    public vby M1;
    public grj N1;
    public FixedWebView O1;
    public bc0 P1;
    public Integer Q1;
    public boolean R1;
    public boolean S1;
    public boolean U1;
    public boolean V1;
    public final a8z W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(bib.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bj5 X1 = new bj5();
    public static final IntRange Z1 = new IntRange(Response.BAD_REQUEST, 499, 1);
    public static final IntRange a2 = new IntRange(500, 599, 1);

    public bib() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, aib.f915a);
        this.W1 = xbc.b0(this, sre0.f32672a.b(ajb.class), new whb(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Window window;
        kxq kxqVarB = B();
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            ofm0.z(window, null, R.attr.uikitBackground, R.attr.uikitBackground, 9);
        }
        View viewQ0 = q0();
        yhb yhbVar = new yhb(this, viewQ0);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, yhbVar);
        FixedWebView fixedWebView = this.O1;
        if (fixedWebView == null) {
            fixedWebView = new FixedWebView(o0());
            siq fixedWebView2 = fixedWebView.getFixedWebView();
            if (fixedWebView2 != null) {
                H0(fixedWebView2);
            }
            this.O1 = fixedWebView;
        }
        fixedWebView.setDetaching(new whb(this, (byte) 1));
        FixedWebView fixedWebView3 = this.O1;
        if (fixedWebView3 != null) {
            bc0 bc0Var = this.P1;
            if (bc0Var != null) {
                fixedWebView3.removeOnAttachStateChangeListener(bc0Var);
            }
            if (fixedWebView3.isAttachedToWindow()) {
                K0();
            }
            bc0 bc0Var2 = new bc0(this, (byte) 3);
            fixedWebView3.addOnAttachStateChangeListener(bc0Var2);
            this.P1 = bc0Var2;
        }
        pkd.h(I0().f919a, qek0.h, null, new ugd(-1712110551, true, new bna(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uhb.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uhb uhbVar = (uhb) (ze3Var instanceof uhb ? ze3Var : null);
            if (uhbVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ntu ntuVar = uhbVar.f35669a;
                n4u n4uVar = uhbVar.b;
                wgu wguVar = uhbVar.c;
                iqt iqtVar = uhbVar.d;
                jqt jqtVar = uhbVar.e;
                hru hruVar = uhbVar.f;
                m1e m1eVar = uhbVar.g;
                mne mneVar = uhbVar.h;
                duj dujVar = uhbVar.i;
                ctf0 ctf0Var = uhbVar.j;
                g2v g2vVar = uhbVar.k;
                j1q0 j1q0Var = uhbVar.l;
                vby vbyVar = uhbVar.m;
                grj grjVar = uhbVar.n;
                wsf0 wsf0Var = uhbVar.o;
                pru pruVar = uhbVar.p;
                wguVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                j1q0Var.getClass();
                vbyVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(ajb.class, (pai) new h6i(wsf0Var, i1w0VarF, ntuVar, n4uVar, wguVar, iqtVar, jqtVar, hruVar, m1eVar, mneVar, dujVar, ctf0Var, g2vVar, j1q0Var, vbyVar, grjVar, pruVar).c));
                this.M1 = vbyVar;
                this.N1 = grjVar;
                return;
            }
        }
        jf4.n(b1j.i(uhb.class, "Cannot create dependency "));
    }

    public final void G0(Function1 function1, fet fetVar, int i) {
        fetVar.g0(1689866194);
        int i2 = (fetVar.i(function1) ? 4 : 2) | i | (fetVar.i(this) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = fetVar.i(this);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new whb(this, (byte) 2);
                fetVar.o0(objP);
            }
            v3c.A(null, (Function0) objP, null, fetVar, 0, 5);
            k3t0 k3t0VarJ0 = J0();
            boolean zI2 = fetVar.i(this) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                objP2 = new op7(function1, this, (byte) 23);
                fetVar.o0(objP2);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP2, fetVar);
            boolean zI3 = fetVar.i(k3t0VarJ0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == obj) {
                Object pcVar = new pc(k3t0VarJ0, clzVar, pz40VarF, null, (byte) 7);
                fetVar.o0(pcVar);
                objP3 = pcVar;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(this, function1, i, (byte) 15);
        }
    }

    public final void H0(siq siqVar) {
        if (this.S1) {
            return;
        }
        WebSettings settings = siqVar.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        vby vbyVar = this.M1;
        if (vbyVar == null) {
            Intrinsics.h("json");
            throw null;
        }
        siqVar.addJavascriptInterface(new cib(vbyVar, new lya(this, (byte) 7)), "MobileAppApiV2");
        siqVar.setFixedWebViewClient(new xhb(this));
        this.S1 = true;
    }

    public final aid I0() {
        Object objN = this.K1.n(Y1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 J0() {
        return (k3t0) this.W1.getValue();
    }

    public final void K0() {
        siq fixedWebView;
        FixedWebView fixedWebView2 = this.O1;
        if (fixedWebView2 == null || (fixedWebView = fixedWebView2.getFixedWebView()) == null || fixedWebView.getUrl() != null) {
            return;
        }
        this.R1 = this.Q1 != null;
        J0().x(mhb.f21782a);
        H0(fixedWebView);
    }

    public final void L0() {
        if (this.U1) {
            return;
        }
        this.U1 = true;
        J0().x(khb.f18282a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        FixedWebView fixedWebView = this.O1;
        if (fixedWebView != null) {
            bc0 bc0Var = this.P1;
            if (bc0Var != null) {
                fixedWebView.removeOnAttachStateChangeListener(bc0Var);
            }
            this.P1 = null;
            this.O1 = null;
            this.S1 = false;
            fixedWebView.a();
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        FixedWebView fixedWebView = this.O1;
        if (fixedWebView != null) {
            ViewParent parent = fixedWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(fixedWebView);
            }
        }
        this.S1 = false;
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        FixedWebView fixedWebView = this.O1;
        if (fixedWebView != null) {
            fixedWebView.e();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(I0().f919a);
        FixedWebView fixedWebView = this.O1;
        if (fixedWebView != null) {
            fixedWebView.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        hxm0.m(I0().f919a);
    }

    @Override // a.cg60
    public final boolean j() {
        siq fixedWebView;
        siq fixedWebView2;
        FixedWebView fixedWebView3 = this.O1;
        if (fixedWebView3 == null || (fixedWebView = fixedWebView3.getFixedWebView()) == null || !fixedWebView.canGoBack()) {
            J0().x(ohb.f25257a);
            return false;
        }
        FixedWebView fixedWebView4 = this.O1;
        if (fixedWebView4 != null && (fixedWebView2 = fixedWebView4.getFixedWebView()) != null) {
            fixedWebView2.goBack();
        }
        return true;
    }
}
