package a;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class fb30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MatchInfoTabsContainerView f9238a;
    public int b = -1;
    public final ValueAnimator c;
    public final ValueAnimator d;
    public final eb30 e;

    public fb30(MatchInfoTabsContainerView matchInfoTabsContainerView) {
        this.f9238a = matchInfoTabsContainerView;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.getClass();
        byte b = 21;
        valueAnimatorOfFloat.addUpdateListener(new fd5(this, b));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        long j = 500;
        valueAnimatorOfFloat.setDuration(500L);
        this.c = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.getClass();
        valueAnimatorOfFloat2.addUpdateListener(new fd5(this, b));
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat2.setDuration(500L);
        this.d = valueAnimatorOfFloat2;
        eb30 eb30Var = new eb30(j, j);
        eb30Var.b = new n230((byte) 7);
        this.e = eb30Var;
    }
}
