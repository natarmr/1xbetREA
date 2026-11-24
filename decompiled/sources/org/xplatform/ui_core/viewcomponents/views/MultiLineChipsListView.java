package org.xplatform.ui_core.viewcomponents.views;

import a.a8z;
import a.aw40;
import a.bw20;
import a.cy7;
import a.da40;
import a.dyb;
import a.maz;
import a.np30;
import a.wez;
import a.zv40;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes.dex */
public final class MultiLineChipsListView extends FlexboxLayout {
    public static final /* synthetic */ int x = 0;
    public final ArrayList r;
    public final a8z s;
    public final int t;
    public final int u;
    public final int v;
    public Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLineChipsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r = new ArrayList();
        this.s = maz.a(wez.b, new np30(this, (byte) 14));
        this.t = (int) getResources().getDimension(R.dimen.space_8);
        this.u = (int) getResources().getDimension(R.dimen.space_8);
        this.v = (int) getResources().getDimension(R.dimen.space_8);
        this.w = new da40((byte) 13);
    }

    private final DsHeader getHeaderLabel() {
        return (DsHeader) this.s.getValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 0, this.u, 0);
        setJustifyContent(0);
        setAlignItems(0);
        setAlignContent(0);
        setFlexWrap(1);
        addView(getHeaderLabel());
    }

    public final void setItemClickListener(Function1<? super aw40, Unit> function1) {
        function1.getClass();
        this.w = function1;
    }

    public final void setItems(List<aw40> list) {
        list.getClass();
        ArrayList arrayList = this.r;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((zv40) it.next());
        }
        arrayList.clear();
        for (aw40 aw40Var : CollectionsKt.L0(list)) {
            Context context = getContext();
            context.getClass();
            zv40 zv40Var = new zv40(context);
            dyb.O(zv40Var, new bw20(this, aw40Var, (byte) 29));
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            boolean zC = cy7.c();
            int i = this.t;
            int i2 = this.v;
            if (zC) {
                layoutParams.setMargins(0, i2, i, 0);
            } else {
                layoutParams.setMargins(i, i2, 0, 0);
            }
            zv40Var.setLayoutParams(layoutParams);
            zv40Var.a(aw40Var.c, aw40Var.b);
            addView(zv40Var);
            arrayList.add(zv40Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiLineChipsListView(Context context) {
        this(context, null);
        context.getClass();
    }
}
