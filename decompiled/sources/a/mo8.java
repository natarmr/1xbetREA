package a;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class mo8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22122a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo8(Object obj, byte b) {
        this.f22122a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f22122a;
        Object obj = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki30 ki30Var = ((BottomSheetBehavior) obj).j;
                if (ki30Var != null) {
                    ki30Var.t(fFloatValue);
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                m0p m0pVar = (m0p) obj;
                m0pVar.c.setAlpha(iFloatValue);
                m0pVar.d.setAlpha(iFloatValue);
                m0pVar.s.invalidate();
                break;
            case 3:
                ((qyx) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 4:
                ((hqj0) obj).invalidateSelf();
                break;
            case 5:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) obj).X1.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
