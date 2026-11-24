package a;

import android.animation.ValueAnimator;
import org.xplatform.domino.presentation.views.DominoTableView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z0l implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43572a;
    public final /* synthetic */ DominoTableView b;
    public final /* synthetic */ ValueAnimator c;

    public /* synthetic */ z0l(DominoTableView dominoTableView, ValueAnimator valueAnimator, byte b) {
        this.f43572a = b;
        this.b = dominoTableView;
        this.c = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f43572a;
        ValueAnimator valueAnimator2 = this.c;
        DominoTableView dominoTableView = this.b;
        switch (b) {
            case 0:
                int i = DominoTableView.r;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator2.getAnimatedValue();
                animatedValue.getClass();
                dominoTableView.i = ((Integer) animatedValue).intValue();
                dominoTableView.invalidate();
                break;
            case 1:
                int i2 = DominoTableView.r;
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                animatedValue2.getClass();
                dominoTableView.e = ((Float) animatedValue2).floatValue();
                dominoTableView.invalidate();
                break;
            default:
                int i3 = DominoTableView.r;
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator2.getAnimatedValue();
                animatedValue3.getClass();
                dominoTableView.h = ((Integer) animatedValue3).intValue();
                dominoTableView.invalidate();
                break;
        }
    }
}
