package org.xplatform.cyber.dota.impl.presentation.statistic.items.view;

import a.a9b;
import a.cww;
import a.f7l;
import a.h5l;
import a.hlp0;
import a.itt0;
import a.l4l;
import a.mvv;
import a.q3d;
import a.twn;
import a.uea0;
import a.v4l;
import a.x9b;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DotaItemsHeroesTableView extends FrameLayout {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46498a;
    public final LinkedHashMap b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaItemsHeroesTableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46498a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = context.getResources().getBoolean(R.bool.isTablet);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_50);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_4);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((hlp0) it.next()).k(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        DotaItemsHeroesTableView dotaItemsHeroesTableView = this;
        LinkedHashMap linkedHashMap = dotaItemsHeroesTableView.f46498a;
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            itt0.a();
            return;
        }
        int size = ((List) ((Map.Entry) it.next()).getValue()).size();
        while (it.hasNext()) {
            int size2 = ((List) ((Map.Entry) it.next()).getValue()).size();
            if (size < size2) {
                size = size2;
            }
        }
        int i6 = dotaItemsHeroesTableView.d;
        int i7 = dotaItemsHeroesTableView.f;
        int iB = ((i3 - i) - twn.b(size, 1, i7, size * i6)) - i7;
        Iterator it2 = dotaItemsHeroesTableView.b.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            i5 = dotaItemsHeroesTableView.g;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            int i8 = (iIntValue * i6) + (i5 * iIntValue);
            cww.B(dotaItemsHeroesTableView, 0, i8, iB - i7, i8 + i6, new h5l((hlp0) entry.getValue(), (byte) 0));
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int iIntValue2 = ((Number) entry2.getKey()).intValue();
            int i9 = i5 * iIntValue2;
            int i10 = 0;
            int i11 = 0;
            for (Object obj : (List) entry2.getValue()) {
                int i12 = i10 + 1;
                if (i10 < 0) {
                    q3d.p();
                    throw null;
                }
                Pair pair = (Pair) obj;
                int i13 = ((x9b) pair.f46059a).getType() instanceof a9b ? dotaItemsHeroesTableView.e : i6;
                int i14 = (iIntValue2 * i6) + i9;
                int i15 = iB + i11 + (i10 * i7);
                cww.z(i15, i14, i15 + i13, i14 + i6, (View) pair.b, this);
                i11 += i13;
                dotaItemsHeroesTableView = this;
                i10 = i12;
            }
            dotaItemsHeroesTableView = this;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinkedHashMap linkedHashMap = this.f46498a;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        int i3 = this.f;
        boolean z = this.c;
        int i4 = this.e;
        int i5 = this.d;
        if (!zIsEmpty) {
            int size = z ? View.MeasureSpec.getSize(i) - ((i3 * 3) + (i5 * 3)) : i4;
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                ((hlp0) it.next()).b(size);
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                for (Pair pair : (List) it2.next()) {
                    ((f7l) pair.b).measure(View.MeasureSpec.makeMeasureSpec(((x9b) pair.f46059a).getType() instanceof a9b ? i4 : i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                }
            }
        }
        if (!linkedHashMap.isEmpty() && !z) {
            i = View.MeasureSpec.makeMeasureSpec((i3 * 4) + (i5 * 3) + i4, 1073741824);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(View.MeasureSpec.makeMeasureSpec((linkedHashMap.size() * this.g) + (linkedHashMap.size() * i5), 1073741824)));
        setTag("DotaItemsHeroesTable");
    }

    public final void setHeroes(List<l4l> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            l4l l4lVar = (l4l) obj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.b;
            Object uea0Var = linkedHashMap.get(numValueOf);
            if (uea0Var == null) {
                uea0Var = this.c ? new uea0(this) : new mvv(this);
                linkedHashMap.put(numValueOf, uea0Var);
            }
            ((hlp0) uea0Var).c(l4lVar.f19411a, l4lVar.b, l4lVar.c);
            i = i2;
        }
    }

    public final void setHeroesItems(List<v4l> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            v4l v4lVar = (v4l) obj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.f46498a;
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            List list2 = (List) arrayList;
            int i3 = 0;
            for (Object obj2 : v4lVar.f36786a) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                x9b x9bVar = (x9b) obj2;
                Pair pair = (Pair) CollectionsKt.W(i3, list2);
                if (pair == null) {
                    Context context = getContext();
                    context.getClass();
                    f7l f7lVar = new f7l(context);
                    f7lVar.setImageItem(x9bVar);
                    addView(f7lVar);
                    list2.add(new Pair(x9bVar, f7lVar));
                } else {
                    ((f7l) pair.b).setImageItem(x9bVar);
                }
                i3 = i4;
            }
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaItemsHeroesTableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaItemsHeroesTableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
