package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class dzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6951a;
    public final DSLottieEmptyContainer b;
    public final TabLayout c;
    public final DsNavigationBarBasic d;
    public final nq8 e;
    public final ViewPager2 f;

    public dzq(ConstraintLayout constraintLayout, DSLottieEmptyContainer dSLottieEmptyContainer, TabLayout tabLayout, DsNavigationBarBasic dsNavigationBarBasic, nq8 nq8Var, ViewPager2 viewPager2) {
        this.f6951a = constraintLayout;
        this.b = dSLottieEmptyContainer;
        this.c = tabLayout;
        this.d = dsNavigationBarBasic;
        this.e = nq8Var;
        this.f = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6951a;
    }
}
