package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class adv extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        if (y8bVarA == null) {
            return 1;
        }
        if (y8bVarA instanceof idj) {
            return 2;
        }
        if (y8bVarA instanceof eyl0) {
            return 3;
        }
        if (y8bVarA instanceof qkc) {
            return 4;
        }
        return y8bVarA instanceof tih0 ? 5 : 1;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof jdj) && (y8bVar instanceof idj)) {
            idj idjVar = (idj) y8bVar;
            wcu0 wcu0Var = ((jdj) w5Var).u;
            wcu0Var.d.setText(idjVar.d);
            wcu0Var.c.setText(idjVar.e);
            return;
        }
        if ((w5Var instanceof jyl0) && (y8bVar instanceof eyl0)) {
            eyl0 eyl0Var = (eyl0) y8bVar;
            List list = u0d.f34849a;
            jk30 jk30Var = ((jyl0) w5Var).u;
            u0d.j(jk30Var.c, eyl0Var.e, R.drawable.ic_no_country, 0, null, null, null, 508);
            jk30Var.d.setText(eyl0Var.d);
            return;
        }
        if ((w5Var instanceof rkc) && (y8bVar instanceof qkc)) {
            ((rkc) w5Var).u.c.setText(((qkc) y8bVar).d);
        } else if ((w5Var instanceof uih0) && (y8bVar instanceof tih0)) {
            ((uih0) w5Var).u.c.setText(((tih0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof hcv) {
            icv icvVar = w5Var instanceof icv ? (icv) w5Var : null;
            if (icvVar != null) {
                hcv hcvVar = (hcv) y8bVar;
                TextView textView = icvVar.u.c;
                textView.setText(hcvVar.d);
                textView.setGravity(hcvVar.e | 16);
            }
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Exception {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_grand_date_cell, viewGroup, false);
            int i2 = R.id.tvDateEnd;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDateEnd);
            if (textView != null) {
                i2 = R.id.tvDateStart;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvDateStart);
                if (textView2 != null) {
                    return new jdj(new wcu0((LinearLayout) viewInflate, textView, textView2, (byte) 0));
                }
            }
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 3) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_grand_stage_cell, viewGroup, false);
            int i3 = R.id.ivCountry;
            ImageView imageView = (ImageView) yum0.f(viewInflate2, R.id.ivCountry);
            if (imageView != null) {
                i3 = R.id.tvTitle;
                TextView textView3 = (TextView) yum0.f(viewInflate2, R.id.tvTitle);
                if (textView3 != null) {
                    return new jyl0(new jk30((LinearLayout) viewInflate2, imageView, textView3, (byte) 2));
                }
            }
            hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
            return null;
        }
        if (i == 4) {
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.vh_grand_city_cell, viewGroup, false);
            TextView textView4 = (TextView) yum0.f(viewInflate3, R.id.tvCity);
            if (textView4 != null) {
                return new rkc(new d5e0((FrameLayout) viewInflate3, textView4, (byte) 12));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(R.id.tvCity)));
            return null;
        }
        if (i != 5) {
            throw new Exception("");
        }
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.vh_grand_season_cell, viewGroup, false);
        TextView textView5 = (TextView) yum0.f(viewInflate4, R.id.tvSeason);
        if (textView5 != null) {
            return new uih0(new d5e0((FrameLayout) viewInflate4, textView5, (byte) 14));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(R.id.tvSeason)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_grand_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvSeason);
        if (textView != null) {
            return new icv(new d5e0((FrameLayout) viewInflate, textView, (byte) 13));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvSeason)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.space_50)));
        return frameLayout;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_grand_empty_row_header, viewGroup, false);
        if (viewInflate != null) {
            return new sun((FrameLayout) viewInflate);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
