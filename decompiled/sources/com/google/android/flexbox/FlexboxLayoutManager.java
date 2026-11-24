package com.google.android.flexbox;

import a.brm0;
import a.ekq;
import a.ghe0;
import a.hhe0;
import a.hkq;
import a.ikq;
import a.l900;
import a.msj;
import a.oa80;
import a.pa80;
import a.rhe0;
import a.the0;
import a.tyj;
import a.yge0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends androidx.recyclerview.widget.b implements ekq, rhe0 {
    public static final Rect o1 = new Rect();
    public final hkq A;
    public pa80 B;
    public pa80 Y;
    public SavedState Z;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public final SparseArray j1;
    public final Context k1;
    public View l1;
    public int m1;
    public final tyj n1;
    public byte p;
    public final boolean q;
    public final byte r;
    public boolean t;
    public boolean u;
    public msj x;
    public the0 y;
    public ikq z;
    public final int s = -1;
    public List v = new ArrayList();
    public final b w = new b(this);

    public static class LayoutParams extends hhe0 implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new d();
        public float e;
        public float f;
        public int g;
        public float h;
        public int i;
        public int j;
        public int k;
        public int l;
        public boolean m;

        @Override // com.google.android.flexbox.FlexItem
        public final void C0(int i) {
            this.i = i;
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
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float J() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L() {
            return this.i;
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
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void U(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int U0() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float V() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Z() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean e0() {
            return this.m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k0() {
            return this.k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45461a;
        public int b;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f45461a);
            sb.append(", mAnchorOffset=");
            return brm0.n(sb, this.b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f45461a);
            parcel.writeInt(this.b);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        hkq hkqVar = new hkq(this);
        this.A = hkqVar;
        this.f1 = -1;
        this.g1 = Integer.MIN_VALUE;
        this.h1 = Integer.MIN_VALUE;
        this.i1 = Integer.MIN_VALUE;
        this.j1 = new SparseArray();
        this.m1 = -1;
        this.n1 = new tyj();
        ghe0 ghe0VarU = androidx.recyclerview.widget.b.U(context, attributeSet, i, i2);
        int i3 = ghe0VarU.f11294a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (ghe0VarU.c) {
                    k1(3);
                } else {
                    k1(2);
                }
            }
        } else if (ghe0VarU.c) {
            k1(1);
        } else {
            k1(0);
        }
        boolean z = this.q;
        if (!z) {
            if (!z) {
                z0();
                this.v.clear();
                hkqVar.b();
                hkqVar.d = 0;
            }
            this.q = true;
            this.B = null;
            this.Y = null;
            F0();
        }
        if (this.r != 4) {
            z0();
            this.v.clear();
            hkqVar.b();
            hkqVar.d = 0;
            this.r = (byte) 4;
            F0();
        }
        this.k1 = context;
    }

    public static boolean Z(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.b
    public final int A(the0 the0Var) {
        return V0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int B(the0 the0Var) {
        return W0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 E() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.e = 0.0f;
        layoutParams.f = 1.0f;
        layoutParams.g = -1;
        layoutParams.h = -1.0f;
        layoutParams.k = 16777215;
        layoutParams.l = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 F(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.e = 0.0f;
        layoutParams.f = 1.0f;
        layoutParams.g = -1;
        layoutParams.h = -1.0f;
        layoutParams.k = 16777215;
        layoutParams.l = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.b
    public final int G0(int i, msj msjVar, the0 the0Var) {
        if (!k() || !this.q) {
            int iH1 = h1(i, msjVar, the0Var);
            this.j1.clear();
            return iH1;
        }
        int iI1 = i1(i);
        this.A.d += iI1;
        this.Y.r(-iI1);
        return iI1;
    }

    @Override // androidx.recyclerview.widget.b
    public final void H0(int i) {
        this.f1 = i;
        this.g1 = Integer.MIN_VALUE;
        SavedState savedState = this.Z;
        if (savedState != null) {
            savedState.f45461a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.b
    public final int I0(int i, msj msjVar, the0 the0Var) {
        if (k() || !(this.q || k())) {
            int iH1 = h1(i, msjVar, the0Var);
            this.j1.clear();
            return iH1;
        }
        int iI1 = i1(i);
        this.A.d += iI1;
        this.Y.r(-iI1);
        return iI1;
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        l900 l900Var = new l900(recyclerView.getContext());
        l900Var.f32207a = i;
        S0(l900Var);
    }

    public final int U0(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        int iB = the0Var.b();
        X0();
        View viewZ0 = Z0(iB);
        View viewB1 = b1(iB);
        if (the0Var.b() == 0 || viewZ0 == null || viewB1 == null) {
            return 0;
        }
        return Math.min(this.B.n(), this.B.d(viewB1) - this.B.g(viewZ0));
    }

    public final int V0(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        int iB = the0Var.b();
        View viewZ0 = Z0(iB);
        View viewB1 = b1(iB);
        if (the0Var.b() == 0 || viewZ0 == null || viewB1 == null) {
            return 0;
        }
        int iT = androidx.recyclerview.widget.b.T(viewZ0);
        int iT2 = androidx.recyclerview.widget.b.T(viewB1);
        int iAbs = Math.abs(this.B.d(viewB1) - this.B.g(viewZ0));
        int[] iArr = this.w.c;
        int i = iArr[iT];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iT2] - i) + 1))) + (this.B.m() - this.B.g(viewZ0)));
    }

    public final int W0(the0 the0Var) {
        if (I() != 0) {
            int iB = the0Var.b();
            View viewZ0 = Z0(iB);
            View viewB1 = b1(iB);
            if (the0Var.b() != 0 && viewZ0 != null && viewB1 != null) {
                View viewD1 = d1(0, I());
                int iT = viewD1 == null ? -1 : androidx.recyclerview.widget.b.T(viewD1);
                View viewD2 = d1(I() - 1, -1);
                return (int) ((Math.abs(this.B.d(viewB1) - this.B.g(viewZ0)) / (((viewD2 != null ? androidx.recyclerview.widget.b.T(viewD2) : -1) - iT) + 1)) * the0Var.b());
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean X() {
        return true;
    }

    public final void X0() {
        if (this.B != null) {
            return;
        }
        boolean zK = k();
        boolean z = this.q;
        if (zK) {
            if (z) {
                this.B = new oa80(this, (byte) 1);
                this.Y = new oa80(this, (byte) 0);
                return;
            } else {
                this.B = new oa80(this, (byte) 0);
                this.Y = new oa80(this, (byte) 1);
                return;
            }
        }
        if (z) {
            this.B = new oa80(this, (byte) 0);
            this.Y = new oa80(this, (byte) 1);
        } else {
            this.B = new oa80(this, (byte) 1);
            this.Y = new oa80(this, (byte) 0);
        }
    }

    public final int Y0(msj msjVar, the0 the0Var, ikq ikqVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        Rect rect;
        int i6;
        Rect rect2;
        int i7;
        Rect rect3;
        int i8 = ikqVar.f;
        if (i8 != Integer.MIN_VALUE) {
            int i9 = ikqVar.f14940a;
            if (i9 < 0) {
                ikqVar.f = i8 + i9;
            }
            j1(msjVar, ikqVar);
        }
        int i10 = ikqVar.f14940a;
        boolean zK = k();
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i11 <= 0 && !this.z.b) {
                break;
            }
            List list = this.v;
            int i13 = ikqVar.d;
            if (i13 < 0 || i13 >= the0Var.b() || (i = ikqVar.c) < 0 || i >= list.size()) {
                break;
            }
            a aVar = (a) this.v.get(ikqVar.c);
            ikqVar.d = aVar.o;
            boolean zK2 = k();
            hkq hkqVar = this.A;
            Rect rect4 = o1;
            b bVar = this.w;
            if (zK2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i14 = this.n;
                int i15 = ikqVar.e;
                if (ikqVar.h == -1) {
                    i15 -= aVar.g;
                }
                int i16 = i15;
                int i17 = ikqVar.d;
                float f = hkqVar.d;
                float f2 = paddingLeft - f;
                float measuredWidth = (i14 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i18 = aVar.h;
                int i19 = i17;
                int i20 = 0;
                while (i19 < i17 + i18) {
                    int i21 = i17;
                    View viewD = d(i19);
                    if (viewD == null) {
                        i19 = i19;
                        rect3 = rect4;
                    } else {
                        if (ikqVar.h == 1) {
                            p(rect4, viewD);
                            l(viewD);
                        } else {
                            p(rect4, viewD);
                            m(viewD, i20, false);
                            i20++;
                        }
                        int i22 = i20;
                        float f3 = measuredWidth;
                        long j = bVar.d[i19];
                        int i23 = (int) j;
                        int i24 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                        if (l1(viewD, i23, i24, layoutParams)) {
                            viewD.measure(i23, i24);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((hhe0) viewD.getLayoutParams()).b.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((hhe0) viewD.getLayoutParams()).b.right);
                        int i25 = i16 + ((hhe0) viewD.getLayoutParams()).b.top;
                        boolean z2 = this.t;
                        b bVar2 = this.w;
                        if (z2) {
                            rect3 = rect4;
                            bVar2.o(viewD, aVar, Math.round(f5) - viewD.getMeasuredWidth(), i25, Math.round(f5), viewD.getMeasuredHeight() + i25);
                        } else {
                            rect3 = rect4;
                            bVar2.o(viewD, aVar, Math.round(f4), i25, viewD.getMeasuredWidth() + Math.round(f4), viewD.getMeasuredHeight() + i25);
                        }
                        float measuredWidth2 = viewD.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((hhe0) viewD.getLayoutParams()).b.right + fMax + f4;
                        measuredWidth = f5 - (((viewD.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((hhe0) viewD.getLayoutParams()).b.left) + fMax);
                        f2 = measuredWidth2;
                        i20 = i22;
                    }
                    i19++;
                    zK = zK;
                    i18 = i18;
                    i17 = i21;
                    rect4 = rect3;
                }
                z = zK;
                ikqVar.c += this.z.h;
                i5 = aVar.g;
                i4 = i11;
            } else {
                z = zK;
                Rect rect5 = rect4;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i26 = this.o;
                int i27 = ikqVar.e;
                if (ikqVar.h == -1) {
                    int i28 = aVar.g;
                    i3 = i27 + i28;
                    i2 = i27 - i28;
                } else {
                    i2 = i27;
                    i3 = i2;
                }
                int i29 = ikqVar.d;
                float f6 = i26 - paddingBottom;
                float f7 = hkqVar.d;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i30 = aVar.h;
                float measuredHeight = f9;
                int i31 = i29;
                float f10 = f8;
                int i32 = 0;
                while (i31 < i29 + i30) {
                    int i33 = i29;
                    View viewD2 = d(i31);
                    if (viewD2 == null) {
                        i6 = i33;
                        rect2 = rect5;
                        i7 = i31;
                    } else {
                        float f11 = f10;
                        long j2 = bVar.d[i31];
                        int i34 = (int) j2;
                        int i35 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewD2.getLayoutParams();
                        if (l1(viewD2, i34, i35, layoutParams2)) {
                            viewD2.measure(i34, i35);
                        }
                        float f12 = f11 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((hhe0) viewD2.getLayoutParams()).b.top;
                        float f13 = measuredHeight - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((hhe0) viewD2.getLayoutParams()).b.bottom);
                        if (ikqVar.h == 1) {
                            rect = rect5;
                            p(rect, viewD2);
                            l(viewD2);
                        } else {
                            rect = rect5;
                            p(rect, viewD2);
                            m(viewD2, i32, false);
                            i32++;
                        }
                        int i36 = i2 + ((hhe0) viewD2.getLayoutParams()).b.left;
                        int i37 = i3 - ((hhe0) viewD2.getLayoutParams()).b.right;
                        Rect rect6 = rect;
                        boolean z3 = this.t;
                        boolean z4 = this.u;
                        b bVar3 = this.w;
                        if (!z3) {
                            i6 = i33;
                            rect2 = rect6;
                            i7 = i31;
                            if (z4) {
                                bVar3.p(viewD2, aVar, z3, i36, Math.round(f13) - viewD2.getMeasuredHeight(), viewD2.getMeasuredWidth() + i36, Math.round(f13));
                            } else {
                                bVar3.p(viewD2, aVar, z3, i36, Math.round(f12), viewD2.getMeasuredWidth() + i36, viewD2.getMeasuredHeight() + Math.round(f12));
                            }
                        } else if (z4) {
                            i6 = i33;
                            rect2 = rect6;
                            i7 = i31;
                            bVar3.p(viewD2, aVar, z3, i37 - viewD2.getMeasuredWidth(), Math.round(f13) - viewD2.getMeasuredHeight(), i37, Math.round(f13));
                        } else {
                            i6 = i33;
                            rect2 = rect6;
                            i7 = i31;
                            bVar3.p(viewD2, aVar, z3, i37 - viewD2.getMeasuredWidth(), Math.round(f12), i37, viewD2.getMeasuredHeight() + Math.round(f12));
                        }
                        float measuredHeight2 = viewD2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((hhe0) viewD2.getLayoutParams()).b.bottom + fMax2 + f12;
                        measuredHeight = f13 - (((viewD2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) + ((hhe0) viewD2.getLayoutParams()).b.top) + fMax2);
                        f10 = measuredHeight2;
                    }
                    i31 = i7 + 1;
                    i11 = i11;
                    i30 = i30;
                    i29 = i6;
                    rect5 = rect2;
                }
                i4 = i11;
                ikqVar.c += this.z.h;
                i5 = aVar.g;
            }
            int i38 = i5;
            i12 += i5;
            if (z || !this.t) {
                ikqVar.e += ikqVar.h * i38;
            } else {
                ikqVar.e -= ikqVar.h * i38;
            }
            i11 = i4 - i38;
            i10 = i10;
            zK = z;
        }
        int i39 = i10;
        int i40 = ikqVar.f14940a - i12;
        ikqVar.f14940a = i40;
        int i41 = ikqVar.f;
        if (i41 != Integer.MIN_VALUE) {
            int i42 = i41 + i12;
            ikqVar.f = i42;
            if (i40 < 0) {
                ikqVar.f = i42 + i40;
            }
            j1(msjVar, ikqVar);
        }
        return i39 - ikqVar.f14940a;
    }

    public final View Z0(int i) {
        View viewE1 = e1(0, I(), i);
        if (viewE1 == null) {
            return null;
        }
        int i2 = this.w.c[androidx.recyclerview.widget.b.T(viewE1)];
        if (i2 == -1) {
            return null;
        }
        return a1(viewE1, (a) this.v.get(i2));
    }

    @Override // a.rhe0
    public final PointF a(int i) {
        View viewH;
        if (I() == 0 || (viewH = H(0)) == null) {
            return null;
        }
        int i2 = i < androidx.recyclerview.widget.b.T(viewH) ? -1 : 1;
        return k() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View a1(View view, a aVar) {
        boolean zK = k();
        int i = aVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewH = H(i2);
            if (viewH != null && viewH.getVisibility() != 8) {
                if (!this.t || zK) {
                    if (this.B.g(view) > this.B.g(viewH)) {
                        view = viewH;
                    }
                } else if (this.B.d(view) < this.B.d(viewH)) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // a.ekq
    public final void b(View view, int i, int i2, a aVar) {
        p(o1, view);
        if (k()) {
            int i3 = ((hhe0) view.getLayoutParams()).b.left + ((hhe0) view.getLayoutParams()).b.right;
            aVar.e += i3;
            aVar.f += i3;
        } else {
            int i4 = ((hhe0) view.getLayoutParams()).b.top + ((hhe0) view.getLayoutParams()).b.bottom;
            aVar.e += i4;
            aVar.f += i4;
        }
    }

    public final View b1(int i) {
        View viewE1 = e1(I() - 1, -1, i);
        if (viewE1 == null) {
            return null;
        }
        return c1(viewE1, (a) this.v.get(this.w.c[androidx.recyclerview.widget.b.T(viewE1)]));
    }

    @Override // a.ekq
    public final int c(int i, int i2, int i3) {
        return androidx.recyclerview.widget.b.J(q(), this.n, this.l, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View c1(View view, a aVar) {
        boolean zK = k();
        int I = (I() - aVar.h) - 1;
        for (int I2 = I() - 2; I2 > I; I2--) {
            View viewH = H(I2);
            if (viewH != null && viewH.getVisibility() != 8) {
                if (!this.t || zK) {
                    if (this.B.d(view) < this.B.d(viewH)) {
                        view = viewH;
                    }
                } else if (this.B.g(view) > this.B.g(viewH)) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // a.ekq
    public final View d(int i) {
        View view = (View) this.j1.get(i);
        return view != null ? view : this.x.e(i);
    }

    public final View d1(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewH = H(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.n - getPaddingRight();
            int paddingBottom = this.o - getPaddingBottom();
            int iN = androidx.recyclerview.widget.b.N(viewH) - ((ViewGroup.MarginLayoutParams) ((hhe0) viewH.getLayoutParams())).leftMargin;
            int iR = androidx.recyclerview.widget.b.R(viewH) - ((ViewGroup.MarginLayoutParams) ((hhe0) viewH.getLayoutParams())).topMargin;
            int iQ = androidx.recyclerview.widget.b.Q(viewH) + ((ViewGroup.MarginLayoutParams) ((hhe0) viewH.getLayoutParams())).rightMargin;
            int iL = androidx.recyclerview.widget.b.L(viewH) + ((ViewGroup.MarginLayoutParams) ((hhe0) viewH.getLayoutParams())).bottomMargin;
            boolean z = iN >= paddingRight || iQ >= paddingLeft;
            boolean z2 = iR >= paddingBottom || iL >= paddingTop;
            if (z && z2) {
                return viewH;
            }
            i += i3;
        }
        return null;
    }

    @Override // a.ekq
    public final int e(int i, int i2, int i3) {
        return androidx.recyclerview.widget.b.J(r(), this.o, this.m, i2, i3);
    }

    @Override // androidx.recyclerview.widget.b
    public final void e0(yge0 yge0Var) {
        z0();
    }

    public final View e1(int i, int i2, int i3) {
        int iT;
        X0();
        if (this.z == null) {
            ikq ikqVar = new ikq();
            ikqVar.h = 1;
            this.z = ikqVar;
        }
        int iM = this.B.m();
        int i4 = this.B.i();
        int i5 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewH = H(i);
            if (viewH != null && (iT = androidx.recyclerview.widget.b.T(viewH)) >= 0 && iT < i3) {
                if (((hhe0) viewH.getLayoutParams()).f13060a.k()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.B.g(viewH) >= iM && this.B.d(viewH) <= i4) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // a.ekq
    public final void f(View view, int i) {
        this.j1.put(i, view);
    }

    @Override // androidx.recyclerview.widget.b
    public final void f0(RecyclerView recyclerView) {
        this.l1 = (View) recyclerView.getParent();
    }

    public final int f1(int i, msj msjVar, the0 the0Var, boolean z) {
        int iH1;
        int i2;
        if (k() || !this.t) {
            int i3 = this.B.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            iH1 = -h1(-i3, msjVar, the0Var);
        } else {
            int iM = i - this.B.m();
            if (iM <= 0) {
                return 0;
            }
            iH1 = h1(iM, msjVar, the0Var);
        }
        int i4 = i + iH1;
        if (!z || (i2 = this.B.i() - i4) <= 0) {
            return iH1;
        }
        this.B.r(i2);
        return i2 + iH1;
    }

    @Override // a.ekq
    public final int g(View view) {
        int i;
        int i2;
        if (k()) {
            i = ((hhe0) view.getLayoutParams()).b.top;
            i2 = ((hhe0) view.getLayoutParams()).b.bottom;
        } else {
            i = ((hhe0) view.getLayoutParams()).b.left;
            i2 = ((hhe0) view.getLayoutParams()).b.right;
        }
        return i + i2;
    }

    public final int g1(int i, msj msjVar, the0 the0Var, boolean z) {
        int iH1;
        int iM;
        if (k() || !this.t) {
            int iM2 = i - this.B.m();
            if (iM2 <= 0) {
                return 0;
            }
            iH1 = -h1(iM2, msjVar, the0Var);
        } else {
            int i2 = this.B.i() - i;
            if (i2 <= 0) {
                return 0;
            }
            iH1 = h1(-i2, msjVar, the0Var);
        }
        int i3 = i + iH1;
        if (!z || (iM = i3 - this.B.m()) <= 0) {
            return iH1;
        }
        this.B.r(-iM);
        return iH1 - iM;
    }

    @Override // a.ekq
    public final int getAlignContent() {
        return 5;
    }

    @Override // a.ekq
    public final int getAlignItems() {
        return this.r;
    }

    @Override // a.ekq
    public final int getFlexDirection() {
        return this.p;
    }

    @Override // a.ekq
    public final int getFlexItemCount() {
        return this.y.b();
    }

    @Override // a.ekq
    public final List getFlexLinesInternal() {
        return this.v;
    }

    @Override // a.ekq
    public final int getFlexWrap() {
        return this.q ? 1 : 0;
    }

    @Override // a.ekq
    public final int getLargestMainSize() {
        if (this.v.size() == 0) {
            return 0;
        }
        int size = this.v.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((a) this.v.get(i)).e);
        }
        return iMax;
    }

    @Override // a.ekq
    public final int getMaxLine() {
        return this.s;
    }

    @Override // a.ekq
    public final int getSumOfCrossSize() {
        int size = this.v.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((a) this.v.get(i2)).g;
        }
        return i;
    }

    @Override // a.ekq
    public final void h(a aVar) {
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    public final int h1(int i, msj msjVar, the0 the0Var) {
        int i2;
        if (I() != 0 && i != 0) {
            X0();
            this.z.i = true;
            boolean z = !k() && this.t;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.z.h = i3;
            boolean zK = k();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n, this.l);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.m);
            boolean z2 = !zK && this.t;
            b bVar = this.w;
            if (i3 == 1) {
                View viewH = H(I() - 1);
                if (viewH != null) {
                    this.z.e = this.B.d(viewH);
                    int iT = androidx.recyclerview.widget.b.T(viewH);
                    View viewC1 = c1(viewH, (a) this.v.get(bVar.c[iT]));
                    ikq ikqVar = this.z;
                    ikqVar.getClass();
                    int i4 = iT + 1;
                    ikqVar.d = i4;
                    int[] iArr = bVar.c;
                    if (iArr.length <= i4) {
                        ikqVar.c = -1;
                    } else {
                        ikqVar.c = iArr[i4];
                    }
                    pa80 pa80Var = this.B;
                    if (z2) {
                        ikqVar.e = pa80Var.g(viewC1);
                        this.z.f = this.B.m() + (-this.B.g(viewC1));
                        ikq ikqVar2 = this.z;
                        ikqVar2.f = Math.max(ikqVar2.f, 0);
                    } else {
                        ikqVar.e = pa80Var.d(viewC1);
                        this.z.f = this.B.d(viewC1) - this.B.i();
                    }
                    int i5 = this.z.c;
                    if ((i5 == -1 || i5 > this.v.size() - 1) && this.z.d <= this.y.b()) {
                        ikq ikqVar3 = this.z;
                        int i6 = iAbs - ikqVar3.f;
                        tyj tyjVar = this.n1;
                        tyjVar.f34759a = null;
                        tyjVar.b = 0;
                        if (i6 > 0) {
                            b bVar2 = this.w;
                            if (zK) {
                                bVar2.b(tyjVar, iMakeMeasureSpec, iMakeMeasureSpec2, i6, ikqVar3.d, -1, this.v);
                            } else {
                                bVar2.b(tyjVar, iMakeMeasureSpec2, iMakeMeasureSpec, i6, ikqVar3.d, -1, this.v);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, this.z.d);
                            bVar.u(this.z.d);
                        }
                    }
                    ikq ikqVar4 = this.z;
                    ikqVar4.f14940a = iAbs - ikqVar4.f;
                }
            } else {
                View viewH2 = H(0);
                if (viewH2 != null) {
                    this.z.e = this.B.g(viewH2);
                    int iT2 = androidx.recyclerview.widget.b.T(viewH2);
                    View viewA1 = a1(viewH2, (a) this.v.get(bVar.c[iT2]));
                    ikq ikqVar5 = this.z;
                    ikqVar5.getClass();
                    int i7 = bVar.c[iT2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        a aVar = (a) this.v.get(i7 - 1);
                        ikqVar5 = this.z;
                        ikqVar5.d = iT2 - aVar.h;
                    } else {
                        ikqVar5.d = -1;
                    }
                    ikqVar5.c = i7 > 0 ? i7 - 1 : 0;
                    pa80 pa80Var2 = this.B;
                    if (z2) {
                        ikqVar5.e = pa80Var2.d(viewA1);
                        this.z.f = this.B.d(viewA1) - this.B.i();
                        ikq ikqVar6 = this.z;
                        ikqVar6.f = Math.max(ikqVar6.f, 0);
                    } else {
                        ikqVar5.e = pa80Var2.g(viewA1);
                        this.z.f = this.B.m() + (-this.B.g(viewA1));
                    }
                    ikq ikqVar7 = this.z;
                    ikqVar7.f14940a = iAbs - ikqVar7.f;
                }
            }
            ikq ikqVar8 = this.z;
            int iY0 = Y0(msjVar, the0Var, ikqVar8) + ikqVar8.f;
            if (iY0 >= 0) {
                if (z) {
                    if (iAbs > iY0) {
                        i2 = (-i3) * iY0;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iY0) {
                    i2 = i3 * iY0;
                } else {
                    i2 = i;
                }
                this.B.r(-i2);
                this.z.g = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // a.ekq
    public final View i(int i) {
        return d(i);
    }

    public final int i1(int i) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        X0();
        boolean zK = k();
        View view = this.l1;
        int width = zK ? view.getWidth() : view.getHeight();
        int i2 = zK ? this.n : this.o;
        int layoutDirection = this.b.getLayoutDirection();
        hkq hkqVar = this.A;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + hkqVar.d) - width, iAbs);
            }
            int i3 = hkqVar.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - hkqVar.d) - width, i);
            }
            int i4 = hkqVar.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // a.ekq
    public final int j(View view, int i, int i2) {
        int i3;
        int i4;
        if (k()) {
            i3 = ((hhe0) view.getLayoutParams()).b.left;
            i4 = ((hhe0) view.getLayoutParams()).b.right;
        } else {
            i3 = ((hhe0) view.getLayoutParams()).b.top;
            i4 = ((hhe0) view.getLayoutParams()).b.bottom;
        }
        return i3 + i4;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0114 A[EDGE_INSN: B:95:0x0114->B:103:? BREAK  A[LOOP:2: B:55:0x00c3->B:74:0x0110], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[SYNTHETIC] */
    public final void j1(msj msjVar, ikq ikqVar) {
        int I;
        int i;
        int I2;
        int i2;
        View viewH;
        int i3;
        if (ikqVar.i) {
            int i4 = ikqVar.h;
            int i5 = ikqVar.f;
            b bVar = this.w;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (I2 = I()) == 0 || (viewH = H((i2 = I2 - 1))) == null || (i3 = bVar.c[androidx.recyclerview.widget.b.T(viewH)]) == -1) {
                    return;
                }
                a aVar = (a) this.v.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View viewH2 = H(i7);
                    if (viewH2 != null) {
                        int i8 = ikqVar.f;
                        if (!k() && this.t) {
                            if (this.B.d(viewH2) > i8) {
                                break;
                            }
                            if (aVar.o != androidx.recyclerview.widget.b.T(viewH2)) {
                                continue;
                            } else if (i3 <= 0) {
                                I2 = i7;
                                break;
                            } else {
                                i3 += ikqVar.h;
                                aVar = (a) this.v.get(i3);
                                I2 = i7;
                            }
                        } else {
                            if (this.B.g(viewH2) < this.B.h() - i8) {
                                break;
                            }
                            if (aVar.o != androidx.recyclerview.widget.b.T(viewH2)) {
                                continue;
                            } else if (i3 <= 0) {
                                I2 = i7;
                                break;
                            } else {
                                i3 += ikqVar.h;
                                aVar = (a) this.v.get(i3);
                                I2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= I2) {
                    View viewH3 = H(i2);
                    if (H(i2) != null) {
                        this.f45401a.k(i2);
                    }
                    msjVar.k(viewH3);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (I = I()) != 0) {
                int i9 = 0;
                View viewH4 = H(0);
                if (viewH4 == null || (i = bVar.c[androidx.recyclerview.widget.b.T(viewH4)]) == -1) {
                    return;
                }
                a aVar2 = (a) this.v.get(i);
                while (true) {
                    if (i9 < I) {
                        View viewH5 = H(i9);
                        if (viewH5 != null) {
                            int i10 = ikqVar.f;
                            if (k() || !this.t) {
                                if (this.B.d(viewH5) <= i10) {
                                    if (aVar2.p != androidx.recyclerview.widget.b.T(viewH5)) {
                                        continue;
                                    } else {
                                        if (i >= this.v.size() - 1) {
                                            break;
                                        }
                                        i += ikqVar.h;
                                        aVar2 = (a) this.v.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.B.h() - this.B.g(viewH5) <= i10) {
                                if (aVar2.p != androidx.recyclerview.widget.b.T(viewH5)) {
                                    continue;
                                } else if (i >= this.v.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += ikqVar.h;
                                    aVar2 = (a) this.v.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    View viewH6 = H(i9);
                    if (H(i9) != null) {
                        this.f45401a.k(i9);
                    }
                    msjVar.k(viewH6);
                    i9--;
                }
            }
        }
    }

    @Override // a.ekq
    public final boolean k() {
        byte b = this.p;
        return b == 0 || b == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(int i) {
        if (this.p != i) {
            z0();
            this.p = i;
            this.B = null;
            this.Y = null;
            this.v.clear();
            hkq hkqVar = this.A;
            hkqVar.b();
            hkqVar.d = 0;
            F0();
        }
    }

    public final boolean l1(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.h && Z(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && Z(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.b
    public final void m0(RecyclerView recyclerView, int i, int i2) {
        m1(i);
    }

    public final void m1(int i) {
        View viewD1 = d1(I() - 1, -1);
        if (i >= (viewD1 != null ? androidx.recyclerview.widget.b.T(viewD1) : -1)) {
            return;
        }
        int I = I();
        b bVar = this.w;
        bVar.j(I);
        bVar.k(I);
        bVar.i(I);
        if (i >= bVar.c.length) {
            return;
        }
        this.m1 = i;
        View viewH = H(0);
        if (viewH == null) {
            return;
        }
        this.f1 = androidx.recyclerview.widget.b.T(viewH);
        if (k() || !this.t) {
            this.g1 = this.B.g(viewH) - this.B.m();
        } else {
            this.g1 = this.B.j() + this.B.d(viewH);
        }
    }

    public final void n1(hkq hkqVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = k() ? this.m : this.l;
            this.z.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.z.b = false;
        }
        if (k() || !this.t) {
            this.z.f14940a = this.B.i() - hkqVar.c;
        } else {
            this.z.f14940a = hkqVar.c - getPaddingRight();
        }
        ikq ikqVar = this.z;
        ikqVar.d = hkqVar.f13220a;
        ikqVar.h = 1;
        ikqVar.e = hkqVar.c;
        ikqVar.f = Integer.MIN_VALUE;
        ikqVar.c = hkqVar.b;
        if (!z || this.v.size() <= 1 || (i = hkqVar.b) < 0 || i >= this.v.size() - 1) {
            return;
        }
        a aVar = (a) this.v.get(hkqVar.b);
        ikq ikqVar2 = this.z;
        ikqVar2.c++;
        ikqVar2.d += aVar.h;
    }

    @Override // androidx.recyclerview.widget.b
    public final void o0(int i, int i2) {
        m1(Math.min(i, i2));
    }

    public final void o1(hkq hkqVar, boolean z, boolean z2) {
        if (z2) {
            int i = k() ? this.m : this.l;
            this.z.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.z.b = false;
        }
        if (k() || !this.t) {
            this.z.f14940a = hkqVar.c - this.B.m();
        } else {
            this.z.f14940a = (this.l1.getWidth() - hkqVar.c) - this.B.m();
        }
        ikq ikqVar = this.z;
        ikqVar.d = hkqVar.f13220a;
        ikqVar.h = -1;
        ikqVar.e = hkqVar.c;
        ikqVar.f = Integer.MIN_VALUE;
        int i2 = hkqVar.b;
        ikqVar.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.v.size();
        int i3 = hkqVar.b;
        if (size > i3) {
            a aVar = (a) this.v.get(i3);
            ikq ikqVar2 = this.z;
            ikqVar2.c--;
            ikqVar2.d -= aVar.h;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void p0(int i, int i2) {
        m1(i);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean q() {
        if (!this.q) {
            return k();
        }
        if (!k()) {
            return true;
        }
        int i = this.n;
        View view = this.l1;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.b
    public final void q0(int i) {
        m1(i);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean r() {
        if (!this.q) {
            return !k();
        }
        if (!k()) {
            int i = this.o;
            View view = this.l1;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.b
    public final void r0(RecyclerView recyclerView, int i, int i2) {
        m1(i);
        m1(i);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean s(hhe0 hhe0Var) {
        return hhe0Var instanceof LayoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:106:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:135:0x020b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0211  */
    /* JADX WARN: Code duplicated, block: B:142:0x021e  */
    /* JADX WARN: Code duplicated, block: B:143:0x022b  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0155  */
    /* JADX WARN: Code duplicated, block: B:97:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        View viewZ0;
        FlexboxLayoutManager flexboxLayoutManager;
        pa80 pa80Var;
        int iT;
        int i;
        int size;
        int i2;
        int i3;
        View viewD;
        View viewH;
        boolean z;
        int iG;
        pa80 pa80Var2;
        boolean z2;
        pa80 pa80Var3;
        int iG2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.x = msjVar;
        this.y = the0Var;
        int iB = the0Var.b();
        if (iB == 0 && the0Var.g) {
            return;
        }
        int layoutDirection = this.b.getLayoutDirection();
        byte b = this.p;
        boolean z5 = this.q;
        if (b == 0) {
            this.t = layoutDirection == 1;
            this.u = z5 == 2;
        } else if (b == 1) {
            this.t = layoutDirection != 1;
            this.u = z5 == 2;
        } else if (b == 2) {
            boolean z6 = layoutDirection == 1;
            this.t = z6;
            if (z5 == 2) {
                this.t = !z6;
            }
            this.u = false;
        } else if (b != 3) {
            this.t = false;
            this.u = false;
        } else {
            boolean z7 = layoutDirection == 1;
            this.t = z7;
            if (z5 == 2) {
                this.t = !z7;
            }
            this.u = true;
        }
        X0();
        if (this.z == null) {
            ikq ikqVar = new ikq();
            ikqVar.h = 1;
            this.z = ikqVar;
        }
        b bVar = this.w;
        bVar.j(iB);
        bVar.k(iB);
        bVar.i(iB);
        this.z.i = false;
        SavedState savedState = this.Z;
        if (savedState != null && (i7 = savedState.f45461a) >= 0 && i7 < iB) {
            this.f1 = i7;
        }
        hkq hkqVar = this.A;
        if (!hkqVar.f || this.f1 != -1 || savedState != null) {
            hkqVar.b();
            SavedState savedState2 = this.Z;
            if (the0Var.g || (i3 = this.f1) == -1) {
                if (I() != 0) {
                    if (hkqVar.e) {
                        viewZ0 = b1(the0Var.b());
                    } else {
                        viewZ0 = Z0(the0Var.b());
                    }
                    if (viewZ0 != null) {
                        flexboxLayoutManager = hkqVar.h;
                        if (flexboxLayoutManager.q) {
                            pa80Var = flexboxLayoutManager.B;
                        } else {
                            pa80Var = flexboxLayoutManager.Y;
                        }
                        if (flexboxLayoutManager.k() && flexboxLayoutManager.t) {
                            if (hkqVar.e) {
                                hkqVar.c = pa80Var.o() + pa80Var.g(viewZ0);
                            } else {
                                hkqVar.c = pa80Var.d(viewZ0);
                            }
                        } else if (hkqVar.e) {
                            hkqVar.c = pa80Var.o() + pa80Var.d(viewZ0);
                        } else {
                            hkqVar.c = pa80Var.g(viewZ0);
                        }
                        iT = androidx.recyclerview.widget.b.T(viewZ0);
                        hkqVar.f13220a = iT;
                        hkqVar.g = false;
                        int[] iArr = flexboxLayoutManager.w.c;
                        if (iT == -1) {
                            iT = 0;
                        }
                        i = iArr[iT];
                        if (i == -1) {
                            i = 0;
                        }
                        hkqVar.b = i;
                        size = flexboxLayoutManager.v.size();
                        i2 = hkqVar.b;
                        if (size > i2) {
                            hkqVar.f13220a = ((a) flexboxLayoutManager.v.get(i2)).o;
                        }
                    } else {
                        hkqVar.a();
                        hkqVar.f13220a = 0;
                        hkqVar.b = 0;
                    }
                } else {
                    hkqVar.a();
                    hkqVar.f13220a = 0;
                    hkqVar.b = 0;
                }
            } else if (i3 < 0 || i3 >= the0Var.b()) {
                this.f1 = -1;
                this.g1 = Integer.MIN_VALUE;
                if (I() != 0) {
                    if (hkqVar.e) {
                        viewZ0 = b1(the0Var.b());
                    } else {
                        viewZ0 = Z0(the0Var.b());
                    }
                    if (viewZ0 != null) {
                        flexboxLayoutManager = hkqVar.h;
                        if (flexboxLayoutManager.q) {
                            pa80Var = flexboxLayoutManager.Y;
                        } else {
                            pa80Var = flexboxLayoutManager.B;
                        }
                        if (flexboxLayoutManager.k()) {
                            if (hkqVar.e) {
                                hkqVar.c = pa80Var.o() + pa80Var.d(viewZ0);
                            } else {
                                hkqVar.c = pa80Var.g(viewZ0);
                            }
                        } else if (hkqVar.e) {
                            hkqVar.c = pa80Var.o() + pa80Var.d(viewZ0);
                        } else {
                            hkqVar.c = pa80Var.g(viewZ0);
                        }
                        iT = androidx.recyclerview.widget.b.T(viewZ0);
                        hkqVar.f13220a = iT;
                        hkqVar.g = false;
                        int[] iArr2 = flexboxLayoutManager.w.c;
                        if (iT == -1) {
                            iT = 0;
                        }
                        i = iArr2[iT];
                        if (i == -1) {
                            i = 0;
                        }
                        hkqVar.b = i;
                        size = flexboxLayoutManager.v.size();
                        i2 = hkqVar.b;
                        if (size > i2) {
                            hkqVar.f13220a = ((a) flexboxLayoutManager.v.get(i2)).o;
                        }
                    } else {
                        hkqVar.a();
                        hkqVar.f13220a = 0;
                        hkqVar.b = 0;
                    }
                } else {
                    hkqVar.a();
                    hkqVar.f13220a = 0;
                    hkqVar.b = 0;
                }
            } else {
                int i8 = this.f1;
                hkqVar.f13220a = i8;
                hkqVar.b = bVar.c[i8];
                SavedState savedState3 = this.Z;
                if (savedState3 != null) {
                    int iB2 = the0Var.b();
                    int i9 = savedState3.f45461a;
                    if (i9 >= 0 && i9 < iB2) {
                        hkqVar.c = this.B.m() + savedState2.b;
                        hkqVar.g = true;
                        hkqVar.b = -1;
                    } else if (this.g1 == Integer.MIN_VALUE) {
                        viewD = D(this.f1);
                        if (viewD != null) {
                            if (I() > 0 && (viewH = H(0)) != null) {
                                if (this.f1 < androidx.recyclerview.widget.b.T(viewH)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                hkqVar.e = z;
                            }
                            hkqVar.a();
                        } else if (this.B.e(viewD) > this.B.n()) {
                            hkqVar.a();
                        } else {
                            iG = this.B.g(viewD) - this.B.m();
                            pa80Var2 = this.B;
                            if (iG < 0) {
                                hkqVar.c = pa80Var2.m();
                                hkqVar.e = false;
                            } else if (pa80Var2.i() - this.B.d(viewD) < 0) {
                                hkqVar.c = this.B.i();
                                hkqVar.e = true;
                            } else {
                                z2 = hkqVar.e;
                                pa80Var3 = this.B;
                                if (z2) {
                                    iG2 = this.B.o() + pa80Var3.d(viewD);
                                } else {
                                    iG2 = pa80Var3.g(viewD);
                                }
                                hkqVar.c = iG2;
                            }
                        }
                    } else if (k() && this.t) {
                        hkqVar.c = this.g1 - this.B.j();
                    } else {
                        hkqVar.c = this.B.m() + this.g1;
                    }
                } else if (this.g1 == Integer.MIN_VALUE) {
                    viewD = D(this.f1);
                    if (viewD != null) {
                        if (I() > 0) {
                            if (this.f1 < androidx.recyclerview.widget.b.T(viewH)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            hkqVar.e = z;
                        }
                        hkqVar.a();
                    } else if (this.B.e(viewD) > this.B.n()) {
                        hkqVar.a();
                    } else {
                        iG = this.B.g(viewD) - this.B.m();
                        pa80Var2 = this.B;
                        if (iG < 0) {
                            hkqVar.c = pa80Var2.m();
                            hkqVar.e = false;
                        } else if (pa80Var2.i() - this.B.d(viewD) < 0) {
                            hkqVar.c = this.B.i();
                            hkqVar.e = true;
                        } else {
                            z2 = hkqVar.e;
                            pa80Var3 = this.B;
                            if (z2) {
                                iG2 = this.B.o() + pa80Var3.d(viewD);
                            } else {
                                iG2 = pa80Var3.g(viewD);
                            }
                            hkqVar.c = iG2;
                        }
                    }
                } else if (k()) {
                    hkqVar.c = this.B.m() + this.g1;
                } else {
                    hkqVar.c = this.B.m() + this.g1;
                }
            }
            hkqVar.f = true;
        }
        C(msjVar);
        if (hkqVar.e) {
            o1(hkqVar, false, true);
        } else {
            n1(hkqVar, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n, this.l);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.m);
        int i10 = this.n;
        int i11 = this.o;
        boolean zK = k();
        Context context = this.k1;
        if (zK) {
            int i12 = this.h1;
            z3 = (i12 == Integer.MIN_VALUE || i12 == i10) ? false : true;
            ikq ikqVar2 = this.z;
            i4 = ikqVar2.b ? context.getResources().getDisplayMetrics().heightPixels : ikqVar2.f14940a;
        } else {
            int i13 = this.i1;
            z3 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            ikq ikqVar3 = this.z;
            i4 = ikqVar3.b ? context.getResources().getDisplayMetrics().widthPixels : ikqVar3.f14940a;
        }
        int i14 = i4;
        this.h1 = i10;
        this.i1 = i11;
        int i15 = this.m1;
        tyj tyjVar = this.n1;
        if (i15 != -1 || (this.f1 == -1 && !z3)) {
            int iMin = hkqVar.f13220a;
            if (i15 != -1) {
                iMin = Math.min(i15, iMin);
            }
            tyjVar.f34759a = null;
            tyjVar.b = 0;
            boolean zK2 = k();
            List list = this.v;
            if (zK2) {
                if (list.size() > 0) {
                    bVar.d(iMin, this.v);
                    this.w.b(this.n1, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, hkqVar.f13220a, this.v);
                } else {
                    bVar.i(iB);
                    this.w.b(this.n1, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, -1, this.v);
                }
            } else if (list.size() > 0) {
                bVar.d(iMin, this.v);
                int i16 = iMin;
                this.w.b(this.n1, iMakeMeasureSpec2, iMakeMeasureSpec, i14, i16, hkqVar.f13220a, this.v);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i16;
            } else {
                bVar.i(iB);
                this.w.b(this.n1, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, -1, this.v);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.v = tyjVar.f34759a;
            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            bVar.u(iMin);
        } else if (!hkqVar.e) {
            this.v.clear();
            tyjVar.f34759a = null;
            tyjVar.b = 0;
            boolean zK3 = k();
            int i17 = hkqVar.f13220a;
            b bVar2 = this.w;
            tyj tyjVar2 = this.n1;
            if (zK3) {
                bVar2.b(tyjVar2, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, i17, this.v);
            } else {
                bVar2.b(tyjVar2, iMakeMeasureSpec2, iMakeMeasureSpec, i14, 0, i17, this.v);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.v = tyjVar.f34759a;
            bVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            bVar.u(0);
            int i18 = bVar.c[hkqVar.f13220a];
            hkqVar.b = i18;
            this.z.c = i18;
        }
        Y0(msjVar, the0Var, this.z);
        boolean z8 = hkqVar.e;
        ikq ikqVar4 = this.z;
        if (z8) {
            i6 = ikqVar4.e;
            z4 = true;
            n1(hkqVar, true, false);
            Y0(msjVar, the0Var, this.z);
            i5 = this.z.e;
        } else {
            z4 = true;
            i5 = ikqVar4.e;
            o1(hkqVar, true, false);
            Y0(msjVar, the0Var, this.z);
            i6 = this.z.e;
        }
        if (I() > 0) {
            if (hkqVar.e) {
                g1(f1(i5, msjVar, the0Var, z4) + i6, msjVar, the0Var, false);
            } else {
                f1(g1(i6, msjVar, the0Var, z4) + i5, msjVar, the0Var, false);
            }
        }
    }

    @Override // a.ekq
    public final void setFlexLines(List list) {
        this.v = list;
    }

    @Override // androidx.recyclerview.widget.b
    public final void t0(the0 the0Var) {
        this.Z = null;
        this.f1 = -1;
        this.g1 = Integer.MIN_VALUE;
        this.m1 = -1;
        this.A.b();
        this.j1.clear();
    }

    @Override // androidx.recyclerview.widget.b
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.Z = (SavedState) parcelable;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final Parcelable v0() {
        SavedState savedState = this.Z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f45461a = savedState.f45461a;
            savedState2.b = savedState.b;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (I() <= 0) {
            savedState3.f45461a = -1;
            return savedState3;
        }
        View viewH = H(0);
        savedState3.f45461a = androidx.recyclerview.widget.b.T(viewH);
        savedState3.b = this.B.g(viewH) - this.B.m();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.b
    public final int w(the0 the0Var) {
        return U0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int x(the0 the0Var) {
        return V0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int y(the0 the0Var) {
        return W0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int z(the0 the0Var) {
        return U0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final void g0(RecyclerView recyclerView, msj msjVar) {
    }
}
