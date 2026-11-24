package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class pow extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof now) && (y8bVar instanceof bow)) {
            ((now) w5Var).u.c.setText(((bow) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof oow) && (y8bVar instanceof cow)) {
            ((oow) w5Var).u.c.setText(((cow) y8bVar).d);
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_race_info, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.dataTextView);
        if (textView != null) {
            return new now(new d5e0((FrameLayout) viewInflate, textView, (byte) 23));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.dataTextView)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_horse_race_column_title, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new mow(new d5e0((FrameLayout) viewInflate, textView, (byte) 15));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_horse_race_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView == null) {
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, vqd.d(viewGroup, R.dimen.size_50)));
        aow aowVar = y8bVar instanceof aow ? (aow) y8bVar : null;
        String str = aowVar != null ? aowVar.d : null;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        return frameLayout;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_race_date_row, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new oow(new d5e0((FrameLayout) viewInflate, textView, (byte) 22));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
