package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yax;", "La/yx5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yax extends yx5 {
    public final hnm0 K1;
    public cji L1;
    public z7z M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final n0o0 Q1;
    public final phf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(yax.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/FragmentWebBrowserBinding;", 0), new ez40(yax.class, RemoteMessageConst.Notification.URL, "getUrl()Ljava/lang/String;", 0)};
    public static final art S1 = new art();

    public yax() {
        super(R.layout.fragment_web_browser);
        this.K1 = hnm0.f13359a;
        vax vaxVar = new vax(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new aaw(new aaw(this, (byte) 4), (byte) 5));
        this.O1 = agc.G(this, sre0.f32672a.b(ibx.class), new qwv(a8zVarA, (byte) 16), new qwv(a8zVarA, (byte) 17), vaxVar);
        this.P1 = ltt0.o(this, wax.f38849a);
        this.Q1 = maz.b(new vax(this, (byte) 1));
        this.R1 = new phf0("URL");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        siq fixedWebView = G0().g.getFixedWebView();
        byte b = 2;
        yje yjeVar = null;
        if (fixedWebView != null) {
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.setInitialScale(1);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setAllowFileAccess(true);
            fixedWebView.getSettings().setBuiltInZoomControls(true);
            fixedWebView.setLayerType(2, null);
        }
        byte b2 = 0;
        knm0.h(G0().g, false);
        siq fixedWebView2 = G0().g.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.setFixedWebViewClient(new xax(this));
        }
        DsNavigationBar dsNavigationBar = G0().d;
        String strH = H(R.string.info);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        mc50.a(dsNavigationBar, new vax(this, b));
        I0(true);
        kiu0 kiu0Var = this.O1;
        ibx ibxVar = (ibx) kiu0Var.getValue();
        s6n0 s6n0Var = new s6n0(ibxVar.l, new gbx(ibxVar, yjeVar, b2));
        kaw kawVar = new kaw(this, yjeVar, (byte) 8);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w(s6n0Var, clzVarW, kawVar, (yje) null), 3);
        ol60 ol60Var = ((ibx) kiu0Var.getValue()).m;
        pfl pflVar = new pfl(2, this, yax.class, "handleViewAction", "handleViewAction(Lorg/xplatform/rules/impl/presentation/InfoWebViewModel$ViewAction;)V", 4, (byte) 25);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r1w(ol60Var, clzVarW2, pflVar, (yje) null), 3);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uax.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uax uaxVar = (uax) (ze3Var instanceof uax ? ze3Var : null);
            if (uaxVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.R1.n(this, U1[1]);
                i1w0VarF.getClass();
                strN.getClass();
                a6u a6uVar = uaxVar.f35354a;
                kt2 kt2Var = uaxVar.b;
                sa10 sa10Var = uaxVar.c;
                m1e m1eVar = uaxVar.d;
                duj dujVar = uaxVar.e;
                j1q0 j1q0Var = uaxVar.f;
                btt0 btt0Var = uaxVar.g;
                cad cadVar = uaxVar.h;
                wdk0 wdk0Var = uaxVar.i;
                pyu pyuVar = uaxVar.j;
                iqt iqtVar = uaxVar.k;
                kt2Var.getClass();
                m1eVar.getClass();
                j1q0Var.getClass();
                btt0Var.getClass();
                wdk0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = strN;
                ruVar.c = pyuVar;
                ruVar.d = iqtVar;
                ruVar.e = a6uVar;
                ruVar.h = m1eVar;
                ruVar.f = j1q0Var;
                ruVar.b = dujVar;
                ruVar.g = cadVar;
                ruVar.i = n0k0.a(new tii(ruVar, (byte) 8));
                ruVar.j = zix.a(sa10Var);
                this.L1 = (cji) ((n5d0) ruVar.i).get();
                this.M1 = mbl.a((zix) ruVar.j);
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(uax.class, "Cannot create dependency "));
    }

    public final p6r G0() {
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        return (p6r) objN;
    }

    public final void H0(Intent intent) {
        try {
            w0(intent);
        } catch (Exception unused) {
            if (N()) {
                wdk0 wdk0Var = this.N1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = H(R.string.intent_app_not_installed);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), this, null, null, false, null, 1020);
            }
        }
    }

    public final void I0(boolean z) {
        ((ProgressBar) G0().f.b).setVisibility(z ? 0 : 8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().g.a();
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        G0().g.f();
        if (G0().g.getCurrentUrl().length() == 0) {
            ibx ibxVar = (ibx) this.O1.getValue();
            if (Intrinsics.d(ibxVar.l.getValue(), new ebx(true))) {
                sac.V(jiu0.a(ibxVar), new zax(ibxVar, (byte) 1), null, null, new gkr(ibxVar, null, (byte) 28), 14);
            }
        }
        super.e0();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
