package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class buh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3231a;
    public final DSLottieEmptyContainer b;
    public final RecyclerView c;
    public final ewe d;

    public buh(FrameLayout frameLayout, DSLottieEmptyContainer dSLottieEmptyContainer, RecyclerView recyclerView, ewe eweVar) {
        this.f3231a = frameLayout;
        this.b = dSLottieEmptyContainer;
        this.c = recyclerView;
        this.d = eweVar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3231a;
    }
}
