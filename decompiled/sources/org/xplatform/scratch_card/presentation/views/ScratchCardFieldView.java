package org.xplatform.scratch_card.presentation.views;

import a.a7h0;
import a.bkx;
import a.kkx;
import a.l1e0;
import a.q3d;
import a.t9f;
import a.y6h0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class ScratchCardFieldView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46910a;
    public int b;
    public final ArrayList c;
    public final ImageView d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ScratchCardFieldView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.c = new ArrayList();
        this.d = new ImageView(context);
    }

    public final void a(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = 0;
            int iOrdinal = ((a7h0) it.next()).ordinal();
            ArrayList arrayList = this.c;
            switch (iOrdinal) {
                case 0:
                    Iterator it2 = CollectionsKt.y0(arrayList, new IntRange(0, 2, 1)).iterator();
                    while (it2.hasNext()) {
                        ((y6h0) it2.next()).a(true);
                    }
                    break;
                case 1:
                    Iterator it3 = CollectionsKt.y0(arrayList, new IntRange(3, 5, 1)).iterator();
                    while (it3.hasNext()) {
                        ((y6h0) it3.next()).a(true);
                    }
                    break;
                case 2:
                    Iterator it4 = CollectionsKt.y0(arrayList, new IntRange(6, 8, 1)).iterator();
                    while (it4.hasNext()) {
                        ((y6h0) it4.next()).a(true);
                    }
                    break;
                case 3:
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        if (q3d.j(0, 3, 6).contains(Integer.valueOf(i))) {
                            arrayList2.add(obj);
                        }
                        i = i2;
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((y6h0) it5.next()).a(true);
                    }
                    break;
                case 4:
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        int i3 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        if (q3d.j(1, 4, 7).contains(Integer.valueOf(i))) {
                            arrayList3.add(obj2);
                        }
                        i = i3;
                    }
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        ((y6h0) it6.next()).a(true);
                    }
                    break;
                case 5:
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        int i4 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        if (q3d.j(2, 5, 8).contains(Integer.valueOf(i))) {
                            arrayList4.add(obj3);
                        }
                        i = i4;
                    }
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        ((y6h0) it7.next()).a(true);
                    }
                    break;
                case 6:
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        int i5 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        if (q3d.j(0, 4, 8).contains(Integer.valueOf(i))) {
                            arrayList5.add(obj4);
                        }
                        i = i5;
                    }
                    Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        ((y6h0) it8.next()).a(true);
                    }
                    break;
                case 7:
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        int i6 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        if (q3d.j(2, 4, 6).contains(Integer.valueOf(i))) {
                            arrayList6.add(obj5);
                        }
                        i = i6;
                    }
                    Iterator it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        ((y6h0) it9.next()).a(true);
                    }
                    break;
                default:
                    t9f.b();
                    return;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = (getMeasuredWidth() - this.b) / 2;
        int measuredHeight = getMeasuredHeight();
        int i5 = this.b;
        int i6 = (measuredHeight - i5) / 2;
        this.d.layout(measuredWidth, i6, measuredWidth + i5, i5 + i6);
        Iterator it = l1e0.o(0, 3).iterator();
        int i7 = 0;
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            Iterator it2 = l1e0.o(0, 3).iterator();
            int i8 = measuredWidth;
            while (((kkx) it2).c) {
                ((bkx) it2).nextInt();
                y6h0 y6h0Var = (y6h0) this.c.get(i7);
                int i9 = this.f46910a;
                y6h0Var.layout(i8, i6, i8 + i9, i9 + i6);
                i8 += this.f46910a;
                i7++;
            }
            i6 += this.f46910a;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredWidth() > getMeasuredHeight() ? getMeasuredHeight() : getMeasuredWidth();
        this.b = measuredHeight;
        int i3 = measuredHeight / 3;
        this.f46910a = i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.b, 1073741824);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((y6h0) it.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        this.d.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchCardFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchCardFieldView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
