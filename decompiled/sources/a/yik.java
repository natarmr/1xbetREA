package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class yik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f42695a;
    public final LottieView b;
    public final ConstraintLayout c;
    public final RecyclerView d;
    public final MaterialToolbar e;

    public yik(ConstraintLayout constraintLayout, LottieView lottieView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f42695a = constraintLayout;
        this.b = lottieView;
        this.c = constraintLayout2;
        this.d = recyclerView;
        this.e = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42695a;
    }
}
