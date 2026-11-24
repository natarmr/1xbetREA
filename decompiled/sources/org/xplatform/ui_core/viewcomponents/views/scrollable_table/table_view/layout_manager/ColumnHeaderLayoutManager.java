package org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager;

import a.hhe0;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ColumnHeaderLayoutManager extends LinearLayoutManager {
    public final SparseIntArray g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnHeaderLayoutManager(Context context) {
        super(context);
        context.getClass();
        this.g1 = new SparseIntArray();
        x1(0);
        this.Z = (byte) 25;
    }

    @Override // androidx.recyclerview.widget.b
    public final void b0(View view) {
        int i = this.g1.get(b.T(view), -1);
        if (i >= 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            hhe0 hhe0Var = layoutParams instanceof hhe0 ? (hhe0) layoutParams : null;
            if (hhe0Var != null && ((ViewGroup.MarginLayoutParams) hhe0Var).width != i) {
                ((ViewGroup.MarginLayoutParams) hhe0Var).width = i;
            }
        }
        super.b0(view);
    }
}
