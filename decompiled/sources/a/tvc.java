package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.Window;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tvc;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tvc extends yx5 {
    public fiu0 K1;
    public wdk0 L1;
    public final kiu0 M1;
    public final s0r N1;
    public final zz2 O1;
    public final cgx0 P1;
    public String Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(tvc.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentWebCmsBannerBinding;", 0), new ez40(tvc.class, "bannerId", "getBannerId()I", 0), new ez40(tvc.class, "fromPush", "getFromPush()Z", 0)};
    public static final gl5 R1 = new gl5((byte) 26);

    public tvc() {
        super(R.layout.fragment_web_cms_banner);
        byte b = 0;
        nvc nvcVar = new nvc(this, b);
        a8z a8zVarA = maz.a(wez.b, new svc(new h79(this, (byte) 29), b));
        this.M1 = agc.G(this, sre0.f32672a.b(iwc.class), new wpb(a8zVarA, (byte) 10), new wpb(a8zVarA, (byte) 11), nvcVar);
        this.N1 = ltt0.o(this, pvc.f27656a);
        this.O1 = new zz2("BANNER_ID");
        this.P1 = new cgx0("FROM_PUSH");
        this.Q1 = "";
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Window window;
        kxq kxqVarB = B();
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            ofm0.z(window, null, R.attr.uikitBackground, R.attr.uikitBackground, 9);
        }
        this.Q1 = ckb.N(o0());
        mc50.a(G0().d, new nvc(this, (byte) 1));
        siq fixedWebView = G0().f.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setOnTouchListener(new ovc((byte) 0));
        }
        siq fixedWebView2 = G0().f.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.getSettings().setTextZoom(100);
            fixedWebView2.getSettings().setSupportZoom(false);
            fixedWebView2.setInitialScale(100);
            fixedWebView2.setLayerType(2, null);
        }
        siq fixedWebView3 = G0().f.getFixedWebView();
        if (fixedWebView3 != null) {
            fixedWebView3.setFixedWebViewClient(new qvc(this));
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xr50.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xr50 xr50Var = (xr50) (ze3Var instanceof xr50 ? ze3Var : null);
            if (xr50Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                i7i i7iVarA = xr50Var.a(this.O1.n(this, iiyVarArr[1]).intValue(), i1w0VarF, this.P1.n(this, iiyVarArr[2]).booleanValue());
                this.K1 = i7iVarA.x();
                this.L1 = (wdk0) i7iVarA.f;
                return;
            }
        }
        jf4.n(b1j.i(xr50.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        xae0 xae0VarN = vtb.N(((iwc) kiu0Var.getValue()).o);
        yje yjeVar = null;
        rvc rvcVar = new rvc(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb(xae0VarN, clzVarW, rvcVar, (yje) null), 3);
        ol60 ol60Var = ((iwc) kiu0Var.getValue()).l;
        rvc rvcVar2 = new rvc(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new vxb(ol60Var, clzVarW2, rvcVar2, (yje) null), 3);
    }

    public final q6r G0() {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        return (q6r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(G0().f28214a);
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        hxm0.m(G0().f28214a);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getP1() {
        return !this.P1.n(this, S1[2]).booleanValue();
    }
}
