package a;

import android.animation.Animator;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;

/* JADX INFO: loaded from: classes3.dex */
public final class qo10 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LuckyWheelView f29050a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function0 c;

    public qo10(LuckyWheelView luckyWheelView, List list, Function0 function0) {
        this.f29050a = luckyWheelView;
        this.b = list;
        this.c = function0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f29050a.r = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setLayerType(0, null);
        }
        Function0 function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
