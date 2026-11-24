package org.xplatform.spin_and_win.presentation.views;

import a.bjr;
import a.fzk0;
import a.hny;
import a.yum0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class SpinAndWinWheelView extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjr f46983a;
    public ObjectAnimator b;
    public Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinAndWinWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        byte b = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.wheel_spin_and_win, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.spin_wheel;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.spin_wheel);
        if (imageView != null) {
            i = R.id.spin_wheel_cover;
            if (((ImageView) yum0.f(viewInflate, R.id.spin_wheel_cover)) != null) {
                this.f46983a = new bjr((ConstraintLayout) viewInflate, imageView);
                this.c = new fzk0(b);
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void setAnimationEndListener(Function0<Unit> function0) {
        function0.getClass();
        this.c = function0;
    }
}
