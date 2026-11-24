package org.xplatform.cyber.dota.impl.presentation.statistic.skills.view;

import a.c9b;
import a.cww;
import a.f7l;
import a.g7l;
import a.h5l;
import a.hlp0;
import a.l4l;
import a.mal;
import a.mvv;
import a.nal;
import a.q3d;
import a.u9b;
import a.uea0;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DotaSkillsHeroesTableView extends FrameLayout {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46500a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaSkillsHeroesTableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46500a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = context.getResources().getBoolean(R.bool.isTablet);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_50);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_32);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Iterator it = this.f46500a.values().iterator();
        while (it.hasNext()) {
            ((hlp0) it.next()).k(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.values().isEmpty()) {
            return;
        }
        int i6 = this.e;
        int i7 = this.g;
        int i8 = ((i3 - i) - ((i6 * 2) + i7)) - i7;
        Iterator it = this.f46500a.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i5 = this.h;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            int i9 = (iIntValue * i6) + (i5 * iIntValue);
            cww.B(this, 0, i9, i8 - i7, i9 + i6, new h5l((hlp0) entry.getValue(), (byte) 1));
        }
        nal nalVar = (nal) CollectionsKt.V(linkedHashMap.values());
        int i10 = 0;
        int measuredWidth = (getMeasuredWidth() - (nalVar != null ? nalVar.getMeasuredWidth() : 0)) - (i7 * 2);
        int i11 = this.i;
        int i12 = measuredWidth - i11;
        int i13 = 0;
        for (Object obj : linkedHashMap.values()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                q3d.p();
                throw null;
            }
            int i15 = i13 * (i11 + i5);
            cww.z(i12, i15, measuredWidth, i15 + i11, (nal) obj, this);
            i13 = i14;
        }
        int width = getWidth() - i7;
        int i16 = width - i11;
        for (Object obj2 : this.b.values()) {
            int i17 = i10 + 1;
            if (i10 < 0) {
                q3d.p();
                throw null;
            }
            f7l f7lVar = (f7l) obj2;
            int i18 = (i11 + i5) * i10;
            cww.z(i16, i18, width, i18 + i11, f7lVar, this);
            i10 = i17;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        LinkedHashMap linkedHashMap = this.b;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        int i3 = this.f;
        int i4 = this.g;
        boolean z = this.d;
        int i5 = this.e;
        if (!zIsEmpty) {
            if (z) {
                size = View.MeasureSpec.getSize(i) - ((i4 * 2) + (i5 * 2));
            } else {
                size = i3;
            }
            Iterator it = this.f46500a.values().iterator();
            while (it.hasNext()) {
                ((hlp0) it.next()).b(size);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((f7l) it2.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            Iterator it3 = this.c.values().iterator();
            while (it3.hasNext()) {
                ((nal) it3.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
        }
        if (!linkedHashMap.isEmpty() && !z) {
            i = View.MeasureSpec.makeMeasureSpec((i4 * 3) + (i5 * 2) + i3, 1073741824);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(View.MeasureSpec.makeMeasureSpec((linkedHashMap.size() * this.h) + (linkedHashMap.size() * i5), 1073741824)));
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
            LinkedHashMap linkedHashMap = this.f46500a;
            Object uea0Var = linkedHashMap.get(numValueOf);
            if (uea0Var == null) {
                uea0Var = this.d ? new uea0(this) : new mvv(this);
                linkedHashMap.put(numValueOf, uea0Var);
            }
            ((hlp0) uea0Var).c(l4lVar.f19411a, l4lVar.b, l4lVar.c);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.nal, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.cyber.dota.impl.presentation.statistic.skills.view.DotaSkillsHeroesTableView] */
    public final void setHeroesItems(List<g7l> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            g7l g7lVar = (g7l) obj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.b;
            Object obj2 = linkedHashMap.get(numValueOf);
            Object obj3 = obj2;
            if (obj2 == null) {
                Context context = getContext();
                context.getClass();
                f7l f7lVar = new f7l(context);
                addView(f7lVar);
                linkedHashMap.put(numValueOf, f7lVar);
                obj3 = f7lVar;
            }
            f7l f7lVar2 = (f7l) obj3;
            Integer numValueOf2 = Integer.valueOf(i);
            LinkedHashMap linkedHashMap2 = this.c;
            ?? nalVar = linkedHashMap2.get(numValueOf2);
            if (nalVar == 0) {
                Context context2 = getContext();
                context2.getClass();
                nalVar = new nal(context2);
                addView(nalVar);
                linkedHashMap2.put(numValueOf2, nalVar);
            }
            g7lVar.getClass();
            f7lVar2.setImageItem(new u9b(R.drawable.cyber_game_dota_talent_tree_disable, c9b.f3954a));
            ((nal) nalVar).setTitleItem(new mal(g7lVar.f10820a));
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaSkillsHeroesTableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaSkillsHeroesTableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
