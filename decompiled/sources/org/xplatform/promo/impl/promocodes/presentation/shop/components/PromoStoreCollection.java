package org.xplatform.promo.impl.promocodes.presentation.shop.components;

import a.aqg;
import a.bqd0;
import a.euc0;
import a.fhe0;
import a.jmu0;
import a.m0x;
import a.pmk0;
import a.xtc0;
import a.yge0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class PromoStoreCollection extends OptimizedScrollRecyclerView {
    public final int o2;
    public int p2;
    public int q2;
    public int r2;
    public final int s2;
    public final int t2;
    public final int u2;
    public final int v2;
    public fhe0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoStoreCollection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.p2 = -1;
        this.q2 = -1;
        this.r2 = -1;
        this.s2 = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.t2 = getResources().getDimensionPixelSize(R.dimen.space_8);
        setTag("TagDsPromoStoreCollection");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.g0, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(0, this.o2);
        this.o2 = i;
        this.p2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.p2);
        this.q2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, this.q2);
        this.r2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.r2);
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, this.u2);
        this.u2 = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        int integer = i == 0 ? 1 : getResources().getInteger(R.integer.promoStoreCollectionSpanCount);
        this.v2 = integer;
        setAdapter(new xtc0(i, new m0x(resourceId, null, 6), numValueOf));
        setLayoutManager(i == 0 ? new LinearLayoutManager(getContext(), 0, false) : new GridLayoutManager(getContext(), integer, 1, false));
        H0();
    }

    private final int getBottomEdgePadding() {
        int i = this.r2;
        return i >= 0 ? i : getEdgePadding();
    }

    private final int getEdgePadding() {
        int i = this.p2;
        return i >= 0 ? i : getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
    }

    private final int getTopEdgePadding() {
        int i = this.q2;
        return i >= 0 ? i : getEdgePadding();
    }

    public final void H0() {
        fhe0 pmk0Var;
        fhe0 fhe0Var = this.w2;
        if (fhe0Var != null) {
            s0(fhe0Var);
        }
        int i = this.o2;
        int i2 = this.t2;
        if (i == 1) {
            pmk0Var = new aqg(i2, this.s2, getTopEdgePadding(), getBottomEdgePadding(), this.v2);
        } else {
            pmk0Var = new pmk0(i2, getEdgePadding(), 0, i, 20);
        }
        this.w2 = pmk0Var;
        m(pmk0Var);
    }

    public final void setBottomEdgeSpace(int i) {
        Context context = getContext();
        context.getClass();
        this.r2 = jmu0.c(i, context);
        H0();
    }

    public final void setEdgeSpace(int i) {
        Context context = getContext();
        context.getClass();
        this.p2 = jmu0.c(i, context);
        H0();
    }

    public final void setItems(List<? extends euc0> list) {
        list.getClass();
        yge0 adapter = getAdapter();
        adapter.getClass();
        ((xtc0) adapter).G(list);
    }

    public final void setOnItemClickListener(Function2<? super euc0, ? super Integer, Unit> function2) {
        function2.getClass();
        yge0 adapter = getAdapter();
        adapter.getClass();
        ((xtc0) adapter).i = function2;
    }

    public final void setTopEdgeSpace(int i) {
        Context context = getContext();
        context.getClass();
        this.q2 = jmu0.c(i, context);
        H0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoStoreCollection(Context context) {
        this(context, null);
        context.getClass();
    }
}
