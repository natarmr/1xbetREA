package a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class iha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14770a;
    public int b;
    public final KeyEvent.Callback c;
    public final Object d;
    public final Object e;
    public final Object f;

    public iha(Context context, ImageView imageView, ImageView imageView2, int i, int i2, int i3) {
        context.getClass();
        imageView.getClass();
        this.c = imageView;
        this.d = imageView2;
        this.f14770a = i;
        this.b = i2;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.cybergame_card_flip_to_middle);
        animationLoadAnimation.getClass();
        this.e = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cybergame_card_flip_from_middle);
        animationLoadAnimation2.getClass();
        this.f = animationLoadAnimation2;
        animationLoadAnimation.setStartOffset(((long) i3) * 1000);
        animationLoadAnimation.setAnimationListener(new hha(this, (byte) 0));
        animationLoadAnimation2.setAnimationListener(new hha(this, (byte) 1));
        imageView.clearAnimation();
        imageView.setAnimation(animationLoadAnimation);
        imageView.startAnimation(animationLoadAnimation);
    }

    public void a(int i, boolean z) {
        Function2 function2 = (Function2) this.d;
        if (z) {
            function2.invoke(Boolean.TRUE, Integer.valueOf(i));
        } else {
            function2.invoke(Boolean.FALSE, 0);
        }
    }

    public int b() {
        return ((Number) ((n0o0) this.e).getValue()).intValue();
    }

    public iha(kxq kxqVar, Function2 function2) {
        this.c = kxqVar;
        this.d = function2;
        this.e = maz.b(new y2x(this, (byte) 18));
        qly qlyVar = new qly(this);
        this.f = qlyVar;
        int iN = b8k0.N(kxqVar);
        a(b() - iN, b8k0.S(kxqVar, b(), iN));
        View viewFindViewById = kxqVar.findViewById(android.R.id.content);
        viewFindViewById.getClass();
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(qlyVar);
    }

    public /* synthetic */ iha(Context context, ImageView imageView, int i) {
        this(context, imageView, new ImageView(context), i, 0, 0);
    }
}
