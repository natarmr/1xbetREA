package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnHeaderLayoutManager;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class aab extends q4 {
    public final Context f;
    public final nmo0 g;
    public final boolean h;
    public final nhe0 i;
    public Integer j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aab(List list, Context context, nmo0 nmo0Var, boolean z) {
        super(context, list);
        list.getClass();
        nmo0Var.getClass();
        this.f = context;
        this.g = nmo0Var;
        this.h = z;
        this.i = new nhe0();
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        yge0 adapter = ((z9b) ((w5) xhe0Var)).u.getAdapter();
        kab kabVar = adapter instanceof kab ? (kab) adapter : null;
        List list = (List) ((List) this.e).get(i);
        if (kabVar != null) {
            kabVar.h = i;
        }
        if (kabVar != null) {
            list.getClass();
            kabVar.e = list;
            kabVar.g();
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        Context context = this.f;
        y9b y9bVar = new y9b(context);
        y9bVar.setRecycledViewPool(this.i);
        Integer num = this.j;
        if (num != null) {
            y9bVar.setItemViewCacheSize(num.intValue());
        }
        nmo0 nmo0Var = this.g;
        y9bVar.setHasFixedSize(((TableViewImpl) nmo0Var).r);
        y9bVar.n(nmo0Var.getHorizontalRecyclerViewListener());
        y9bVar.setLayoutManager(new ColumnLayoutManager(context, nmo0Var));
        k5 adapter = nmo0Var.getAdapter();
        adapter.getClass();
        y9bVar.setAdapter(new kab(context, adapter, this.h));
        return new z9b(y9bVar);
    }

    @Override // a.yge0
    public final void s(xhe0 xhe0Var) {
        flo0 scrollHandler = this.g.getScrollHandler();
        androidx.recyclerview.widget.b layoutManager = ((z9b) ((w5) xhe0Var)).u.getLayoutManager();
        layoutManager.getClass();
        ColumnLayoutManager columnLayoutManager = (ColumnLayoutManager) layoutManager;
        int iF1 = scrollHandler.b.f1();
        ColumnHeaderLayoutManager columnHeaderLayoutManager = scrollHandler.b;
        View viewD = columnHeaderLayoutManager.D(columnHeaderLayoutManager.f1());
        columnLayoutManager.w1(iF1, viewD != null ? viewD.getLeft() : 0);
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        w5 w5Var = (w5) xhe0Var;
        w5Var.getClass();
        z9b z9bVar = w5Var instanceof z9b ? (z9b) w5Var : null;
        if (z9bVar != null) {
            z9bVar.u.m2 = 0;
        }
    }
}
