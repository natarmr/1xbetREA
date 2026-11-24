package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class x6j implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f40366a;
    public final RecyclerView b;
    public final DSLottieEmptyContainer c;
    public final FrameLayout d;

    public x6j(FrameLayout frameLayout, RecyclerView recyclerView, DSLottieEmptyContainer dSLottieEmptyContainer, FrameLayout frameLayout2) {
        this.f40366a = frameLayout;
        this.b = recyclerView;
        this.c = dSLottieEmptyContainer;
        this.d = frameLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40366a;
    }
}
