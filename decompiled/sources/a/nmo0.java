package a;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.CellLayoutManager;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnHeaderLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public interface nmo0 {
    k5 getAdapter();

    CellLayoutManager getCellLayoutManager();

    y9b getCellRecyclerView();

    ColumnHeaderLayoutManager getColumnHeaderLayoutManager();

    y9b getColumnHeaderRecyclerView();

    Context getContext();

    vlw getHorizontalRecyclerViewListener();

    LinearLayoutManager getRowHeaderLayoutManager();

    y9b getRowHeaderRecyclerView();

    int getRowHeaderWidth();

    flo0 getScrollHandler();

    mcu0 getVerticalRecyclerViewListener();

    void setColumnHeaderHeight(int i);

    void setRowHeaderWidth(int i);
}
