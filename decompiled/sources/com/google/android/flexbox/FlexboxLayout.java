package com.google.android.flexbox;

import a.ekq;
import a.gkq;
import a.hny;
import a.jf4;
import a.qpd0;
import a.rgu0;
import a.twn;
import a.tyj;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements ekq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45459a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;
    public Drawable h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int[] m;
    public SparseIntArray n;
    public final b o;
    public List p;
    public final tyj q;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45460a;
        public float b;
        public float c;
        public int d;
        public float e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.f45460a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.g = -1;
            this.h = 16777215;
            this.i = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void C0(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int D0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int E0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int H() {
            return this.d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float J() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int R0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int S() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int S0() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void U(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int U0() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float V() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Z() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean e0() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f45460a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k0() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f45460a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = -1;
        this.o = new b(this);
        this.p = new ArrayList();
        this.q = new tyj();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qpd0.f29112a, 0, 0);
        this.f45459a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.j = i;
            this.i = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.j = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.i = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.p.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        n(canvas, z ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l, aVar.b, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.j & 4) > 0) {
                        n(canvas, z ? (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l : viewO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.b, aVar.g);
                    }
                }
            }
            if (q(i)) {
                m(canvas, paddingLeft, z2 ? aVar.d : aVar.b - this.k, iMax);
            }
            if (r(i) && (this.i & 4) > 0) {
                m(canvas, paddingLeft, z2 ? aVar.b - this.k : aVar.d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        b bVar = this.o;
        ekq ekqVar = bVar.f45463a;
        int flexItemCount = ekqVar.getFlexItemCount();
        ArrayList arrayListF = bVar.f(flexItemCount);
        gkq gkqVar = new gkq();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            gkqVar.b = 1;
        } else {
            gkqVar.b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= ekqVar.getFlexItemCount()) {
            gkqVar.f11456a = flexItemCount;
        } else {
            gkqVar.f11456a = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((gkq) arrayListF.get(i2)).f11456a++;
            }
        }
        arrayListF.add(gkqVar);
        this.m = b.r(flexItemCount + 1, arrayListF, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // a.ekq
    public final void b(View view, int i, int i2, a aVar) {
        if (p(i, i2)) {
            boolean zK = k();
            int i3 = aVar.e;
            if (zK) {
                int i4 = this.l;
                aVar.e = i3 + i4;
                aVar.f += i4;
            } else {
                int i5 = this.k;
                aVar.e = i3 + i5;
                aVar.f += i5;
            }
        }
    }

    @Override // a.ekq
    public final int c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // a.ekq
    public final View d(int i) {
        return getChildAt(i);
    }

    @Override // a.ekq
    public final int e(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // a.ekq
    public final int g(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f45460a = 1;
            layoutParams3.b = 0.0f;
            layoutParams3.c = 1.0f;
            layoutParams3.d = -1;
            layoutParams3.e = -1.0f;
            layoutParams3.f = -1;
            layoutParams3.g = -1;
            layoutParams3.h = 16777215;
            layoutParams3.i = 16777215;
            layoutParams3.f45460a = layoutParams2.f45460a;
            layoutParams3.b = layoutParams2.b;
            layoutParams3.c = layoutParams2.c;
            layoutParams3.d = layoutParams2.d;
            layoutParams3.e = layoutParams2.e;
            layoutParams3.f = layoutParams2.f;
            layoutParams3.g = layoutParams2.g;
            layoutParams3.h = layoutParams2.h;
            layoutParams3.i = layoutParams2.i;
            layoutParams3.j = layoutParams2.j;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f45460a = 1;
            layoutParams4.b = 0.0f;
            layoutParams4.c = 1.0f;
            layoutParams4.d = -1;
            layoutParams4.e = -1.0f;
            layoutParams4.f = -1;
            layoutParams4.g = -1;
            layoutParams4.h = 16777215;
            layoutParams4.i = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f45460a = 1;
        layoutParams5.b = 0.0f;
        layoutParams5.c = 1.0f;
        layoutParams5.d = -1;
        layoutParams5.e = -1.0f;
        layoutParams5.f = -1;
        layoutParams5.g = -1;
        layoutParams5.h = 16777215;
        layoutParams5.i = 16777215;
        return layoutParams5;
    }

    @Override // a.ekq
    public int getAlignContent() {
        return this.e;
    }

    @Override // a.ekq
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // a.ekq
    public int getFlexDirection() {
        return this.f45459a;
    }

    @Override // a.ekq
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.p.size());
        for (a aVar : this.p) {
            if (aVar.a() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // a.ekq
    public List<a> getFlexLinesInternal() {
        return this.p;
    }

    @Override // a.ekq
    public int getFlexWrap() {
        return this.b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // a.ekq
    public int getLargestMainSize() {
        Iterator it = this.p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((a) it.next()).e);
        }
        return iMax;
    }

    @Override // a.ekq
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.j;
    }

    @Override // a.ekq
    public int getSumOfCrossSize() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) this.p.get(i2);
            if (q(i2)) {
                i += k() ? this.k : this.l;
            }
            if (r(i2)) {
                i += k() ? this.k : this.l;
            }
            i += aVar.g;
        }
        return i;
    }

    @Override // a.ekq
    public final void h(a aVar) {
        if (k()) {
            if ((this.j & 4) > 0) {
                int i = aVar.e;
                int i2 = this.l;
                aVar.e = i + i2;
                aVar.f += i2;
                return;
            }
            return;
        }
        if ((this.i & 4) > 0) {
            int i3 = aVar.e;
            int i4 = this.k;
            aVar.e = i3 + i4;
            aVar.f += i4;
        }
    }

    @Override // a.ekq
    public final View i(int i) {
        return o(i);
    }

    @Override // a.ekq
    public final int j(View view, int i, int i2) {
        int i3;
        int i4;
        if (k()) {
            i3 = p(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = p(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // a.ekq
    public final boolean k() {
        int i = this.f45459a;
        return i == 0 || i == 1;
    }

    public final void l(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.p.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        m(canvas, aVar.f45462a, z2 ? viewO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.i & 4) > 0) {
                        m(canvas, aVar.f45462a, z2 ? (viewO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k : viewO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, aVar.g);
                    }
                }
            }
            if (q(i)) {
                n(canvas, z ? aVar.c : aVar.f45462a - this.l, paddingTop, iMax);
            }
            if (r(i) && (this.j & 4) > 0) {
                n(canvas, z ? aVar.f45462a - this.l : aVar.c, paddingTop, iMax);
            }
        }
    }

    public final void m(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    public final View o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        int layoutDirection = getLayoutDirection();
        int i = this.f45459a;
        if (i == 0) {
            a(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            a(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.b == 2) {
                z = !z;
            }
            l(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        l(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap weakHashMap = rgu0.f30456a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.f45459a;
        if (i5 == 0) {
            s(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            s(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            if (this.b == 2) {
                z2 = !z2;
            }
            t(i, i2, i3, i4, z2, false);
            return;
        }
        if (i5 != 3) {
            hny.s(this.f45459a, "Invalid flex direction is set: ");
            return;
        }
        z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        t(i, i2, i3, i4, z2, true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        b bVar = this.o;
        ekq ekqVar = bVar.f45463a;
        int flexItemCount = ekqVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.n;
            int flexItemCount2 = bVar.f45463a.getFlexItemCount();
            this.m = b.r(flexItemCount2, bVar.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewD = ekqVar.d(i3);
            if (viewD != null && ((FlexItem) viewD.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.n;
                int flexItemCount3 = bVar.f45463a.getFlexItemCount();
                this.m = b.r(flexItemCount3, bVar.f(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.f45459a;
        tyj tyjVar = this.q;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                hny.s(this.f45459a, "Invalid value for the flex direction is set: ");
                return;
            }
            this.p.clear();
            tyjVar.f34759a = null;
            tyjVar.b = 0;
            this.o.b(this.q, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.p = tyjVar.f34759a;
            bVar.h(i, i2, 0);
            bVar.g(i, i2, getPaddingRight() + getPaddingLeft());
            bVar.u(0);
            u(this.f45459a, i, i2, tyjVar.b);
            return;
        }
        this.p.clear();
        tyjVar.f34759a = null;
        tyjVar.b = 0;
        this.o.b(this.q, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.p = tyjVar.f34759a;
        bVar.h(i, i2, 0);
        if (this.d == 3) {
            for (a aVar : this.p) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < aVar.h; i5++) {
                    View viewO = o(aVar.o + i5);
                    if (viewO != null && viewO.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                        int i6 = this.b;
                        int i7 = aVar.l;
                        iMax = i6 != 2 ? Math.max(iMax, viewO.getMeasuredHeight() + Math.max(i7 - viewO.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewO.getBaseline() + (i7 - viewO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                aVar.g = iMax;
            }
        }
        bVar.g(i, i2, getPaddingBottom() + getPaddingTop());
        bVar.u(0);
        u(this.f45459a, i, i2, tyjVar.b);
    }

    public final boolean p(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewO = o(i - i3);
            if (viewO != null && viewO.getVisibility() != 8) {
                if (k()) {
                    return (this.j & 2) != 0;
                }
                return (this.i & 2) != 0;
            }
        }
        if (k()) {
            return (this.j & 1) != 0;
        }
        return (this.i & 1) != 0;
    }

    public final boolean q(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((a) this.p.get(i2)).a() > 0) {
                    if (k()) {
                        return (this.i & 2) != 0;
                    }
                    return (this.j & 2) != 0;
                }
            }
            if (k()) {
                return (this.i & 1) != 0;
            }
            if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (int i2 = i + 1; i2 < this.p.size(); i2++) {
                if (((a) this.p.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (k()) {
                return (this.i & 4) != 0;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewO;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        b bVar;
        a aVar;
        b bVar2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.p.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar2 = (a) this.p.get(i12);
            if (q(i12)) {
                int i13 = this.k;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.c;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = aVar2.e;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = aVar2.a();
                    f2 = (i11 - aVar2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iA2 = aVar2.a();
                    float f6 = iA2 != 0 ? (i11 - aVar2.e) / iA2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        hny.s(this.c, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = aVar2.a();
                    f2 = iA3 != 0 ? (i11 - aVar2.e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < aVar2.h) {
                    i6 = aVar2.o + i5;
                    viewO = o(i6);
                    char c2 = c;
                    if (viewO != null) {
                        z2 = z3;
                        if (viewO.getVisibility() == 8) {
                            z2 = z2;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (p(i6, i5)) {
                                int i18 = this.l;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == aVar2.h - 1 || (this.j & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.l;
                            }
                            if (this.b == i16) {
                                i8 = i16;
                                bVar2 = this.o;
                                if (z) {
                                    view = viewO;
                                    bVar2.o(view, aVar2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewO;
                                    bVar2.o(view, aVar2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i7 = i14;
                            } else {
                                i5 = i5;
                                view = viewO;
                                z2 = z2;
                                i8 = i16;
                                i7 = i14;
                                bVar = this.o;
                                if (z) {
                                    bVar.o(view, aVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    bVar.o(view, aVar2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                aVar = aVar2;
                                aVar.b(view, i10, 0, i9, 0);
                            } else {
                                aVar = aVar2;
                                aVar.b(view, i9, 0, i10, 0);
                            }
                            aVar2 = aVar;
                            f = measuredWidth2;
                        }
                        i5++;
                        c = c2;
                        i16 = i8;
                        z3 = z2;
                        i14 = i7;
                    } else {
                        z2 = z3;
                    }
                    i8 = i16;
                    i5 = i5;
                    i7 = i14;
                    i5++;
                    c = c2;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                }
                int i20 = aVar2.g;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = aVar2.e;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < aVar2.h) {
                i6 = aVar2.o + i5;
                viewO = o(i6);
                char c3 = c;
                if (viewO != null) {
                    z2 = z3;
                    if (viewO.getVisibility() == 8) {
                        z2 = z2;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewO.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (p(i6, i5)) {
                            int i110 = this.l;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == aVar2.h - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.b == i16) {
                            i8 = i16;
                            bVar2 = this.o;
                            if (z) {
                                view = viewO;
                                bVar2.o(view, aVar2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewO;
                                bVar2.o(view, aVar2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i7 = i14;
                        } else {
                            i5 = i5;
                            view = viewO;
                            z2 = z2;
                            i8 = i16;
                            i7 = i14;
                            bVar = this.o;
                            if (z) {
                                bVar.o(view, aVar2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                bVar.o(view, aVar2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            aVar = aVar2;
                            aVar.b(view, i10, 0, i9, 0);
                        } else {
                            aVar = aVar2;
                            aVar.b(view, i9, 0, i10, 0);
                        }
                        aVar2 = aVar;
                        f = measuredWidth3;
                    }
                    i5++;
                    c = c3;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                } else {
                    z2 = z3;
                }
                i8 = i16;
                i5 = i5;
                i7 = i14;
                i5++;
                c = c3;
                i16 = i8;
                z3 = z2;
                i14 = i7;
            }
            int i22 = aVar2.g;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        if (drawable != null) {
            this.k = drawable.getIntrinsicHeight();
        } else {
            this.k = 0;
        }
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f45459a != i) {
            this.f45459a = i;
            requestLayout();
        }
    }

    @Override // a.ekq
    public void setFlexLines(List<a> list) {
        this.p = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    public final void t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewO;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        b bVar;
        a aVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.p.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar2 = (a) this.p.get(i14);
            if (q(i14)) {
                int i15 = this.l;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.c;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 != 1) {
                if (i17 == 2) {
                    float f6 = (i12 - aVar2.e) / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iA = aVar2.a();
                    f2 = (i12 - aVar2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iA2 = aVar2.a();
                    f2 = iA2 != 0 ? (i12 - aVar2.e) / iA2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredHeight = paddingTop + f7;
                    f = (i12 - paddingBottom) - f7;
                } else {
                    if (i17 != 5) {
                        hny.s(this.c, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = aVar2.a();
                    f2 = iA3 != 0 ? (i12 - aVar2.e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < aVar2.h) {
                    i6 = aVar2.o + i5;
                    i7 = i18;
                    viewO = o(i6);
                    if (viewO != null) {
                        c = c2;
                        if (viewO.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (p(i6, i5)) {
                                i10 = this.k;
                                float f8 = i10;
                                f3 += f8;
                                f4 -= f8;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == aVar2.h - i7 || (this.i & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.k;
                            }
                            i9 = i5;
                            bVar = this.o;
                            if (z) {
                                if (z2) {
                                    bVar.p(viewO, aVar2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    bVar.p(viewO, aVar2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                                }
                                i8 = i16;
                            } else {
                                i9 = i9;
                                i7 = i7;
                                i8 = i16;
                                if (z2) {
                                    bVar.p(viewO, aVar2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i19 = paddingLeft;
                                    bVar.p(viewO, aVar2, false, i19, Math.round(f3), viewO.getMeasuredWidth() + i19, viewO.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i19;
                                }
                            }
                            measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                aVar = aVar2;
                                aVar.b(viewO, 0, i11, 0, i10);
                            } else {
                                aVar = aVar2;
                                aVar.b(viewO, 0, i10, 0, i11);
                            }
                            aVar2 = aVar;
                            f = measuredHeight2;
                        }
                        i5 = i9 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i8;
                    } else {
                        c = c2;
                    }
                    i9 = i5;
                    i7 = i7;
                    i8 = i16;
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                }
                int i20 = aVar2.g;
                paddingLeft += i20;
                i13 = i16 - i20;
            } else {
                int i21 = aVar2.e;
                f = i21 - paddingTop;
                measuredHeight = (i12 - i21) + paddingBottom;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < aVar2.h) {
                i6 = aVar2.o + i5;
                i7 = i18;
                viewO = o(i6);
                if (viewO != null) {
                    c = c2;
                    if (viewO.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) viewO.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (p(i6, i5)) {
                            i10 = this.k;
                            float f9 = i10;
                            f3 += f9;
                            f4 -= f9;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == aVar2.h - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        i9 = i5;
                        bVar = this.o;
                        if (z) {
                            if (z2) {
                                bVar.p(viewO, aVar2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                bVar.p(viewO, aVar2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                            }
                            i8 = i16;
                        } else {
                            i9 = i9;
                            i7 = i7;
                            i8 = i16;
                            if (z2) {
                                bVar.p(viewO, aVar2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i110 = paddingLeft;
                                bVar.p(viewO, aVar2, false, i110, Math.round(f3), viewO.getMeasuredWidth() + i110, viewO.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i110;
                            }
                        }
                        measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z2) {
                            aVar = aVar2;
                            aVar.b(viewO, 0, i11, 0, i10);
                        } else {
                            aVar = aVar2;
                            aVar.b(viewO, 0, i10, 0, i11);
                        }
                        aVar2 = aVar;
                        f = measuredHeight3;
                    }
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                } else {
                    c = c2;
                }
                i9 = i5;
                i7 = i7;
                i8 = i16;
                i5 = i9 + 1;
                c2 = c;
                i18 = i7;
                i16 = i8;
            }
            int i22 = aVar2.g;
            paddingLeft += i22;
            i13 = i16 - i22;
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                jf4.o(twn.m(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            jf4.n(twn.m(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            jf4.n(twn.m(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // a.ekq
    public final void f(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f45460a = 1;
        layoutParams.b = 0.0f;
        layoutParams.c = 1.0f;
        layoutParams.d = -1;
        layoutParams.e = -1.0f;
        layoutParams.f = -1;
        layoutParams.g = -1;
        layoutParams.h = 16777215;
        layoutParams.i = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qpd0.b);
        layoutParams.f45460a = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.b = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.d = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
