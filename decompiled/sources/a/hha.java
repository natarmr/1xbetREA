package a;

import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class hha implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13053a;
    public final /* synthetic */ iha b;

    public /* synthetic */ hha(iha ihaVar, byte b) {
        this.f13053a = b;
        this.b = ihaVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.f13053a;
        iha ihaVar = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) ihaVar.c;
                imageView.setImageResource(ihaVar.f14770a);
                imageView.clearAnimation();
                Animation animation2 = (Animation) ihaVar.f;
                imageView.setAnimation(animation2);
                imageView.startAnimation(animation2);
                break;
            default:
                ImageView imageView2 = (ImageView) ihaVar.d;
                imageView2.setVisibility(0);
                imageView2.setImageResource(ihaVar.b);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.f13053a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.f13053a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
