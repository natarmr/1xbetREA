package a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.widget.ProgressBar;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/wgk0;", "La/by5;", "La/jjk0;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class wgk0 extends by5<jjk0> {
    public static final /* synthetic */ iiy[] d2 = {new j0d0(wgk0.class, "binding", "getBinding()Lorg/xplatform/social/impl/databinding/SocialWebViewBinding;", 0)};
    public final int b2 = R.attr.uikitBackground;
    public final nae0 c2 = ltt0.p(this, vgk0.f37385a);

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        return new a630(this, n0(), this.M1, (byte) 2);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final int getA2() {
        return this.b2;
    }

    @Override // a.by5
    public void K0() {
        jjk0 jjk0VarI0 = I0();
        FixedWebView fixedWebView = jjk0VarI0.d;
        if (fixedWebView.b()) {
            CookieManager.getInstance().setAcceptCookie(true);
            WebStorage.getInstance().deleteAllData();
            fixedWebView.setDetaching(new o0k0((Object) jjk0VarI0, (Object) this, (byte) 3));
        }
        siq fixedWebView2 = fixedWebView.getFixedWebView();
        if (fixedWebView2 != null) {
            fixedWebView2.getSettings().setJavaScriptEnabled(true);
            fixedWebView2.getSettings().setDomStorageEnabled(true);
            fixedWebView2.setLayerType(2, null);
        }
        MaterialToolbar materialToolbar = jjk0VarI0.c;
        TypedValue typedValue = j5d.f15927a;
        materialToolbar.setTitleTextColor(j5d.a(o0(), R.attr.uikitSecondary, false));
        ProgressBar progressBar = jjk0VarI0.b;
        progressBar.setVisibility(0);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        Context context = progressBar.getContext();
        context.getClass();
        int color = context.getColor(R.color.static_white);
        b4d b4dVar = b4d.f1952a;
        vcc.b0(indeterminateDrawable, color);
    }

    @Override // a.by5
    public final int O0() {
        return R.id.toolbar;
    }

    @Override // a.by5
    public final int P0() {
        return R.drawable.ic_arrow_back;
    }

    @Override // a.by5
    public final View.OnClickListener Q0() {
        return new jpe0(this, (byte) 9);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final jjk0 I0() {
        Object objN = this.c2.n(d2[0], this);
        objN.getClass();
        return (jjk0) objN;
    }

    public final void S0() {
        siq siqVar = I0().d.f47221a;
        if (!(siqVar != null ? siqVar.canGoBack() : false)) {
            F().t0(i120.V(new Pair("CLOSE_SOCIAL", "")), "CLOSE_SOCIAL");
            y0();
        } else {
            siq siqVar2 = I0().d.f47221a;
            if (siqVar2 != null) {
                siqVar2.goBack();
            }
        }
    }
}
