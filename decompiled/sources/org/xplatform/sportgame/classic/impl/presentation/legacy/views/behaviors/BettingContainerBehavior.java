package org.xplatform.sportgame.classic.impl.presentation.legacy.views.behaviors;

import a.ble;
import a.wwb;
import a.yke;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.SubGamesContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/behaviors/BettingContainerBehavior;", "La/yke;", "Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BettingContainerBehavior extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46998a;

    @Override // a.yke
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof MatchInfoContainerView;
    }

    @Override // a.yke
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        SubGamesContainerView subGamesContainerView = (SubGamesContainerView) view;
        view2.getClass();
        Context context = subGamesContainerView.getContext();
        context.getClass();
        if (this.f46998a == 0) {
            this.f46998a = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_16);
        }
        int height = view2.getHeight() - this.f46998a;
        ble bleVar = new ble(-1, -1);
        bleVar.setMargins(0, height, 0, 0);
        subGamesContainerView.setLayoutParams(bleVar);
        return true;
    }

    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        SubGamesContainerView subGamesContainerView = (SubGamesContainerView) view;
        Context context = subGamesContainerView.getContext();
        context.getClass();
        int dimensionPixelSize = this.f46998a;
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_16);
            this.f46998a = dimensionPixelSize;
        }
        int iH = wwb.H(subGamesContainerView, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = subGamesContainerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != iH) {
            ble bleVar = new ble(-1, -1);
            bleVar.setMargins(0, iH, 0, 0);
            subGamesContainerView.setLayoutParams(bleVar);
        }
        return false;
    }
}
