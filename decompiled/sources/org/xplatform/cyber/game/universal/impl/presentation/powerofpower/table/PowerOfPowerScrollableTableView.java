package org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table;

import a.cww;
import a.jqb0;
import a.q3d;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PowerOfPowerScrollableTableView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46534a;
    public final LinkedHashMap b;
    public List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public PowerOfPowerScrollableTableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46534a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = new LinkedHashMap();
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int measuredWidth = 0;
        for (Object obj : this.b.values()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            PowerOfPowerColumnView powerOfPowerColumnView = (PowerOfPowerColumnView) obj;
            PowerOfPowerScrollableTableView powerOfPowerScrollableTableView = this;
            cww.z(measuredWidth, 0, powerOfPowerColumnView.getMeasuredWidth() + measuredWidth, powerOfPowerColumnView.getMeasuredHeight(), powerOfPowerColumnView, powerOfPowerScrollableTableView);
            measuredWidth += powerOfPowerColumnView.getMeasuredWidth() + powerOfPowerScrollableTableView.f46534a;
            i5 = i6;
            this = powerOfPowerScrollableTableView;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num;
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((PowerOfPowerColumnView) it.next()).measure(i, i2);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((PowerOfPowerColumnView) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int measuredWidth = 0;
        while (it2.hasNext()) {
            measuredWidth += ((PowerOfPowerColumnView) it2.next()).getMeasuredWidth();
        }
        int size = ((arrayList.size() - 1) * this.f46534a) + measuredWidth;
        if (size < getMinimumWidth()) {
            size = getMinimumWidth();
        }
        int paddingEnd = getPaddingEnd() + size;
        Iterator it3 = linkedHashMap.values().iterator();
        if (it3.hasNext()) {
            Integer numValueOf = Integer.valueOf(((PowerOfPowerColumnView) it3.next()).getMeasuredHeight());
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((PowerOfPowerColumnView) it3.next()).getMeasuredHeight());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        setMeasuredDimension(paddingEnd, num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, java.lang.Object, org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table.PowerOfPowerColumnView] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table.PowerOfPowerScrollableTableView] */
    public final void setColumns(List<jqb0> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            jqb0 jqb0Var = (jqb0) obj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.b;
            ?? powerOfPowerColumnView = linkedHashMap.get(numValueOf);
            if (powerOfPowerColumnView == 0) {
                Context context = getContext();
                context.getClass();
                powerOfPowerColumnView = new PowerOfPowerColumnView(context, null, 6);
                addView(powerOfPowerColumnView);
                linkedHashMap.put(numValueOf, powerOfPowerColumnView);
            }
            ((PowerOfPowerColumnView) powerOfPowerColumnView).setColumn(jqb0Var);
            i = i2;
        }
        this.c = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerOfPowerScrollableTableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerOfPowerScrollableTableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
