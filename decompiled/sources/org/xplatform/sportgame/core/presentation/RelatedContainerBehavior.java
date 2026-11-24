package org.xplatform.sportgame.core.presentation;

import a.ble;
import a.wwb;
import a.yke;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/sportgame/core/presentation/RelatedContainerBehavior;", "La/yke;", "Lorg/xplatform/related/api/presentation/RelatedContainerView;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RelatedContainerBehavior extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47001a;

    @Override // a.yke
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof MatchInfoContainerView;
    }

    @Override // a.yke
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        RelatedContainerView relatedContainerView = (RelatedContainerView) view;
        view2.getClass();
        Context context = relatedContainerView.getContext();
        context.getClass();
        if (this.f47001a == 0) {
            this.f47001a = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_8);
        }
        int height = view2.getHeight() - this.f47001a;
        ble bleVar = new ble(-1, -1);
        bleVar.setMargins(0, height, 0, 0);
        relatedContainerView.setLayoutParams(bleVar);
        return true;
    }

    @Override // a.yke
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        RelatedContainerView relatedContainerView = (RelatedContainerView) view;
        Context context = relatedContainerView.getContext();
        context.getClass();
        int dimensionPixelSize = this.f47001a;
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_8);
            this.f47001a = dimensionPixelSize;
        }
        int iH = wwb.H(relatedContainerView, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = relatedContainerView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != iH) {
            ble bleVar = new ble(-1, -1);
            bleVar.setMargins(0, iH, 0, 0);
            relatedContainerView.setLayoutParams(bleVar);
        }
        return false;
    }
}
