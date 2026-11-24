package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class uth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f36254a;
    public final DSLottieEmptyContainer b;
    public final RecyclerView c;
    public final vr9 d;

    public uth(FrameLayout frameLayout, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, vr9 vr9Var) {
        this.f36254a = frameLayout;
        this.b = dSLottieEmptyContainer;
        this.c = recyclerView;
        this.d = vr9Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36254a;
    }
}
