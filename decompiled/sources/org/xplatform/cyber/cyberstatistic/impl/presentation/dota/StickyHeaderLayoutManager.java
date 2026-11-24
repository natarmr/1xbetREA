package org.xplatform.cyber.cyberstatistic.impl.presentation.dota;

import a.cs0;
import a.dw9;
import a.hhe0;
import a.jf4;
import a.l1e0;
import a.l5g;
import a.msj;
import a.prs0;
import a.q3d;
import a.rgu0;
import a.the0;
import a.w23;
import a.xhe0;
import a.yge0;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a/l5g", "SavedState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class StickyHeaderLayoutManager extends LinearLayoutManager {
    public final RecyclerView g1;
    public final l5g h1;
    public yge0 i1;
    public ArrayList j1;
    public Bitmap k1;
    public FrameLayout l1;
    public int m1;
    public int n1;
    public int o1;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f46492a;
        public final List b;

        public SavedState(Parcelable parcelable, List list) {
            list.getClass();
            this.f46492a = parcelable;
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return Intrinsics.d(this.f46492a, savedState.f46492a) && Intrinsics.d(this.b, savedState.b);
        }

        public final int hashCode() {
            Parcelable parcelable = this.f46492a;
            return this.b.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        public final String toString() {
            return "SavedState(superParcelable=" + this.f46492a + ", headerPositions=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f46492a, i);
            Iterator itT = cs0.t(this.b, parcel);
            while (itT.hasNext()) {
                parcel.writeInt(((Number) itT.next()).intValue());
            }
        }
    }

    public StickyHeaderLayoutManager(RecyclerView recyclerView) {
        super(recyclerView.getContext(), 1, false);
        this.g1 = recyclerView;
        this.h1 = new l5g(this, (byte) 7);
        this.j1 = new ArrayList();
        this.m1 = -1;
        this.n1 = -1;
    }

    public final void C1(msj msjVar, int i) {
        hhe0 hhe0Var;
        FrameLayout frameLayout = this.l1;
        if (frameLayout != null) {
            msjVar.getClass();
            xhe0 xhe0VarX = RecyclerView.X(frameLayout);
            RecyclerView recyclerView = (RecyclerView) msjVar.h;
            if (xhe0VarX == null) {
                jf4.o("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.H()));
                return;
            }
            View view = xhe0VarX.f40887a;
            int iU = recyclerView.e.u(i, 0);
            if (iU < 0 || iU >= recyclerView.m.d()) {
                StringBuilder sbT = dw9.t("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iU);
                sbT.append(recyclerView.H1.b());
                sbT.append(recyclerView.H());
                throw new IndexOutOfBoundsException(sbT.toString());
            }
            msjVar.n(xhe0VarX, iU, i, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                hhe0Var = (hhe0) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(hhe0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                hhe0Var = (hhe0) layoutParams;
            } else {
                hhe0Var = (hhe0) recyclerView.generateLayoutParams(layoutParams);
                view.setLayoutParams(hhe0Var);
            }
            hhe0Var.c = true;
            hhe0Var.f13060a = xhe0VarX;
            hhe0Var.d = view.getParent() == null;
            this.m1 = i;
            b0(frameLayout);
            frameLayout.layout(0, 0, this.n, frameLayout.getMeasuredHeight());
            if (this.n1 != -1) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
                    frameLayout.addOnLayoutChangeListener(new w23(this, (byte) 16));
                    return;
                }
                int i2 = this.n1;
                if (i2 != -1) {
                    w1(i2, this.o1);
                    this.n1 = -1;
                    this.o1 = Integer.MIN_VALUE;
                }
            }
        }
    }

    public final void D1(msj msjVar, int i, boolean z) {
        FrameLayout frameLayout;
        View viewE = msjVar.e(i);
        FrameLayout frameLayout2 = viewE instanceof FrameLayout ? (FrameLayout) viewE : null;
        if (frameLayout2 != null) {
            this.l1 = frameLayout2;
            l(frameLayout2);
            b0(frameLayout2);
            frameLayout2.layout(0, 0, this.n, frameLayout2.getMeasuredHeight());
            ViewParent parent = frameLayout2.getParent();
            RecyclerView recyclerView = this.b;
            if (parent != recyclerView || recyclerView.indexOfChild(frameLayout2) == -1) {
                jf4.o("View should be fully attached to be ignored".concat(this.b.H()));
                return;
            }
            xhe0 xhe0VarX = RecyclerView.X(frameLayout2);
            xhe0VarX.b(128);
            this.b.g.p(xhe0VarX);
            F1();
            this.m1 = i;
        }
        if (z || (frameLayout = this.l1) == null || b.T(frameLayout) != i) {
            C1(msjVar, i);
        }
    }

    public final int E1(int i) {
        int iF = q3d.f(this.j1, Integer.valueOf(i));
        if (iF >= 0) {
            return iF;
        }
        return -1;
    }

    public final void F1() {
        FrameLayout frameLayout = this.l1;
        Bitmap bitmapCreateBitmap = this.k1;
        if (frameLayout == null || bitmapCreateBitmap == null) {
            return;
        }
        float width = bitmapCreateBitmap.getWidth() / this.n;
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width2 = bitmapCreateBitmap.getWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        if (width2 <= 0 || measuredHeight <= 0) {
            return;
        }
        int i3 = (int) (i2 * width);
        int i4 = (int) (measuredHeight * width);
        int width3 = bitmapCreateBitmap.getWidth();
        int height = bitmapCreateBitmap.getHeight();
        int iD = l1e0.d(i, 0, width3);
        int iD2 = l1e0.d(i3, 0, height);
        int i5 = width3 - iD;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = height - iD2;
        if (i6 < 0) {
            i6 = 0;
        }
        int iD3 = l1e0.d(width2, 0, i5);
        int iD4 = l1e0.d(i4, 0, i6);
        if (iD3 > 0 && iD4 > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, iD, iD2, iD3, iD4);
            bitmapCreateBitmap.getClass();
        }
        Resources resources = this.g1.getResources();
        resources.getClass();
        frameLayout.setBackground(new BitmapDrawable(resources, bitmapCreateBitmap));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:67:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public final void G1(msj msjVar, boolean z) {
        prs0 prs0Var;
        int iIntValue;
        FrameLayout frameLayout;
        View viewH;
        FrameLayout frameLayout2;
        yge0 yge0Var;
        if (this.j1.isEmpty() || I() == 0) {
            FrameLayout frameLayout3 = this.l1;
            if (frameLayout3 != null) {
                this.m1 = -1;
                D0(frameLayout3);
                this.l1 = null;
                return;
            }
            return;
        }
        int I = I();
        int i = 0;
        while (true) {
            if (i >= I) {
                prs0Var = null;
                break;
            }
            View viewH2 = H(i);
            if (viewH2 != null) {
                ViewGroup.LayoutParams layoutParams = viewH2.getLayoutParams();
                layoutParams.getClass();
                hhe0 hhe0Var = (hhe0) layoutParams;
                if (!hhe0Var.f13060a.k() && !hhe0Var.f13060a.i() && viewH2.getBottom() - viewH2.getTranslationY() >= 0.0f) {
                    prs0Var = new prs0(viewH2, Integer.valueOf(i), Integer.valueOf(hhe0Var.f13060a.d()));
                    break;
                }
            }
            i++;
        }
        if (prs0Var == null) {
            FrameLayout frameLayout4 = this.l1;
            if (frameLayout4 != null) {
                this.m1 = -1;
                D0(frameLayout4);
                this.l1 = null;
                return;
            }
            return;
        }
        View view = (View) prs0Var.f27482a;
        int iIntValue2 = ((Number) prs0Var.b).intValue();
        int iIntValue3 = ((Number) prs0Var.c).intValue();
        int iF = q3d.f(this.j1, Integer.valueOf(iIntValue3));
        if (iF < 0) {
            int i2 = -(iF + 1);
            iF = i2 > 0 ? i2 - 1 : -1;
        }
        Integer numValueOf = Integer.valueOf(iF);
        if (iF == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = ((Number) this.j1.get(numValueOf.intValue())).intValue();
        } else {
            iIntValue = -1;
        }
        int i3 = iF + 1;
        int iIntValue4 = this.j1.size() > i3 ? ((Number) this.j1.get(i3)).intValue() : -1;
        if (iIntValue != -1) {
            if (iIntValue == iIntValue3) {
                if (view.getTranslationY() + view.getTop() < 0.0f) {
                    if (iIntValue4 != iIntValue + 1) {
                        frameLayout = this.l1;
                        if (frameLayout != null) {
                            yge0Var = this.i1;
                            if (yge0Var != null || RecyclerView.X(frameLayout).f != yge0Var.f(iIntValue)) {
                                this.m1 = -1;
                                D0(this.l1);
                                this.l1 = null;
                                D1(msjVar, iIntValue, z);
                            } else if (z && b.T(frameLayout) != iIntValue) {
                                C1(msjVar, iIntValue);
                            }
                        } else {
                            D1(msjVar, iIntValue, z);
                        }
                        viewH = iIntValue4 != -1 ? H((iIntValue4 - iIntValue3) + iIntValue2) : null;
                        frameLayout2 = this.l1;
                        if (frameLayout2 != null) {
                            if (viewH != null) {
                                viewH.getLeft();
                                frameLayout2.getWidth();
                            }
                            frameLayout2.setTranslationX(0.0f);
                            if (viewH != null) {
                                viewH.getTop();
                                frameLayout2.getHeight();
                            }
                            frameLayout2.setTranslationY(0.0f);
                            return;
                        }
                        return;
                    }
                }
            } else if (iIntValue4 != iIntValue + 1) {
                frameLayout = this.l1;
                if (frameLayout != null) {
                    yge0Var = this.i1;
                    if (yge0Var != null) {
                        this.m1 = -1;
                        D0(this.l1);
                        this.l1 = null;
                        D1(msjVar, iIntValue, z);
                    } else {
                        this.m1 = -1;
                        D0(this.l1);
                        this.l1 = null;
                        D1(msjVar, iIntValue, z);
                    }
                } else {
                    D1(msjVar, iIntValue, z);
                }
                if (iIntValue4 != -1) {
                }
                frameLayout2 = this.l1;
                if (frameLayout2 != null) {
                    if (viewH != null) {
                        viewH.getLeft();
                        frameLayout2.getWidth();
                    }
                    frameLayout2.setTranslationX(0.0f);
                    if (viewH != null) {
                        viewH.getTop();
                        frameLayout2.getHeight();
                    }
                    frameLayout2.setTranslationY(0.0f);
                    return;
                }
                return;
            }
        }
        FrameLayout frameLayout5 = this.l1;
        if (frameLayout5 != null) {
            this.m1 = -1;
            D0(frameLayout5);
            this.l1 = null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void H0(int i) {
        w1(i, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int I0(int i, msj msjVar, the0 the0Var) {
        int iJ;
        msjVar.getClass();
        the0Var.getClass();
        FrameLayout frameLayout = this.l1;
        if (frameLayout != null && (iJ = this.f45401a.j(frameLayout)) >= 0) {
            this.f45401a.c(iJ);
        }
        int iI0 = super.I0(i, msjVar, the0Var);
        FrameLayout frameLayout2 = this.l1;
        if (frameLayout2 != null) {
            o(frameLayout2, -1);
        }
        if (iI0 != 0) {
            G1(msjVar, false);
        }
        return iI0;
    }

    @Override // androidx.recyclerview.widget.b
    public final void e0(yge0 yge0Var) {
        yge0 yge0Var2 = this.i1;
        l5g l5gVar = this.h1;
        if (yge0Var2 != null) {
            yge0Var2.y(l5gVar);
        }
        if (yge0Var != null) {
            this.i1 = yge0Var;
            yge0Var.v(l5gVar);
        } else {
            this.i1 = null;
            this.j1.clear();
        }
    }

    @Override // androidx.recyclerview.widget.b
    public final void f0(RecyclerView recyclerView) {
        yge0 adapter = recyclerView.getAdapter();
        yge0 yge0Var = this.i1;
        l5g l5gVar = this.h1;
        if (yge0Var != null) {
            yge0Var.y(l5gVar);
        }
        if (adapter != null) {
            this.i1 = adapter;
            adapter.v(l5gVar);
        } else {
            this.i1 = null;
            this.j1.clear();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final View h0(View view, int i, msj msjVar, the0 the0Var) {
        int iJ;
        msjVar.getClass();
        the0Var.getClass();
        FrameLayout frameLayout = this.l1;
        if (frameLayout != null && (iJ = this.f45401a.j(frameLayout)) >= 0) {
            this.f45401a.c(iJ);
        }
        View viewH0 = super.h0(view, i, msjVar, the0Var);
        FrameLayout frameLayout2 = this.l1;
        if (frameLayout2 != null) {
            o(frameLayout2, -1);
        }
        return viewH0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        int iJ;
        msjVar.getClass();
        the0Var.getClass();
        FrameLayout frameLayout = this.l1;
        if (frameLayout != null && (iJ = this.f45401a.j(frameLayout)) >= 0) {
            this.f45401a.c(iJ);
        }
        super.s0(msjVar, the0Var);
        FrameLayout frameLayout2 = this.l1;
        if (frameLayout2 != null) {
            o(frameLayout2, -1);
        }
        if (the0Var.g) {
            return;
        }
        G1(msjVar, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.u0(savedState.f46492a);
            this.j1 = CollectionsKt.N0(savedState.b);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final Parcelable v0() {
        return new SavedState(super.v0(), CollectionsKt.L0(this.j1));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w1(int i, int i2) {
        this.n1 = -1;
        this.o1 = Integer.MIN_VALUE;
        int iF = q3d.f(this.j1, Integer.valueOf(i));
        if (iF < 0) {
            int i3 = -(iF + 1);
            iF = i3 > 0 ? i3 - 1 : -1;
        }
        if (iF == -1 || E1(i) != -1 || E1(i - 1) != -1) {
            super.w1(i, i2);
            return;
        }
        FrameLayout frameLayout = this.l1;
        Integer numValueOf = frameLayout != null ? Integer.valueOf(frameLayout.getHeight()) : null;
        if (this.l1 == null || iF != E1(this.m1) || numValueOf == null) {
            this.n1 = i;
            this.o1 = i2;
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            super.w1(i, numValueOf.intValue() + i2);
        }
    }
}
