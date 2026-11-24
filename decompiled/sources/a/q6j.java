package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class q6j implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f28201a;
    public final View b;
    public final View c;
    public final DSLottieEmptyContainer d;
    public final FrameLayout e;
    public final RecyclerView f;

    public q6j(FrameLayout frameLayout, View view, View view2, DSLottieEmptyContainer dSLottieEmptyContainer, FrameLayout frameLayout2, RecyclerView recyclerView) {
        this.f28201a = frameLayout;
        this.b = view;
        this.c = view2;
        this.d = dSLottieEmptyContainer;
        this.e = frameLayout2;
        this.f = recyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28201a;
    }
}
