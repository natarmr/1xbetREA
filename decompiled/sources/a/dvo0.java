package a;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dvo0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6755a;
    public final /* synthetic */ LinearLayout b;

    public /* synthetic */ dvo0(LinearLayout linearLayout, byte b) {
        this.f6755a = b;
        this.b = linearLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f6755a;
        LinearLayout linearLayout = this.b;
        switch (b) {
            case 0:
                int i = TaxExpandableSpoiler.k;
                linearLayout.getLayoutParams().height = ((Integer) w6x.m(valueAnimator)).intValue();
                linearLayout.requestLayout();
                break;
            default:
                int i2 = TaxExpandableSpoiler.k;
                linearLayout.getLayoutParams().height = ((Integer) w6x.m(valueAnimator)).intValue();
                linearLayout.requestLayout();
                break;
        }
    }
}
