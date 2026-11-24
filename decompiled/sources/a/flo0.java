package a;

import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.ColumnHeaderLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class flo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TableViewImpl f9749a;
    public final ColumnHeaderLayoutManager b;

    public flo0(TableViewImpl tableViewImpl) {
        this.f9749a = tableViewImpl;
        tableViewImpl.getCellLayoutManager();
        tableViewImpl.getRowHeaderLayoutManager();
        this.b = tableViewImpl.getColumnHeaderLayoutManager();
    }
}
