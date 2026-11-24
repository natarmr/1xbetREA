package org.xplatform.ui_core.viewcomponents.smart_background;

import a.elo;
import a.gbe0;
import a.hny;
import a.hwi0;
import a.ibk0;
import a.j5d;
import a.jbk0;
import a.k1x;
import a.o5k0;
import a.phf0;
import a.sj3;
import a.t1x;
import a.u0d;
import a.ulo;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.ui.PlayerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f47205a;
    public ulo b;
    public String c;
    public String d;
    public Function0 e;
    public final jbk0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context, null, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_smart_background_video_view, this);
        int i = R.id.ivProgress;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(this, R.id.ivProgress);
        if (appCompatImageView != null) {
            i = R.id.vVideo;
            PlayerView playerView = (PlayerView) yum0.f(this, R.id.vVideo);
            if (playerView != null) {
                this.f47205a = new vd7(this, appCompatImageView, playerView, (byte) 28);
                this.c = "";
                this.d = "";
                this.e = new hwi0((byte) 25);
                this.f = new jbk0(this);
                b();
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        ((PlayerView) this.f47205a.d).setPlayer(null);
        ulo uloVar = this.b;
        if (uloVar != null) {
            uloVar.G(this.f);
        }
        ulo uloVar2 = this.b;
        if (uloVar2 != null) {
            uloVar2.F();
        }
        this.b = null;
    }

    public final void b() {
        a();
        ulo uloVarA = new elo(getContext()).a();
        this.b = uloVarA;
        vd7 vd7Var = this.f47205a;
        PlayerView playerView = (PlayerView) vd7Var.d;
        PlayerView playerView2 = (PlayerView) vd7Var.d;
        playerView.setPlayer(uloVarA);
        ulo uloVar = this.b;
        if (uloVar != null) {
            uloVar.a(this.f);
        }
        playerView2.setUseController(false);
        ulo uloVar2 = this.b;
        if (uloVar2 != null) {
            uloVar2.Q(2);
        }
        playerView2.setResizeMode(4);
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.length() == 0 || str.equals(this.c) || str2.length() == 0 || str2.equals(this.d)) {
            return;
        }
        Context context = getContext();
        context.getClass();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        int i = Build.VERSION.SDK_INT;
        int iWidth = i >= 30 ? windowManager.getCurrentWindowMetrics().getBounds().width() : context.getResources().getDisplayMetrics().widthPixels;
        int iHeight = i >= 30 ? windowManager.getCurrentWindowMetrics().getBounds().height() : context.getResources().getDisplayMetrics().heightPixels;
        byte b = 0;
        byte b2 = 1;
        boolean z = context.getResources().getBoolean(R.bool.isTablet) && (iWidth > iHeight);
        this.c = str;
        this.d = str2;
        b();
        vd7 vd7Var = this.f47205a;
        ((AppCompatImageView) vd7Var.c).setVisibility(0);
        List list = u0d.f34849a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) vd7Var.c;
        TypedValue typedValue = j5d.f15927a;
        Context context2 = getContext();
        context2.getClass();
        int iA = j5d.a(context2, R.attr.uikitSplashBackground, true);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i2 = z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        int i3 = z ? getContext().getResources().getDisplayMetrics().heightPixels : getContext().getResources().getDisplayMetrics().widthPixels;
        ibk0 ibk0Var = new ibk0(this, b);
        ibk0 ibk0Var2 = new ibk0(this, b2);
        Context context3 = appCompatImageView.getContext();
        context3.getClass();
        if (sj3.q0(context3)) {
            gbe0 gbe0VarA = o5k0.a(appCompatImageView.getContext());
            k1x k1xVar = new k1x(appCompatImageView.getContext());
            k1xVar.c = str2;
            t1x.h(k1xVar, appCompatImageView);
            t1x.f(k1xVar, iA);
            k1xVar.d(i3, i2);
            k1xVar.e = new phf0(ibk0Var2, ibk0Var, appCompatImageView);
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public final void d() {
        ulo uloVar = this.b;
        if (uloVar != null) {
            uloVar.P(true);
        }
        List list = u0d.f34849a;
        vd7 vd7Var = this.f47205a;
        u0d.a((AppCompatImageView) vd7Var.c);
        ((AppCompatImageView) vd7Var.c).setVisibility(8);
    }

    public final void e() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SmartBackgroundVideoView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SmartBackgroundVideoView$SavedState smartBackgroundVideoView$SavedState = (SmartBackgroundVideoView$SavedState) parcelable;
        this.c = smartBackgroundVideoView$SavedState.b;
        this.d = smartBackgroundVideoView$SavedState.c;
        super.onRestoreInstanceState(smartBackgroundVideoView$SavedState.f47201a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SmartBackgroundVideoView$SavedState(this.c, this.d, super.onSaveInstanceState());
    }

    public final void setOnPlayerReadyListener(Function0<Unit> function0) {
        function0.getClass();
        this.e = function0;
    }
}
