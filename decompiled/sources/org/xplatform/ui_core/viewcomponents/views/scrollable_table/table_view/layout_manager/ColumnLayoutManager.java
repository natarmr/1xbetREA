package org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager;

import a.hhe0;
import a.msj;
import a.nmo0;
import a.the0;
import a.y9b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ColumnLayoutManager extends LinearLayoutManager {
    public y9b g1;
    public final y9b h1;
    public final ColumnHeaderLayoutManager i1;
    public final CellLayoutManager j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnLayoutManager(Context context, nmo0 nmo0Var) {
        super(context);
        nmo0Var.getClass();
        this.h1 = nmo0Var.getColumnHeaderRecyclerView();
        this.i1 = nmo0Var.getColumnHeaderLayoutManager();
        this.j1 = nmo0Var.getCellLayoutManager();
        x1(0);
        this.Z = (byte) 25;
        this.z = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int G0(int i, msj msjVar, the0 the0Var) {
        y9b y9bVar;
        msjVar.getClass();
        the0Var.getClass();
        y9b y9bVar2 = this.h1;
        if (y9bVar2.getScrollState() == 0 && (y9bVar = this.g1) != null && (!y9bVar.o2)) {
            y9bVar2.scrollBy(i, 0);
        }
        return super.G0(i, msjVar, the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final void b0(View view) {
        int i = this.i1.g1.get(b.T(view), -1);
        if (i >= 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            hhe0 hhe0Var = layoutParams instanceof hhe0 ? (hhe0) layoutParams : null;
            if (hhe0Var != null && ((ViewGroup.MarginLayoutParams) hhe0Var).width != i) {
                ((ViewGroup.MarginLayoutParams) hhe0Var).width = i;
            }
        }
        super.b0(view);
    }

    @Override // androidx.recyclerview.widget.b
    public final void f0(RecyclerView recyclerView) {
        y9b y9bVar = recyclerView instanceof y9b ? (y9b) recyclerView : null;
        this.g1 = y9bVar;
        if (y9bVar != null) {
            this.j1.getClass();
            b.T(y9bVar);
        }
    }
}
