package org.xplatform.cyber.dota.impl.presentation.statistic.items.view;

import a.cww;
import a.f7l;
import a.itt0;
import a.k5l;
import a.q3d;
import a.x9b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DotaItemsTableView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46499a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaItemsTableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46499a = new LinkedHashMap();
        this.b = getResources().getDimensionPixelSize(R.dimen.size_42);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (Map.Entry entry : this.f46499a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            int i5 = this.e * iIntValue;
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    q3d.p();
                    throw null;
                }
                f7l f7lVar = (f7l) obj;
                int i8 = this.d * i6;
                int i9 = this.b;
                int i10 = i6 * i9;
                int i11 = this.c;
                int i12 = iIntValue * i11;
                cww.z(i10 + i8, i12 + i5, i10 + i9 + i8, i12 + i11 + i5, f7lVar, this);
                i6 = i7;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinkedHashMap linkedHashMap = this.f46499a;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.values().iterator();
            if (!it.hasNext()) {
                itt0.a();
                return;
            }
            int size = ((List) it.next()).size();
            while (it.hasNext()) {
                int size2 = ((List) it.next()).size();
                if (size < size2) {
                    size = size2;
                }
            }
            int i3 = this.d;
            int i4 = size > 0 ? (size - 1) * i3 : 0;
            int i5 = this.b;
            setMinimumWidth((i3 * 5) + (i5 * 6));
            i = View.MeasureSpec.makeMeasureSpec((size * i5) + i4, 1073741824);
        }
        super.onMeasure(i, i2);
        setTag("DotaItemsTable");
    }

    public final void setItems(List<k5l> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            k5l k5lVar = (k5l) obj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.f46499a;
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            List list2 = (List) arrayList;
            int i3 = 0;
            for (Object obj2 : k5lVar.f17725a) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                x9b x9bVar = (x9b) obj2;
                f7l f7lVar = (f7l) CollectionsKt.W(i3, list2);
                if (f7lVar == null) {
                    Context context = getContext();
                    context.getClass();
                    f7l f7lVar2 = new f7l(context);
                    f7lVar2.setImageItem(x9bVar);
                    addView(f7lVar2);
                    list2.add(i3, f7lVar2);
                } else {
                    f7lVar.setImageItem(x9bVar);
                }
                i3 = i4;
            }
            int size = k5lVar.f17725a.size();
            int i5 = 0;
            for (Object obj3 : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                ((f7l) obj3).setVisibility(i5 < size ? 0 : 8);
                i5 = i6;
            }
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaItemsTableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaItemsTableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
