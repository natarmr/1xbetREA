package a;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;

/* JADX INFO: loaded from: classes4.dex */
public final class qkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f28889a;
    public final DicePokerView b;
    public final List c;
    public final Function0 d;
    public final float e;
    public final float f;

    public qkk(Context context, ImageView imageView, int i, DicePokerView dicePokerView, List list, Function0 function0) {
        context.getClass();
        list.getClass();
        this.f28889a = imageView;
        this.b = dicePokerView;
        this.c = list;
        this.d = function0;
        this.e = context.getResources().getBoolean(R.bool.isTablet) ? 1.4f : 1.0f;
        this.f = context.getResources().getBoolean(R.bool.isTablet) ? 1.5f : 1.0f;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), i);
        animationLoadAnimation.setAnimationListener(new f73(this, context, (byte) 2));
        imageView.startAnimation(animationLoadAnimation);
    }
}
