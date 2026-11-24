package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class v930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37014a;
    public final int b;
    public final MatchInfoContainerView c;
    public s930 d;
    public boolean e;
    public boolean f;
    public AnimatorSet g;
    public AnimatorSet h;
    public boolean i;
    public boolean j;
    public final ValueAnimator k;
    public final ValueAnimator l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public final ValueAnimator o;

    public v930(s930 s930Var) {
        s930Var.getClass();
        this.f37014a = s930Var.f31834a;
        this.b = s930Var.b;
        this.c = s930Var.j;
        this.d = s930Var;
        ValueAnimator duration = new ValueAnimator().setDuration(200L);
        final byte b = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.t930
            public final /* synthetic */ v930 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                v930 v930Var = this.b;
                switch (b2) {
                    case 0:
                        valueAnimator.getClass();
                        s930 s930Var2 = v930Var.d;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        int iIntValue = ((Integer) animatedValue).intValue();
                        s930Var2.e = iIntValue;
                        s930Var2.j.A(iIntValue);
                        break;
                    case 1:
                        valueAnimator.getClass();
                        s930 s930Var3 = v930Var.d;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        float fFloatValue = ((Float) animatedValue2).floatValue();
                        s930Var3.d = fFloatValue;
                        s930Var3.j.x(fFloatValue);
                        break;
                    case 2:
                        valueAnimator.getClass();
                        s930 s930Var4 = v930Var.d;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        int iIntValue2 = ((Integer) animatedValue3).intValue();
                        s930Var4.g = iIntValue2;
                        s930Var4.j.v(iIntValue2);
                        break;
                    case 3:
                        valueAnimator.getClass();
                        s930 s930Var5 = v930Var.d;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        int iIntValue3 = ((Integer) animatedValue4).intValue();
                        s930Var5.e = iIntValue3;
                        s930Var5.j.A(iIntValue3);
                        break;
                    default:
                        valueAnimator.getClass();
                        s930 s930Var6 = v930Var.d;
                        Object animatedValue5 = valueAnimator.getAnimatedValue();
                        animatedValue5.getClass();
                        float fFloatValue2 = ((Float) animatedValue5).floatValue();
                        s930Var6.c = fFloatValue2;
                        s930Var6.j.z(fFloatValue2);
                        break;
                }
            }
        });
        final byte b2 = 3;
        duration.addListener(new u930(this, b2));
        this.k = duration;
        ValueAnimator duration2 = new ValueAnimator().setDuration(200L);
        final byte b3 = 1;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.t930
            public final /* synthetic */ v930 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b4 = b3;
                v930 v930Var = this.b;
                switch (b4) {
                    case 0:
                        valueAnimator.getClass();
                        s930 s930Var2 = v930Var.d;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        int iIntValue = ((Integer) animatedValue).intValue();
                        s930Var2.e = iIntValue;
                        s930Var2.j.A(iIntValue);
                        break;
                    case 1:
                        valueAnimator.getClass();
                        s930 s930Var3 = v930Var.d;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        float fFloatValue = ((Float) animatedValue2).floatValue();
                        s930Var3.d = fFloatValue;
                        s930Var3.j.x(fFloatValue);
                        break;
                    case 2:
                        valueAnimator.getClass();
                        s930 s930Var4 = v930Var.d;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        int iIntValue2 = ((Integer) animatedValue3).intValue();
                        s930Var4.g = iIntValue2;
                        s930Var4.j.v(iIntValue2);
                        break;
                    case 3:
                        valueAnimator.getClass();
                        s930 s930Var5 = v930Var.d;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        int iIntValue3 = ((Integer) animatedValue4).intValue();
                        s930Var5.e = iIntValue3;
                        s930Var5.j.A(iIntValue3);
                        break;
                    default:
                        valueAnimator.getClass();
                        s930 s930Var6 = v930Var.d;
                        Object animatedValue5 = valueAnimator.getAnimatedValue();
                        animatedValue5.getClass();
                        float fFloatValue2 = ((Float) animatedValue5).floatValue();
                        s930Var6.c = fFloatValue2;
                        s930Var6.j.z(fFloatValue2);
                        break;
                }
            }
        });
        final byte b4 = 2;
        duration2.addListener(new u930(this, b4));
        this.l = duration2;
        ValueAnimator duration3 = new ValueAnimator().setDuration(200L);
        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.t930
            public final /* synthetic */ v930 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b4;
                v930 v930Var = this.b;
                switch (b5) {
                    case 0:
                        valueAnimator.getClass();
                        s930 s930Var2 = v930Var.d;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        int iIntValue = ((Integer) animatedValue).intValue();
                        s930Var2.e = iIntValue;
                        s930Var2.j.A(iIntValue);
                        break;
                    case 1:
                        valueAnimator.getClass();
                        s930 s930Var3 = v930Var.d;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        float fFloatValue = ((Float) animatedValue2).floatValue();
                        s930Var3.d = fFloatValue;
                        s930Var3.j.x(fFloatValue);
                        break;
                    case 2:
                        valueAnimator.getClass();
                        s930 s930Var4 = v930Var.d;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        int iIntValue2 = ((Integer) animatedValue3).intValue();
                        s930Var4.g = iIntValue2;
                        s930Var4.j.v(iIntValue2);
                        break;
                    case 3:
                        valueAnimator.getClass();
                        s930 s930Var5 = v930Var.d;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        int iIntValue3 = ((Integer) animatedValue4).intValue();
                        s930Var5.e = iIntValue3;
                        s930Var5.j.A(iIntValue3);
                        break;
                    default:
                        valueAnimator.getClass();
                        s930 s930Var6 = v930Var.d;
                        Object animatedValue5 = valueAnimator.getAnimatedValue();
                        animatedValue5.getClass();
                        float fFloatValue2 = ((Float) animatedValue5).floatValue();
                        s930Var6.c = fFloatValue2;
                        s930Var6.j.z(fFloatValue2);
                        break;
                }
            }
        });
        this.m = duration3;
        ValueAnimator duration4 = new ValueAnimator().setDuration(200L);
        duration4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.t930
            public final /* synthetic */ v930 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b5 = b2;
                v930 v930Var = this.b;
                switch (b5) {
                    case 0:
                        valueAnimator.getClass();
                        s930 s930Var2 = v930Var.d;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        int iIntValue = ((Integer) animatedValue).intValue();
                        s930Var2.e = iIntValue;
                        s930Var2.j.A(iIntValue);
                        break;
                    case 1:
                        valueAnimator.getClass();
                        s930 s930Var3 = v930Var.d;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        float fFloatValue = ((Float) animatedValue2).floatValue();
                        s930Var3.d = fFloatValue;
                        s930Var3.j.x(fFloatValue);
                        break;
                    case 2:
                        valueAnimator.getClass();
                        s930 s930Var4 = v930Var.d;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        int iIntValue2 = ((Integer) animatedValue3).intValue();
                        s930Var4.g = iIntValue2;
                        s930Var4.j.v(iIntValue2);
                        break;
                    case 3:
                        valueAnimator.getClass();
                        s930 s930Var5 = v930Var.d;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        int iIntValue3 = ((Integer) animatedValue4).intValue();
                        s930Var5.e = iIntValue3;
                        s930Var5.j.A(iIntValue3);
                        break;
                    default:
                        valueAnimator.getClass();
                        s930 s930Var6 = v930Var.d;
                        Object animatedValue5 = valueAnimator.getAnimatedValue();
                        animatedValue5.getClass();
                        float fFloatValue2 = ((Float) animatedValue5).floatValue();
                        s930Var6.c = fFloatValue2;
                        s930Var6.j.z(fFloatValue2);
                        break;
                }
            }
        });
        duration4.addListener(new u930(this, (byte) 6));
        this.n = duration4;
        ValueAnimator duration5 = new ValueAnimator().setDuration(200L);
        final byte b5 = 4;
        duration5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.t930
            public final /* synthetic */ v930 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b6 = b5;
                v930 v930Var = this.b;
                switch (b6) {
                    case 0:
                        valueAnimator.getClass();
                        s930 s930Var2 = v930Var.d;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        int iIntValue = ((Integer) animatedValue).intValue();
                        s930Var2.e = iIntValue;
                        s930Var2.j.A(iIntValue);
                        break;
                    case 1:
                        valueAnimator.getClass();
                        s930 s930Var3 = v930Var.d;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        float fFloatValue = ((Float) animatedValue2).floatValue();
                        s930Var3.d = fFloatValue;
                        s930Var3.j.x(fFloatValue);
                        break;
                    case 2:
                        valueAnimator.getClass();
                        s930 s930Var4 = v930Var.d;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        int iIntValue2 = ((Integer) animatedValue3).intValue();
                        s930Var4.g = iIntValue2;
                        s930Var4.j.v(iIntValue2);
                        break;
                    case 3:
                        valueAnimator.getClass();
                        s930 s930Var5 = v930Var.d;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        int iIntValue3 = ((Integer) animatedValue4).intValue();
                        s930Var5.e = iIntValue3;
                        s930Var5.j.A(iIntValue3);
                        break;
                    default:
                        valueAnimator.getClass();
                        s930 s930Var6 = v930Var.d;
                        Object animatedValue5 = valueAnimator.getAnimatedValue();
                        animatedValue5.getClass();
                        float fFloatValue2 = ((Float) animatedValue5).floatValue();
                        s930Var6.c = fFloatValue2;
                        s930Var6.j.z(fFloatValue2);
                        break;
                }
            }
        });
        duration5.addListener(new u930(this, (byte) 5));
        this.o = duration5;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g = null;
        byte b = 0;
        this.i = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new LinearInterpolator());
        this.h = animatorSet2;
        s930 s930Var = this.d;
        int i = s930Var.e;
        int i2 = s930Var.f;
        int i3 = i + i2;
        float f = s930Var.c;
        if (f == 0.0f) {
            int i4 = this.b;
            ValueAnimator valueAnimator = this.l;
            if (i3 > i4) {
                int i5 = s930Var.h;
                int i6 = s930Var.g;
                ValueAnimator valueAnimator2 = this.k;
                ValueAnimator valueAnimator3 = this.m;
                if (i2 == 0) {
                    valueAnimator3.setIntValues(i6, i5);
                    valueAnimator2.setIntValues(this.d.e, i4);
                    valueAnimator.setFloatValues(this.d.d, 1.0f);
                    animatorSet2.playSequentially(valueAnimator3, valueAnimator2, valueAnimator);
                } else {
                    valueAnimator3.setIntValues(i6, i5);
                    valueAnimator2.setIntValues(this.d.e, 0);
                    valueAnimator.setFloatValues(this.d.d, 1.0f);
                    animatorSet2.playSequentially(valueAnimator3, valueAnimator2, valueAnimator);
                }
            } else if (i2 == i4 && i == 0) {
                valueAnimator.setFloatValues(s930Var.d, 1.0f);
                animatorSet2.playSequentially(valueAnimator);
            } else if (i3 == i4) {
                s930Var.a(0, i4);
                AnimatorSet animatorSet3 = this.h;
                if (animatorSet3 != null) {
                    valueAnimator.setFloatValues(this.d.d, 1.0f);
                    animatorSet3.playSequentially(valueAnimator);
                }
            }
        } else {
            ValueAnimator valueAnimator4 = this.o;
            valueAnimator4.setFloatValues(f, 1.0f);
            animatorSet2.playSequentially(valueAnimator4);
        }
        AnimatorSet animatorSet4 = this.h;
        ArrayList<Animator> childAnimations = animatorSet4 != null ? animatorSet4.getChildAnimations() : null;
        if (childAnimations == null || childAnimations.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet5 = this.h;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new u930(this, (byte) 4));
        }
        AnimatorSet animatorSet6 = this.h;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new u930(this, b));
        }
        AnimatorSet animatorSet7 = this.h;
        if (animatorSet7 != null) {
            animatorSet7.start();
        }
    }

    public final void b(boolean z) {
        if (this.f) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = null;
        this.j = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new LinearInterpolator());
        this.g = animatorSet2;
        s930 s930Var = this.d;
        int i = s930Var.e;
        int i2 = s930Var.f;
        int i3 = i + i2;
        float f = s930Var.d;
        byte b = 1;
        int i4 = this.b;
        ValueAnimator valueAnimator = this.n;
        ValueAnimator valueAnimator2 = this.m;
        int i5 = this.f37014a;
        ValueAnimator valueAnimator3 = this.o;
        if (f != 0.0f) {
            ValueAnimator valueAnimator4 = this.l;
            if (z) {
                valueAnimator4.setFloatValues(f, 0.0f);
                s930 s930Var2 = this.d;
                valueAnimator2.setIntValues(s930Var2.g, s930Var2.i);
                valueAnimator.setIntValues(this.d.e, i5 - i4);
                valueAnimator3.setFloatValues(this.d.c, 1.0f);
                animatorSet2.playSequentially(valueAnimator4, valueAnimator2, valueAnimator, valueAnimator3);
            } else {
                valueAnimator4.setFloatValues(f, 1.0f);
                animatorSet2.play(valueAnimator4);
            }
        } else if (i3 < i5) {
            int i6 = s930Var.i;
            int i7 = s930Var.g;
            if (i2 == 0) {
                valueAnimator2.setIntValues(i7, i6);
                valueAnimator.setIntValues(this.d.e, i5);
                valueAnimator3.setFloatValues(this.d.c, 1.0f);
                animatorSet2.playSequentially(valueAnimator2, valueAnimator, valueAnimator3);
            } else {
                valueAnimator2.setIntValues(i7, i6);
                valueAnimator.setIntValues(this.d.e, i5 - i4);
                valueAnimator3.setFloatValues(this.d.c, 1.0f);
                animatorSet2.playSequentially(valueAnimator2, valueAnimator, valueAnimator3);
            }
        } else if (i2 == 0 && i == i5) {
            valueAnimator3.setFloatValues(s930Var.c, 1.0f);
            animatorSet2.playSequentially(valueAnimator3);
        } else if (i3 == i5) {
            s930Var.a(i5, 0);
            AnimatorSet animatorSet3 = this.g;
            if (animatorSet3 != null) {
                valueAnimator3.setFloatValues(this.d.c, 1.0f);
                animatorSet3.play(valueAnimator3);
            }
        }
        AnimatorSet animatorSet4 = this.g;
        ArrayList<Animator> childAnimations = animatorSet4 != null ? animatorSet4.getChildAnimations() : null;
        if (childAnimations == null || childAnimations.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet5 = this.g;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new u930(this, (byte) 4));
        }
        AnimatorSet animatorSet6 = this.g;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new u930(this, b));
        }
        AnimatorSet animatorSet7 = this.g;
        if (animatorSet7 != null) {
            animatorSet7.start();
        }
    }
}
