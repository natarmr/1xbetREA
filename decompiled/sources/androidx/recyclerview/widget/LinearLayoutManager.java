package androidx.recyclerview.widget;

import a.amo;
import a.d7;
import a.ghe0;
import a.h34;
import a.hhe0;
import a.j900;
import a.jf4;
import a.k7;
import a.msj;
import a.pa80;
import a.rhe0;
import a.the0;
import a.twn;
import a.uyx;
import a.xhe0;
import a.yge0;
import a.yjc;
import a.yyw;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends b implements uyx, rhe0 {
    public SavedState A;
    public final amo B;
    public final h34 Y;
    public byte Z;
    public final int[] f1;
    public int p;
    public j900 q;
    public pa80 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45397a;
        public int b;
        public boolean c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f45397a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A = null;
        this.B = new amo();
        this.Y = new h34();
        this.Z = (byte) 2;
        this.f1 = new int[2];
        ghe0 ghe0VarU = b.U(context, attributeSet, i, i2);
        x1(ghe0VarU.f11294a);
        boolean z = ghe0VarU.c;
        n(null);
        if (z != this.t) {
            this.t = z;
            F0();
        }
        y1(ghe0VarU.d);
    }

    @Override // androidx.recyclerview.widget.b
    public int A(the0 the0Var) {
        return X0(the0Var);
    }

    public final void A1(int i, int i2) {
        this.q.c = this.r.i() - i2;
        j900 j900Var = this.q;
        j900Var.e = this.u ? -1 : 1;
        j900Var.d = i;
        j900Var.f = 1;
        j900Var.b = i2;
        j900Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.b
    public int B(the0 the0Var) {
        return Y0(the0Var);
    }

    public final void B1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        j900 j900Var = this.q;
        j900Var.d = i;
        j900Var.e = this.u ? 1 : -1;
        j900Var.f = -1;
        j900Var.b = i2;
        j900Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.b
    public final View D(int i) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int iT = i - b.T(H(0));
        if (iT >= 0 && iT < I) {
            View viewH = H(iT);
            if (b.T(viewH) == i) {
                return viewH;
            }
        }
        return super.D(i);
    }

    @Override // androidx.recyclerview.widget.b
    public int G0(int i, msj msjVar, the0 the0Var) {
        if (this.p == 1) {
            return 0;
        }
        return v1(i, msjVar, the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public void H0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.A;
        if (savedState != null) {
            savedState.f45397a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.b
    public int I0(int i, msj msjVar, the0 the0Var) {
        if (this.p == 0) {
            return 0;
        }
        return v1(i, msjVar, the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean P0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int I = I();
            for (int i = 0; i < I; i++) {
                ViewGroup.LayoutParams layoutParams = H(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b
    public boolean T0() {
        return this.A == null && this.s == this.v;
    }

    public void U0(the0 the0Var, int[] iArr) {
        int i;
        int iN = the0Var.f33958a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void V0(the0 the0Var, j900 j900Var, yjc yjcVar) {
        int i = j900Var.d;
        if (i < 0 || i >= the0Var.b()) {
            return;
        }
        yjcVar.b(i, Math.max(0, j900Var.g));
    }

    public final int W0(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        a1();
        return yyw.C(the0Var, this.r, e1(!this.w), d1(!this.w), this, this.w);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean X() {
        return true;
    }

    public final int X0(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        a1();
        return yyw.D(the0Var, this.r, e1(!this.w), d1(!this.w), this, this.w, this.u);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean Y() {
        return this.t;
    }

    public final int Y0(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        a1();
        return yyw.E(the0Var, this.r, e1(!this.w), d1(!this.w), this, this.w);
    }

    public final int Z0(int i) {
        if (i == 1) {
            return (this.p != 1 && p1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && p1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // a.rhe0
    public final PointF a(int i) {
        if (I() == 0) {
            return null;
        }
        int i2 = (i < b.T(H(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1() {
        if (this.q == null) {
            j900 j900Var = new j900();
            j900Var.f16114a = true;
            j900Var.h = 0;
            j900Var.i = 0;
            j900Var.k = null;
            this.q = j900Var;
        }
    }

    public final int b1(msj msjVar, j900 j900Var, the0 the0Var, boolean z) {
        int i;
        int i2 = j900Var.c;
        int i3 = j900Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                j900Var.g = i3 + i2;
            }
            s1(msjVar, j900Var);
        }
        int i4 = j900Var.c + j900Var.h;
        while (true) {
            if ((!j900Var.l && i4 <= 0) || (i = j900Var.d) < 0 || i >= the0Var.b()) {
                break;
            }
            h34 h34Var = this.Y;
            h34Var.d = 0;
            h34Var.f12367a = false;
            h34Var.b = false;
            h34Var.c = false;
            q1(msjVar, the0Var, j900Var, h34Var);
            if (!h34Var.f12367a) {
                int i5 = j900Var.b;
                int i6 = h34Var.d;
                j900Var.b = (j900Var.f * i6) + i5;
                if (!h34Var.b || j900Var.k != null || !the0Var.g) {
                    j900Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = j900Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    j900Var.g = i8;
                    int i9 = j900Var.c;
                    if (i9 < 0) {
                        j900Var.g = i8 + i9;
                    }
                    s1(msjVar, j900Var);
                }
                if (z && h34Var.c) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - j900Var.c;
    }

    public final int c1() {
        View viewJ1 = j1(0, I(), true, false);
        if (viewJ1 == null) {
            return -1;
        }
        return b.T(viewJ1);
    }

    public final View d1(boolean z) {
        return this.u ? j1(0, I(), z, true) : j1(I() - 1, -1, z, true);
    }

    public final View e1(boolean z) {
        return this.u ? j1(I() - 1, -1, z, true) : j1(0, I(), z, true);
    }

    public final int f1() {
        View viewJ1 = j1(0, I(), false, true);
        if (viewJ1 == null) {
            return -1;
        }
        return b.T(viewJ1);
    }

    @Override // androidx.recyclerview.widget.b
    public final void g0(RecyclerView recyclerView, msj msjVar) {
        if (this.z) {
            A0(msjVar);
            ((ArrayList) msjVar.c).clear();
            msjVar.i();
        }
    }

    public final int g1() {
        View viewJ1 = j1(I() - 1, -1, true, false);
        if (viewJ1 == null) {
            return -1;
        }
        return b.T(viewJ1);
    }

    @Override // androidx.recyclerview.widget.b
    public View h0(View view, int i, msj msjVar, the0 the0Var) {
        int iZ0;
        View viewI1;
        u1();
        if (I() != 0 && (iZ0 = Z0(i)) != Integer.MIN_VALUE) {
            a1();
            z1(iZ0, (int) (this.r.n() * 0.33333334f), false, the0Var);
            j900 j900Var = this.q;
            j900Var.g = Integer.MIN_VALUE;
            j900Var.f16114a = false;
            b1(msjVar, j900Var, the0Var, true);
            boolean z = this.u;
            if (iZ0 == -1) {
                viewI1 = z ? i1(I() - 1, -1) : i1(0, I());
            } else {
                viewI1 = z ? i1(0, I()) : i1(I() - 1, -1);
            }
            View viewO1 = iZ0 == -1 ? o1() : n1();
            if (!viewO1.hasFocusable()) {
                return viewI1;
            }
            if (viewI1 != null) {
                return viewO1;
            }
        }
        return null;
    }

    public final int h1() {
        View viewJ1 = j1(I() - 1, -1, false, true);
        if (viewJ1 == null) {
            return -1;
        }
        return b.T(viewJ1);
    }

    @Override // androidx.recyclerview.widget.b
    public final void i0(AccessibilityEvent accessibilityEvent) {
        super.i0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(f1());
            accessibilityEvent.setToIndex(h1());
        }
    }

    public final View i1(int i, int i2) {
        int i3;
        int i4;
        a1();
        if (i2 <= i && i2 >= i) {
            return H(i);
        }
        if (this.r.g(H(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.k(i, i2, i3, i4) : this.d.k(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.b
    public void j0(msj msjVar, the0 the0Var, k7 k7Var) {
        super.j0(msjVar, the0Var, k7Var);
        yge0 yge0Var = this.b.m;
        if (yge0Var == null || yge0Var.d() <= 0) {
            return;
        }
        k7Var.b(d7.l);
    }

    public final View j1(int i, int i2, boolean z, boolean z2) {
        a1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.k(i, i2, i3, i4) : this.d.k(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View k1(msj msjVar, the0 the0Var, boolean z, boolean z2) {
        int i;
        int I;
        int i2;
        a1();
        int I2 = I();
        if (z2) {
            I = I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = I2;
            I = 0;
            i2 = 1;
        }
        int iB = the0Var.b();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (I != i) {
            View viewH = H(I);
            int iT = b.T(viewH);
            int iG = this.r.g(viewH);
            int iD = this.r.d(viewH);
            if (iT >= 0 && iT < iB) {
                if (!((hhe0) viewH.getLayoutParams()).f13060a.k()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewH;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewH;
                        } else if (view == null) {
                            view = viewH;
                        }
                    } else if (z3) {
                        view2 = viewH;
                    } else if (view == null) {
                        view = viewH;
                    }
                } else if (view3 == null) {
                    view3 = viewH;
                }
            }
            I += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int l1(int i, msj msjVar, the0 the0Var, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -v1(-i3, msjVar, the0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.r.i() - i5) <= 0) {
            return i4;
        }
        this.r.r(i2);
        return i2 + i4;
    }

    public final int m1(int i, msj msjVar, the0 the0Var, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -v1(iM2, msjVar, the0Var);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.r(-iM);
        return i2 - iM;
    }

    @Override // androidx.recyclerview.widget.b
    public final void n(String str) {
        if (this.A == null) {
            super.n(str);
        }
    }

    public final View n1() {
        return H(this.u ? 0 : I() - 1);
    }

    public final View o1() {
        return H(this.u ? I() - 1 : 0);
    }

    public final boolean p1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.b
    public boolean q() {
        return this.p == 0;
    }

    public void q1(msj msjVar, the0 the0Var, j900 j900Var, h34 h34Var) {
        int i;
        int iF;
        int i2;
        int iF2;
        View viewB = j900Var.b(msjVar);
        if (viewB == null) {
            h34Var.f12367a = true;
            return;
        }
        hhe0 hhe0Var = (hhe0) viewB.getLayoutParams();
        List list = j900Var.k;
        boolean z = this.u;
        int i3 = j900Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                l(viewB);
            } else {
                m(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                m(viewB, -1, true);
            } else {
                m(viewB, 0, true);
            }
        }
        b0(viewB);
        h34Var.d = this.r.e(viewB);
        if (this.p == 1) {
            if (p1()) {
                iF2 = this.n - getPaddingRight();
                iF = iF2 - this.r.f(viewB);
            } else {
                int paddingLeft = getPaddingLeft();
                iF2 = this.r.f(viewB) + paddingLeft;
                iF = paddingLeft;
            }
            int i4 = j900Var.f;
            i2 = j900Var.b;
            int i5 = h34Var.d;
            if (i4 == -1) {
                int i6 = i2 - i5;
                i = i2;
                i2 = i6;
            } else {
                i = i5 + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF3 = this.r.f(viewB) + paddingTop;
            int i7 = j900Var.f;
            int i8 = j900Var.b;
            int i9 = h34Var.d;
            if (i7 == -1) {
                int i10 = i8 - i9;
                iF2 = i8;
                i2 = paddingTop;
                i = iF3;
                iF = i10;
            } else {
                int i11 = i8 + i9;
                i = iF3;
                iF = i8;
                i2 = paddingTop;
                iF2 = i11;
            }
        }
        b.a0(viewB, iF, i2, iF2, i);
        if (hhe0Var.f13060a.k() || hhe0Var.f13060a.n()) {
            h34Var.b = true;
        }
        h34Var.c = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.b
    public boolean r() {
        return this.p == 1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:122:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0220  */
    /* JADX WARN: Code duplicated, block: B:126:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0227  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0230  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0241  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.b
    public void s0(msj msjVar, the0 the0Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewK1;
        boolean z3;
        pa80 pa80Var;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        hhe0 hhe0Var;
        int i2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iL1;
        int i7;
        View viewD;
        int iG2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.A == null && this.x == -1) && the0Var.b() == 0) {
            A0(msjVar);
            return;
        }
        SavedState savedState = this.A;
        if (savedState != null && (i9 = savedState.f45397a) >= 0) {
            this.x = i9;
        }
        a1();
        boolean z6 = false;
        this.q.f16114a = false;
        u1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.f45401a.c.contains(focusedChild)) {
            focusedChild = null;
        }
        amo amoVar = this.B;
        if (!amoVar.e || this.x != -1 || this.A != null) {
            amoVar.d();
            amoVar.d = this.u ^ this.v;
            if (the0Var.g || (i2 = this.x) == -1) {
                if (I() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.f45401a.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        hhe0Var = (hhe0) focusedChild2.getLayoutParams();
                        if (!hhe0Var.f13060a.k() || hhe0Var.f13060a.e() < 0 || hhe0Var.f13060a.e() >= the0Var.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewK1 = k1(msjVar, the0Var, amoVar.d, z2)) == null) {
                                amoVar.a();
                                if (this.v) {
                                    iB = the0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                amoVar.b = iB;
                            } else {
                                int iT = b.T(viewK1);
                                z3 = amoVar.d;
                                pa80Var = (pa80) amoVar.f;
                                if (z3) {
                                    amoVar.c = ((pa80) amoVar.f).o() + pa80Var.d(viewK1);
                                } else {
                                    amoVar.c = pa80Var.g(viewK1);
                                }
                                amoVar.b = iT;
                                if (!the0Var.g && T0()) {
                                    iG = this.r.g(viewK1);
                                    iD = this.r.d(viewK1);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (amoVar.d) {
                                            iM = i;
                                        }
                                        amoVar.c = iM;
                                    }
                                }
                            }
                        } else {
                            amoVar.b(focusedChild2, b.T(focusedChild2));
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            amoVar.a();
                            if (this.v) {
                                iB = the0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            amoVar.b = iB;
                        } else {
                            int iT2 = b.T(viewK1);
                            z3 = amoVar.d;
                            pa80Var = (pa80) amoVar.f;
                            if (z3) {
                                amoVar.c = ((pa80) amoVar.f).o() + pa80Var.d(viewK1);
                            } else {
                                amoVar.c = pa80Var.g(viewK1);
                            }
                            amoVar.b = iT2;
                            if (!the0Var.g) {
                                iG = this.r.g(viewK1);
                                iD = this.r.d(viewK1);
                                iM = this.r.m();
                                i = this.r.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (amoVar.d) {
                                        iM = i;
                                    }
                                    amoVar.c = iM;
                                } else {
                                    if (amoVar.d) {
                                        iM = i;
                                    }
                                    amoVar.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    amoVar.a();
                    if (this.v) {
                        iB = the0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    amoVar.b = iB;
                }
            } else if (i2 < 0 || i2 >= the0Var.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (I() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        hhe0Var = (hhe0) focusedChild2.getLayoutParams();
                        if (hhe0Var.f13060a.k()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                amoVar.a();
                                if (this.v) {
                                    iB = the0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                amoVar.b = iB;
                            } else {
                                int iT3 = b.T(viewK1);
                                z3 = amoVar.d;
                                pa80Var = (pa80) amoVar.f;
                                if (z3) {
                                    amoVar.c = ((pa80) amoVar.f).o() + pa80Var.d(viewK1);
                                } else {
                                    amoVar.c = pa80Var.g(viewK1);
                                }
                                amoVar.b = iT3;
                                if (!the0Var.g) {
                                    iG = this.r.g(viewK1);
                                    iD = this.r.d(viewK1);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (amoVar.d) {
                                            iM = i;
                                        }
                                        amoVar.c = iM;
                                    } else {
                                        if (amoVar.d) {
                                            iM = i;
                                        }
                                        amoVar.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                amoVar.a();
                                if (this.v) {
                                    iB = the0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                amoVar.b = iB;
                            } else {
                                int iT4 = b.T(viewK1);
                                z3 = amoVar.d;
                                pa80Var = (pa80) amoVar.f;
                                if (z3) {
                                    amoVar.c = ((pa80) amoVar.f).o() + pa80Var.d(viewK1);
                                } else {
                                    amoVar.c = pa80Var.g(viewK1);
                                }
                                amoVar.b = iT4;
                                if (!the0Var.g) {
                                    iG = this.r.g(viewK1);
                                    iD = this.r.d(viewK1);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (amoVar.d) {
                                            iM = i;
                                        }
                                        amoVar.c = iM;
                                    } else {
                                        if (amoVar.d) {
                                            iM = i;
                                        }
                                        amoVar.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            amoVar.a();
                            if (this.v) {
                                iB = the0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            amoVar.b = iB;
                        } else {
                            int iT5 = b.T(viewK1);
                            z3 = amoVar.d;
                            pa80Var = (pa80) amoVar.f;
                            if (z3) {
                                amoVar.c = ((pa80) amoVar.f).o() + pa80Var.d(viewK1);
                            } else {
                                amoVar.c = pa80Var.g(viewK1);
                            }
                            amoVar.b = iT5;
                            if (!the0Var.g) {
                                iG = this.r.g(viewK1);
                                iD = this.r.d(viewK1);
                                iM = this.r.m();
                                i = this.r.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (amoVar.d) {
                                        iM = i;
                                    }
                                    amoVar.c = iM;
                                } else {
                                    if (amoVar.d) {
                                        iM = i;
                                    }
                                    amoVar.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    amoVar.a();
                    if (this.v) {
                        iB = the0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    amoVar.b = iB;
                }
            } else {
                int i11 = this.x;
                amoVar.b = i11;
                SavedState savedState2 = this.A;
                if (savedState2 != null && savedState2.f45397a >= 0) {
                    boolean z7 = savedState2.c;
                    amoVar.d = z7;
                    pa80 pa80Var2 = this.r;
                    if (z7) {
                        amoVar.c = pa80Var2.i() - this.A.b;
                    } else {
                        amoVar.c = pa80Var2.m() + this.A.b;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewD2 = D(i11);
                    if (viewD2 == null) {
                        if (I() > 0) {
                            amoVar.d = (this.x < b.T(H(0))) == this.u;
                        }
                        amoVar.a();
                    } else if (this.r.e(viewD2) > this.r.n()) {
                        amoVar.a();
                    } else {
                        int iG3 = this.r.g(viewD2) - this.r.m();
                        pa80 pa80Var3 = this.r;
                        if (iG3 < 0) {
                            amoVar.c = pa80Var3.m();
                            amoVar.d = false;
                        } else if (pa80Var3.i() - this.r.d(viewD2) < 0) {
                            amoVar.c = this.r.i();
                            amoVar.d = true;
                        } else {
                            boolean z8 = amoVar.d;
                            pa80 pa80Var4 = this.r;
                            amoVar.c = z8 ? this.r.o() + pa80Var4.d(viewD2) : pa80Var4.g(viewD2);
                        }
                    }
                } else {
                    boolean z9 = this.u;
                    amoVar.d = z9;
                    pa80 pa80Var5 = this.r;
                    if (z9) {
                        amoVar.c = pa80Var5.i() - this.y;
                    } else {
                        amoVar.c = pa80Var5.m() + this.y;
                    }
                }
            }
            amoVar.e = true;
        } else if (focusedChild != null && (this.r.g(focusedChild) >= this.r.i() || this.r.d(focusedChild) <= this.r.m())) {
            amoVar.b(focusedChild, b.T(focusedChild));
        }
        j900 j900Var = this.q;
        j900Var.f = j900Var.j >= 0 ? 1 : -1;
        int[] iArr = this.f1;
        iArr[0] = 0;
        iArr[1] = 0;
        U0(the0Var, iArr);
        int iM2 = this.r.m() + Math.max(0, iArr[0]);
        int iJ = this.r.j() + Math.max(0, iArr[1]);
        if (the0Var.g && (i7 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewD = D(i7)) != null) {
            boolean z10 = this.u;
            pa80 pa80Var6 = this.r;
            if (z10) {
                i8 = pa80Var6.i() - this.r.d(viewD);
                iG2 = this.y;
            } else {
                iG2 = pa80Var6.g(viewD) - this.r.m();
                i8 = this.y;
            }
            int i12 = i8 - iG2;
            if (i12 > 0) {
                iM2 += i12;
            } else {
                iJ -= i12;
            }
        }
        boolean z11 = amoVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i10 = 1;
        }
        r1(msjVar, the0Var, amoVar, i10);
        C(msjVar);
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = amoVar.d;
        int i13 = amoVar.b;
        if (z13) {
            B1(i13, amoVar.c);
            j900 j900Var2 = this.q;
            j900Var2.h = iM2;
            b1(msjVar, j900Var2, the0Var, false);
            j900 j900Var3 = this.q;
            i4 = j900Var3.b;
            int i14 = j900Var3.d;
            int i15 = j900Var3.c;
            if (i15 > 0) {
                iJ += i15;
            }
            A1(amoVar.b, amoVar.c);
            j900 j900Var4 = this.q;
            j900Var4.h = iJ;
            j900Var4.d += j900Var4.e;
            b1(msjVar, j900Var4, the0Var, false);
            j900 j900Var5 = this.q;
            i3 = j900Var5.b;
            int i16 = j900Var5.c;
            if (i16 > 0) {
                B1(i14, i4);
                j900 j900Var6 = this.q;
                j900Var6.h = i16;
                b1(msjVar, j900Var6, the0Var, false);
                i4 = this.q.b;
            }
        } else {
            A1(i13, amoVar.c);
            j900 j900Var7 = this.q;
            j900Var7.h = iJ;
            b1(msjVar, j900Var7, the0Var, false);
            j900 j900Var8 = this.q;
            i3 = j900Var8.b;
            int i17 = j900Var8.d;
            int i18 = j900Var8.c;
            if (i18 > 0) {
                iM2 += i18;
            }
            B1(amoVar.b, amoVar.c);
            j900 j900Var9 = this.q;
            j900Var9.h = iM2;
            j900Var9.d += j900Var9.e;
            b1(msjVar, j900Var9, the0Var, false);
            j900 j900Var10 = this.q;
            int i19 = j900Var10.b;
            int i20 = j900Var10.c;
            if (i20 > 0) {
                A1(i17, i3);
                j900 j900Var11 = this.q;
                j900Var11.h = i20;
                b1(msjVar, j900Var11, the0Var, false);
                i3 = this.q.b;
            }
            i4 = i19;
        }
        if (I() > 0) {
            if (this.u ^ this.v) {
                int iL2 = l1(i3, msjVar, the0Var, true);
                i5 = i4 + iL2;
                i6 = i3 + iL2;
                iL1 = m1(i5, msjVar, the0Var, false);
            } else {
                int iM1 = m1(i4, msjVar, the0Var, true);
                i5 = i4 + iM1;
                i6 = i3 + iM1;
                iL1 = l1(i6, msjVar, the0Var, false);
            }
            i4 = i5 + iL1;
            i3 = i6 + iL1;
        }
        if (the0Var.k && I() != 0 && !the0Var.g && T0()) {
            List list2 = (List) msjVar.f;
            int size = list2.size();
            int iT6 = b.T(H(0));
            int i21 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i21 < size) {
                xhe0 xhe0Var = (xhe0) list2.get(i21);
                boolean zK = xhe0Var.k();
                View view = xhe0Var.f40887a;
                if (!zK) {
                    boolean z14 = xhe0Var.e() < iT6 ? true : z6;
                    boolean z15 = this.u;
                    pa80 pa80Var7 = this.r;
                    if (z14 != z15) {
                        iE += pa80Var7.e(view);
                    } else {
                        iE2 += pa80Var7.e(view);
                    }
                }
                i21++;
                z6 = false;
            }
            this.q.k = list2;
            if (iE > 0) {
                B1(b.T(o1()), i4);
                j900 j900Var12 = this.q;
                j900Var12.h = iE;
                r4 = 0;
                j900Var12.c = 0;
                j900Var12.a(null);
                b1(msjVar, this.q, the0Var, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                A1(b.T(n1()), i3);
                j900 j900Var13 = this.q;
                j900Var13.h = iE2;
                j900Var13.c = r4;
                list = null;
                j900Var13.a(null);
                b1(msjVar, this.q, the0Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (the0Var.g) {
            amoVar.d();
        } else {
            pa80 pa80Var8 = this.r;
            pa80Var8.f26643a = pa80Var8.n();
        }
        this.s = this.v;
    }

    public final void s1(msj msjVar, j900 j900Var) {
        if (!j900Var.f16114a || j900Var.l) {
            return;
        }
        int i = j900Var.g;
        int i2 = j900Var.i;
        if (j900Var.f == -1) {
            int I = I();
            if (i < 0) {
                return;
            }
            int iH = (this.r.h() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < I; i3++) {
                    View viewH = H(i3);
                    if (this.r.g(viewH) < iH || this.r.q(viewH) < iH) {
                        t1(msjVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = I - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewH2 = H(i5);
                if (this.r.g(viewH2) < iH || this.r.q(viewH2) < iH) {
                    t1(msjVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int I2 = I();
        if (!this.u) {
            for (int i7 = 0; i7 < I2; i7++) {
                View viewH3 = H(i7);
                if (this.r.d(viewH3) > i6 || this.r.p(viewH3) > i6) {
                    t1(msjVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = I2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewH4 = H(i9);
            if (this.r.d(viewH4) > i6 || this.r.p(viewH4) > i6) {
                t1(msjVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.b
    public void t0(the0 the0Var) {
        this.A = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.B.d();
    }

    public final void t1(msj msjVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewH = H(i);
                if (H(i) != null) {
                    this.f45401a.k(i);
                }
                msjVar.k(viewH);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewH2 = H(i3);
            if (H(i3) != null) {
                this.f45401a.k(i3);
            }
            msjVar.k(viewH2);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void u(int i, int i2, the0 the0Var, yjc yjcVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        a1();
        z1(i > 0 ? 1 : -1, Math.abs(i), true, the0Var);
        V0(the0Var, this.q, yjcVar);
    }

    @Override // androidx.recyclerview.widget.b
    public void u0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A = savedState;
            if (this.x != -1) {
                savedState.f45397a = -1;
            }
            F0();
        }
    }

    public final void u1() {
        if (this.p == 1 || !p1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void v(int i, yjc yjcVar) {
        boolean z;
        int i2;
        SavedState savedState = this.A;
        if (savedState == null || (i2 = savedState.f45397a) < 0) {
            u1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.Z && i2 >= 0 && i2 < i; i4++) {
            yjcVar.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public Parcelable v0() {
        SavedState savedState = this.A;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f45397a = savedState.f45397a;
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (I() <= 0) {
            savedState3.f45397a = -1;
            return savedState3;
        }
        a1();
        boolean z = this.s ^ this.u;
        savedState3.c = z;
        if (z) {
            View viewN1 = n1();
            savedState3.b = this.r.i() - this.r.d(viewN1);
            savedState3.f45397a = b.T(viewN1);
            return savedState3;
        }
        View viewO1 = o1();
        savedState3.f45397a = b.T(viewO1);
        savedState3.b = this.r.g(viewO1) - this.r.m();
        return savedState3;
    }

    public final int v1(int i, msj msjVar, the0 the0Var) {
        if (I() != 0 && i != 0) {
            a1();
            this.q.f16114a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            z1(i2, iAbs, true, the0Var);
            j900 j900Var = this.q;
            int iB1 = b1(msjVar, j900Var, the0Var, false) + j900Var.g;
            if (iB1 >= 0) {
                if (iAbs > iB1) {
                    i = i2 * iB1;
                }
                this.r.r(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final int w(the0 the0Var) {
        return W0(the0Var);
    }

    public void w1(int i, int i2) {
        this.x = i;
        this.y = i2;
        SavedState savedState = this.A;
        if (savedState != null) {
            savedState.f45397a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.b
    public int x(the0 the0Var) {
        return X0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public boolean x0(int i, Bundle bundle) {
        int iMin;
        if (super.x0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i2, V(recyclerView.c, recyclerView.H1) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i3, K(recyclerView2.c, recyclerView2.H1) - 1);
            }
            if (iMin >= 0) {
                w1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final void x1(int i) {
        if (i != 0 && i != 1) {
            jf4.o(twn.m(i, "invalid orientation:"));
            return;
        }
        n(null);
        if (i != this.p || this.r == null) {
            pa80 pa80VarB = pa80.b(this, i);
            this.r = pa80VarB;
            this.B.f = pa80VarB;
            this.p = i;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public int y(the0 the0Var) {
        return Y0(the0Var);
    }

    public void y1(boolean z) {
        n(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        F0();
    }

    @Override // androidx.recyclerview.widget.b
    public final int z(the0 the0Var) {
        return W0(the0Var);
    }

    public final void z1(int i, int i2, boolean z, the0 the0Var) {
        int iM;
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.f = i;
        int[] iArr = this.f1;
        iArr[0] = 0;
        iArr[1] = 0;
        U0(the0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        j900 j900Var = this.q;
        int i3 = z2 ? iMax2 : iMax;
        j900Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        j900Var.i = iMax;
        if (z2) {
            j900Var.h = this.r.j() + i3;
            View viewN1 = n1();
            j900 j900Var2 = this.q;
            j900Var2.e = this.u ? -1 : 1;
            int iT = b.T(viewN1);
            j900 j900Var3 = this.q;
            j900Var2.d = iT + j900Var3.e;
            j900Var3.b = this.r.d(viewN1);
            iM = this.r.d(viewN1) - this.r.i();
        } else {
            View viewO1 = o1();
            j900 j900Var4 = this.q;
            j900Var4.h = this.r.m() + j900Var4.h;
            j900 j900Var5 = this.q;
            j900Var5.e = this.u ? 1 : -1;
            int iT2 = b.T(viewO1);
            j900 j900Var6 = this.q;
            j900Var5.d = iT2 + j900Var6.e;
            j900Var6.b = this.r.g(viewO1);
            iM = (-this.r.g(viewO1)) + this.r.m();
        }
        j900 j900Var7 = this.q;
        j900Var7.c = i2;
        if (z) {
            j900Var7.c = i2 - iM;
        }
        j900Var7.g = iM;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A = null;
        this.B = new amo();
        this.Y = new h34();
        this.Z = (byte) 2;
        this.f1 = new int[2];
        x1(i);
        n(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        F0();
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void r1(msj msjVar, the0 the0Var, amo amoVar, int i) {
    }
}
