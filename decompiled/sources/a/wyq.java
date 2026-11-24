package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class wyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39985a;
    public final LottieView b;
    public final OptimizedScrollRecyclerView c;
    public final vr9 d;
    public final TextView e;

    public wyq(ConstraintLayout constraintLayout, LottieView lottieView, OptimizedScrollRecyclerView optimizedScrollRecyclerView, vr9 vr9Var, TextView textView) {
        this.f39985a = constraintLayout;
        this.b = lottieView;
        this.c = optimizedScrollRecyclerView;
        this.d = vr9Var;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39985a;
    }
}
