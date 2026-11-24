package a;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ssc extends dxn {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final q10 j;
    public final qd7 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public ssc(cxn cxnVar) {
        super(cxnVar);
        this.j = new q10(this, (byte) 10);
        this.k = new qd7(this, (byte) 1);
        this.e = n6x.T(cxnVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = n6x.T(cxnVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = g7x.W(cxnVar.getContext(), R.attr.motionEasingLinearInterpolator, n73.f23021a);
        this.h = g7x.W(cxnVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, n73.d);
    }

    @Override // a.dxn
    public final void a() {
        if (this.b.p != null) {
            return;
        }
        s(t());
    }

    @Override // a.dxn
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // a.dxn
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // a.dxn
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // a.dxn
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // a.dxn
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // a.dxn
    public final void l(EditText editText) {
        this.i = editText;
        this.f6855a.setEndIconVisible(t());
    }

    @Override // a.dxn
    public final void o(boolean z) {
        if (this.b.p == null) {
            return;
        }
        s(z);
    }

    @Override // a.dxn
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        final byte b = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.qsc
            public final /* synthetic */ ssc b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                ssc sscVar = this.b;
                switch (b2) {
                    case 0:
                        sscVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = sscVar.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        valueAnimatorOfFloat2.setDuration(i);
        final byte b2 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.qsc
            public final /* synthetic */ ssc b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                ssc sscVar = this.b;
                switch (b3) {
                    case 0:
                        sscVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = sscVar.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new rsc(this, b2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.qsc
            public final /* synthetic */ ssc b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                ssc sscVar = this.b;
                switch (b3) {
                    case 0:
                        sscVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = sscVar.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new rsc(this, b));
    }

    @Override // a.dxn
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new w1((Object) this, (byte) 26));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.c() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.d.hasFocus()) && ((this.i.getText().length() > 0) || (this.b.p != null));
    }
}
