package org.xplatform.ui_core.viewcomponents.smart_background;

import a.a3e;
import a.ba10;
import a.ey3;
import a.fy3;
import a.gy3;
import a.hny;
import a.hy3;
import a.iy3;
import a.maz;
import a.n0o0;
import a.nq8;
import a.o0k0;
import a.t9f;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq8 f47203a;
    public final n0o0 b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, null, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_smart_background_lottie_view, this);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) yum0.f(this, R.id.lottieView);
        if (lottieAnimationView == null) {
            hny.u("Missing required view with ID: ".concat(getResources().getResourceName(R.id.lottieView)));
            throw null;
        }
        this.f47203a = new nq8(this, lottieAnimationView, (byte) 21);
        this.b = maz.b(new o0k0((Object) context, (Object) this, (byte) 1));
    }

    private final AppCompatImageView getImageView() {
        return (AppCompatImageView) this.b.getValue();
    }

    public final void a() {
        nq8 nq8Var = this.f47203a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) nq8Var.c;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) nq8Var.c;
        if (lottieAnimationView.h.i()) {
            lottieAnimationView2.a();
        }
        lottieAnimationView2.clearAnimation();
        getImageView().setImageDrawable(null);
        getImageView().setVisibility(8);
    }

    public final void b(int i, int i2, int i3) {
        if (this.c == i && this.d == i2 && this.e == i3) {
            return;
        }
        this.c = i;
        this.d = i2;
        this.e = i3;
        nq8 nq8Var = this.f47203a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) nq8Var.c;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) nq8Var.c;
        if (lottieAnimationView.getParent() == null) {
            addView(lottieAnimationView2, 1);
        }
        if (i2 != 0) {
            getImageView().setImageResource(i2);
            getImageView().setVisibility(0);
        } else if (i3 != 0) {
            getImageView().setImageDrawable(new ColorDrawable(i3));
            getImageView().setVisibility(0);
        } else {
            getImageView().setImageDrawable(null);
            getImageView().setVisibility(8);
        }
        lottieAnimationView2.setAnimation(i);
        lottieAnimationView2.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f47203a.c;
        if (lottieAnimationView.getAnimation() != null) {
            lottieAnimationView.n.add(ba10.f);
            lottieAnimationView.h.n();
            return;
        }
        int i = this.c;
        if (i != 0) {
            lottieAnimationView.setAnimation(i);
            lottieAnimationView.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        nq8 nq8Var = this.f47203a;
        if (((LottieAnimationView) nq8Var.c).h.i()) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) nq8Var.c;
            lottieAnimationView.l = false;
            lottieAnimationView.h.k();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SmartBackgroundLottieView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SmartBackgroundLottieView$SavedState smartBackgroundLottieView$SavedState = (SmartBackgroundLottieView$SavedState) parcelable;
        this.c = smartBackgroundLottieView$SavedState.b;
        this.d = smartBackgroundLottieView$SavedState.c;
        this.e = smartBackgroundLottieView$SavedState.d;
        super.onRestoreInstanceState(smartBackgroundLottieView$SavedState.f47199a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SmartBackgroundLottieView$SavedState(super.onSaveInstanceState(), this.c, this.d, this.e);
    }

    public final void setContainerLayoutParams(iy3 iy3Var) {
        iy3Var.getClass();
        if (iy3Var != null) {
            int i = -2;
            if (!(iy3Var instanceof fy3) && !(iy3Var instanceof ey3) && !(iy3Var instanceof gy3)) {
                if (iy3Var instanceof hy3) {
                    i = -1;
                }
            }
            if (iy3Var == null || !((iy3Var instanceof fy3) || (iy3Var instanceof ey3) || (iy3Var instanceof gy3) || (iy3Var instanceof hy3))) {
                t9f.b();
                return;
            }
            a3e a3eVar = new a3e(i, -1);
            a3eVar.i = 0;
            a3eVar.l = 0;
            a3eVar.t = 0;
            a3eVar.v = 0;
            setLayoutParams(a3eVar);
            return;
        }
        t9f.b();
    }
}
