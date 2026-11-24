package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final class ajk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f980a;
    public final LinearLayout b;
    public final LottieView c;
    public final ProgressBar d;
    public final RecyclerView e;

    public ajk(FrameLayout frameLayout, LinearLayout linearLayout, LottieView lottieView, ProgressBar progressBar, RecyclerView recyclerView) {
        this.f980a = frameLayout;
        this.b = linearLayout;
        this.c = lottieView;
        this.d = progressBar;
        this.e = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f980a;
    }
}
