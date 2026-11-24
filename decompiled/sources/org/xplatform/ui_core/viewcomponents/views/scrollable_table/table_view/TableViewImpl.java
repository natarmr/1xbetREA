package org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view;

import a.aqd0;
import a.flo0;
import a.hny;
import a.k5;
import a.mcu0;
import a.nmo0;
import a.omo0;
import a.pmo0;
import a.uxj;
import a.vlw;
import a.y9b;
import a.yge0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.CellLayoutManager;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnHeaderLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class TableViewImpl extends FrameLayout implements nmo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y9b f47219a;
    public y9b b;
    public y9b c;
    public k5 d;
    public final uxj e;
    public mcu0 f;
    public vlw g;
    public ColumnHeaderLayoutManager h;
    public LinearLayoutManager i;
    public CellLayoutManager j;
    public flo0 k;
    public View l;
    public View m;
    public final boolean n;
    public final boolean o;
    public int p;
    public int q;
    public boolean r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl$SavedState;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47220a;
        public final Parcelable b;
        public final Parcelable c;
        public final Parcelable d;

        public SavedState(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4) {
            this.f47220a = parcelable;
            this.b = parcelable2;
            this.c = parcelable3;
            this.d = parcelable4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f47220a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        context.getClass();
        int dimension = (int) getResources().getDimension(R.dimen.size_24);
        this.e = new uxj();
        this.n = true;
        this.o = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aqd0.w, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            dimension = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, dimension);
            this.n = typedArrayObtainStyledAttributes.getBoolean(1, true);
            this.o = typedArrayObtainStyledAttributes.getBoolean(2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        y9b y9bVar = new y9b(getContext());
        y9bVar.setLayoutManager(getColumnHeaderLayoutManager());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.q, getGravity());
        layoutParams.leftMargin = this.p;
        y9bVar.setLayoutParams(layoutParams);
        this.b = y9bVar;
        y9b y9bVar2 = new y9b(getContext());
        y9bVar2.setLayoutManager(getRowHeaderLayoutManager());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.p, -2, getGravity());
        layoutParams2.topMargin = this.q;
        y9bVar2.setLayoutParams(layoutParams2);
        this.c = y9bVar2;
        y9b y9bVar3 = new y9b(getContext());
        y9bVar3.setMotionEventSplittingEnabled(false);
        y9bVar3.setLayoutManager(getCellLayoutManager());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, getGravity());
        layoutParams3.leftMargin = this.p;
        layoutParams3.topMargin = this.q;
        y9bVar3.setLayoutParams(layoutParams3);
        this.f47219a = y9bVar3;
        y9b y9bVar4 = this.c;
        if (y9bVar4 != null) {
            y9bVar4.setClipToPadding(false);
            y9bVar4.setItemAnimator(null);
            y9bVar4.setPadding(0, 0, 0, dimension);
        }
        y9b y9bVar5 = this.f47219a;
        if (y9bVar5 != null) {
            y9bVar5.setClipToPadding(false);
            y9bVar5.setHasFixedSize(true);
            y9bVar5.setItemAnimator(null);
            y9bVar5.setPadding(0, 0, 0, dimension);
        }
        addView(this.b);
        addView(this.c);
        addView(this.f47219a);
        this.k = new flo0(this);
        mcu0 mcu0Var = new mcu0(this);
        this.f = mcu0Var;
        y9b y9bVar6 = this.c;
        if (y9bVar6 != null) {
            y9bVar6.o(mcu0Var);
        }
        y9b y9bVar7 = this.c;
        if (y9bVar7 != null) {
            y9bVar7.n(mcu0Var);
        }
        y9b y9bVar8 = this.f47219a;
        if (y9bVar8 != null) {
            y9bVar8.o(mcu0Var);
        }
        y9b y9bVar9 = this.f47219a;
        if (y9bVar9 != null) {
            y9bVar9.n(mcu0Var);
        }
        vlw vlwVar = new vlw(this);
        this.g = vlwVar;
        y9b y9bVar10 = this.b;
        if (y9bVar10 != null) {
            y9bVar10.n(vlwVar);
        }
        omo0 omo0Var = new omo0(this);
        y9b y9bVar11 = this.b;
        if (y9bVar11 != null) {
            y9bVar11.addOnLayoutChangeListener(omo0Var);
        }
        y9b y9bVar12 = this.f47219a;
        if (y9bVar12 != null) {
            y9bVar12.addOnLayoutChangeListener(omo0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHorizontalEdgeFading$lambda$0(TableViewImpl tableViewImpl) {
        View view;
        View viewD;
        y9b y9bVar = tableViewImpl.f47219a;
        int measuredHeight = (y9bVar != null ? y9bVar.getMeasuredHeight() : 0) + tableViewImpl.q;
        y9b y9bVar2 = tableViewImpl.f47219a;
        ViewGroup.LayoutParams layoutParams = null;
        b layoutManager = y9bVar2 != null ? y9bVar2.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iH1 = linearLayoutManager != null ? linearLayoutManager.h1() : 0;
        boolean z = iH1 == (linearLayoutManager != null ? linearLayoutManager.S() : 0) - 1;
        int bottom = ((linearLayoutManager == null || (viewD = linearLayoutManager.D(iH1)) == null) ? 0 : viewD.getBottom()) + tableViewImpl.q;
        if (z) {
            measuredHeight = bottom;
        }
        View view2 = tableViewImpl.m;
        if (view2 != null) {
            int iG1 = tableViewImpl.getColumnHeaderLayoutManager().g1();
            yge0 adapter = tableViewImpl.getColumnHeaderRecyclerView().getAdapter();
            view2.setVisibility(iG1 >= (adapter != null ? adapter.d() : 0) - 1 ? 8 : 0);
        }
        View view3 = tableViewImpl.l;
        if (view3 == null || view3.getHeight() != measuredHeight) {
            View view4 = tableViewImpl.l;
            if (view4 != null && tableViewImpl.m != null) {
                if (tableViewImpl.n) {
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    layoutParams2.getClass();
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.leftMargin = tableViewImpl.p;
                    layoutParams3.height = measuredHeight;
                    view4.setLayoutParams(layoutParams3);
                }
                if (!tableViewImpl.o || (view = tableViewImpl.m) == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = measuredHeight;
                    layoutParams = layoutParams4;
                }
                view.setLayoutParams(layoutParams);
                return;
            }
            View view5 = new View(tableViewImpl.getContext());
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(view5.getContext().getResources().getDimensionPixelSize(R.dimen.size_14), measuredHeight);
            layoutParams5.gravity = 3;
            layoutParams5.leftMargin = tableViewImpl.p;
            view5.setLayoutParams(layoutParams5);
            view5.setBackground(view5.getContext().getDrawable(R.drawable.solid_shadow));
            view5.setVisibility(8);
            tableViewImpl.l = view5;
            View view6 = new View(tableViewImpl.getContext());
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(view6.getContext().getResources().getDimensionPixelSize(R.dimen.size_36), measuredHeight);
            layoutParams6.gravity = 5;
            view6.setLayoutParams(layoutParams6);
            view6.setBackground(view6.getContext().getDrawable(R.drawable.right_shadow));
            view6.setVisibility(8);
            tableViewImpl.m = view6;
            tableViewImpl.addView(view6);
            tableViewImpl.addView(tableViewImpl.l);
        }
    }

    public final void b(boolean z, boolean z2) {
        View view = this.l;
        if (view != null) {
            view.setVisibility(z && this.n ? 0 : 8);
        }
        View view2 = this.m;
        if (view2 != null) {
            view2.setVisibility(z2 && this.o ? 0 : 8);
        }
    }

    @Override // a.nmo0
    public k5 getAdapter() throws Exception {
        k5 k5Var = this.d;
        if (k5Var == null) {
            throw new Exception("tableAdapter is null");
        }
        k5Var.getClass();
        return k5Var;
    }

    @Override // a.nmo0
    public CellLayoutManager getCellLayoutManager() {
        CellLayoutManager cellLayoutManager = this.j;
        if (cellLayoutManager != null) {
            return cellLayoutManager;
        }
        Context context = getContext();
        context.getClass();
        CellLayoutManager cellLayoutManager2 = new CellLayoutManager(context);
        cellLayoutManager2.x1(1);
        this.j = cellLayoutManager2;
        return cellLayoutManager2;
    }

    @Override // a.nmo0
    public y9b getCellRecyclerView() {
        y9b y9bVar = this.f47219a;
        if (y9bVar == null) {
            y9bVar = new y9b(getContext());
            this.f47219a = y9bVar;
        }
        y9bVar.getClass();
        return y9bVar;
    }

    @Override // a.nmo0
    public ColumnHeaderLayoutManager getColumnHeaderLayoutManager() {
        ColumnHeaderLayoutManager columnHeaderLayoutManager = this.h;
        if (columnHeaderLayoutManager != null) {
            return columnHeaderLayoutManager;
        }
        ColumnHeaderLayoutManager columnHeaderLayoutManager2 = new ColumnHeaderLayoutManager(getContext());
        this.h = columnHeaderLayoutManager2;
        return columnHeaderLayoutManager2;
    }

    @Override // a.nmo0
    public y9b getColumnHeaderRecyclerView() {
        y9b y9bVar = this.b;
        if (y9bVar == null) {
            y9bVar = new y9b(getContext());
            this.b = y9bVar;
        }
        y9bVar.getClass();
        return y9bVar;
    }

    public int getGravity() {
        return 51;
    }

    @Override // a.nmo0
    public vlw getHorizontalRecyclerViewListener() {
        vlw vlwVar = this.g;
        if (vlwVar != null) {
            return vlwVar;
        }
        vlw vlwVar2 = new vlw(this);
        this.g = vlwVar2;
        return vlwVar2;
    }

    @Override // a.nmo0
    public LinearLayoutManager getRowHeaderLayoutManager() {
        LinearLayoutManager linearLayoutManager = this.i;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
            this.i = linearLayoutManager;
        }
        linearLayoutManager.getClass();
        return linearLayoutManager;
    }

    @Override // a.nmo0
    public y9b getRowHeaderRecyclerView() {
        y9b y9bVar = this.c;
        if (y9bVar == null) {
            y9bVar = new y9b(getContext());
            this.c = y9bVar;
        }
        y9bVar.getClass();
        return y9bVar;
    }

    @Override // a.nmo0
    public int getRowHeaderWidth() {
        return this.p;
    }

    @Override // a.nmo0
    public flo0 getScrollHandler() {
        flo0 flo0Var = this.k;
        if (flo0Var != null) {
            return flo0Var;
        }
        flo0 flo0Var2 = new flo0(this);
        this.k = flo0Var2;
        return flo0Var2;
    }

    public boolean getShowCornerView() {
        return false;
    }

    public pmo0 getTableViewListener() {
        return this.e;
    }

    @Override // a.nmo0
    public mcu0 getVerticalRecyclerViewListener() {
        mcu0 mcu0Var = this.f;
        if (mcu0Var != null) {
            return mcu0Var;
        }
        mcu0 mcu0Var2 = new mcu0(this);
        this.f = mcu0Var2;
        return mcu0Var2;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        b layoutManager;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f47220a);
        LinearLayoutManager linearLayoutManager = this.i;
        if (linearLayoutManager != null) {
            linearLayoutManager.u0(savedState.b);
        }
        ColumnHeaderLayoutManager columnHeaderLayoutManager = this.h;
        if (columnHeaderLayoutManager != null) {
            columnHeaderLayoutManager.u0(savedState.c);
        }
        y9b y9bVar = this.f47219a;
        if (y9bVar == null || (layoutManager = y9bVar.getLayoutManager()) == null) {
            return;
        }
        layoutManager.u0(savedState.d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b layoutManager;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        LinearLayoutManager linearLayoutManager = this.i;
        Parcelable parcelableV0 = null;
        Parcelable parcelableV1 = linearLayoutManager != null ? linearLayoutManager.v0() : null;
        ColumnHeaderLayoutManager columnHeaderLayoutManager = this.h;
        Parcelable parcelableV2 = columnHeaderLayoutManager != null ? columnHeaderLayoutManager.v0() : null;
        y9b y9bVar = this.f47219a;
        if (y9bVar != null && (layoutManager = y9bVar.getLayoutManager()) != null) {
            parcelableV0 = layoutManager.v0();
        }
        return new SavedState(parcelableOnSaveInstanceState, parcelableV1, parcelableV2, parcelableV0);
    }

    public final void setAdapter(k5 k5Var) {
        k5Var.getClass();
        this.d = k5Var;
        k5Var.r(this);
        y9b y9bVar = this.b;
        if (y9bVar != null) {
            k5 k5Var2 = this.d;
            y9bVar.setAdapter(k5Var2 != null ? k5Var2.f17694a : null);
        }
        y9b y9bVar2 = this.c;
        if (y9bVar2 != null) {
            k5 k5Var3 = this.d;
            y9bVar2.setAdapter(k5Var3 != null ? k5Var3.b : null);
        }
        y9b y9bVar3 = this.f47219a;
        if (y9bVar3 != null) {
            k5 k5Var4 = this.d;
            y9bVar3.setAdapter(k5Var4 != null ? k5Var4.c : null);
        }
    }

    @Override // a.nmo0
    public void setColumnHeaderHeight(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        y9b y9bVar = this.c;
        ViewGroup.LayoutParams layoutParams = y9bVar != null ? y9bVar.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i;
        }
        y9b y9bVar2 = this.b;
        ViewGroup.LayoutParams layoutParams3 = y9bVar2 != null ? y9bVar2.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.height = i;
        }
        y9b y9bVar3 = this.f47219a;
        ViewGroup.LayoutParams layoutParams5 = y9bVar3 != null ? y9bVar3.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.topMargin = i;
        }
        requestLayout();
        getAdapter().getClass();
    }

    public void setHasFixedWidth(boolean z) {
        this.r = z;
        y9b y9bVar = this.b;
        if (y9bVar != null) {
            y9bVar.setHasFixedSize(z);
        }
    }

    @Override // a.nmo0
    public void setRowHeaderWidth(int i) {
        if (i <= this.p) {
            return;
        }
        this.p = i;
        y9b y9bVar = this.c;
        ViewGroup.LayoutParams layoutParams = y9bVar != null ? y9bVar.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i;
        }
        y9b y9bVar2 = this.b;
        ViewGroup.LayoutParams layoutParams3 = y9bVar2 != null ? y9bVar2.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.leftMargin = i;
        }
        y9b y9bVar3 = this.f47219a;
        ViewGroup.LayoutParams layoutParams5 = y9bVar3 != null ? y9bVar3.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.leftMargin = i;
        }
        requestLayout();
        View view = getAdapter().h;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            if (layoutParams7 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                layoutParams7.width = i;
                view.setLayoutParams(layoutParams7);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
