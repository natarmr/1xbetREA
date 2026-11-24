package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayedCardsTableView;

/* JADX INFO: loaded from: classes5.dex */
public final class f73 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9040a;
    public final Object b;
    public final Object c;

    public /* synthetic */ f73(Object obj, Object obj2, byte b) {
        this.f9040a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.f9040a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                animation.getClass();
                ((Function0) obj2).invoke();
                break;
            case 1:
                CyberPlayedCardsTableView cyberPlayedCardsTableView = (CyberPlayedCardsTableView) obj2;
                int i = CyberPlayedCardsTableView.f;
                cyberPlayedCardsTableView.a((ArrayList) obj);
                cyberPlayedCardsTableView.setVisibility(0);
                break;
            default:
                qkk qkkVar = (qkk) obj2;
                ImageView imageView = qkkVar.f28889a;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_Y, -(imageView.getHeight() / 4.0f));
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.addListener(new akc(qkkVar, (Context) obj, (byte) 4));
                objectAnimatorOfFloat.start();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.f9040a) {
            case 0:
                animation.getClass();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f9040a) {
            case 0:
                animation.getClass();
                ((Function0) this.c).invoke();
                break;
        }
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
