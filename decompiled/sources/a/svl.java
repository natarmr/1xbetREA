package a;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class svl implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32873a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ svl(Function1 function1, byte b) {
        this.f32873a = b;
        this.b = function1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f32873a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke((Integer) w6x.m(valueAnimator));
                break;
            case 1:
                function1.invoke((Float) w6x.m(valueAnimator));
                break;
            default:
                int i = KillerJokerView.h1;
                function1.invoke((Float) w6x.m(valueAnimator));
                break;
        }
    }
}
