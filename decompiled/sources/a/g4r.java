package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class g4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10682a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final ConstraintLayout d;
    public final LottieView e;
    public final nq8 f;
    public final RecyclerView g;
    public final MaterialToolbar h;

    public g4r(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout2, LottieView lottieView, nq8 nq8Var, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f10682a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = constraintLayout2;
        this.e = lottieView;
        this.f = nq8Var;
        this.g = recyclerView;
        this.h = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10682a;
    }
}
