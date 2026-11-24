package org.xplatform.uikit.components.category_card_collection;

import a.bqd0;
import a.m0x;
import a.n3b;
import a.ntl;
import a.o0x;
import a.p3b;
import a.pmk0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsCategoryCardCollection extends OptimizedScrollRecyclerView {
    public o0x o2;
    public final n3b p2;
    public final pmk0 q2;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsCategoryCardCollection(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.o2 = new m0x(R.drawable.banner_item_placeholder, null, 6);
        pmk0 pmk0Var = new pmk0(getResources().getDimensionPixelSize(R.dimen.space_8), getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic), 0, 0, 20);
        this.q2 = pmk0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.l, 0, 0);
        this.o2 = new m0x(typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.banner_item_placeholder), null, 6);
        typedArrayObtainStyledAttributes.recycle();
        n3b n3bVar = new n3b(new ntl(this, (byte) 1));
        this.p2 = n3bVar;
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(n3bVar);
        m(pmk0Var);
    }

    public final void setHorizontalPadding(int i) {
        pmk0 pmk0Var = new pmk0(getResources().getDimensionPixelSize(R.dimen.space_8), i, 0, 0, 20);
        s0(this.q2);
        m(pmk0Var);
    }

    public final void setOnItemClickListener(Function1<? super p3b, Unit> function1) {
        function1.getClass();
        this.p2.g = function1;
    }

    public final void setPlaceholder(o0x o0xVar) {
        o0xVar.getClass();
        this.o2 = o0xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCategoryCardCollection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCategoryCardCollection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
