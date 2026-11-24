package androidx.recyclerview.widget;

import a.amo;
import a.c2;
import a.d7;
import a.dw9;
import a.h34;
import a.hhe0;
import a.j7;
import a.j900;
import a.jf4;
import a.k7;
import a.msj;
import a.qgv;
import a.rgu0;
import a.rgv;
import a.rz4;
import a.the0;
import a.twn;
import a.v4i0;
import a.xhe0;
import a.yge0;
import a.yjc;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set r1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean g1;
    public int h1;
    public int[] i1;
    public View[] j1;
    public final SparseIntArray k1;
    public final SparseIntArray l1;
    public c2 m1;
    public final Rect n1;
    public int o1;
    public int p1;
    public int q1;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g1 = false;
        this.h1 = -1;
        this.k1 = new SparseIntArray();
        this.l1 = new SparseIntArray();
        this.m1 = new qgv((byte) 8);
        this.n1 = new Rect();
        this.o1 = -1;
        this.p1 = -1;
        this.q1 = -1;
        N1(b.U(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int A(the0 the0Var) {
        return X0(the0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int B(the0 the0Var) {
        return Y0(the0Var);
    }

    public final void C1(int i) {
        int i2;
        int[] iArr = this.i1;
        int i3 = this.h1;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.i1 = iArr;
    }

    public final void D1() {
        View[] viewArr = this.j1;
        if (viewArr == null || viewArr.length != this.h1) {
            this.j1 = new View[this.h1];
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 E() {
        return this.p == 0 ? new rgv(-2, -1) : new rgv(-1, -2);
    }

    public final int E1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? J1(i, recyclerView.c, recyclerView.H1) : K1(i, recyclerView.c, recyclerView.H1);
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 F(Context context, AttributeSet attributeSet) {
        rgv rgvVar = new rgv(context, attributeSet);
        rgvVar.e = -1;
        rgvVar.f = 0;
        return rgvVar;
    }

    public final int F1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? J1(i, recyclerView.c, recyclerView.H1) : K1(i, recyclerView.c, recyclerView.H1);
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            rgv rgvVar = new rgv((ViewGroup.MarginLayoutParams) layoutParams);
            rgvVar.e = -1;
            rgvVar.f = 0;
            return rgvVar;
        }
        rgv rgvVar2 = new rgv(layoutParams);
        rgvVar2.e = -1;
        rgvVar2.f = 0;
        return rgvVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int G0(int i, msj msjVar, the0 the0Var) {
        O1();
        D1();
        return super.G0(i, msjVar, the0Var);
    }

    public final HashSet G1(int i) {
        return H1(F1(i), i);
    }

    public final HashSet H1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iL1 = L1(i2, recyclerView.c, recyclerView.H1);
        for (int i3 = i; i3 < i + iL1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int I0(int i, msj msjVar, the0 the0Var) {
        O1();
        D1();
        return super.I0(i, msjVar, the0Var);
    }

    public final int I1(int i, int i2) {
        if (this.p != 1 || !p1()) {
            int[] iArr = this.i1;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.i1;
        int i3 = this.h1;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int J1(int i, msj msjVar, the0 the0Var) {
        if (!the0Var.g) {
            return this.m1.o(i, this.h1);
        }
        int iB = msjVar.b(i);
        if (iB != -1) {
            return this.m1.o(iB, this.h1);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final int K(msj msjVar, the0 the0Var) {
        if (this.p == 1) {
            return Math.min(this.h1, S());
        }
        if (the0Var.b() < 1) {
            return 0;
        }
        return J1(the0Var.b() - 1, msjVar, the0Var) + 1;
    }

    public final int K1(int i, msj msjVar, the0 the0Var) {
        if (!the0Var.g) {
            return this.m1.p(i, this.h1);
        }
        int i2 = this.l1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = msjVar.b(i);
        if (iB != -1) {
            return this.m1.p(iB, this.h1);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final void L0(Rect rect, int i, int i2) {
        int iT;
        int iT2;
        if (this.i1 == null) {
            super.L0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.p == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = rgu0.f30456a;
            iT2 = b.t(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.i1;
            iT = b.t(i, iArr[iArr.length - 1] + paddingRight, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = rgu0.f30456a;
            iT = b.t(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.i1;
            iT2 = b.t(i2, iArr2[iArr2.length - 1] + paddingBottom, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iT, iT2);
    }

    public final int L1(int i, msj msjVar, the0 the0Var) {
        if (!the0Var.g) {
            return this.m1.q(i);
        }
        int i2 = this.k1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = msjVar.b(i);
        if (iB != -1) {
            return this.m1.q(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void M1(View view, int i, boolean z) {
        int iJ;
        int iJ2;
        rgv rgvVar = (rgv) view.getLayoutParams();
        Rect rect = rgvVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rgvVar).topMargin + ((ViewGroup.MarginLayoutParams) rgvVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rgvVar).leftMargin + ((ViewGroup.MarginLayoutParams) rgvVar).rightMargin;
        int iI1 = I1(rgvVar.e, rgvVar.f);
        if (this.p == 1) {
            iJ2 = b.J(false, iI1, i, i3, ((ViewGroup.MarginLayoutParams) rgvVar).width);
            iJ = b.J(true, this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) rgvVar).height);
        } else {
            int iJ3 = b.J(false, iI1, i, i2, ((ViewGroup.MarginLayoutParams) rgvVar).height);
            int iJ4 = b.J(true, this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) rgvVar).width);
            iJ = iJ3;
            iJ2 = iJ4;
        }
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        if (z ? Q0(view, iJ2, iJ, hhe0Var) : O0(view, iJ2, iJ, hhe0Var)) {
            view.measure(iJ2, iJ);
        }
    }

    public final void N1(int i) {
        if (i == this.h1) {
            return;
        }
        this.g1 = true;
        if (i < 1) {
            jf4.o(twn.m(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.h1 = i;
        this.m1.s();
        F0();
    }

    public final void O1() {
        int paddingBottom;
        int paddingTop;
        if (this.p == 1) {
            paddingBottom = this.n - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.o - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        C1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final boolean T0() {
        return this.A == null && !this.g1;
    }

    @Override // androidx.recyclerview.widget.b
    public final int V(msj msjVar, the0 the0Var) {
        if (this.p == 0) {
            return Math.min(this.h1, S());
        }
        if (the0Var.b() < 1) {
            return 0;
        }
        return J1(the0Var.b() - 1, msjVar, the0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(the0 the0Var, j900 j900Var, yjc yjcVar) {
        int i;
        int iQ = this.h1;
        for (int i2 = 0; i2 < this.h1 && (i = j900Var.d) >= 0 && i < the0Var.b() && iQ > 0; i2++) {
            int i3 = j900Var.d;
            yjcVar.b(i3, Math.max(0, j900Var.g));
            iQ -= this.m1.q(i3);
            j900Var.d += j900Var.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View h0(android.view.View r23, int r24, a.msj r25, a.the0 r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.h0(android.view.View, int, a.msj, a.the0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void j0(msj msjVar, the0 the0Var, k7 k7Var) {
        super.j0(msjVar, the0Var, k7Var);
        k7Var.j(GridView.class.getName());
        yge0 yge0Var = this.b.m;
        if (yge0Var == null || yge0Var.d() <= 1) {
            return;
        }
        k7Var.b(d7.q);
    }

    @Override // androidx.recyclerview.widget.b
    public final void k0(msj msjVar, the0 the0Var, View view, k7 k7Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof rgv)) {
            l0(view, k7Var);
            return;
        }
        rgv rgvVar = (rgv) layoutParams;
        int iJ1 = J1(rgvVar.f13060a.e(), msjVar, the0Var);
        int i = this.p;
        int i2 = rgvVar.e;
        int i3 = rgvVar.f;
        if (i == 0) {
            k7Var.l(j7.a(false, i2, i3, iJ1, 1));
        } else {
            k7Var.l(j7.a(false, iJ1, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View k1(msj msjVar, the0 the0Var, boolean z, boolean z2) {
        int i;
        int I;
        int I2 = I();
        int i2 = 1;
        if (z2) {
            I = I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = I2;
            I = 0;
        }
        int iB = the0Var.b();
        a1();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        while (I != i) {
            View viewH = H(I);
            int iT = b.T(viewH);
            if (iT >= 0 && iT < iB && K1(iT, msjVar, the0Var) == 0) {
                if (((hhe0) viewH.getLayoutParams()).f13060a.k()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.r.g(viewH) < i3 && this.r.d(viewH) >= iM) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            I += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.b
    public final void m0(RecyclerView recyclerView, int i, int i2) {
        this.m1.s();
        ((SparseIntArray) this.m1.b).clear();
    }

    @Override // androidx.recyclerview.widget.b
    public final void n0() {
        this.m1.s();
        ((SparseIntArray) this.m1.b).clear();
    }

    @Override // androidx.recyclerview.widget.b
    public final void o0(int i, int i2) {
        this.m1.s();
        ((SparseIntArray) this.m1.b).clear();
    }

    @Override // androidx.recyclerview.widget.b
    public final void p0(int i, int i2) {
        this.m1.s();
        ((SparseIntArray) this.m1.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(msj msjVar, the0 the0Var, j900 j900Var, h34 h34Var) {
        int i;
        int i2;
        int i3;
        int iF;
        int paddingLeft;
        int paddingTop;
        int iJ;
        int iJ2;
        boolean z;
        int i4;
        View viewB;
        int iL = this.r.l();
        boolean z2 = iL != 1073741824;
        int i5 = I() > 0 ? this.i1[this.h1] : 0;
        if (z2) {
            O1();
        }
        boolean z3 = j900Var.e == 1;
        int iK1 = this.h1;
        if (!z3) {
            iK1 = K1(j900Var.d, msjVar, the0Var) + L1(j900Var.d, msjVar, the0Var);
        }
        int i6 = 0;
        while (i6 < this.h1 && (i4 = j900Var.d) >= 0 && i4 < the0Var.b() && iK1 > 0) {
            int i7 = j900Var.d;
            int iL1 = L1(i7, msjVar, the0Var);
            if (iL1 > this.h1) {
                jf4.o(rz4.j(this.h1, " spans.", dw9.t("Item at position ", i7, " requires ", " spans but GridLayoutManager has only ", iL1)));
                return;
            }
            iK1 -= iL1;
            if (iK1 < 0 || (viewB = j900Var.b(msjVar)) == null) {
                break;
            }
            this.j1[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            h34Var.f12367a = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.j1[i];
            rgv rgvVar = (rgv) view.getLayoutParams();
            int iL2 = L1(b.T(view), msjVar, the0Var);
            rgvVar.f = iL2;
            rgvVar.e = i8;
            i8 += iL2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.j1[i10];
            if (j900Var.k != null) {
                z = false;
                if (z3) {
                    m(view2, -1, true);
                } else {
                    m(view2, 0, true);
                }
            } else if (z3) {
                l(view2);
                z = false;
            } else {
                z = false;
                m(view2, 0, false);
            }
            p(this.n1, view2);
            M1(view2, iL, z);
            int iE = this.r.e(view2);
            if (iE > i9) {
                i9 = iE;
            }
            float f2 = (this.r.f(view2) * 1.0f) / ((rgv) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            C1(Math.max(Math.round(f * this.h1), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.j1[i11];
                M1(view3, 1073741824, true);
                int iE2 = this.r.e(view3);
                if (iE2 > i9) {
                    i9 = iE2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.j1[i12];
            if (this.r.e(view4) != i9) {
                rgv rgvVar2 = (rgv) view4.getLayoutParams();
                Rect rect = rgvVar2.b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rgvVar2).topMargin + ((ViewGroup.MarginLayoutParams) rgvVar2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rgvVar2).leftMargin + ((ViewGroup.MarginLayoutParams) rgvVar2).rightMargin;
                int iI1 = I1(rgvVar2.e, rgvVar2.f);
                if (this.p == 1) {
                    iJ2 = b.J(false, iI1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) rgvVar2).width);
                    iJ = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iJ = b.J(false, iI1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) rgvVar2).height);
                    iJ2 = iMakeMeasureSpec;
                }
                if (Q0(view4, iJ2, iJ, (hhe0) view4.getLayoutParams())) {
                    view4.measure(iJ2, iJ);
                }
            }
        }
        h34Var.d = i9;
        int i15 = this.p;
        int i16 = j900Var.f;
        int iF2 = j900Var.b;
        if (i15 != 1) {
            if (i16 == -1) {
                paddingLeft = iF2 - i9;
                iF = iF2;
            } else {
                iF = iF2 + i9;
                paddingLeft = iF2;
            }
            paddingTop = 0;
            iF2 = 0;
        } else if (i16 == -1) {
            paddingTop = iF2 - i9;
            paddingLeft = 0;
            iF = 0;
        } else {
            paddingTop = iF2;
            iF = 0;
            iF2 += i9;
            paddingLeft = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.j1;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            rgv rgvVar3 = (rgv) view5.getLayoutParams();
            if (this.p != 1) {
                paddingTop = getPaddingTop() + this.i1[rgvVar3.e];
                iF2 = this.r.f(view5) + paddingTop;
            } else if (p1()) {
                int paddingLeft2 = getPaddingLeft() + this.i1[this.h1 - rgvVar3.e];
                iF = paddingLeft2;
                paddingLeft = paddingLeft2 - this.r.f(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.i1[rgvVar3.e];
                iF = this.r.f(view5) + paddingLeft;
            }
            b.a0(view5, paddingLeft, paddingTop, iF, iF2);
            if (rgvVar3.f13060a.k() || rgvVar3.f13060a.n()) {
                h34Var.b = true;
            }
            h34Var.c = view5.hasFocusable() | h34Var.c;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void r0(RecyclerView recyclerView, int i, int i2) {
        this.m1.s();
        ((SparseIntArray) this.m1.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r1(msj msjVar, the0 the0Var, amo amoVar, int i) {
        O1();
        if (the0Var.b() > 0 && !the0Var.g) {
            boolean z = i == 1;
            int iK1 = K1(amoVar.b, msjVar, the0Var);
            if (z) {
                while (iK1 > 0) {
                    int i2 = amoVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    amoVar.b = i3;
                    iK1 = K1(i3, msjVar, the0Var);
                }
            } else {
                int iB = the0Var.b() - 1;
                int i4 = amoVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iK2 = K1(i5, msjVar, the0Var);
                    if (iK2 <= iK1) {
                        break;
                    }
                    i4 = i5;
                    iK1 = iK2;
                }
                amoVar.b = i4;
            }
        }
        D1();
    }

    @Override // androidx.recyclerview.widget.b
    public boolean s(hhe0 hhe0Var) {
        return hhe0Var instanceof rgv;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public void s0(msj msjVar, the0 the0Var) {
        boolean z = the0Var.g;
        SparseIntArray sparseIntArray = this.l1;
        SparseIntArray sparseIntArray2 = this.k1;
        if (z) {
            int I = I();
            for (int i = 0; i < I; i++) {
                rgv rgvVar = (rgv) H(i).getLayoutParams();
                int iE = rgvVar.f13060a.e();
                sparseIntArray2.put(iE, rgvVar.f);
                sparseIntArray.put(iE, rgvVar.e);
            }
        }
        super.s0(msjVar, the0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void t0(the0 the0Var) {
        View viewD;
        super.t0(the0Var);
        this.g1 = false;
        int i = this.o1;
        if (i == -1 || (viewD = D(i)) == null) {
            return;
        }
        viewD.sendAccessibilityEvent(67108864);
        this.o1 = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int x(the0 the0Var) {
        return X0(the0Var);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final boolean x0(int i, Bundle bundle) {
        View viewH;
        xhe0 xhe0VarW;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == d7.q.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= I()) {
                    viewH = null;
                    break;
                }
                View viewH2 = H(i5);
                Objects.requireNonNull(viewH2);
                if (viewH2.isAccessibilityFocused()) {
                    viewH = H(i5);
                    break;
                }
                i5++;
            }
            if (viewH != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (r1.contains(Integer.valueOf(i6)) && (xhe0VarW = this.b.W(viewH)) != null) {
                    int iC = xhe0VarW.c();
                    int iF1 = F1(iC);
                    int iE1 = E1(iC);
                    if (iF1 >= 0 && iE1 >= 0) {
                        if (!G1(iC).contains(Integer.valueOf(this.p1)) || !H1(E1(iC), iC).contains(Integer.valueOf(this.q1))) {
                            this.p1 = iF1;
                            this.q1 = iE1;
                        }
                        int i7 = this.p1;
                        if (i7 == -1) {
                            i7 = iF1;
                        }
                        int i8 = this.q1;
                        if (i8 != -1) {
                            iE1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iC - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iF2 = F1(iIntValue);
                                    int iE2 = E1(iIntValue);
                                    if (iF2 >= 0 && iE2 >= 0) {
                                        if (this.p != 1) {
                                            if (G1(iIntValue).contains(Integer.valueOf(i7)) && iE2 < iE1) {
                                                this.q1 = iE2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iF2 == i7 && iE2 < iE1) || iF2 < i7) {
                                                this.p1 = iF2;
                                                this.q1 = iE2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < S()) {
                                                    it2 = G1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iF1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.p1 = iIntValue2;
                                                                this.q1 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iF1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < S()) {
                                                it4 = G1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iF1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.p1 = iIntValue3;
                                                            this.q1 = E1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.o1 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iC - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iF3 = F1(iIntValue);
                                    int iE3 = E1(iIntValue);
                                    if (iF3 >= 0 && iE3 >= 0) {
                                        if (this.p != 1) {
                                            if (iF3 < i7 && iE3 == iE1) {
                                                this.p1 = ((Integer) Collections.max(G1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iF3 < i7 && H1(E1(iIntValue), iIntValue).contains(Integer.valueOf(iE1))) {
                                                this.p1 = iF3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < S()) {
                                                    it2 = G1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iF1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.p1 = iIntValue2;
                                                                this.q1 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iF1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < S()) {
                                                it4 = G1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iF1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.p1 = iIntValue3;
                                                            this.q1 = E1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.o1 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iC + 1;
                            while (true) {
                                if (iIntValue < S()) {
                                    int iF4 = F1(iIntValue);
                                    int iE4 = E1(iIntValue);
                                    if (iF4 >= 0 && iE4 >= 0) {
                                        if (this.p != 1) {
                                            if (iE4 > iE1 && G1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.q1 = iE4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iF4 == i7 && iE4 > iE1) || iF4 > i7) {
                                                this.p1 = iF4;
                                                this.q1 = iE4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < S()) {
                                                    it2 = G1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iF1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.p1 = iIntValue2;
                                                                this.q1 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iF1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < S()) {
                                                it4 = G1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iF1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.p1 = iIntValue3;
                                                            this.q1 = E1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.o1 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iC + 1;
                            while (true) {
                                if (iIntValue < S()) {
                                    int iF5 = F1(iIntValue);
                                    int iE5 = E1(iIntValue);
                                    if (iF5 >= 0 && iE5 >= 0) {
                                        if (this.p != 1) {
                                            if (iF5 > i7 && iE5 == iE1) {
                                                this.p1 = F1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iF5 > i7 && (iE5 == iE1 || H1(E1(iIntValue), iIntValue).contains(Integer.valueOf(iE1)))) {
                                                this.p1 = iF5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.p) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iF1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < S()) {
                                                it2 = G1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iF1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.p1 = iIntValue2;
                                                            this.q1 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iF1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < S()) {
                                            it4 = G1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iF1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.p1 = iIntValue3;
                                                        this.q1 = E1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                H0(iIntValue);
                                this.o1 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.x0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iD = this.b.m.d();
                int i11 = 0;
                while (true) {
                    if (i11 >= iD) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int iK1 = K1(i11, recyclerView.c, recyclerView.H1);
                    RecyclerView recyclerView2 = this.b;
                    int iJ1 = J1(i11, recyclerView2.c, recyclerView2.H1);
                    if (this.p != 1) {
                        if (iK1 == i9 && iJ1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iK1 == i10 && iJ1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    w1(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int y(the0 the0Var) {
        return Y0(the0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y1(boolean z) {
        if (z) {
            v4i0.p("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.y1(false);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.g1 = false;
        this.h1 = -1;
        this.k1 = new SparseIntArray();
        this.l1 = new SparseIntArray();
        this.m1 = new qgv((byte) 8);
        this.n1 = new Rect();
        this.o1 = -1;
        this.p1 = -1;
        this.q1 = -1;
        N1(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.g1 = false;
        this.h1 = -1;
        this.k1 = new SparseIntArray();
        this.l1 = new SparseIntArray();
        this.m1 = new qgv((byte) 8);
        this.n1 = new Rect();
        this.o1 = -1;
        this.p1 = -1;
        this.q1 = -1;
        N1(i);
    }
}
