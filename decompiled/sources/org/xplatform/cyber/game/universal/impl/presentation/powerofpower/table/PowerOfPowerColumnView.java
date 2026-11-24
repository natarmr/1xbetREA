package org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table;

import a.iqb0;
import a.jqb0;
import a.q3d;
import a.t9f;
import a.tpb0;
import a.vqd;
import a.wpb0;
import a.xpb0;
import a.ypb0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PowerOfPowerColumnView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46533a;
    public final ArrayList b;
    public jqb0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public PowerOfPowerColumnView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46533a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = new ArrayList();
        setOrientation(1);
        setClipToPadding(false);
        setClipChildren(false);
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jqb0 jqb0Var = this.c;
        int dimensionPixelSize = jqb0Var != null ? getResources().getDimensionPixelSize(jqb0Var.c.f29109a) : 0;
        int i5 = 0;
        for (Object obj : this.b) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            tpb0 tpb0Var = (tpb0) obj;
            int iA = vqd.a(i5, this.f46533a, (tpb0Var.getMeasuredHeight() * i5) + i2, i5 > (this.c != null ? 3 : Integer.MAX_VALUE) ? dimensionPixelSize : 0);
            tpb0Var.layout(0, iA, tpb0Var.getMeasuredWidth(), tpb0Var.getMeasuredHeight() + iA);
            i5 = i6;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        jqb0 jqb0Var = this.c;
        int measuredHeight = 0;
        int dimensionPixelSize = jqb0Var != null ? getResources().getDimensionPixelSize(jqb0Var.c.f29109a) : 0;
        jqb0 jqb0Var2 = this.c;
        ypb0 ypb0Var = jqb0Var2 != null ? jqb0Var2.f16942a : null;
        if (ypb0Var == null) {
            return;
        }
        boolean z = ypb0Var instanceof wpb0;
        int i3 = this.f46533a;
        ArrayList<tpb0> arrayList = this.b;
        if (z) {
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(((wpb0) ypb0Var).f39537a);
            for (tpb0 tpb0Var : arrayList) {
                ViewGroup.LayoutParams layoutParams = tpb0Var.getLayoutParams();
                layoutParams.width = dimensionPixelSize2;
                tpb0Var.setLayoutParams(layoutParams);
                measureChild(tpb0Var, View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824), i2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                measuredHeight += ((tpb0) it.next()).getMeasuredHeight();
            }
            setMeasuredDimension(dimensionPixelSize2, (arrayList.size() * i3) + measuredHeight + dimensionPixelSize);
            return;
        }
        if (!(ypb0Var instanceof xpb0)) {
            t9f.b();
            return;
        }
        int iMax = 0;
        for (tpb0 tpb0Var2 : arrayList) {
            measureChild(tpb0Var2, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            iMax = Math.max(iMax, tpb0Var2.getMeasuredWidth());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            measuredHeight += ((tpb0) it2.next()).getMeasuredHeight();
        }
        setMeasuredDimension(iMax, (arrayList.size() * i3) + measuredHeight + dimensionPixelSize);
        for (tpb0 tpb0Var3 : arrayList) {
            ViewGroup.LayoutParams layoutParams2 = tpb0Var3.getLayoutParams();
            layoutParams2.width = -1;
            tpb0Var3.setLayoutParams(layoutParams2);
            measureChild(tpb0Var3, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), i2);
        }
    }

    public final void setColumn(jqb0 jqb0Var) {
        jqb0Var.getClass();
        List list = jqb0Var.b;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.b;
            if (!zHasNext) {
                if (list.size() < arrayList.size()) {
                    Iterator it2 = arrayList.subList(list.size(), arrayList.size()).iterator();
                    while (it2.hasNext()) {
                        ((tpb0) it2.next()).setVisibility(8);
                    }
                }
                this.c = jqb0Var;
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            iqb0 iqb0Var = (iqb0) next;
            tpb0 tpb0Var = (tpb0) CollectionsKt.W(i, arrayList);
            if (tpb0Var != null) {
                tpb0Var.setVisibility(0);
            } else {
                Context context = getContext();
                context.getClass();
                tpb0Var = new tpb0(context);
                tpb0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                arrayList.add(tpb0Var);
                addView(tpb0Var);
            }
            tpb0Var.setCellItem(iqb0Var);
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerOfPowerColumnView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerOfPowerColumnView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
