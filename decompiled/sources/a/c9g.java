package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class c9g implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3960a;
    public final DSLottieEmptyContainer b;
    public final ViewPager2 c;

    public c9g(FrameLayout frameLayout, DSLottieEmptyContainer dSLottieEmptyContainer, ViewPager2 viewPager2) {
        this.f3960a = frameLayout;
        this.b = dSLottieEmptyContainer;
        this.c = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3960a;
    }
}
