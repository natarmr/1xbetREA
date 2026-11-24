package a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/a2v0;", "La/by5;", "La/tjk;", "<init>", "()V", "a/svs0", "captcha"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a2v0 extends by5<tjk> {
    public final yzn0 b2 = new yzn0("KEY_PARAMS");
    public final a8z c2;
    public final kiu0 d2;
    public final nae0 e2;
    public final int f2;
    public static final /* synthetic */ iiy[] h2 = {new ez40(a2v0.class, "params", "getParams()Lorg/xplatform/captcha/impl/presentation/fragments/webcaptcha/redesign/model/WebCaptchaDialogDesignSystemParams;", 0), new j0d0(a2v0.class, "binding", "getBinding()Lorg/xplatform/captcha/databinding/DialogWebCaptchaDesignSystemBinding;", 0)};
    public static final svs0 g2 = new svs0((byte) 12);

    public a2v0() {
        y1v0 y1v0Var = new y1v0(this, (byte) 1);
        wez wezVar = wez.b;
        this.c2 = maz.a(wezVar, y1v0Var);
        y1v0 y1v0Var2 = new y1v0(this, (byte) 2);
        a8z a8zVarA = maz.a(wezVar, new cvs0(new cvs0(this, (byte) 23), (byte) 24));
        this.d2 = agc.G(this, sre0.f32672a.b(h2v0.class), new w6u0(a8zVarA, (byte) 16), new w6u0(a8zVarA, (byte) 17), y1v0Var2);
        this.e2 = ltt0.p(this, z1v0.f43641a);
        this.f2 = R.attr.uikitBackgroundContent;
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
        return new v1v0(this, o0(), this.M1, (byte) 1);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final int getE2() {
        return this.f2;
    }

    @Override // a.by5
    public final void K0() throws Exception {
        I0().b.b(new y1v0(this, (byte) 0));
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
            fixedWebView2.addJavascriptInterface(new hdy(new npt0(this, (byte) 23)), "MobileAppApi");
        }
        I0().b.setTitle(S0().d);
        kiu0 kiu0Var = this.d2;
        ol60 ol60Var = ((h2v0) kiu0Var.getValue()).e;
        rtq0 rtq0Var = new rtq0(this, yjeVar, (byte) 25);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new npu0(ol60Var, clzVarW, rtq0Var, (yje) null), 3);
        p7m0 p7m0Var = ((h2v0) kiu0Var.getValue()).f;
        lkz lkzVar2 = lkz.f20223a;
        k5r0 k5r0Var = new k5r0(2, I0().d, FixedWebView.class, "loadUrl", "loadUrl(Ljava/lang/String;)V", 4, (byte) 20);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new npu0((gmq) p7m0Var, clzVarW2, k5r0Var, (yje) null, (char) 0), 3);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final tjk I0() {
        Object objN = this.e2.n(h2[1], this);
        objN.getClass();
        return (tjk) objN;
    }

    public final c2v0 S0() {
        return (c2v0) this.b2.n(this, h2[0]);
    }
}
