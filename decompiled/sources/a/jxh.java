package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class jxh extends k5 {
    public TableViewImpl l;
    public final olh m;

    public jxh(TableViewImpl tableViewImpl, olh olhVar) {
        super(tableViewImpl, true, R.dimen.text_12);
        this.l = tableViewImpl;
        this.m = olhVar;
    }

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        xwh xwhVar = y8bVarA instanceof xwh ? (xwh) y8bVarA : null;
        if (xwhVar == null) {
            return 1;
        }
        if (xwhVar instanceof wwh) {
            return 2;
        }
        if ((xwhVar instanceof vwh) || (xwhVar instanceof uwh)) {
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
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof uwh) {
            ywh ywhVar = w5Var instanceof ywh ? (ywh) w5Var : null;
            if (ywhVar != null) {
                TextView textView = ywhVar.u.c;
                textView.setText(((uwh) y8bVar).d);
                textView.setGravity(16);
            }
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        l950 l950Var = w5Var instanceof l950 ? (l950) w5Var : null;
        if (l950Var != null) {
            vwh vwhVar = (vwh) y8bVar;
            jk3 jk3Var = l950Var.u;
            ((TextView) jk3Var.e).setText(vwhVar.d.toString());
            List list = u0d.f34849a;
            u0d.j((RoundCornerImageView) jk3Var.d, vwhVar.f, R.drawable.ic_no_country, 0, null, null, null, 508);
            ((TextView) jk3Var.f).setText(vwhVar.e);
            int i = vwhVar.h;
            AppCompatImageView appCompatImageView = (AppCompatImageView) jk3Var.c;
            if (i != 0) {
                Context context = ((ConstraintLayout) jk3Var.b).getContext();
                context.getClass();
                appCompatImageView.setImageDrawable(context.getDrawable(i));
            } else {
                appCompatImageView.setImageDrawable(null);
            }
            w5Var.f40887a.setOnClickListener(new wg(this, y8bVar, (byte) 13));
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Exception {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            throw new Exception("");
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_cycling_text_value_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTextValue);
        if (textView != null) {
            return new gaq0(new d5e0((FrameLayout) viewInflate, textView, (byte) 9));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTextValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_cycling_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvSeason);
        if (textView != null) {
            return new ywh(new d5e0((FrameLayout) viewInflate, textView, (byte) 8));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvSeason)));
        return null;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_cycling_name_with_flag_cell, viewGroup, false);
        int i2 = R.id.imageTshirt;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.imageTshirt);
        if (appCompatImageView != null) {
            i2 = R.id.ivCountry;
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivCountry);
            if (roundCornerImageView != null) {
                i2 = R.id.position;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.position);
                if (textView != null) {
                    i2 = R.id.tvName;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvName);
                    if (textView2 != null) {
                        return new l950(new jk3((ConstraintLayout) viewInflate, appCompatImageView, roundCornerImageView, textView, textView2, (byte) 14));
                    }
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
