package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class j2m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public iab f15787a;
    public Function1 b;
    public w7s0 c;
    public spm0 d;
    public LinearLayoutManager f;
    public fiv g;
    public String h;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public final n0o0 e = maz.b(new v6e0(this, 4));
    public int i = -1;

    public final tjj0 a() {
        return (tjj0) this.e.getValue();
    }

    public final void b(iab iabVar, Function1 function1) {
        function1.getClass();
        this.f15787a = iabVar;
        this.b = function1;
        this.g = null;
        this.h = null;
        this.i = -1;
        this.n = false;
        TableViewImpl tableViewImpl = (TableViewImpl) iabVar.f;
        boolean z = true;
        spm0 spm0Var = new spm0(tableViewImpl, z, R.dimen.text_12, (byte) 0);
        spm0Var.m = tableViewImpl;
        tableViewImpl.setAdapter(spm0Var);
        this.d = spm0Var;
        tableViewImpl.getColumnHeaderRecyclerView().setOnTouchListener(new ovc((byte) 2));
        TableViewImpl tableViewImpl2 = (TableViewImpl) iabVar.g;
        w7s0 w7s0Var = new w7s0(tableViewImpl2, new elk0(function1, (byte) 25));
        tableViewImpl2.setAdapter(w7s0Var);
        this.c = w7s0Var;
        mcu0 verticalRecyclerViewListener = tableViewImpl2.getVerticalRecyclerViewListener();
        int i = 0;
        Class<j2m0> cls = j2m0.class;
        kcl0 kcl0Var = new kcl0(1, this, cls, "onVerticalScroll", "onVerticalScroll(I)V", i, (byte) 14);
        verticalRecyclerViewListener.getClass();
        verticalRecyclerViewListener.b = kcl0Var;
        vlw horizontalRecyclerViewListener = tableViewImpl2.getHorizontalRecyclerViewListener();
        kx2 kx2Var = new kx2(3, this, cls, "onHorizontalScroll", "onHorizontalScroll(IZZ)V", i, (byte) 6);
        horizontalRecyclerViewListener.getClass();
        horizontalRecyclerViewListener.h = kx2Var;
        NonScrollableRecyclerView nonScrollableRecyclerView = (NonScrollableRecyclerView) iabVar.c;
        nonScrollableRecyclerView.setAdapter(a());
        nonScrollableRecyclerView.m(new rpm0(a()));
        nonScrollableRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(nonScrollableRecyclerView.getContext());
        this.f = linearLayoutManager;
        nonScrollableRecyclerView.setLayoutManager(linearLayoutManager);
    }

    public final void c(c3m0 c3m0Var) {
        c3m0Var.getClass();
        iab iabVar = this.f15787a;
        if (iabVar == null) {
            Intrinsics.h("binding");
            throw null;
        }
        iabVar.b.setVisibility(0);
        iab iabVar2 = this.f15787a;
        if (iabVar2 == null) {
            Intrinsics.h("binding");
            throw null;
        }
        ((TableViewImpl) iabVar2.g).setVisibility(0);
        iab iabVar3 = this.f15787a;
        if (iabVar3 == null) {
            Intrinsics.h("binding");
            throw null;
        }
        ((LinearLayout) iabVar3.h).setVisibility(0);
        iab iabVar4 = this.f15787a;
        if (iabVar4 == null) {
            Intrinsics.h("binding");
            throw null;
        }
        ((NonScrollableRecyclerView) iabVar4.c).setVisibility(0);
        ArrayList arrayList = c3m0Var.e;
        iab iabVar5 = this.f15787a;
        if (iabVar5 == null) {
            Intrinsics.h("binding");
            throw null;
        }
        ((DsHeader) iabVar5.e).setVisibility(arrayList.size() <= 1 ? 8 : 0);
        fiv fivVar = c3m0Var.d;
        ArrayList arrayList2 = fivVar.c;
        ArrayList arrayList3 = fivVar.b;
        ArrayList arrayList4 = fivVar.f9607a;
        if (fivVar.equals(this.g)) {
            return;
        }
        this.g = fivVar;
        w7s0 w7s0Var = this.c;
        if (w7s0Var != null) {
            w7s0Var.q(arrayList4, arrayList3, arrayList2, new w8b(new h9b(""), null, null, 30));
        }
        spm0 spm0Var = this.d;
        if (spm0Var != null) {
            spm0Var.q(arrayList4, arrayList3, arrayList2, new w8b(new h9b(""), null, null, 30));
        }
        iab iabVar6 = this.f15787a;
        if (iabVar6 == null) {
            Intrinsics.h("binding");
            throw null;
        }
        TableViewImpl tableViewImpl = (TableViewImpl) iabVar6.g;
        if (!tableViewImpl.isLaidOut() || tableViewImpl.isLayoutRequested()) {
            tableViewImpl.addOnLayoutChangeListener(new w23(this, (byte) 15));
        } else {
            iab iabVar7 = this.f15787a;
            if (iabVar7 == null) {
                Intrinsics.h("binding");
                throw null;
            }
            ((TableViewImpl) iabVar7.g).getCellLayoutManager().C1();
        }
        this.h = null;
        this.i = -1;
        a().f = fivVar.d;
        a().g();
        d();
        f();
    }

    public final void d() {
        if (this.n || this.g == null) {
            return;
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = this.l;
        int i4 = this.m;
        if (i > 0 || i3 > 0) {
            this.n = true;
            iab iabVar = this.f15787a;
            if (iabVar == null) {
                Intrinsics.h("binding");
                throw null;
            }
            TableViewImpl tableViewImpl = (TableViewImpl) iabVar.g;
            tl60.a(tableViewImpl, new i2m0(tableViewImpl, i, this, i2, i3, i4));
        }
    }

    public final void e() {
        Object g0g0Var;
        Object g0g0Var2;
        try {
            e0g0 e0g0Var = j0g0.b;
            iab iabVar = this.f15787a;
            if (iabVar == null) {
                Intrinsics.h("binding");
                throw null;
            }
            g0g0Var = (TableViewImpl) iabVar.g;
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            TableViewImpl tableViewImpl = (TableViewImpl) g0g0Var;
            try {
                iab iabVar2 = this.f15787a;
                if (iabVar2 == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                g0g0Var2 = (NonScrollableRecyclerView) iabVar2.c;
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = null;
                }
                NonScrollableRecyclerView nonScrollableRecyclerView = (NonScrollableRecyclerView) g0g0Var2;
                if (tableViewImpl == null || nonScrollableRecyclerView == null) {
                    this.j = 0;
                    this.k = 0;
                    this.l = 0;
                    this.m = 0;
                    return;
                }
                LinearLayoutManager rowHeaderLayoutManager = tableViewImpl.getRowHeaderLayoutManager();
                int iF1 = rowHeaderLayoutManager.f1();
                if (iF1 != -1) {
                    this.j = iF1;
                    View viewD = rowHeaderLayoutManager.D(iF1);
                    this.k = viewD != null ? viewD.getTop() : 0;
                }
                androidx.recyclerview.widget.b layoutManager = nonScrollableRecyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                int iF2 = linearLayoutManager != null ? linearLayoutManager.f1() : -1;
                if (iF2 == -1 || iF2 < 0) {
                    return;
                }
                this.l = iF2;
                View viewD2 = linearLayoutManager != null ? linearLayoutManager.D(iF2) : null;
                this.m = viewD2 != null ? viewD2.getTop() : 0;
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var2 = new g0g0(th);
            }
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th2);
        }
    }

    public final void f() {
        iab iabVar = this.f15787a;
        if (iabVar != null) {
            ((NonScrollableRecyclerView) iabVar.c).post(new apj0((Object) this, (byte) 3));
        } else {
            Intrinsics.h("binding");
            throw null;
        }
    }

    public final void g(int i, boolean z) {
        int i2 = -1;
        if (i != -1) {
            if (z || i != this.i) {
                this.i = i;
                tjj0 tjj0VarA = a();
                do {
                    List list = (List) tjj0VarA.f;
                    if ((list != null ? (sjj0) CollectionsKt.W(i, list) : null) instanceof qjj0) {
                        i2 = i;
                        break;
                    }
                    i--;
                } while (i >= 0);
                String strH = a().H(i2);
                if (z) {
                    if (StringsKt.W(strH)) {
                        return;
                    }
                } else if (strH.equals(this.h)) {
                    return;
                }
                this.h = strH;
                iab iabVar = this.f15787a;
                if (iabVar == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                ((DsHeader) iabVar.e).setModel(new nrv(strH, false, null, null, null, null, null, 254));
                iab iabVar2 = this.f15787a;
                if (iabVar2 != null) {
                    ((DsHeader) iabVar2.e).requestLayout();
                } else {
                    Intrinsics.h("binding");
                    throw null;
                }
            }
        }
    }
}
