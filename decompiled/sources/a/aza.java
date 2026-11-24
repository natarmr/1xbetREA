package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackCardView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackMiniCardView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes4.dex */
public final class aza implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1707a;
    public final DsAccountSelection b;
    public final AppBarLayout c;
    public final CashbackCardView d;
    public final CollapsingToolbarLayout e;
    public final DsLottieEmpty f;
    public final CashbackMiniCardView g;
    public final FrameLayout h;
    public final ConstraintLayout i;
    public final LottieView j;
    public final CashbackMiniCardView k;
    public final NestedScrollView l;
    public final CashbackMiniCardView m;
    public final MaterialToolbar n;
    public final LinearLayout o;
    public final CashbackView p;

    public aza(ConstraintLayout constraintLayout, DsAccountSelection dsAccountSelection, AppBarLayout appBarLayout, CashbackCardView cashbackCardView, CollapsingToolbarLayout collapsingToolbarLayout, DsLottieEmpty dsLottieEmpty, CashbackMiniCardView cashbackMiniCardView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, LottieView lottieView, CashbackMiniCardView cashbackMiniCardView2, NestedScrollView nestedScrollView, CashbackMiniCardView cashbackMiniCardView3, MaterialToolbar materialToolbar, LinearLayout linearLayout, CashbackView cashbackView) {
        this.f1707a = constraintLayout;
        this.b = dsAccountSelection;
        this.c = appBarLayout;
        this.d = cashbackCardView;
        this.e = collapsingToolbarLayout;
        this.f = dsLottieEmpty;
        this.g = cashbackMiniCardView;
        this.h = frameLayout;
        this.i = constraintLayout2;
        this.j = lottieView;
        this.k = cashbackMiniCardView2;
        this.l = nestedScrollView;
        this.m = cashbackMiniCardView3;
        this.n = materialToolbar;
        this.o = linearLayout;
        this.p = cashbackView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1707a;
    }
}
