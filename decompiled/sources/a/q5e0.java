package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class q5e0 extends k5 {
    public TableViewImpl l;

    public static void s(List list, w5 w5Var) {
        View view = w5Var.f40887a;
        if (list.size() == 1) {
            view.setBackgroundColor(((Number) CollectionsKt.U(list)).intValue());
        } else if (list.size() == 2) {
            view.setBackground(new obl(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue()));
        }
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        b5e0 b5e0Var = w5Var instanceof b5e0 ? (b5e0) w5Var : null;
        if (b5e0Var != null) {
            a5e0 a5e0Var = (a5e0) y8bVar;
            s(a5e0Var.d, w5Var);
            TextView textView = b5e0Var.u.c;
            textView.setText(a5e0Var.f38714a.f12665a);
            textView.setGravity(17);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        CharSequence text;
        c5e0 c5e0Var = w5Var instanceof c5e0 ? (c5e0) w5Var : null;
        if (c5e0Var != null) {
            d5e0 d5e0Var = c5e0Var.u;
            TextView textView = d5e0Var.c;
            w8b w8bVar = y8bVar instanceof w8b ? (w8b) y8bVar : null;
            if (w8bVar == null || (text = w8bVar.f38714a.f12665a) == null) {
                text = d5e0Var.b.getResources().getText(R.string.minus);
                text.getClass();
            }
            textView.setText(text);
            textView.setGravity(17);
            textView.setVisibility(0);
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        k5e0 k5e0Var = w5Var instanceof k5e0 ? (k5e0) w5Var : null;
        if (k5e0Var != null) {
            j5e0 j5e0Var = (j5e0) y8bVar;
            s(j5e0Var.e, w5Var);
            TextView textView = k5e0Var.u.c;
            textView.setText(j5e0Var.d);
            textView.setGravity(17);
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rating_history_main_table_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.dataTextView);
        if (textView != null) {
            return new b5e0(new d5e0((FrameLayout) viewInflate, textView, (byte) 2));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.dataTextView)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rating_history_column_title, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new c5e0(new d5e0((FrameLayout) viewInflate, textView, (byte) 0));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        String string;
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rating_history_first_table_column, viewGroup, false);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        if (textView != null) {
            w8b w8bVar = y8bVar instanceof w8b ? (w8b) y8bVar : null;
            if (w8bVar == null || (string = w8bVar.f38714a.f12665a) == null) {
                string = viewGroup.getContext().getResources().getString(R.string.minus);
                string.getClass();
            }
            textView.setText(string);
        }
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-2, vqd.d(viewGroup, R.dimen.size_50)));
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rating_history_floating_panel, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new k5e0(new d5e0((FrameLayout) viewInflate, textView, (byte) 1));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
