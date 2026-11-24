package a;

import android.animation.ValueAnimator;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rfl implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30393a;
    public final /* synthetic */ DragonsGoldGameView b;
    public final /* synthetic */ int c;

    public /* synthetic */ rfl(DragonsGoldGameView dragonsGoldGameView, int i, byte b) {
        this.f30393a = b;
        this.b = dragonsGoldGameView;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f30393a;
        int i = this.c;
        DragonsGoldGameView dragonsGoldGameView = this.b;
        switch (b) {
            case 0:
                int i2 = DragonsGoldGameView.u;
                valueAnimator.getClass();
                Object obj = dragonsGoldGameView.i.get(i);
                obj.getClass();
                for (sab sabVar : (Iterable) obj) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    sabVar.setTranslationY(((Float) animatedValue).floatValue());
                }
                b0d b0dVar = (b0d) dragonsGoldGameView.j.get(i);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                b0dVar.setTranslationY(((Float) animatedValue2).floatValue());
                break;
            default:
                int i3 = DragonsGoldGameView.u;
                valueAnimator.getClass();
                Object obj2 = dragonsGoldGameView.i.get(i);
                obj2.getClass();
                for (sab sabVar2 : (Iterable) obj2) {
                    Object animatedValue3 = valueAnimator.getAnimatedValue();
                    animatedValue3.getClass();
                    sabVar2.setTranslationY(((Float) animatedValue3).floatValue());
                }
                b0d b0dVar2 = (b0d) dragonsGoldGameView.j.get(i);
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                b0dVar2.setTranslationY(((Float) animatedValue4).floatValue());
                break;
        }
    }
}
