package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import org.xplatform.core.presentation.balance.OnexGamesBalanceView;

/* JADX INFO: loaded from: classes3.dex */
public final class pe70 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26838a;
    public final ShimmerFrameLayout b;
    public final OnexGamesBalanceView c;

    public pe70(ConstraintLayout constraintLayout, ShimmerFrameLayout shimmerFrameLayout, OnexGamesBalanceView onexGamesBalanceView) {
        this.f26838a = constraintLayout;
        this.b = shimmerFrameLayout;
        this.c = onexGamesBalanceView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26838a;
    }
}
