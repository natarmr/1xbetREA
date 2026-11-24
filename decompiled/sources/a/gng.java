package a;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class gng implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11584a;
    public final /* synthetic */ hng b;

    public /* synthetic */ gng(hng hngVar, byte b) {
        this.f11584a = b;
        this.b = hngVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.f11584a;
        hng hngVar = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) hngVar.c;
                imageView.setImageResource(hngVar.f13350a);
                imageView.clearAnimation();
                Animation animation2 = (Animation) hngVar.f;
                imageView.setAnimation(animation2);
                imageView.startAnimation(animation2);
                break;
            default:
                ((View) hngVar.d).setVisibility(hngVar.b ? 0 : 8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.f11584a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f11584a) {
            case 0:
                ((View) this.b.d).setVisibility(8);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }
}
