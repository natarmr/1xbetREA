package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/kxc0;", "La/yx5;", "La/cg60;", "<init>", "()V", "a/jh70", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kxc0 extends yx5 implements cg60 {
    public final s0r K1;
    public fiu0 L1;
    public wdk0 M1;
    public vby N1;
    public grj O1;
    public final phf0 P1;
    public FixedWebView Q1;
    public bc0 R1;
    public Integer S1;
    public boolean U1;
    public boolean V1;
    public boolean W1;
    public final a8z X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(kxc0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(kxc0.class, RemoteMessageConst.Notification.URL, "getUrl()Ljava/lang/String;", 0)};
    public static final jh70 Y1 = new jh70();

    public kxc0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, jxc0.f17300a);
        this.P1 = new phf0("URL");
        this.X1 = xbc.b0(this, sre0.f32672a.b(ayc0.class), new hxc0(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        FixedWebView fixedWebView = this.Q1;
        if (fixedWebView == null) {
            fixedWebView = new FixedWebView(o0());
            siq fixedWebView2 = fixedWebView.getFixedWebView();
            if (fixedWebView2 != null) {
                H0(fixedWebView2);
            }
            this.Q1 = fixedWebView;
        }
        fixedWebView.setDetaching(new hxc0(this, (byte) 1));
        FixedWebView fixedWebView3 = this.Q1;
        if (fixedWebView3 != null) {
            bc0 bc0Var = this.R1;
            if (bc0Var != null) {
                fixedWebView3.removeOnAttachStateChangeListener(bc0Var);
            }
            if (fixedWebView3.isAttachedToWindow()) {
                K0();
            }
            bc0 bc0Var2 = new bc0(this, (byte) 12);
            fixedWebView3.addOnAttachStateChangeListener(bc0Var2);
            this.R1 = bc0Var2;
        }
        pkd.h(I0().f919a, qek0.h, new shd((byte) 14), new ugd(1264178689, true, new nrc0(this, (byte) 2)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p3v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p3v0 p3v0Var = (p3v0) (ze3Var instanceof p3v0 ? ze3Var : null);
            if (p3v0Var != null) {
                String strN = this.P1.n(this, Z1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                ii iiVar = p3v0Var.f;
                vby vbyVar = p3v0Var.f26319a;
                b8u b8uVar = p3v0Var.c;
                m1e m1eVar = p3v0Var.b;
                mne mneVar = p3v0Var.d;
                j1q0 j1q0Var = p3v0Var.e;
                duj dujVar = p3v0Var.g;
                ntu ntuVar = p3v0Var.h;
                n4u n4uVar = p3v0Var.i;
                ctf0 ctf0Var = p3v0Var.j;
                grj grjVar = p3v0Var.k;
                wdk0 wdk0Var = p3v0Var.l;
                wgu wguVar = p3v0Var.m;
                hse0 hse0Var = p3v0Var.n;
                wsf0 wsf0Var = p3v0Var.o;
                x0u x0uVar = p3v0Var.p;
                yfu yfuVar = p3v0Var.q;
                hru hruVar = p3v0Var.r;
                ocl oclVar = p3v0Var.s;
                uzc0 uzc0Var = p3v0Var.t;
                jqt jqtVar = p3v0Var.u;
                ieu ieuVar = p3v0Var.y;
                ocl oclVar2 = p3v0Var.z;
                g2v g2vVar = p3v0Var.A;
                btt0 btt0Var = p3v0Var.x;
                gst0 gst0Var = p3v0Var.w;
                yfu yfuVar2 = p3v0Var.v;
                vbyVar.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                j1q0Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                wguVar.getClass();
                hse0Var.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(ayc0.class, (kzi) new t7i(wsf0Var, strN, vbyVar, b8uVar, i1w0VarF, m1eVar, mneVar, j1q0Var, dujVar, ntuVar, n4uVar, ctf0Var, grjVar, wdk0Var, wguVar, hse0Var, x0uVar, uzc0Var, yfuVar, hruVar, oclVar, jqtVar, yfuVar2, gst0Var, ieuVar, oclVar2, g2vVar).y));
                this.M1 = wdk0Var;
                this.N1 = vbyVar;
                this.O1 = grjVar;
                return;
            }
        }
        jf4.n(b1j.i(p3v0.class, "Cannot create dependency "));
    }

    public final void G0(Function1 function1, fet fetVar, int i) {
        fetVar.g0(320129847);
        int i2 = (fetVar.i(function1) ? 4 : 2) | i | (fetVar.i(this) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = fetVar.i(this);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new hxc0(this, (byte) 4);
                fetVar.o0(objP);
            }
            v3c.A(null, (Function0) objP, null, fetVar, 0, 5);
            k3t0 k3t0VarJ0 = J0();
            boolean zI2 = fetVar.i(this) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                objP2 = new oac0(function1, this, (byte) 13);
                fetVar.o0(objP2);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP2, fetVar);
            boolean zI3 = fetVar.i(k3t0VarJ0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == obj) {
                Object kc70Var = new kc70(k3t0VarJ0, clzVar, pz40VarF, null, (byte) 8);
                fetVar.o0(kc70Var);
                objP3 = kc70Var;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(this, function1, i, (byte) 28);
        }
    }

    public final void H0(siq siqVar) {
        if (this.V1) {
            return;
        }
        WebSettings settings = siqVar.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        siqVar.setFixedWebViewClient(new ixc0(this));
        vby vbyVar = this.N1;
        if (vbyVar == null) {
            Intrinsics.h("json");
            throw null;
        }
        siqVar.addJavascriptInterface(new r3v0(vbyVar, new hxc0(this, (byte) 2), new hxc0(this, (byte) 3), new ppb0(this, (byte) 27)), "MobileAppApiV2");
        this.V1 = true;
        siqVar.setTag("innerWebView");
    }

    public final aid I0() {
        Object objN = this.K1.n(Z1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 J0() {
        return (k3t0) this.X1.getValue();
    }

    public final void K0() {
        siq fixedWebView;
        FixedWebView fixedWebView2 = this.Q1;
        if (fixedWebView2 == null || (fixedWebView = fixedWebView2.getFixedWebView()) == null || fixedWebView.getUrl() != null) {
            return;
        }
        this.U1 = this.S1 != null;
        J0().x(rvc0.f31161a);
        H0(fixedWebView);
    }

    public final void L0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        J0().x(ovc0.f25919a);
    }

    public final void M0(sek0 sek0Var, String str) {
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.k(wdk0Var, new xdk0(sek0Var, str, null, null, null, null, 124), this, null, null, false, null, 1020);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        FixedWebView fixedWebView = this.Q1;
        if (fixedWebView != null) {
            bc0 bc0Var = this.R1;
            if (bc0Var != null) {
                fixedWebView.removeOnAttachStateChangeListener(bc0Var);
            }
            this.R1 = null;
            this.Q1 = null;
            this.V1 = false;
            fixedWebView.a();
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        FixedWebView fixedWebView = this.Q1;
        if (fixedWebView != null) {
            ViewParent parent = fixedWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(fixedWebView);
            }
        }
        this.V1 = false;
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        FixedWebView fixedWebView = this.Q1;
        if (fixedWebView != null) {
            fixedWebView.e();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(I0().f919a);
        FixedWebView fixedWebView = this.Q1;
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
        FixedWebView fixedWebView3 = this.Q1;
        if (fixedWebView3 == null || (fixedWebView = fixedWebView3.getFixedWebView()) == null || !fixedWebView.canGoBack()) {
            J0().x(tvc0.f34592a);
            return false;
        }
        FixedWebView fixedWebView4 = this.Q1;
        if (fixedWebView4 != null && (fixedWebView2 = fixedWebView4.getFixedWebView()) != null) {
            fixedWebView2.goBack();
        }
        return true;
    }
}
