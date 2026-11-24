package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/w1v0;", "La/by5;", "La/sjk;", "<init>", "()V", "a/bzs0", "captcha"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w1v0 extends by5<sjk> {
    public final phf0 b2 = new phf0("BUNDLE_REQUEST_KEY");
    public final phf0 c2 = new phf0("BUNDLE_TITLE_KEY");
    public final phf0 d2 = new phf0("BUNDLE_PHONE_KEY");
    public final yzn0 e2 = new yzn0("KEY_BUNDLE_CAPTCHA_REQUIRED");
    public hzi f2;
    public final kiu0 g2;
    public final nae0 h2;
    public final int i2;
    public static final /* synthetic */ iiy[] k2 = {new ez40(w1v0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(w1v0.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(w1v0.class, "phone", "getPhone()Ljava/lang/String;", 0), new ez40(w1v0.class, "captureTask", "getCaptureTask()Lorg/xplatform/captcha/api/domain/model/CaptchaTask;", 0), new j0d0(w1v0.class, "binding", "getBinding()Lorg/xplatform/captcha/databinding/DialogWebCaptchaBinding;", 0)};
    public static final bzs0 j2 = new bzs0((byte) 11);

    public w1v0() {
        byte b = 21;
        rbt0 rbt0Var = new rbt0(this, b);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, b), (byte) 22));
        this.g2 = agc.G(this, sre0.f32672a.b(i2v0.class), new w6u0(a8zVarA, (byte) 14), new w6u0(a8zVarA, (byte) 15), rbt0Var);
        this.h2 = ltt0.p(this, u1v0.f34919a);
        this.i2 = R.attr.uikitBackgroundContent;
    }

    @Override // a.sik
    public final Dialog A0() {
        Dialog dialog = this.S1;
        if (dialog == null) {
            return null;
        }
        dialog.setCancelable(false);
        return dialog;
    }

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        return new v1v0(this, o0(), this.M1, (byte) 0);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final int getE2() {
        return this.i2;
    }

    @Override // a.by5
    public final void K0() throws Exception {
        I0().c.setNavigationOnClickListener(new jpe0(this, (byte) 18));
        Context contextO0 = o0();
        TypedValue typedValue = j5d.f15927a;
        int iA = j5d.a(contextO0, R.attr.uikitBackgroundContent, false);
        Window window = D0().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(iA));
            ofm0.x(window, R.attr.uikitBackgroundContent, contextO0, 4);
        }
        siq fixedWebView = I0().d.getFixedWebView();
        yje yjeVar = null;
        if (fixedWebView != null) {
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            fixedWebView.getSettings().setCacheMode(2);
            fixedWebView.setBackgroundColor(0);
            fixedWebView.setLayerType(2, null);
        }
        siq fixedWebView2 = I0().d.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.addJavascriptInterface(new hdy(new npt0(this, (byte) 22)), "MobileAppApi");
        }
        I0().c.setTitle(this.c2.n(this, k2[1]));
        kiu0 kiu0Var = this.g2;
        qoj0 qoj0Var = ((i2v0) kiu0Var.getValue()).e;
        lkz lkzVar = lkz.f20223a;
        wup0 wup0Var = new wup0(this, yjeVar, (byte) 16);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new npu0(qoj0Var, clzVarW, wup0Var, (yje) null), 3);
        qoj0 qoj0Var2 = ((i2v0) kiu0Var.getValue()).d;
        k5r0 k5r0Var = new k5r0(2, this, w1v0.class, "onWebCaptchaEvent", "onWebCaptchaEvent(Lorg/xplatform/captcha/impl/domain/models/WebCaptchaEvent;)V", 4, (byte) 18);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new npu0(qoj0Var2, clzVarW2, k5r0Var, (yje) null), 3);
        p7m0 p7m0Var = ((i2v0) kiu0Var.getValue()).f;
        k5r0 k5r0Var2 = new k5r0(2, I0().d, FixedWebView.class, "loadUrl", "loadUrl(Ljava/lang/String;)V", 4, (byte) 19);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new npu0((gmq) p7m0Var, clzVarW3, k5r0Var2, (yje) null, (byte) 0), 3);
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(x1v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            x1v0 x1v0Var = (x1v0) (ze3Var instanceof x1v0 ? ze3Var : null);
            if (x1v0Var != null) {
                ntu ntuVar = x1v0Var.f40138a;
                vby vbyVar = x1v0Var.b;
                g2v g2vVar = x1v0Var.c;
                pyu pyuVar = x1v0Var.d;
                l6a l6aVar = x1v0Var.e;
                vbyVar.getClass();
                l6aVar.getClass();
                this.f2 = (hzi) ((n5d0) new pmi(ntuVar, g2vVar, pyuVar).d).get();
                return;
            }
        }
        jf4.n(b1j.i(x1v0.class, "Cannot create dependency "));
    }

    @Override // a.by5
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final sjk I0() {
        Object objN = this.h2.n(k2[4], this);
        objN.getClass();
        return (sjk) objN;
    }

    public final String S0() {
        return this.b2.n(this, k2[0]);
    }
}
