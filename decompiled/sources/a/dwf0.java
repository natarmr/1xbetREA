package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dwf0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dwf0 extends yx5 {
    public jzi K1;
    public final kiu0 L1;
    public final s0r M1;
    public final phf0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(dwf0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentResponsibleGamblingWebBinding;", 0), new ez40(dwf0.class, RemoteMessageConst.Notification.URL, "getUrl()Ljava/lang/String;", 0)};
    public static final cge0 O1 = new cge0((byte) 8);

    public dwf0() {
        super(R.layout.fragment_responsible_gambling_web);
        tie0 tie0Var = new tie0(this, (byte) 25);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 25), (byte) 26));
        this.L1 = agc.G(this, sre0.f32672a.b(jwf0.class), new wbe0(a8zVarA, (byte) 26), new wbe0(a8zVarA, (byte) 27), tie0Var);
        this.M1 = ltt0.o(this, bwf0.f3322a);
        this.N1 = new phf0("URL");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.setNavigationOnClickListener(new jpe0(this, (byte) 2));
        FixedWebView fixedWebView = G0().e;
        siq fixedWebView2 = fixedWebView.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.getSettings().setDomStorageEnabled(true);
            fixedWebView2.getSettings().setJavaScriptEnabled(true);
            fixedWebView2.getSettings().setLoadWithOverviewMode(true);
            fixedWebView2.setInitialScale(1);
            fixedWebView2.getSettings().setUseWideViewPort(true);
            fixedWebView2.getSettings().setAllowFileAccess(true);
            fixedWebView2.getSettings().setBuiltInZoomControls(true);
            fixedWebView2.setLayerType(2, null);
            fixedWebView2.setFixedWebViewClient(new cwf0(G0().e, G0().b, G0().d));
            fixedWebView2.getSettings().setDisplayZoomControls(false);
        }
        fixedWebView.setVisibility(8);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(q2v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            q2v0 q2v0Var = (q2v0) (ze3Var instanceof q2v0 ? ze3Var : null);
            if (q2v0Var != null) {
                String strN = this.N1.n(this, P1[1]);
                strN.getClass();
                duj dujVar = q2v0Var.f28021a;
                sa10 sa10Var = q2v0Var.b;
                m1e m1eVar = q2v0Var.c;
                mne mneVar = q2v0Var.d;
                pyu pyuVar = q2v0Var.e;
                iqt iqtVar = q2v0Var.f;
                m1eVar.getClass();
                this.K1 = (jzi) ((n5d0) new rrd(dujVar, strN, sa10Var, m1eVar, mneVar, pyuVar, iqtVar).i).get();
                return;
            }
        }
        jf4.n(b1j.i(q2v0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((jwf0) this.L1.getValue()).h;
        tye0 tye0Var = new tye0(this, null, (byte) 9);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(p7m0Var, clzVarW, tye0Var, (yje) null), 3);
    }

    public final f4r G0() {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        return (f4r) objN;
    }
}
