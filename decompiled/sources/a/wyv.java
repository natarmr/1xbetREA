package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class wyv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39992a;
    public final LottieView b;
    public final ProgressBar c;
    public final RecyclerView d;
    public final DsNavigationBar e;

    public wyv(ConstraintLayout constraintLayout, LottieView lottieView, ProgressBar progressBar, RecyclerView recyclerView, DsNavigationBar dsNavigationBar) {
        this.f39992a = constraintLayout;
        this.b = lottieView;
        this.c = progressBar;
        this.d = recyclerView;
        this.e = dsNavigationBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39992a;
    }
}
