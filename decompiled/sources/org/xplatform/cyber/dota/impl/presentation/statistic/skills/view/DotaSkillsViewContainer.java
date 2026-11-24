package org.xplatform.cyber.dota.impl.presentation.statistic.skills.view;

import a.amw;
import a.itt0;
import a.n4l;
import a.o6l;
import a.q3d;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DotaSkillsViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46501a;
    public final int b;
    public amw c;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaSkillsViewContainer(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46501a = new LinkedHashMap();
        this.b = getResources().getDimensionPixelSize(R.dimen.space_4);
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = 0;
        for (Object obj : this.f46501a.values()) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                q3d.p();
                throw null;
            }
            o6l o6lVar = (o6l) obj;
            int measuredHeight = (this.b * i6) + (o6lVar.getMeasuredHeight() * i6);
            o6lVar.layout(0, measuredHeight, i5, o6lVar.getMeasuredHeight() + measuredHeight);
            i6 = i7;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinkedHashMap linkedHashMap = this.f46501a;
        if (linkedHashMap.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((o6l) it.next()).measure(i, i2);
        }
        Iterator it2 = linkedHashMap.values().iterator();
        if (!it2.hasNext()) {
            itt0.a();
            return;
        }
        int measuredWidth = ((o6l) it2.next()).getMeasuredWidth();
        while (it2.hasNext()) {
            int measuredWidth2 = ((o6l) it2.next()).getMeasuredWidth();
            if (measuredWidth < measuredWidth2) {
                measuredWidth = measuredWidth2;
            }
        }
        Iterator it3 = linkedHashMap.values().iterator();
        int measuredHeight = 0;
        while (it3.hasNext()) {
            measuredHeight += ((o6l) it3.next()).getMeasuredHeight();
        }
        int size = ((linkedHashMap.size() - 1) * this.b) + measuredHeight;
        Iterator it4 = linkedHashMap.values().iterator();
        if (!it4.hasNext()) {
            itt0.a();
            return;
        }
        int minimumWidth = ((o6l) it4.next()).getMinimumWidth();
        while (it4.hasNext()) {
            int minimumWidth2 = ((o6l) it4.next()).getMinimumWidth();
            if (minimumWidth < minimumWidth2) {
                minimumWidth = minimumWidth2;
            }
        }
        setMinimumWidth(minimumWidth);
        setMeasuredDimension(measuredWidth, size);
    }

    public final void setScrollViewKeeper(amw amwVar) {
        amwVar.getClass();
        this.c = amwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.o6l, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.cyber.dota.impl.presentation.statistic.skills.view.DotaSkillsViewContainer] */
    public final void setSkills(List<? extends List<n4l>> list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            List<n4l> list2 = (List) obj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.f46501a;
            ?? o6lVar = linkedHashMap.get(numValueOf);
            if (o6lVar == 0) {
                Context context = getContext();
                context.getClass();
                o6lVar = new o6l(context);
                addView(o6lVar, new FrameLayout.LayoutParams(-1, -2));
                linkedHashMap.put(numValueOf, o6lVar);
            }
            ((o6l) o6lVar).setSkills(list2);
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaSkillsViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaSkillsViewContainer(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
