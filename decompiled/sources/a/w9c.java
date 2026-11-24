package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w9c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38772a;
    public final /* synthetic */ z9c b;

    public /* synthetic */ w9c(z9c z9cVar, byte b) {
        this.f38772a = b;
        this.b = z9cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38772a;
        z9c z9cVar = this.b;
        switch (b) {
            case 0:
                ((ImageView) z9cVar.f44009a.c).setImageResource(R.drawable.ic_chest_closed);
                return Unit.f46060a;
            case 1:
                z9cVar.f = y9c.b;
                z9cVar.h.c();
                return Unit.f46060a;
            case 2:
                ((ImageView) z9cVar.f44009a.c).setImageResource(R.drawable.ic_chest_closed);
                return Unit.f46060a;
            case 3:
                z9cVar.g.invoke();
                return Unit.f46060a;
            case 4:
                AnimatorSet animatorSet = new AnimatorSet();
                nq8 nq8Var = z9cVar.f44009a;
                animatorSet.playTogether(ObjectAnimator.ofFloat((ImageView) nq8Var.c, (Property<ImageView, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat((ImageView) nq8Var.c, (Property<ImageView, Float>) View.SCALE_Y, 1.0f));
                return animatorSet;
            case 5:
                AnimatorSet animatorSet2 = new AnimatorSet();
                nq8 nq8Var2 = z9cVar.f44009a;
                animatorSet2.playTogether(ObjectAnimator.ofFloat((ImageView) nq8Var2.c, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f), ObjectAnimator.ofFloat((ImageView) nq8Var2.c, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                return animatorSet2;
            case 6:
                return z9c.e(z9cVar);
            default:
                return z9c.c(z9cVar);
        }
    }
}
