package a;

import android.view.View;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager.CellLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class omo0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TableViewImpl f25513a;
    public final y9b b;
    public final y9b c;
    public final CellLayoutManager d;

    static {
        int i = y9b.q2;
    }

    public omo0(TableViewImpl tableViewImpl) {
        this.f25513a = tableViewImpl;
        this.b = tableViewImpl.getCellRecyclerView();
        this.c = tableViewImpl.getColumnHeaderRecyclerView();
        this.d = tableViewImpl.getCellLayoutManager();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (!view.isShown() || i3 - i == i7 - i5) {
            return;
        }
        y9b y9bVar = this.c;
        int width = y9bVar.getWidth();
        y9b y9bVar2 = this.b;
        if (width > y9bVar2.getWidth()) {
            this.d.C1();
        } else if (y9bVar2.getWidth() > y9bVar.getWidth()) {
            y9bVar.getLayoutParams().width = -2;
            y9bVar.requestLayout();
        }
        TableViewImpl tableViewImpl = this.f25513a;
        tableViewImpl.getColumnHeaderRecyclerView().post(new apj0((Object) tableViewImpl, (byte) 11));
    }
}
