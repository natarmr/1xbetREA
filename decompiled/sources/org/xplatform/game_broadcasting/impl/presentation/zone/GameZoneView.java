package org.xplatform.game_broadcasting.impl.presentation.zone;

import a.a8z;
import a.ctr;
import a.ghu0;
import a.maz;
import a.nsr;
import a.r0t;
import a.sqs;
import a.w3w0;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
public final class GameZoneView extends ctr {
    public static final /* synthetic */ int l = 0;
    public final a8z b;
    public final View c;
    public final GameBroadcastingControlPanelView d;
    public final ProgressBar e;
    public Function0 f;
    public Function0 g;
    public String h;
    public String i;
    public w3w0 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 3));
        this.c = getBinding().b;
        this.d = getBinding().e;
        this.e = getBinding().c;
        this.f = new sqs((byte) 21);
        this.g = new sqs((byte) 22);
        this.h = "";
        this.i = "";
        this.j = w3w0.b;
        setBackgroundColor(context.getColor(R.color.static_black));
        if (getBinding().d.b()) {
            GameZoneWebView gameZoneWebView = getBinding().d;
            final byte b = 0;
            gameZoneWebView.setOnMediaFileReddy(new Function0(this) { // from class: a.x0t
                public final /* synthetic */ GameZoneView b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b2 = b;
                    GameZoneView gameZoneView = this.b;
                    switch (b2) {
                        case 0:
                            return GameZoneView.i(gameZoneView);
                        case 1:
                            gameZoneView.g.invoke();
                            return Unit.f46060a;
                        default:
                            return GameZoneView.j(gameZoneView);
                    }
                }
            });
            final byte b2 = 1;
            gameZoneWebView.setOnError(new Function0(this) { // from class: a.x0t
                public final /* synthetic */ GameZoneView b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    GameZoneView gameZoneView = this.b;
                    switch (b3) {
                        case 0:
                            return GameZoneView.i(gameZoneView);
                        case 1:
                            gameZoneView.g.invoke();
                            return Unit.f46060a;
                        default:
                            return GameZoneView.j(gameZoneView);
                    }
                }
            });
            final byte b3 = 2;
            gameZoneWebView.setOnInternalError(new Function0(this) { // from class: a.x0t
                public final /* synthetic */ GameZoneView b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b4 = b3;
                    GameZoneView gameZoneView = this.b;
                    switch (b4) {
                        case 0:
                            return GameZoneView.i(gameZoneView);
                        case 1:
                            gameZoneView.g.invoke();
                            return Unit.f46060a;
                        default:
                            return GameZoneView.j(gameZoneView);
                    }
                }
            });
        }
    }

    private final ghu0 getBinding() {
        Object value = this.b.getValue();
        value.getClass();
        return (ghu0) value;
    }

    public static final Unit i(GameZoneView gameZoneView) {
        if (gameZoneView.k) {
            GameZoneWebView gameZoneWebView = gameZoneView.getBinding().d;
            String str = gameZoneView.h;
            str.getClass();
            gameZoneWebView.c(str);
            gameZoneView.k = false;
        }
        gameZoneView.getOnMediaFileReddyListener().invoke();
        return Unit.f46060a;
    }

    public static final Unit j(GameZoneView gameZoneView) {
        gameZoneView.getBinding().d.e();
        gameZoneView.getBinding().d.c("");
        gameZoneView.getBinding().d.f();
        gameZoneView.getBinding().d.c(gameZoneView.i);
        gameZoneView.getBinding().d.f();
        gameZoneView.k = true;
        return Unit.f46060a;
    }

    public final void e() {
        if (getBinding().d.b()) {
            this.i = "";
            getBinding().d.e();
            getBinding().d.c("");
            getBinding().e.setPlayDrawable(false);
        }
    }

    public final void f() {
        if (this.i.length() == 0 || this.h.length() == 0 || !getBinding().d.b()) {
            return;
        }
        getBinding().d.f();
        GameZoneWebView gameZoneWebView = getBinding().d;
        String str = this.h;
        str.getClass();
        gameZoneWebView.c(str);
        getBinding().e.setPlayDrawable(true);
    }

    public final void g(String str, w3w0 w3w0Var) {
        if (w3w0Var == this.j || !getBinding().d.b()) {
            return;
        }
        this.j = w3w0Var;
        getBinding().d.c(str);
    }

    @Override // a.ctr
    public View getBroadcastingContainerView() {
        return this.c;
    }

    @Override // a.ctr
    public GameBroadcastingControlPanelView getBroadcastingControlPanelView() {
        return this.d;
    }

    public final Function0<Unit> getOnErrorListener() {
        return this.g;
    }

    @Override // a.ctr
    public Function0<Unit> getOnMediaFileReddyListener() {
        return this.f;
    }

    public final void h() {
        getBinding().d.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnMediaFileReddyListener(new sqs((byte) 20));
    }

    @Override // a.ctr
    public void setBroadcastingUrl(String str) {
        str.getClass();
        if (getBinding().d.b()) {
            this.i = str;
            getBinding().d.c(this.i);
        }
    }

    public final void setJavascriptInterface(r0t r0tVar) {
        r0tVar.getClass();
        getBinding().d.setJavascriptInterface(r0tVar);
    }

    public final void setOnErrorListener(Function0<Unit> function0) {
        function0.getClass();
        this.g = function0;
    }

    @Override // a.ctr
    public void setOnMediaFileReddyListener(Function0<Unit> function0) {
        function0.getClass();
        this.f = function0;
    }

    public final void setPlayZoneCommand(String str) {
        str.getClass();
        if (Intrinsics.d(str, this.h)) {
            return;
        }
        this.h = str;
    }

    public final void setZoneFormatDrawable(w3w0 w3w0Var) {
        w3w0Var.getClass();
        getBinding().e.setZoneFormatDrawable(w3w0Var);
    }

    public final void setZoneFormatIsVisible(boolean z) {
        getBinding().e.setZoneFormatIsVisible(z);
    }

    @Override // a.ctr
    public ProgressBar getProgressView() {
        return this.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameZoneView(Context context) {
        this(context, null);
        context.getClass();
    }
}
