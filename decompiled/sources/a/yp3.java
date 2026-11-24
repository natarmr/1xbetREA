package a;

import android.animation.ValueAnimator;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yp3 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43011a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ yp3(Object obj, int i, byte b) {
        this.f43011a = b;
        this.b = obj;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object value;
        byte b = this.f43011a;
        int iIntValue = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                AppleFortuneGameView appleFortuneGameView = (AppleFortuneGameView) obj;
                int i = AppleFortuneGameView.t;
                valueAnimator.getClass();
                Object obj2 = appleFortuneGameView.i.get(iIntValue);
                obj2.getClass();
                for (sab sabVar : (Iterable) obj2) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    sabVar.setTranslationY(((Float) animatedValue).floatValue());
                }
                b0d b0dVar = (b0d) appleFortuneGameView.j.get(iIntValue);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                b0dVar.setTranslationY(((Float) animatedValue2).floatValue());
                break;
            case 1:
                AppleFortuneGameView appleFortuneGameView2 = (AppleFortuneGameView) obj;
                int i2 = AppleFortuneGameView.t;
                valueAnimator.getClass();
                Object obj3 = appleFortuneGameView2.i.get(iIntValue);
                obj3.getClass();
                for (sab sabVar2 : (Iterable) obj3) {
                    Object animatedValue3 = valueAnimator.getAnimatedValue();
                    animatedValue3.getClass();
                    sabVar2.setTranslationY(((Float) animatedValue3).floatValue());
                }
                b0d b0dVar2 = (b0d) appleFortuneGameView2.j.get(iIntValue);
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                b0dVar2.setTranslationY(((Float) animatedValue4).floatValue());
                break;
            default:
                vic0 vic0Var = (vic0) obj;
                iiy[] iiyVarArr = vic0.S1;
                valueAnimator.getClass();
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                Integer num = animatedValue5 instanceof Integer ? (Integer) animatedValue5 : null;
                hjc0 hjc0VarH0 = vic0Var.H0();
                if (num != null) {
                    iIntValue = num.intValue();
                }
                int i3 = iIntValue;
                p7m0 p7m0Var = hjc0VarH0.j;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, zic0.a((zic0) value, false, i3, false, false, 13)));
                break;
        }
    }
}
