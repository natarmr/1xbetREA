package org.xplatform.cyber.dota.impl.presentation.common;

import a.cww;
import a.h00;
import a.iun;
import a.j8l;
import a.q3d;
import a.s1g;
import a.y1l;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DotaAdditionalTeamInformationView extends FrameLayout {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f46497a;
    public final s1g b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public List j;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaAdditionalTeamInformationView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        float dimension = getResources().getDimension(R.dimen.corner_radius_8);
        this.f46497a = dimension;
        s1g s1gVar = new s1g(this, R.color.static_black_40);
        s1gVar.c(dimension);
        this.b = s1gVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = getResources().getDimension(R.dimen.space_8);
        this.f = getResources().getDimension(R.dimen.space_6);
        this.g = getResources().getDimension(R.dimen.space_4);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.space_12);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_24);
        this.j = iun.f15405a;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.b.a(canvas);
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((s1g) it.next()).a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        DotaAdditionalTeamInformationView dotaAdditionalTeamInformationView = this;
        int i6 = i4 - i2;
        int i7 = i3 - i;
        int i8 = 0;
        dotaAdditionalTeamInformationView.b.b(0, 0, i7, i6);
        LinkedHashMap linkedHashMap = dotaAdditionalTeamInformationView.c;
        Iterator it = linkedHashMap.values().iterator();
        int measuredWidth = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i5 = dotaAdditionalTeamInformationView.h;
            if (!zHasNext) {
                break;
            } else {
                measuredWidth += ((j8l) it.next()).getMeasuredWidth() + i5;
            }
        }
        float f = measuredWidth;
        float size = linkedHashMap.size() - 1;
        float f2 = dotaAdditionalTeamInformationView.e;
        float f3 = (i7 - ((size * f2) + f)) / 2.0f;
        int measuredWidth2 = 0;
        for (Object obj : linkedHashMap.values()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                q3d.p();
                throw null;
            }
            j8l j8lVar = (j8l) obj;
            s1g s1gVar = (s1g) dotaAdditionalTeamInformationView.d.get(Integer.valueOf(i8));
            float f4 = (i8 * f2) + f3 + measuredWidth2;
            int i10 = (int) dotaAdditionalTeamInformationView.g;
            int measuredWidth3 = (int) (f4 + j8lVar.getMeasuredWidth() + i5);
            int i11 = i10 + dotaAdditionalTeamInformationView.i;
            y1l y1lVar = new y1l(s1gVar, i6, j8lVar, this, (byte) 0);
            int i12 = i7;
            cww.C(this, i12, (int) f4, i10, measuredWidth3, i11, y1lVar);
            measuredWidth2 += j8lVar.getMeasuredWidth() + i5;
            dotaAdditionalTeamInformationView = this;
            i7 = i12;
            i8 = i9;
            i6 = i6;
        }
    }

    public final void setItemParams(List<h00> list) {
        int size;
        int i;
        list.getClass();
        int size2 = list.size() - 1;
        int i2 = q3d.i(this.j);
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.c;
        if (size2 < i2 && (size = list.size() - 1) <= (i = q3d.i(this.j))) {
            while (true) {
                j8l j8lVar = (j8l) linkedHashMap2.get(Integer.valueOf(size));
                if (j8lVar != null) {
                    removeView(j8lVar);
                    linkedHashMap2.remove(Integer.valueOf(size));
                }
                linkedHashMap.remove(Integer.valueOf(size));
                if (size == i) {
                    break;
                } else {
                    size++;
                }
            }
        }
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            h00 h00Var = (h00) obj;
            Integer numValueOf = Integer.valueOf(i3);
            Object obj2 = linkedHashMap2.get(numValueOf);
            Object obj3 = obj2;
            if (obj2 == null) {
                Context context = getContext();
                context.getClass();
                j8l j8lVar2 = new j8l(context, false);
                addView(j8lVar2, new FrameLayout.LayoutParams(-2, -2));
                linkedHashMap2.put(numValueOf, j8lVar2);
                obj3 = j8lVar2;
            }
            j8l j8lVar3 = (j8l) obj3;
            Integer numValueOf2 = Integer.valueOf(i3);
            if (linkedHashMap.get(numValueOf2) == null) {
                s1g s1gVar = new s1g(this, R.color.dota_statistic_bg);
                s1gVar.c(this.f46497a);
                linkedHashMap.put(numValueOf2, s1gVar);
            }
            j8lVar3.setVisibility(0);
            int i5 = h00Var.f12208a;
            String str = h00Var.b;
            int i6 = j8lVar3.j;
            j8lVar3.setTextSize(0, j8lVar3.i);
            j8lVar3.j(i5, i6);
            j8lVar3.setText(str);
            i3 = i4;
        }
        if (this.j.size() != list.size()) {
            requestLayout();
        }
        this.j = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaAdditionalTeamInformationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaAdditionalTeamInformationView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
