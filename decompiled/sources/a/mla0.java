package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class mla0 extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        return a(i, i2) instanceof nka0 ? 2 : 1;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof qka0) {
            String str = ((qka0) y8bVar).f38714a.f12665a;
            str.getClass();
            TextView textView = ((ska0) w5Var).u.c;
            textView.setText(str);
            textView.setTextAlignment(5);
            return;
        }
        if (y8bVar instanceof nka0) {
            String str2 = ((nka0) y8bVar).f38714a.f12665a;
            str2.getClass();
            TextView textView2 = ((tka0) w5Var).u.c;
            textView2.setText(str2);
            textView2.setTextAlignment(4);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof oka0) {
            String str = ((oka0) y8bVar).d;
            str.getClass();
            ((rka0) w5Var).u.c.setText(str);
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof gla0) && (y8bVar instanceof w8b)) {
            String str = ((w8b) y8bVar).f38714a.f12665a;
            str.getClass();
            ((gla0) w5Var).u.c.setText(str);
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i == 1 ? new ska0(d5e0.f(layoutInflaterFrom, viewGroup)) : new tka0(d5e0.f(layoutInflaterFrom, viewGroup));
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistics_cricket_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvColumnHeader);
        if (textView != null) {
            return new rka0(new d5e0((FrameLayout) viewInflate, textView, (byte) 19));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvColumnHeader)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistics_cricket_corner_cell, viewGroup, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.size_50)));
        if (y8bVar instanceof qka0) {
            ((TextView) viewInflate.findViewById(R.id.tvName)).setText(((qka0) y8bVar).f38714a.f12665a);
        }
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_players_statistics_cricket_row_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvRowHeader);
        if (textView != null) {
            return new gla0(new d5e0((FrameLayout) viewInflate, textView, (byte) 21));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvRowHeader)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
