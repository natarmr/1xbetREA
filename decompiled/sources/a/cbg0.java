package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cbg0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cbg0 extends yx5 {
    public final hnm0 K1;
    public wdk0 L1;
    public fiu0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(cbg0.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/FragmentWebBrowserBinding;", 0)};
    public static final zie0 P1 = new zie0();

    public cbg0() {
        super(R.layout.fragment_web_browser);
        this.K1 = hnm0.f13359a;
        abg0 abg0Var = new abg0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 3), (byte) 4));
        this.N1 = agc.G(this, sre0.f32672a.b(pbg0.class), new fxf0(a8zVarA, (byte) 6), new fxf0(a8zVarA, (byte) 7), abg0Var);
        this.O1 = ltt0.o(this, bbg0.f2307a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        DsNavigationBar dsNavigationBar = G0().d;
        String strH = H(R.string.reward_system);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        mc50.a(G0().d, new abg0(this, (byte) 1));
        knm0.h(G0().g, false);
        siq fixedWebView = G0().g.getFixedWebView();
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
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dbg0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dbg0 dbg0Var = (dbg0) (ze3Var instanceof dbg0 ? ze3Var : null);
            if (dbg0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = dbg0Var.f5803a;
                j1q0 j1q0Var = dbg0Var.b;
                duj dujVar = dbg0Var.c;
                sa10 sa10Var = dbg0Var.d;
                knf0 knf0Var = dbg0Var.e;
                btt0 btt0Var = dbg0Var.f;
                gii0 gii0Var = dbg0Var.g;
                wdk0 wdk0Var = dbg0Var.h;
                j1q0Var.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = knf0Var;
                g45Var.b = gii0Var;
                g45Var.c = btt0Var;
                g45Var.d = cadVar;
                g45Var.e = i1w0VarF;
                g45Var.f = j1q0Var;
                g45Var.g = dujVar;
                g45Var.h = sa10Var;
                g45Var.i = new fri(g45Var, (byte) 16);
                this.L1 = wdk0Var;
                this.M1 = new fiu0(Collections.singletonMap(pbg0.class, (fri) g45Var.i));
                return;
            }
        }
        jf4.n(b1j.i(dbg0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((pbg0) this.N1.getValue()).h;
        jjc0 jjc0Var = new jjc0(2, this, cbg0.class, "handleViewActions", "handleViewActions(Lorg/xplatform/reward_system/impl/presentation/RewardSystemViewModel$ViewAction;)V", 4, (byte) 25);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0((gmq) ol60Var, clzVarW, jjc0Var, (yje) null, (short) 0), 3);
    }

    public final p6r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (p6r) objN;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
