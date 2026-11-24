package org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.layout_manager;

import a.msj;
import a.the0;
import a.y9b;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/CellLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CellLayoutManager extends LinearLayoutManager {
    public final void C1() {
        ViewGroup.LayoutParams layoutParams;
        int I = I();
        for (int i = 0; i < I; i++) {
            View viewH = H(i);
            y9b y9bVar = viewH instanceof y9b ? (y9b) viewH : null;
            if (y9bVar != null && (layoutParams = y9bVar.getLayoutParams()) != null) {
                layoutParams.width = -2;
            }
            if (y9bVar != null) {
                y9bVar.requestLayout();
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int I0(int i, msj msjVar, the0 the0Var) {
        msjVar.getClass();
        the0Var.getClass();
        return super.I0(i, msjVar, the0Var);
    }

    @Override // androidx.recyclerview.widget.b
    public final void w0(int i) {
    }
}
