package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class w6j implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f38626a;
    public final RecyclerView b;
    public final View c;
    public final View d;
    public final DSLottieEmptyContainer e;
    public final RecyclerView f;

    public w6j(FrameLayout frameLayout, RecyclerView recyclerView, View view, View view2, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView2) {
        this.f38626a = frameLayout;
        this.b = recyclerView;
        this.c = view;
        this.d = view2;
        this.e = dSLottieEmptyContainer;
        this.f = recyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38626a;
    }
}
