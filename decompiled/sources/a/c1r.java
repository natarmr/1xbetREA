package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class c1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3587a;
    public final Button b;
    public final FrameLayout c;
    public final LottieView d;
    public final nq8 e;
    public final RecyclerView f;
    public final MaterialToolbar g;

    public c1r(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, LottieView lottieView, nq8 nq8Var, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f3587a = constraintLayout;
        this.b = button;
        this.c = frameLayout;
        this.d = lottieView;
        this.e = nq8Var;
        this.f = recyclerView;
        this.g = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3587a;
    }
}
