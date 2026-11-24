package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class zle0 extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        return a(i, i2) instanceof yke0 ? 2 : 1;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof bme0) && (y8bVar instanceof yke0)) {
            ((bme0) w5Var).u.c.setText(((yke0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        cme0 cme0Var;
        if (y8bVar instanceof zke0) {
            cme0Var = w5Var instanceof cme0 ? (cme0) w5Var : null;
            if (cme0Var != null) {
                String str = ((zke0) y8bVar).d;
                str.getClass();
                adu0 adu0Var = cme0Var.u;
                TextView textView = adu0Var.d;
                textView.setText(str);
                textView.setGravity(17);
                textView.setVisibility(0);
                adu0Var.c.setVisibility(8);
                return;
            }
            return;
        }
        if (y8bVar instanceof wke0) {
            cme0Var = w5Var instanceof cme0 ? (cme0) w5Var : null;
            if (cme0Var != null) {
                int i = ((wke0) y8bVar).d;
                adu0 adu0Var2 = cme0Var.u;
                TextView textView2 = adu0Var2.d;
                AppCompatImageView appCompatImageView = adu0Var2.c;
                textView2.setText("");
                textView2.setVisibility(8);
                appCompatImageView.setImageResource(i);
                appCompatImageView.setVisibility(0);
            }
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof xke0) {
            wle0 wle0Var = w5Var instanceof wle0 ? (wle0) w5Var : null;
            if (wle0Var != null) {
                wle0Var.u.c.setText(((xke0) y8bVar).d);
            }
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Exception {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            throw new Exception("");
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_referee_tour_text_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTextValue);
        if (textView != null) {
            return new bme0(new d5e0((FrameLayout) viewInflate, textView, (byte) 27));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTextValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_referee_tour_text_column_header, viewGroup, false);
        int i2 = R.id.ivColumnIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.ivColumnIcon);
        if (appCompatImageView != null) {
            i2 = R.id.tvColumnTitle;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvColumnTitle);
            if (textView != null) {
                return new cme0(new adu0((FrameLayout) viewInflate, appCompatImageView, textView, (byte) 1));
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_referee_tour_corner_cell, viewGroup, false);
        viewInflate.getClass();
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, vqd.d(viewGroup, R.dimen.size_50)));
        if (y8bVar instanceof w8b) {
            ((TextView) viewInflate.findViewById(R.id.tvCornerTitle)).setText(((w8b) y8bVar).f38714a.f12665a);
        }
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_referee_tour_text_row_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTextValue);
        if (textView != null) {
            return new wle0(new d5e0((FrameLayout) viewInflate, textView, (byte) 28));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTextValue)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
