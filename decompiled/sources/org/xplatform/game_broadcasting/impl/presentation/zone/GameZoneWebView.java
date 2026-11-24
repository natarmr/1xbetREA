package org.xplatform.game_broadcasting.impl.presentation.zone;

import a.f1t;
import a.ovc;
import a.r0t;
import a.siq;
import a.tiq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class GameZoneWebView extends FixedWebView {
    public static final /* synthetic */ int j = 0;
    public Function0 f;
    public Function0 g;
    public Function0 h;
    public tiq i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameZoneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }

    public final tiq getClient() {
        return this.i;
    }

    public final Function0<Unit> getOnError() {
        return this.g;
    }

    public final Function0<Unit> getOnInternalError() {
        return this.h;
    }

    public final Function0<Unit> getOnMediaFileReddy() {
        return this.f;
    }

    @Override // org.xplatform.ui_core.viewcomponents.webview.FixedWebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = new f1t(this.f, this.g, this.h);
        siq fixedWebView = getFixedWebView();
        if (fixedWebView != null) {
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            fixedWebView.setBackgroundColor(getContext().getColor(R.color.static_black));
            WebSettings settings = fixedWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            fixedWebView.setFixedWebViewClient(this.i);
            setOnTouchListener(new ovc((byte) 1));
        }
    }

    @Override // org.xplatform.ui_core.viewcomponents.webview.FixedWebView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = null;
        super.onDetachedFromWindow();
    }

    public final void setClient(tiq tiqVar) {
        this.i = tiqVar;
    }

    public final void setJavascriptInterface(r0t r0tVar) {
        r0tVar.getClass();
        siq fixedWebView = getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.addJavascriptInterface(r0tVar, "Mobile");
        }
    }

    public final void setOnError(Function0<Unit> function0) {
        this.g = function0;
    }

    public final void setOnInternalError(Function0<Unit> function0) {
        this.h = function0;
    }

    public final void setOnMediaFileReddy(Function0<Unit> function0) {
        this.f = function0;
    }
}
