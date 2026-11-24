package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.CellLayoutManager;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class glo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11503a;

    public static void a(TableViewImpl tableViewImpl) {
        tableViewImpl.getCellRecyclerView().y0(0);
        tableViewImpl.getRowHeaderRecyclerView().y0(0);
        flo0 flo0Var = tableViewImpl.k;
        if (flo0Var != null) {
            TableViewImpl tableViewImpl2 = flo0Var.f9749a;
            if (!tableViewImpl2.isShown()) {
                tableViewImpl2.getHorizontalRecyclerViewListener().g = 0;
            }
            tableViewImpl2.getColumnHeaderLayoutManager().w1(0, 0);
            CellLayoutManager cellLayoutManager = tableViewImpl2.getCellLayoutManager();
            int iH1 = cellLayoutManager.h1() + 1;
            for (int iF1 = cellLayoutManager.f1(); iF1 < iH1; iF1++) {
                View viewD = cellLayoutManager.D(iF1);
                RecyclerView recyclerView = viewD instanceof RecyclerView ? (RecyclerView) viewD : null;
                androidx.recyclerview.widget.b layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                ColumnLayoutManager columnLayoutManager = layoutManager instanceof ColumnLayoutManager ? (ColumnLayoutManager) layoutManager : null;
                if (columnLayoutManager != null) {
                    columnLayoutManager.w1(0, 0);
                }
            }
        }
        tableViewImpl.getColumnHeaderRecyclerView().post(new apj0((Object) tableViewImpl, (byte) 11));
    }
}
