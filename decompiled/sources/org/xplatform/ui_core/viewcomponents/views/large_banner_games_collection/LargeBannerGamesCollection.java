package org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection;

import a.bvy;
import a.ek5;
import a.pmk0;
import a.rvy;
import a.v1x;
import a.yge0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class LargeBannerGamesCollection extends OptimizedScrollRecyclerView {
    /* JADX WARN: Illegal instructions before constructor call */
    public LargeBannerGamesCollection(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        v1x v1xVar = new v1x((byte) 28);
        bvy bvyVar = new bvy(ek5.d);
        bvyVar.f = v1xVar;
        setAdapter(bvyVar);
        m(new pmk0(dimensionPixelSize, dimensionPixelSize2, 0, 0, 20));
    }

    public final void setOnItemClickListener(Function2<? super rvy, ? super String, Unit> function2) {
        function2.getClass();
        yge0 adapter = getAdapter();
        bvy bvyVar = adapter instanceof bvy ? (bvy) adapter : null;
        if (bvyVar != null) {
            function2.getClass();
            bvyVar.f = function2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBannerGamesCollection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBannerGamesCollection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
