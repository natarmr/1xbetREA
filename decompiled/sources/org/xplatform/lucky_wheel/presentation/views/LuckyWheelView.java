package org.xplatform.lucky_wheel.presentation.views;

import a.am10;
import a.bm10;
import a.f0p;
import a.hny;
import a.iav0;
import a.q3d;
import a.qo10;
import a.r9g;
import a.sb3;
import a.uk5;
import a.yum0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LuckyWheelView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final uk5 q;
    public Animator r;
    public bm10 s;
    public bm10 t;
    public am10 u;
    public final List v;
    public final List w;

    /* JADX WARN: Illegal instructions before constructor call */
    public LuckyWheelView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_lucky_wheel, this);
        int i2 = R.id.centerView;
        ImageView imageView = (ImageView) yum0.f(this, R.id.centerView);
        if (imageView != null) {
            i2 = R.id.decorTop;
            ImageView imageView2 = (ImageView) yum0.f(this, R.id.decorTop);
            if (imageView2 != null) {
                i2 = R.id.guideCenter;
                if (((Guideline) yum0.f(this, R.id.guideCenter)) != null) {
                    i2 = R.id.guidePinStart;
                    if (((Guideline) yum0.f(this, R.id.guidePinStart)) != null) {
                        i2 = R.id.imvWheelDecor;
                        View viewF = yum0.f(this, R.id.imvWheelDecor);
                        if (viewF != null) {
                            i2 = R.id.pinView;
                            ImageView imageView3 = (ImageView) yum0.f(this, R.id.pinView);
                            if (imageView3 != null) {
                                i2 = R.id.wheelView;
                                WheelView wheelView = (WheelView) yum0.f(this, R.id.wheelView);
                                if (wheelView != null) {
                                    this.q = new uk5(this, imageView, imageView2, viewF, imageView3, wheelView, (byte) 9);
                                    this.v = a.c(wheelView);
                                    this.w = q3d.j(wheelView, viewF);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final float getWheelCenterYPosition() {
        uk5 uk5Var = this.q;
        return ((ImageView) uk5Var.g).getY() + (((ImageView) uk5Var.g).getHeight() / 2);
    }

    public final void setNewYearMode(boolean z) {
        uk5 uk5Var = this.q;
        ((WheelView) uk5Var.f).setNewYearMode(z);
        ((ImageView) uk5Var.c).setImageResource(z ? R.drawable.wheel_decor_top_ny : R.drawable.wheel_decor_top);
        ((ImageView) uk5Var.g).setImageResource(z ? R.drawable.ic_wheel_center_ny : R.drawable.ic_wheel_center);
        uk5Var.d.setBackgroundResource(z ? R.drawable.ic_wheel_decor_ny : R.drawable.ic_wheel_decor);
        ((ImageView) uk5Var.e).setImageResource(z ? R.drawable.ic_wheel_pin_ny : R.drawable.ic_wheel_pin);
    }

    public final void setWheelItems(List<iav0> list) {
        list.getClass();
        ((WheelView) this.q.f).setWheelItems(list);
    }

    public final void u(ValueAnimator valueAnimator, List list, Function0 function0) {
        valueAnimator.setDuration(1500L);
        valueAnimator.setInterpolator(new f0p((byte) 1));
        valueAnimator.addListener(new r9g(this, list));
        valueAnimator.addListener(new qo10(this, list, function0));
        valueAnimator.addUpdateListener(new sb3(this, list, (byte) 5));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuckyWheelView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
