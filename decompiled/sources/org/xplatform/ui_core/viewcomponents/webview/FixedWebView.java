package org.xplatform.ui_core.viewcomponents.webview;

import a.mdk0;
import a.rek0;
import a.siq;
import a.v9q;
import a.wdk0;
import a.xdk0;
import android.content.Context;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public class FixedWebView extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public siq f47221a;
    public mdk0 b;
    public boolean c;
    public Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedWebView(Context context) {
        super(context, null);
        context.getClass();
        try {
            this.f47221a = new siq(context);
        } catch (Exception e2) {
            if (e2 instanceof AndroidRuntimeException) {
                this.c = true;
            }
        }
    }

    public final void a() {
        siq siqVar = this.f47221a;
        if (siqVar != null) {
            siqVar.destroy();
        }
        removeView(this.f47221a);
        this.f47221a = null;
    }

    public final boolean b() {
        return (this.c || this.f47221a == null) ? false : true;
    }

    public final void c(String str) {
        str.getClass();
        siq siqVar = this.f47221a;
        if (siqVar != null) {
            siqVar.loadUrl(str);
        }
    }

    public void d(String str, Map map) {
        str.getClass();
        map.getClass();
        siq siqVar = this.f47221a;
        if (siqVar != null) {
            siqVar.loadUrl(str, map);
        }
    }

    public final void e() {
        siq siqVar = this.f47221a;
        if (siqVar != null) {
            siqVar.onPause();
        }
    }

    public final void f() {
        siq siqVar = this.f47221a;
        if (siqVar != null) {
            siqVar.onResume();
        }
    }

    public void g() {
        siq siqVar = this.f47221a;
        if (siqVar != null) {
            siqVar.reload();
        }
    }

    public String getCurrentUrl() {
        String url;
        siq siqVar = this.f47221a;
        return (siqVar == null || (url = siqVar.getUrl()) == null) ? "" : url;
    }

    public final Function0<Unit> getDetaching() {
        return this.d;
    }

    public final siq getFixedWebView() {
        return this.f47221a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && this.f47221a == null) {
            wdk0 wdk0Var = new wdk0(new v9q((byte) 15));
            rek0 rek0Var = rek0.b;
            String string = getContext().getString(R.string.error_not_installed_v2, "WebView");
            string.getClass();
            this.b = wdk0.i(wdk0Var, new xdk0(rek0Var, string, null, null, null, null, 124), this);
            return;
        }
        View view = this.f47221a;
        if (view != null) {
            addView(view);
            return;
        }
        try {
            Context context = getContext();
            context.getClass();
            siq siqVar = new siq(context);
            this.f47221a = siqVar;
            addView(siqVar);
        } catch (Exception e2) {
            if (e2 instanceof AndroidRuntimeException) {
                this.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mdk0 mdk0Var = this.b;
        if (mdk0Var != null) {
            mdk0Var.dismiss();
        }
        Function0 function0 = this.d;
        if (function0 != null) {
            function0.invoke();
        }
        this.d = null;
        if (this.f47221a != null) {
            a();
        }
        super.onDetachedFromWindow();
    }

    public final void setDetaching(Function0<Unit> function0) {
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        try {
            this.f47221a = new siq(context, attributeSet);
        } catch (Exception e2) {
            if (e2 instanceof AndroidRuntimeException) {
                this.c = true;
            }
        }
    }
}
