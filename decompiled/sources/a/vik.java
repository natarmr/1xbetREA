package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.bonus_games.impl.core.presentation.views.BetGameShopDotIndicatorView;

/* JADX INFO: loaded from: classes3.dex */
public final class vik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f37482a;
    public final RecyclerView b;
    public final Button c;
    public final BetGameShopDotIndicatorView d;
    public final hsx e;
    public final RecyclerView f;
    public final FrameLayout g;
    public final ConstraintLayout h;

    public vik(ConstraintLayout constraintLayout, RecyclerView recyclerView, Button button, BetGameShopDotIndicatorView betGameShopDotIndicatorView, hsx hsxVar, RecyclerView recyclerView2, FrameLayout frameLayout, ConstraintLayout constraintLayout2) {
        this.f37482a = constraintLayout;
        this.b = recyclerView;
        this.c = button;
        this.d = betGameShopDotIndicatorView;
        this.e = hsxVar;
        this.f = recyclerView2;
        this.g = frameLayout;
        this.h = constraintLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37482a;
    }
}
