package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackChoiceView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final class m0b implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20945a;
    public final View b;
    public final LottieView c;
    public final FrameLayout d;
    public final RecyclerView e;
    public final MaterialToolbar f;
    public final CashbackChoiceView g;

    public m0b(ConstraintLayout constraintLayout, View view, LottieView lottieView, FrameLayout frameLayout, RecyclerView recyclerView, MaterialToolbar materialToolbar, CashbackChoiceView cashbackChoiceView) {
        this.f20945a = constraintLayout;
        this.b = view;
        this.c = lottieView;
        this.d = frameLayout;
        this.e = recyclerView;
        this.f = materialToolbar;
        this.g = cashbackChoiceView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20945a;
    }
}
