package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class l6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f19521a;
    public final LottieView b;
    public final nq8 c;
    public final RecyclerView d;
    public final MaterialToolbar e;

    public l6r(ConstraintLayout constraintLayout, LottieView lottieView, nq8 nq8Var, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f19521a = constraintLayout;
        this.b = lottieView;
        this.c = nq8Var;
        this.d = recyclerView;
        this.e = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19521a;
    }
}
