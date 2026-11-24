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
public final class dnv0 extends k5 {
    public TableViewImpl l;
    public final szu0 m;

    public dnv0(TableViewImpl tableViewImpl, szu0 szu0Var) {
        super(tableViewImpl, true, R.dimen.text_12);
        this.l = tableViewImpl;
        this.m = szu0Var;
    }

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        xmv0 xmv0Var = y8bVarA instanceof xmv0 ? (xmv0) y8bVarA : null;
        if (xmv0Var == null) {
            return 1;
        }
        if (xmv0Var instanceof vmv0) {
            return 2;
        }
        if ((xmv0Var instanceof umv0) || (xmv0Var instanceof wmv0)) {
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
        if ((w5Var instanceof faq0) && (y8bVar instanceof vmv0)) {
            ((faq0) w5Var).u.c.setText(((vmv0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof wmv0) {
            ymv0 ymv0Var = w5Var instanceof ymv0 ? (ymv0) w5Var : null;
            if (ymv0Var != null) {
                TextView textView = ymv0Var.u.c;
                textView.setText(((wmv0) y8bVar).d);
                textView.setGravity(16);
            }
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        k950 k950Var = w5Var instanceof k950 ? (k950) w5Var : null;
        if (k950Var != null) {
            umv0 umv0Var = (umv0) y8bVar;
            ycu0 ycu0Var = k950Var.u;
            ycu0Var.d.setText(umv0Var.d);
            List list = u0d.f34849a;
            u0d.j(ycu0Var.c, umv0Var.f, R.drawable.ic_no_country, 0, null, null, null, 508);
            ycu0Var.e.setText(umv0Var.e);
            w5Var.f40887a.setOnClickListener(new bs50((Object) this, (Object) y8bVar, (byte) 20));
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Exception {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            throw new Exception("");
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_text_value_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTextValue);
        if (textView != null) {
            return new faq0(new bdu0((FrameLayout) viewInflate, textView, (byte) 4));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTextValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvValue);
        if (textView != null) {
            return new ymv0(new d5e0((FrameLayout) viewInflate, textView, (byte) 6));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvValue)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_corner_cell, viewGroup, false);
        viewInflate.getClass();
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.space_50)));
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_name_with_flag_cell, viewGroup, false);
        int i2 = R.id.ivCountry;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivCountry);
        if (roundCornerImageView != null) {
            i2 = R.id.position;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.position);
            if (textView != null) {
                i2 = R.id.tvName;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvName);
                if (textView2 != null) {
                    return new k950(new ycu0((ConstraintLayout) viewInflate, roundCornerImageView, textView, textView2, (byte) 0));
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
