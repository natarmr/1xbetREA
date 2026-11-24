package a;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ro10 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30815a;
    public final /* synthetic */ View b;

    public /* synthetic */ ro10(View view, byte b) {
        this.f30815a = b;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f30815a;
        View view = this.b;
        Object objM = w6x.m(valueAnimator);
        switch (b) {
            case 0:
                view.setAlpha(((Float) objM).floatValue());
                break;
            case 1:
                int iIntValue = ((Integer) objM).intValue();
                Drawable background = view.getBackground();
                background.getClass();
                ((GradientDrawable) background).setColor(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) objM).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.height = iIntValue2;
                    view.setLayoutParams(layoutParams);
                }
                break;
        }
    }
}
