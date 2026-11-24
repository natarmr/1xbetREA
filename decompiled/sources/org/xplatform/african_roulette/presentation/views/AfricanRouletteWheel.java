package org.xplatform.african_roulette.presentation.views;

import a.a3e;
import a.dc3;
import a.hny;
import a.q8;
import a.yum0;
import android.animation.AnimatorSet;
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

/* JADX INFO: loaded from: classes2.dex */
public final class AfricanRouletteWheel extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc3 f46269a;
    public float b;
    public AnimatorSet c;
    public ObjectAnimator d;
    public Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfricanRouletteWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.wheel_african_roulette, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.ball;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ball);
        if (imageView != null) {
            i = R.id.stroke;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.stroke);
            if (imageView2 != null) {
                i = R.id.wheel;
                ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.wheel);
                if (imageView3 != null) {
                    this.f46269a = new dc3((ConstraintLayout) viewInflate, imageView, imageView2, imageView3);
                    this.b = 2.4f;
                    this.e = new q8((byte) 24);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        dc3 dc3Var = this.f46269a;
        ViewGroup.LayoutParams layoutParams = ((ImageView) dc3Var.d).getLayoutParams();
        a3e a3eVar = layoutParams instanceof a3e ? (a3e) layoutParams : null;
        if (a3eVar != null) {
            int height = ((ImageView) dc3Var.c).getHeight() / 15;
            ((ViewGroup.MarginLayoutParams) a3eVar).height = height;
            ((ViewGroup.MarginLayoutParams) a3eVar).width = height;
            a3eVar.q = (int) (getMeasuredWidth() / this.b);
            invalidate();
        }
    }

    public final void setAnimationEndListener$african_roulette(Function0<Unit> function0) {
        function0.getClass();
        this.e = function0;
    }
}
