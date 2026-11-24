package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class qma0 extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        return 1;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof gka0) {
            String str = ((gka0) y8bVar).f38714a.f12665a;
            str.getClass();
            ((qia0) w5Var).u.c.setText(str);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof eka0) {
            ((pha0) w5Var).u.c.setText(((eka0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof jja0) && (y8bVar instanceof w8b)) {
            String str = ((w8b) y8bVar).f38714a.f12665a;
            str.getClass();
            ((jja0) w5Var).u.c.setText(str);
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistic_data_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvCellValue);
        if (textView != null) {
            return new qia0(new d5e0((FrameLayout) viewInflate, textView, (byte) 17));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvCellValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistic_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvColumnHeader);
        if (textView != null) {
            return new pha0(new d5e0((FrameLayout) viewInflate, textView, (byte) 16));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvColumnHeader)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistic_corner_cell, viewGroup, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.size_50)));
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistic_row_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvRowHeader);
        if (textView != null) {
            return new jja0(new d5e0((FrameLayout) viewInflate, textView, (byte) 18));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvRowHeader)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
