package a;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakCardDeckView;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eng implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8092a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ eng(ImageView imageView, byte b) {
        this.f8092a = b;
        this.b = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f8092a;
        ImageView imageView = this.b;
        switch (b) {
            case 0:
                int i = CyberDurakCardDeckView.c;
                imageView.setX(((Float) w6x.m(valueAnimator)).floatValue());
                break;
            case 1:
                imageView.setAlpha(((Float) w6x.m(valueAnimator)).floatValue());
                imageView.setVisibility(0);
                break;
            default:
                int i2 = KillerJokerView.h1;
                imageView.setScaleX(((Float) w6x.m(valueAnimator)).floatValue());
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                imageView.setScaleY(((Float) animatedValue).floatValue());
                break;
        }
    }
}
