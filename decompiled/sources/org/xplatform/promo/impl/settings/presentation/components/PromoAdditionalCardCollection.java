package org.xplatform.promo.impl.settings.presentation.components;

import a.bqd0;
import a.j4c0;
import a.jmu0;
import a.m0x;
import a.o4c0;
import a.yge0;
import a.yrh;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class PromoAdditionalCardCollection extends OptimizedScrollRecyclerView {
    public int o2;
    public int p2;
    public int q2;
    public final int r2;
    public final int s2;

    /* JADX WARN: Illegal instructions before constructor call */
    public PromoAdditionalCardCollection(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.p2 = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.q2 = getResources().getDimensionPixelSize(R.dimen.space_12);
        int integer = context.getResources().getInteger(R.integer.promoAdditionalCollectionSpanCount);
        this.s2 = context.getResources().getInteger(R.integer.promoAdditionalCollectionShimmerCount);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.M, 0, 0);
        this.o2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.o2);
        this.p2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.p2);
        this.q2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.q2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, this.r2);
        this.r2 = resourceId;
        setTag("PromoAdditionalCardCollection");
        typedArrayObtainStyledAttributes.recycle();
        setAdapter(new j4c0(new m0x(resourceId, null, 6)));
        setLayoutManager(new GridLayoutManager(getContext(), integer, 1, false));
        m(new yrh(dimensionPixelSize, integer, (byte) 6));
        setPadding(getHorizontalEdgeSpace(), getVerticalEdgeSpace(), getHorizontalEdgeSpace(), getVerticalEdgeSpace());
        setClipToPadding(false);
    }

    private final int getEdgeSpace() {
        int i = this.o2;
        return i >= 0 ? i : getResources().getDimensionPixelSize(R.dimen.space_12);
    }

    private final int getHorizontalEdgeSpace() {
        int i = this.q2;
        return i >= 0 ? i : getEdgeSpace();
    }

    private final int getVerticalEdgeSpace() {
        int i = this.p2;
        return i >= 0 ? i : getEdgeSpace();
    }

    public final void setEdgeSpace(int i) {
        Context context = getContext();
        context.getClass();
        this.o2 = jmu0.c(i, context);
        setPadding(getHorizontalEdgeSpace(), getVerticalEdgeSpace(), getHorizontalEdgeSpace(), getVerticalEdgeSpace());
    }

    public final void setHorizontalEdgeSpace(int i) {
        Context context = getContext();
        context.getClass();
        this.q2 = jmu0.c(i, context);
        setPadding(getHorizontalEdgeSpace(), getVerticalEdgeSpace(), getHorizontalEdgeSpace(), getVerticalEdgeSpace());
    }

    public final void setItems(List<o4c0> list) {
        list.getClass();
        yge0 adapter = getAdapter();
        adapter.getClass();
        ((j4c0) adapter).G(list);
    }

    public final void setOnItemClickListener(Function2<? super o4c0, ? super Integer, Unit> function2) {
        function2.getClass();
        yge0 adapter = getAdapter();
        adapter.getClass();
        ((j4c0) adapter).g = function2;
    }

    public final void setVerticalEdgeSpace(int i) {
        Context context = getContext();
        context.getClass();
        this.p2 = jmu0.c(i, context);
        setPadding(getHorizontalEdgeSpace(), getVerticalEdgeSpace(), getHorizontalEdgeSpace(), getVerticalEdgeSpace());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoAdditionalCardCollection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoAdditionalCardCollection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
