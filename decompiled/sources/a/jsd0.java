package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class jsd0 extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        isd0 isd0Var = y8bVarA instanceof isd0 ? (isd0) y8bVarA : null;
        if (isd0Var == null) {
            return 1;
        }
        if (isd0Var instanceof hsd0) {
            return 2;
        }
        if ((isd0Var instanceof fsd0) || (isd0Var instanceof gsd0)) {
            return 1;
        }
        t9f.b();
        return 0;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof i4q0) && (y8bVar instanceof hsd0)) {
            ((i4q0) w5Var).u.c.setText(((hsd0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof gsd0) {
            t5d t5dVar = w5Var instanceof t5d ? (t5d) w5Var : null;
            if (t5dVar != null) {
                TextView textView = t5dVar.u.c;
                textView.setText(((gsd0) y8bVar).d);
                textView.setGravity(16);
            }
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        wt90 wt90Var = w5Var instanceof wt90 ? (wt90) w5Var : null;
        if (wt90Var != null) {
            fsd0 fsd0Var = (fsd0) y8bVar;
            ycu0 ycu0Var = wt90Var.u;
            ycu0Var.e.setText(fsd0Var.d);
            List list = u0d.f34849a;
            u0d.j(ycu0Var.c, fsd0Var.f, R.drawable.ic_no_country, 0, null, null, null, 508);
            ycu0Var.d.setText(fsd0Var.e);
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Exception {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            throw new Exception("");
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_race_result_text_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTextValue);
        if (textView != null) {
            return new i4q0(new d5e0((FrameLayout) viewInflate, textView, (byte) 25));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTextValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_race_result_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTitle);
        if (textView != null) {
            return new t5d(new d5e0((FrameLayout) viewInflate, textView, (byte) 24));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTitle)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_race_result_corner_cell, viewGroup, false);
        viewInflate.getClass();
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.space_50)));
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_race_result_pilot_row_header, viewGroup, false);
        int i2 = R.id.ivCountry;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivCountry);
        if (roundCornerImageView != null) {
            i2 = R.id.tvPilotName;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvPilotName);
            if (textView != null) {
                i2 = R.id.tvPosition;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvPosition);
                if (textView2 != null) {
                    return new wt90(new ycu0((ConstraintLayout) viewInflate, roundCornerImageView, textView, textView2, (byte) 1));
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
