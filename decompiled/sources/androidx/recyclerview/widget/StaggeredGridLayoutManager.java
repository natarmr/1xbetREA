package androidx.recyclerview.widget;

import a.a4m0;
import a.dw9;
import a.ghe0;
import a.hhe0;
import a.j7;
import a.jf4;
import a.k7;
import a.l8k0;
import a.l900;
import a.msj;
import a.mx2;
import a.pa80;
import a.rgu0;
import a.rhe0;
import a.she0;
import a.the0;
import a.w7z;
import a.yge0;
import a.yjc;
import a.yyw;
import a.z3m0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends b implements rhe0 {
    public final f B;
    public final byte Y;
    public boolean Z;
    public boolean f1;
    public SavedState g1;
    public final Rect h1;
    public final z3m0 i1;
    public final boolean j1;
    public int[] k1;
    public final mx2 l1;
    public final int p;
    public final l8k0[] q;
    public final pa80 r;
    public final pa80 s;
    public final int t;
    public int u;
    public final w7z v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45400a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public ArrayList g;
        public boolean h;
        public boolean i;
        public boolean j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f45400a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        f fVar = new f();
        this.B = fVar;
        this.Y = (byte) 2;
        this.h1 = new Rect();
        this.i1 = new z3m0(this);
        this.j1 = true;
        this.l1 = new mx2(this, (byte) 26);
        ghe0 ghe0VarU = b.U(context, attributeSet, i, i2);
        int i3 = ghe0VarU.f11294a;
        if (i3 != 0 && i3 != 1) {
            jf4.o("invalid orientation.");
            throw null;
        }
        n(null);
        if (i3 != this.t) {
            this.t = i3;
            pa80 pa80Var = this.r;
            this.r = this.s;
            this.s = pa80Var;
            F0();
        }
        int i4 = ghe0VarU.b;
        n(null);
        if (i4 != this.p) {
            fVar.a();
            F0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new l8k0[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new l8k0(this, i5);
            }
            F0();
        }
        boolean z = ghe0VarU.c;
        n(null);
        SavedState savedState = this.g1;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.w = z;
        F0();
        w7z w7zVar = new w7z();
        w7zVar.f38696a = true;
        w7zVar.f = 0;
        w7zVar.g = 0;
        this.v = w7zVar;
        this.r = pa80.b(this, this.t);
        this.s = pa80.b(this, 1 - this.t);
    }

    public static int u1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.b
    public final int A(the0 the0Var) {
        return V0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int B(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return yyw.E(the0Var, this.r, Y0(z), X0(z), this, this.j1);
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 E() {
        return this.t == 0 ? new a4m0(-2, -1) : new a4m0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 F(Context context, AttributeSet attributeSet) {
        return new a4m0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.b
    public final hhe0 G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a4m0((ViewGroup.MarginLayoutParams) layoutParams) : new a4m0(layoutParams);
    }

    @Override // androidx.recyclerview.widget.b
    public final int G0(int i, msj msjVar, the0 the0Var) {
        return q1(i, msjVar, the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final void H0(int i) {
        SavedState savedState = this.g1;
        if (savedState != null && savedState.f45400a != i) {
            savedState.d = null;
            savedState.c = 0;
            savedState.f45400a = -1;
            savedState.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        F0();
    }

    @Override // androidx.recyclerview.widget.b
    public final int I0(int i, msj msjVar, the0 the0Var) {
        return q1(i, msjVar, the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int K(msj msjVar, the0 the0Var) {
        if (this.t == 1) {
            return Math.min(this.p, the0Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.b
    public final void L0(Rect rect, int i, int i2) {
        int iT;
        int iT2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = rgu0.f30456a;
            iT2 = b.t(i2, iHeight, recyclerView.getMinimumHeight());
            iT = b.t(i, (this.u * i4) + paddingRight, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = rgu0.f30456a;
            iT = b.t(i, iWidth, recyclerView2.getMinimumWidth());
            iT2 = b.t(i2, (this.u * i4) + paddingBottom, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iT, iT2);
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        l900 l900Var = new l900(recyclerView.getContext());
        l900Var.f32207a = i;
        S0(l900Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean T0() {
        return this.g1 == null;
    }

    public final boolean U0() {
        int iB1;
        if (I() != 0 && this.Y != 0 && this.g) {
            if (this.x) {
                iB1 = c1();
                b1();
            } else {
                iB1 = b1();
                c1();
            }
            if (iB1 == 0 && g1() != null) {
                this.B.a();
                this.f = true;
                F0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b
    public final int V(msj msjVar, the0 the0Var) {
        if (this.t == 0) {
            return Math.min(this.p, the0Var.b());
        }
        return -1;
    }

    public final int V0(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return yyw.D(the0Var, this.r, Y0(z), X0(z), this, this.j1, this.x);
    }

    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    public final int W0(msj msjVar, w7z w7zVar, the0 the0Var) {
        int i;
        int i2;
        l8k0[] l8k0VarArr;
        int iD1;
        BitSet bitSet;
        int i3;
        l8k0[] l8k0VarArr2;
        l8k0 l8k0Var;
        ?? r4;
        int iJ;
        int iE;
        int iE2;
        int i4;
        BitSet bitSet2;
        int i5;
        int i6;
        int i7;
        msj msjVar2 = msjVar;
        BitSet bitSet3 = this.y;
        int i8 = this.p;
        bitSet3.set(0, i8, true);
        w7z w7zVar2 = this.v;
        if (w7zVar2.i) {
            i = w7zVar.e;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = w7zVar.e;
            i2 = i == 1 ? w7zVar.g + w7zVar.b : w7zVar.f - w7zVar.b;
        }
        int i9 = 0;
        while (true) {
            l8k0VarArr = this.q;
            if (i9 >= i8) {
                break;
            }
            if (!l8k0VarArr[i9].f19609a.isEmpty()) {
                t1(l8k0VarArr[i9], i, i2);
            }
            i9++;
        }
        boolean z = this.x;
        pa80 pa80Var = this.r;
        int i10 = z ? pa80Var.i() : pa80Var.m();
        boolean z2 = false;
        while (true) {
            int i11 = w7zVar.c;
            if (i11 < 0 || i11 >= the0Var.b() || (!w7zVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View viewE = msjVar2.e(w7zVar.c);
            w7zVar.c += w7zVar.d;
            a4m0 a4m0Var = (a4m0) viewE.getLayoutParams();
            int iE3 = a4m0Var.f13060a.e();
            f fVar = this.B;
            int[] iArr = fVar.f45403a;
            int i12 = (iArr == null || iE3 >= iArr.length) ? -1 : iArr[iE3];
            if (i12 == -1) {
                if (k1(w7zVar.e)) {
                    i6 = i8 - 1;
                    i3 = i8;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i5 = i8;
                    i3 = i5;
                    i6 = 0;
                    i7 = 1;
                }
                l8k0 l8k0Var2 = null;
                int i13 = i6;
                if (w7zVar.e == 1) {
                    int iM = pa80Var.m();
                    l8k0VarArr2 = l8k0VarArr;
                    int i14 = i13;
                    int i15 = Integer.MAX_VALUE;
                    while (i14 != i5) {
                        int i16 = i14;
                        l8k0 l8k0Var3 = l8k0VarArr2[i16];
                        BitSet bitSet4 = bitSet3;
                        int iG = l8k0Var3.g(iM);
                        if (iG < i15) {
                            i15 = iG;
                            l8k0Var2 = l8k0Var3;
                        }
                        i14 = i16 + i7;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    l8k0VarArr2 = l8k0VarArr;
                    int i17 = pa80Var.i();
                    int i18 = i13;
                    int i19 = Integer.MIN_VALUE;
                    while (i18 != i5) {
                        l8k0 l8k0Var4 = l8k0VarArr2[i18];
                        int i20 = i18;
                        int iJ2 = l8k0Var4.j(i17);
                        if (iJ2 > i19) {
                            i19 = iJ2;
                            l8k0Var2 = l8k0Var4;
                        }
                        i18 = i20 + i7;
                    }
                }
                l8k0Var = l8k0Var2;
                fVar.b(iE3);
                fVar.f45403a[iE3] = l8k0Var.e;
            } else {
                bitSet = bitSet3;
                i3 = i8;
                l8k0VarArr2 = l8k0VarArr;
                l8k0Var = l8k0VarArr2[i12];
            }
            a4m0Var.e = l8k0Var;
            if (w7zVar.e == 1) {
                l(viewE);
                r4 = 0;
            } else {
                r4 = 0;
                m(viewE, 0, false);
            }
            int i21 = this.t;
            if (i21 == 1) {
                i1(viewE, b.J(r4, this.u, this.l, r4, ((ViewGroup.MarginLayoutParams) a4m0Var).width), b.J(true, this.o, this.m, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) a4m0Var).height));
            } else {
                i1(viewE, b.J(true, this.n, this.l, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) a4m0Var).width), b.J(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) a4m0Var).height));
            }
            if (w7zVar.e == 1) {
                iE = l8k0Var.g(i10);
                iJ = pa80Var.e(viewE) + iE;
            } else {
                iJ = l8k0Var.j(i10);
                iE = iJ - pa80Var.e(viewE);
            }
            int i22 = w7zVar.e;
            l8k0 l8k0Var5 = a4m0Var.e;
            if (i22 == 1) {
                l8k0Var5.getClass();
                a4m0 a4m0Var2 = (a4m0) viewE.getLayoutParams();
                a4m0Var2.e = l8k0Var5;
                ArrayList arrayList = l8k0Var5.f19609a;
                arrayList.add(viewE);
                l8k0Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    l8k0Var5.b = Integer.MIN_VALUE;
                }
                if (a4m0Var2.f13060a.k() || a4m0Var2.f13060a.n()) {
                    l8k0Var5.d = ((StaggeredGridLayoutManager) l8k0Var5.f).r.e(viewE) + l8k0Var5.d;
                }
            } else {
                l8k0Var5.getClass();
                a4m0 a4m0Var3 = (a4m0) viewE.getLayoutParams();
                a4m0Var3.e = l8k0Var5;
                ArrayList arrayList2 = l8k0Var5.f19609a;
                arrayList2.add(0, viewE);
                l8k0Var5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    l8k0Var5.c = Integer.MIN_VALUE;
                }
                if (a4m0Var3.f13060a.k() || a4m0Var3.f13060a.n()) {
                    l8k0Var5.d = ((StaggeredGridLayoutManager) l8k0Var5.f).r.e(viewE) + l8k0Var5.d;
                }
            }
            boolean zH1 = h1();
            pa80 pa80Var2 = this.s;
            if (zH1 && i21 == 1) {
                i4 = pa80Var2.i() - (((i3 - 1) - l8k0Var.e) * this.u);
                iE2 = i4 - pa80Var2.e(viewE);
            } else {
                int iM2 = (l8k0Var.e * this.u) + pa80Var2.m();
                int iE4 = pa80Var2.e(viewE) + iM2;
                iE2 = iM2;
                i4 = iE4;
            }
            z2 = true;
            if (i21 == 1) {
                b.a0(viewE, iE2, iE, i4, iJ);
            } else {
                b.a0(viewE, iE, iE2, iJ, i4);
            }
            t1(l8k0Var, w7zVar2.e, i2);
            msjVar2 = msjVar;
            m1(msjVar2, w7zVar2);
            if (w7zVar2.h && viewE.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(l8k0Var.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i8 = i3;
            l8k0VarArr = l8k0VarArr2;
        }
        if (!z2) {
            m1(msjVar2, w7zVar2);
        }
        if (w7zVar2.e == -1) {
            iD1 = pa80Var.m() - e1(pa80Var.m());
        } else {
            iD1 = d1(pa80Var.i()) - pa80Var.i();
        }
        if (iD1 > 0) {
            return Math.min(w7zVar.b, iD1);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean X() {
        return this.Y != 0;
    }

    public final View X0(boolean z) {
        pa80 pa80Var = this.r;
        int iM = pa80Var.m();
        int i = pa80Var.i();
        View view = null;
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            int iG = pa80Var.g(viewH);
            int iD = pa80Var.d(viewH);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean Y() {
        return this.w;
    }

    public final View Y0(boolean z) {
        pa80 pa80Var = this.r;
        int iM = pa80Var.m();
        int i = pa80Var.i();
        int I = I();
        View view = null;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            int iG = pa80Var.g(viewH);
            if (pa80Var.d(viewH) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    public final void Z0(msj msjVar, the0 the0Var, boolean z) {
        int i;
        int iD1 = d1(Integer.MIN_VALUE);
        if (iD1 != Integer.MIN_VALUE && (i = this.r.i() - iD1) > 0) {
            int i2 = i - (-q1(-i, msjVar, the0Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.r.r(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // a.rhe0
    public final PointF a(int i) {
        int i2 = -1;
        if (I() != 0) {
            if ((i < b1()) == this.x) {
                i2 = 1;
            }
        } else if (this.x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    public final void a1(msj msjVar, the0 the0Var, boolean z) {
        int iM;
        int iE1 = e1(Integer.MAX_VALUE);
        if (iE1 != Integer.MAX_VALUE && (iM = iE1 - this.r.m()) > 0) {
            int iQ1 = iM - q1(iM, msjVar, the0Var);
            if (!z || iQ1 <= 0) {
                return;
            }
            this.r.r(-iQ1);
        }
    }

    public final int b1() {
        if (I() == 0) {
            return 0;
        }
        return b.T(H(0));
    }

    @Override // androidx.recyclerview.widget.b
    public final void c0(int i) {
        super.c0(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            l8k0 l8k0Var = this.q[i2];
            int i3 = l8k0Var.b;
            if (i3 != Integer.MIN_VALUE) {
                l8k0Var.b = i3 + i;
            }
            int i4 = l8k0Var.c;
            if (i4 != Integer.MIN_VALUE) {
                l8k0Var.c = i4 + i;
            }
        }
    }

    public final int c1() {
        int I = I();
        if (I == 0) {
            return 0;
        }
        return b.T(H(I - 1));
    }

    @Override // androidx.recyclerview.widget.b
    public final void d0(int i) {
        super.d0(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            l8k0 l8k0Var = this.q[i2];
            int i3 = l8k0Var.b;
            if (i3 != Integer.MIN_VALUE) {
                l8k0Var.b = i3 + i;
            }
            int i4 = l8k0Var.c;
            if (i4 != Integer.MIN_VALUE) {
                l8k0Var.c = i4 + i;
            }
        }
    }

    public final int d1(int i) {
        int iG = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iG2 = this.q[i2].g(i);
            if (iG2 > iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    @Override // androidx.recyclerview.widget.b
    public final void e0(yge0 yge0Var) {
        this.B.a();
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
    }

    public final int e1(int i) {
        int iJ = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iJ2 = this.q[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[LOOP:0: B:23:0x0038->B:27:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[LOOP:1: B:32:0x0059->B:36:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x004b A[EDGE_INSN: B:62:0x004b->B:29:0x004b BREAK  A[LOOP:0: B:23:0x0038->B:27:0x0047], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x006c A[EDGE_INSN: B:64:0x006c->B:38:0x006c BREAK  A[LOOP:1: B:32:0x0059->B:36:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void f1(int i, int i2, int i3) {
        int i4;
        int i5;
        f fVar;
        int[] iArr;
        int iC1;
        ArrayList arrayList;
        int size;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iC2 = this.x ? c1() : b1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            fVar = this.B;
            iArr = fVar.f45403a;
            if (iArr != null && i5 < iArr.length) {
                arrayList = fVar.b;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) fVar.b.get(size);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f45399a == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        fVar.b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size2 = fVar.b.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) fVar.b.get(i6)).f45399a >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) fVar.b.get(i6);
                        fVar.b.remove(i6);
                        i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f45399a;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = fVar.f45403a;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = fVar.f45403a.length;
                } else {
                    Arrays.fill(fVar.f45403a, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                fVar.c(i, i2);
            } else if (i3 != 2) {
                fVar.d(i, i2);
            } else if (i3 == 8) {
                fVar.d(i, 1);
                fVar.c(i2, 1);
            }
            if (i4 <= iC2) {
                return;
            }
            if (this.x) {
                iC1 = b1();
            } else {
                iC1 = c1();
            }
            if (i5 <= iC1) {
                F0();
            }
        }
        i4 = i + i2;
        i5 = i;
        fVar = this.B;
        iArr = fVar.f45403a;
        if (iArr != null) {
            arrayList = fVar.b;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) fVar.b.get(size);
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f45399a == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    fVar.b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size2 = fVar.b.size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) fVar.b.get(i6)).f45399a >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) fVar.b.get(i6);
                    fVar.b.remove(i6);
                    i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.f45399a;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = fVar.f45403a;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = fVar.f45403a.length;
            } else {
                Arrays.fill(fVar.f45403a, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            fVar.c(i, i2);
        } else if (i3 != 2) {
            fVar.d(i, i2);
        } else if (i3 == 8) {
            fVar.d(i, 1);
            fVar.c(i2, 1);
        }
        if (i4 <= iC2) {
            return;
        }
        if (this.x) {
            iC1 = b1();
        } else {
            iC1 = c1();
        }
        if (i5 <= iC1) {
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void g0(RecyclerView recyclerView, msj msjVar) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.l1);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View g1() {
        boolean z;
        boolean z2;
        int I = I();
        int i = I - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.t == 1 && h1()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            I = -1;
        } else {
            i = 0;
        }
        int i3 = i < I ? 1 : -1;
        while (i != I) {
            View viewH = H(i);
            a4m0 a4m0Var = (a4m0) viewH.getLayoutParams();
            boolean z3 = bitSet.get(a4m0Var.e.e);
            pa80 pa80Var = this.r;
            if (z3) {
                l8k0 l8k0Var = a4m0Var.e;
                if (this.x) {
                    int i4 = l8k0Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        l8k0Var.b();
                        i4 = l8k0Var.c;
                    }
                    if (i4 < pa80Var.i()) {
                        ((a4m0) ((View) dw9.l(1, l8k0Var.f19609a)).getLayoutParams()).getClass();
                        return viewH;
                    }
                } else {
                    int i5 = l8k0Var.b;
                    ArrayList arrayList = l8k0Var.f19609a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        a4m0 a4m0Var2 = (a4m0) view.getLayoutParams();
                        l8k0Var.b = ((StaggeredGridLayoutManager) l8k0Var.f).r.g(view);
                        a4m0Var2.getClass();
                        i5 = l8k0Var.b;
                    }
                    if (i5 > pa80Var.m()) {
                        ((a4m0) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewH;
                    }
                }
                bitSet.clear(a4m0Var.e.e);
            }
            i += i3;
            if (i != I) {
                View viewH2 = H(i);
                if (this.x) {
                    int iD = pa80Var.d(viewH);
                    int iD2 = pa80Var.d(viewH2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (a4m0Var.e.e - ((a4m0) viewH2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewH;
                }
                int iG = pa80Var.g(viewH);
                int iG2 = pa80Var.g(viewH2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (a4m0Var.e.e - ((a4m0) viewH2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewH;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    @Override // androidx.recyclerview.widget.b
    public final View h0(View view, int i, msj msjVar, the0 the0Var) {
        View viewK;
        int i2;
        if (I() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewK = recyclerView.K(view)) == null || this.f45401a.c.contains(viewK)) {
                viewK = null;
            }
            if (viewK != null) {
                p1();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && h1()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && h1()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    a4m0 a4m0Var = (a4m0) viewK.getLayoutParams();
                    a4m0Var.getClass();
                    l8k0 l8k0Var = a4m0Var.e;
                    int iC1 = i2 == 1 ? c1() : b1();
                    s1(iC1, the0Var);
                    r1(i2);
                    w7z w7zVar = this.v;
                    w7zVar.c = w7zVar.d + iC1;
                    w7zVar.b = (int) (this.r.n() * 0.33333334f);
                    w7zVar.h = true;
                    w7zVar.f38696a = false;
                    W0(msjVar, w7zVar, the0Var);
                    this.Z = this.x;
                    View viewH = l8k0Var.h(iC1, i2);
                    if (viewH != null && viewH != viewK) {
                        return viewH;
                    }
                    boolean zK1 = k1(i2);
                    l8k0[] l8k0VarArr = this.q;
                    int i4 = this.p;
                    if (zK1) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewH2 = l8k0VarArr[i5].h(iC1, i2);
                            if (viewH2 != null && viewH2 != viewK) {
                                return viewH2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewH3 = l8k0VarArr[i6].h(iC1, i2);
                            if (viewH3 != null && viewH3 != viewK) {
                                return viewH3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View viewD = D(z ? l8k0Var.d() : l8k0Var.e());
                    if (viewD != null && viewD != viewK) {
                        return viewD;
                    }
                    if (k1(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != l8k0Var.e) {
                                View viewD2 = D(z ? l8k0VarArr[i7].d() : l8k0VarArr[i7].e());
                                if (viewD2 != null && viewD2 != viewK) {
                                    return viewD2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewD3 = D(z ? l8k0VarArr[i8].d() : l8k0VarArr[i8].e());
                            if (viewD3 != null && viewD3 != viewK) {
                                return viewD3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean h1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.b
    public final void i0(AccessibilityEvent accessibilityEvent) {
        super.i0(accessibilityEvent);
        if (I() > 0) {
            View viewY0 = Y0(false);
            View viewX0 = X0(false);
            if (viewY0 == null || viewX0 == null) {
                return;
            }
            int iT = b.T(viewY0);
            int iT2 = b.T(viewX0);
            if (iT < iT2) {
                accessibilityEvent.setFromIndex(iT);
                accessibilityEvent.setToIndex(iT2);
            } else {
                accessibilityEvent.setFromIndex(iT2);
                accessibilityEvent.setToIndex(iT);
            }
        }
    }

    public final void i1(View view, int i, int i2) {
        Rect rect = this.h1;
        p(rect, view);
        a4m0 a4m0Var = (a4m0) view.getLayoutParams();
        int iU1 = u1(i, ((ViewGroup.MarginLayoutParams) a4m0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) a4m0Var).rightMargin + rect.right);
        int iU2 = u1(i2, ((ViewGroup.MarginLayoutParams) a4m0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) a4m0Var).bottomMargin + rect.bottom);
        if (O0(view, iU1, iU2, a4m0Var)) {
            view.measure(iU1, iU2);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void j0(msj msjVar, the0 the0Var, k7 k7Var) {
        super.j0(msjVar, the0Var, k7Var);
        k7Var.j("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void j1(msj msjVar, the0 the0Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        SavedState savedState;
        int I;
        int i2;
        int iT;
        int iT2;
        int I2;
        boolean z4;
        int i3;
        boolean z5;
        SavedState savedState2 = this.g1;
        z3m0 z3m0Var = this.i1;
        if (!(savedState2 == null && this.z == -1) && the0Var.b() == 0) {
            A0(msjVar);
            z3m0Var.a();
            return;
        }
        boolean z6 = z3m0Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = z3m0Var.g;
        boolean z7 = (z6 && this.z == -1 && this.g1 == null) ? false : true;
        l8k0[] l8k0VarArr = this.q;
        int i4 = this.p;
        f fVar = this.B;
        if (z7) {
            z3m0Var.a();
            SavedState savedState3 = this.g1;
            pa80 pa80Var = this.r;
            if (savedState3 != null) {
                int i5 = savedState3.c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            l8k0VarArr[i6].c();
                            SavedState savedState4 = this.g1;
                            int i7 = savedState4.d[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += savedState4.i ? pa80Var.i() : pa80Var.m();
                            }
                            l8k0 l8k0Var = l8k0VarArr[i6];
                            l8k0Var.b = i7;
                            l8k0Var.c = i7;
                        }
                    } else {
                        savedState3.d = null;
                        savedState3.c = 0;
                        savedState3.e = 0;
                        savedState3.f = null;
                        savedState3.g = null;
                        savedState3.f45400a = savedState3.b;
                    }
                }
                SavedState savedState5 = this.g1;
                this.f1 = savedState5.j;
                boolean z8 = savedState5.h;
                n(null);
                SavedState savedState6 = this.g1;
                if (savedState6 != null && savedState6.h != z8) {
                    savedState6.h = z8;
                }
                this.w = z8;
                F0();
                p1();
                SavedState savedState7 = this.g1;
                int i8 = savedState7.f45400a;
                if (i8 != -1) {
                    this.z = i8;
                    z3m0Var.c = savedState7.i;
                } else {
                    z3m0Var.c = this.x;
                }
                if (savedState7.e > 1) {
                    fVar.f45403a = savedState7.f;
                    fVar.b = savedState7.g;
                }
            } else {
                p1();
                z3m0Var.c = this.x;
            }
            if (the0Var.g || (i3 = this.z) == -1) {
                if (this.Z) {
                    int iB = the0Var.b();
                    I2 = I() - 1;
                    while (true) {
                        if (I2 < 0) {
                            iT2 = 0;
                            break;
                        }
                        iT2 = b.T(H(I2));
                        if (iT2 < 0 && iT2 < iB) {
                            break;
                        } else {
                            I2--;
                        }
                    }
                } else {
                    int iB2 = the0Var.b();
                    I = I();
                    i2 = 0;
                    while (true) {
                        if (i2 >= I) {
                            iT2 = 0;
                            break;
                        }
                        iT = b.T(H(i2));
                        if (iT < 0 && iT < iB2) {
                            iT2 = iT;
                            break;
                        }
                        i2++;
                    }
                }
                z3m0Var.f43727a = iT2;
                z3m0Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= the0Var.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.Z) {
                    int iB3 = the0Var.b();
                    I2 = I() - 1;
                    while (true) {
                        if (I2 < 0) {
                            iT2 = 0;
                            break;
                        } else {
                            iT2 = b.T(H(I2));
                            if (iT2 < 0) {
                            }
                            I2--;
                        }
                    }
                } else {
                    int iB4 = the0Var.b();
                    I = I();
                    i2 = 0;
                    while (true) {
                        if (i2 >= I) {
                            iT2 = 0;
                            break;
                        } else {
                            iT = b.T(H(i2));
                            if (iT < 0) {
                            }
                            i2++;
                        }
                    }
                }
                z3m0Var.f43727a = iT2;
                z3m0Var.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                SavedState savedState8 = this.g1;
                if (savedState8 == null || savedState8.f45400a == -1 || savedState8.c < 1) {
                    View viewD = D(this.z);
                    if (viewD != null) {
                        z3m0Var.f43727a = this.x ? c1() : b1();
                        if (this.A != Integer.MIN_VALUE) {
                            if (z3m0Var.c) {
                                z3m0Var.b = (pa80Var.i() - this.A) - pa80Var.d(viewD);
                            } else {
                                z3m0Var.b = (pa80Var.m() + this.A) - pa80Var.g(viewD);
                            }
                        } else if (pa80Var.e(viewD) > pa80Var.n()) {
                            z3m0Var.b = z3m0Var.c ? pa80Var.i() : pa80Var.m();
                        } else {
                            int iG = pa80Var.g(viewD) - pa80Var.m();
                            if (iG < 0) {
                                z3m0Var.b = -iG;
                            } else {
                                int i9 = pa80Var.i() - pa80Var.d(viewD);
                                if (i9 < 0) {
                                    z3m0Var.b = i9;
                                } else {
                                    z3m0Var.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i10 = this.z;
                        z3m0Var.f43727a = i10;
                        int i11 = this.A;
                        if (i11 == Integer.MIN_VALUE) {
                            if (I() != 0) {
                                if ((i10 < b1()) != this.x) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.x) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z3m0Var.c = z5;
                            pa80 pa80Var2 = staggeredGridLayoutManager.r;
                            z3m0Var.b = z5 ? pa80Var2.i() : pa80Var2.m();
                        } else {
                            boolean z9 = z3m0Var.c;
                            pa80 pa80Var3 = staggeredGridLayoutManager.r;
                            if (z9) {
                                z3m0Var.b = pa80Var3.i() - i11;
                            } else {
                                z3m0Var.b = pa80Var3.m() + i11;
                            }
                        }
                        z4 = true;
                        z3m0Var.d = true;
                    }
                } else {
                    z3m0Var.b = Integer.MIN_VALUE;
                    z3m0Var.f43727a = this.z;
                }
                z4 = true;
            }
            z3m0Var.e = z4;
        }
        if (this.g1 == null && this.z == -1 && !(z3m0Var.c == this.Z && h1() == this.f1)) {
            fVar.a();
            i = 1;
            z3m0Var.d = true;
        } else {
            i = 1;
        }
        if (I() > 0 && ((savedState = this.g1) == null || savedState.c < i)) {
            if (z3m0Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    l8k0VarArr[i12].c();
                    int i13 = z3m0Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        l8k0 l8k0Var2 = l8k0VarArr[i12];
                        l8k0Var2.b = i13;
                        l8k0Var2.c = i13;
                    }
                }
            } else if (z7 || z3m0Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    l8k0 l8k0Var3 = l8k0VarArr[i14];
                    boolean z10 = this.x;
                    int i15 = z3m0Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) l8k0Var3.f;
                    int iG2 = z10 ? l8k0Var3.g(Integer.MIN_VALUE) : l8k0Var3.j(Integer.MIN_VALUE);
                    l8k0Var3.c();
                    if (iG2 != Integer.MIN_VALUE && ((!z10 || iG2 >= staggeredGridLayoutManager2.r.i()) && (z10 || iG2 <= staggeredGridLayoutManager2.r.m()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iG2 += i15;
                        }
                        l8k0Var3.c = iG2;
                        l8k0Var3.b = iG2;
                    }
                }
                int length = l8k0VarArr.length;
                int[] iArr = z3m0Var.f;
                if (iArr == null || iArr.length < length) {
                    z3m0Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    z3m0Var.f[i16] = l8k0VarArr[i16].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    l8k0 l8k0Var4 = l8k0VarArr[i17];
                    l8k0Var4.c();
                    int i18 = z3m0Var.f[i17];
                    l8k0Var4.b = i18;
                    l8k0Var4.c = i18;
                }
            }
        }
        C(msjVar);
        w7z w7zVar = this.v;
        w7zVar.f38696a = false;
        pa80 pa80Var4 = this.s;
        int iN = pa80Var4.n();
        this.u = iN / i4;
        View.MeasureSpec.makeMeasureSpec(iN, pa80Var4.k());
        s1(z3m0Var.f43727a, the0Var);
        if (z3m0Var.c) {
            r1(-1);
            W0(msjVar, w7zVar, the0Var);
            r1(1);
            w7zVar.c = z3m0Var.f43727a + w7zVar.d;
            W0(msjVar, w7zVar, the0Var);
        } else {
            r1(1);
            W0(msjVar, w7zVar, the0Var);
            r1(-1);
            w7zVar.c = z3m0Var.f43727a + w7zVar.d;
            W0(msjVar, w7zVar, the0Var);
        }
        if (pa80Var4.k() != 1073741824) {
            int I3 = I();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < I3; i19++) {
                View viewH = H(i19);
                float fE = pa80Var4.e(viewH);
                if (fE >= fMax) {
                    ((a4m0) viewH.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i20 = this.u;
            int iRound = Math.round(fMax * i4);
            if (pa80Var4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, pa80Var4.n());
            }
            this.u = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, pa80Var4.k());
            if (this.u != i20) {
                for (int i21 = 0; i21 < I3; i21++) {
                    View viewH2 = H(i21);
                    a4m0 a4m0Var = (a4m0) viewH2.getLayoutParams();
                    a4m0Var.getClass();
                    boolean zH1 = h1();
                    int i22 = this.t;
                    if (zH1 && i22 == 1) {
                        int i23 = -((i4 - 1) - a4m0Var.e.e);
                        viewH2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                    } else {
                        int i24 = a4m0Var.e.e;
                        int i25 = this.u * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            viewH2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewH2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (I() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            Z0(msjVar, the0Var, true);
            a1(msjVar, the0Var, false);
        } else {
            z2 = true;
            a1(msjVar, the0Var, true);
            Z0(msjVar, the0Var, false);
        }
        if (!z || the0Var.g || this.Y == 0 || I() <= 0 || g1() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.l1);
            }
            if (U0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (the0Var.g) {
            z3m0Var.a();
        }
        this.Z = z3m0Var.c;
        this.f1 = h1();
        if (z3) {
            z3m0Var.a();
            j1(msjVar, the0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void k0(msj msjVar, the0 the0Var, View view, k7 k7Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a4m0)) {
            l0(view, k7Var);
            return;
        }
        l8k0 l8k0Var = ((a4m0) layoutParams).e;
        if (this.t == 0) {
            k7Var.l(j7.a(false, l8k0Var == null ? -1 : l8k0Var.e, 1, -1, -1));
        } else {
            k7Var.l(j7.a(false, -1, -1, l8k0Var == null ? -1 : l8k0Var.e, 1));
        }
    }

    public final boolean k1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == h1();
    }

    public final void l1(int i, the0 the0Var) {
        int iB1;
        int i2;
        if (i > 0) {
            iB1 = c1();
            i2 = 1;
        } else {
            iB1 = b1();
            i2 = -1;
        }
        w7z w7zVar = this.v;
        w7zVar.f38696a = true;
        s1(iB1, the0Var);
        r1(i2);
        w7zVar.c = iB1 + w7zVar.d;
        w7zVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.b
    public final void m0(RecyclerView recyclerView, int i, int i2) {
        f1(i, i2, 1);
    }

    public final void m1(msj msjVar, w7z w7zVar) {
        if (!w7zVar.f38696a || w7zVar.i) {
            return;
        }
        int i = w7zVar.b;
        int i2 = w7zVar.e;
        if (i == 0) {
            if (i2 == -1) {
                n1(msjVar, w7zVar.g);
                return;
            } else {
                o1(msjVar, w7zVar.f);
                return;
            }
        }
        int i3 = this.p;
        l8k0[] l8k0VarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = w7zVar.f;
            int iJ = l8k0VarArr[0].j(i5);
            while (i4 < i3) {
                int iJ2 = l8k0VarArr[i4].j(i5);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i4++;
            }
            int i6 = i5 - iJ;
            int iMin = w7zVar.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, w7zVar.b);
            }
            n1(msjVar, iMin);
            return;
        }
        int i7 = w7zVar.g;
        int iG = l8k0VarArr[0].g(i7);
        while (i4 < i3) {
            int iG2 = l8k0VarArr[i4].g(i7);
            if (iG2 < iG) {
                iG = iG2;
            }
            i4++;
        }
        int i8 = iG - w7zVar.g;
        int iMin2 = w7zVar.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, w7zVar.b);
        }
        o1(msjVar, iMin2);
    }

    @Override // androidx.recyclerview.widget.b
    public final void n(String str) {
        if (this.g1 == null) {
            super.n(str);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void n0() {
        this.B.a();
        F0();
    }

    public final void n1(msj msjVar, int i) {
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            pa80 pa80Var = this.r;
            if (pa80Var.g(viewH) < i || pa80Var.q(viewH) < i) {
                return;
            }
            a4m0 a4m0Var = (a4m0) viewH.getLayoutParams();
            a4m0Var.getClass();
            if (a4m0Var.e.f19609a.size() == 1) {
                return;
            }
            l8k0 l8k0Var = a4m0Var.e;
            ArrayList arrayList = l8k0Var.f19609a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            a4m0 a4m0Var2 = (a4m0) view.getLayoutParams();
            a4m0Var2.e = null;
            if (a4m0Var2.f13060a.k() || a4m0Var2.f13060a.n()) {
                l8k0Var.d -= ((StaggeredGridLayoutManager) l8k0Var.f).r.e(view);
            }
            if (size == 1) {
                l8k0Var.b = Integer.MIN_VALUE;
            }
            l8k0Var.c = Integer.MIN_VALUE;
            C0(viewH, msjVar);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void o0(int i, int i2) {
        f1(i, i2, 8);
    }

    public final void o1(msj msjVar, int i) {
        while (I() > 0) {
            View viewH = H(0);
            pa80 pa80Var = this.r;
            if (pa80Var.d(viewH) > i || pa80Var.p(viewH) > i) {
                return;
            }
            a4m0 a4m0Var = (a4m0) viewH.getLayoutParams();
            a4m0Var.getClass();
            if (a4m0Var.e.f19609a.size() == 1) {
                return;
            }
            l8k0 l8k0Var = a4m0Var.e;
            ArrayList arrayList = l8k0Var.f19609a;
            View view = (View) arrayList.remove(0);
            a4m0 a4m0Var2 = (a4m0) view.getLayoutParams();
            a4m0Var2.e = null;
            if (arrayList.size() == 0) {
                l8k0Var.c = Integer.MIN_VALUE;
            }
            if (a4m0Var2.f13060a.k() || a4m0Var2.f13060a.n()) {
                l8k0Var.d -= ((StaggeredGridLayoutManager) l8k0Var.f).r.e(view);
            }
            l8k0Var.b = Integer.MIN_VALUE;
            C0(viewH, msjVar);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void p0(int i, int i2) {
        f1(i, i2, 2);
    }

    public final void p1() {
        if (this.t == 1 || !h1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean q() {
        return this.t == 0;
    }

    public final int q1(int i, msj msjVar, the0 the0Var) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        l1(i, the0Var);
        w7z w7zVar = this.v;
        int iW0 = W0(msjVar, w7zVar, the0Var);
        if (w7zVar.b >= iW0) {
            i = i < 0 ? -iW0 : iW0;
        }
        this.r.r(-i);
        this.Z = this.x;
        w7zVar.b = 0;
        m1(msjVar, w7zVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean r() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.b
    public final void r0(RecyclerView recyclerView, int i, int i2) {
        f1(i, i2, 4);
    }

    public final void r1(int i) {
        w7z w7zVar = this.v;
        w7zVar.e = i;
        w7zVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.b
    public final boolean s(hhe0 hhe0Var) {
        return hhe0Var instanceof a4m0;
    }

    @Override // androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        j1(msjVar, the0Var, true);
    }

    public final void s1(int i, the0 the0Var) {
        int iN;
        int iN2;
        int i2;
        w7z w7zVar = this.v;
        boolean z = false;
        w7zVar.b = 0;
        w7zVar.c = i;
        she0 she0Var = this.e;
        pa80 pa80Var = this.r;
        if (she0Var == null || !she0Var.e || (i2 = the0Var.f33958a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = pa80Var.n();
                iN2 = 0;
            } else {
                iN2 = pa80Var.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.h) {
            w7zVar.g = pa80Var.h() + iN;
            w7zVar.f = -iN2;
        } else {
            w7zVar.f = pa80Var.m() - iN2;
            w7zVar.g = pa80Var.i() + iN;
        }
        w7zVar.h = false;
        w7zVar.f38696a = true;
        if (pa80Var.k() == 0 && pa80Var.h() == 0) {
            z = true;
        }
        w7zVar.i = z;
    }

    @Override // androidx.recyclerview.widget.b
    public final void t0(the0 the0Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.g1 = null;
        this.i1.a();
    }

    public final void t1(l8k0 l8k0Var, int i, int i2) {
        int i3 = l8k0Var.d;
        int i4 = l8k0Var.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = l8k0Var.c;
            if (i5 == Integer.MIN_VALUE) {
                l8k0Var.b();
                i5 = l8k0Var.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = l8k0Var.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) l8k0Var.f19609a.get(0);
            a4m0 a4m0Var = (a4m0) view.getLayoutParams();
            l8k0Var.b = ((StaggeredGridLayoutManager) l8k0Var.f).r.g(view);
            a4m0Var.getClass();
            i6 = l8k0Var.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void u(int i, int i2, the0 the0Var, yjc yjcVar) {
        w7z w7zVar;
        int iG;
        if (this.t != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        l1(i, the0Var);
        int[] iArr = this.k1;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.k1 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            w7zVar = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = w7zVar.d;
            l8k0[] l8k0VarArr = this.q;
            if (i6 == -1) {
                int i7 = w7zVar.f;
                iG = i7 - l8k0VarArr[i4].j(i7);
            } else {
                iG = l8k0VarArr[i4].g(w7zVar.g) - w7zVar.g;
            }
            if (iG >= 0) {
                this.k1[i5] = iG;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.k1, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = w7zVar.c;
            if (i9 < 0 || i9 >= the0Var.b()) {
                return;
            }
            yjcVar.b(w7zVar.c, this.k1[i8]);
            w7zVar.c += w7zVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.g1 = savedState;
            if (this.z != -1) {
                savedState.f45400a = -1;
                savedState.b = -1;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.g = null;
            }
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final Parcelable v0() {
        int iJ;
        int iM;
        int[] iArr;
        SavedState savedState = this.g1;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.c = savedState.c;
            savedState2.f45400a = savedState.f45400a;
            savedState2.b = savedState.b;
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.f = savedState.f;
            savedState2.h = savedState.h;
            savedState2.i = savedState.i;
            savedState2.j = savedState.j;
            savedState2.g = savedState.g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.h = this.w;
        savedState3.i = this.Z;
        savedState3.j = this.f1;
        f fVar = this.B;
        if (fVar == null || (iArr = fVar.f45403a) == null) {
            savedState3.e = 0;
        } else {
            savedState3.f = iArr;
            savedState3.e = iArr.length;
            savedState3.g = fVar.b;
        }
        if (I() <= 0) {
            savedState3.f45400a = -1;
            savedState3.b = -1;
            savedState3.c = 0;
            return savedState3;
        }
        savedState3.f45400a = this.Z ? c1() : b1();
        View viewX0 = this.x ? X0(true) : Y0(true);
        savedState3.b = viewX0 != null ? b.T(viewX0) : -1;
        int i = this.p;
        savedState3.c = i;
        savedState3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.Z;
            pa80 pa80Var = this.r;
            l8k0[] l8k0VarArr = this.q;
            if (z) {
                iJ = l8k0VarArr[i2].g(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = pa80Var.i();
                    iJ -= iM;
                }
            } else {
                iJ = l8k0VarArr[i2].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = pa80Var.m();
                    iJ -= iM;
                }
            }
            savedState3.d[i2] = iJ;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.b
    public final int w(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return yyw.C(the0Var, this.r, Y0(z), X0(z), this, this.j1);
    }

    @Override // androidx.recyclerview.widget.b
    public final void w0(int i) {
        if (i == 0) {
            U0();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final int x(the0 the0Var) {
        return V0(the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final int y(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return yyw.E(the0Var, this.r, Y0(z), X0(z), this, this.j1);
    }

    @Override // androidx.recyclerview.widget.b
    public final int z(the0 the0Var) {
        if (I() == 0) {
            return 0;
        }
        boolean z = !this.j1;
        return yyw.C(the0Var, this.r, Y0(z), X0(z), this, this.j1);
    }
}
