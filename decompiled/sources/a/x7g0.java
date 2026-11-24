package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class x7g0 extends k5 {
    public TableViewImpl l;
    public final dvd0 m;

    public x7g0(TableViewImpl tableViewImpl, dvd0 dvd0Var) {
        super(tableViewImpl, false, R.dimen.text_12);
        this.l = tableViewImpl;
        this.m = dvd0Var;
    }

    @Override // a.k5
    public final int b(int i, int i2) {
        return a(i, i2) instanceof p6g0 ? 1 : 0;
    }

    @Override // a.k5
    public final int d(int i) {
        return c(i) instanceof o6g0 ? 3 : 2;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        int iA;
        if ((w5Var instanceof z7g0) && (y8bVar instanceof p6g0)) {
            p6g0 p6g0Var = (p6g0) y8bVar;
            bdu0 bdu0Var = ((z7g0) w5Var).u;
            TextView textView = bdu0Var.c;
            textView.setText(p6g0Var.d);
            int i = p6g0Var.e;
            if (i != 0) {
                iA = textView.getContext().getColor(i);
            } else {
                TypedValue typedValue = j5d.f15927a;
                Context context = textView.getContext();
                context.getClass();
                iA = j5d.a(context, R.attr.uikitSecondary, false);
            }
            textView.setTextColor(iA);
            FrameLayout frameLayout = bdu0Var.b;
            t2m0 t2m0Var = p6g0Var.f;
            Context context2 = frameLayout.getContext();
            context2.getClass();
            frameLayout.setBackgroundColor(n2x.K(t2m0Var, context2));
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof t6g0) && (y8bVar instanceof o6g0)) {
            List list = u0d.f34849a;
            u0d.m((RoundCornerImageView) ((t6g0) w5Var).u.c, qzw.f29598a, ((o6g0) y8bVar).d, R.drawable.ic_profile);
        } else if ((w5Var instanceof u6g0) && (y8bVar instanceof r6g0)) {
            ((u6g0) w5Var).u.c.setText(((r6g0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof s7g0) && (y8bVar instanceof q6g0)) {
            s7g0 s7g0Var = (s7g0) w5Var;
            q6g0 q6g0Var = (q6g0) y8bVar;
            String str = q6g0Var.f;
            jk3 jk3Var = s7g0Var.u;
            TextView textView = (TextView) jk3Var.e;
            ConstraintLayout constraintLayout = (ConstraintLayout) jk3Var.b;
            String str2 = q6g0Var.d;
            boolean z = q6g0Var.g;
            textView.setText(str2);
            ((TextView) jk3Var.f).setText(q6g0Var.e);
            if (str.length() > 0) {
                List list = u0d.f34849a;
                u0d.m((RoundCornerImageView) jk3Var.d, qzw.f29598a, str, R.drawable.ic_profile);
            }
            ((ImageView) jk3Var.c).setVisibility(z ? 0 : 8);
            if (z) {
                constraintLayout.getClass();
                dyb.c0(constraintLayout, new dff0(s7g0Var, q6g0Var, (byte) 14));
            } else {
                constraintLayout.setOnClickListener(null);
            }
            t2m0 t2m0Var = q6g0Var.i;
            Context context = constraintLayout.getContext();
            context.getClass();
            constraintLayout.setBackgroundColor(n2x.K(t2m0Var, context));
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            jf4.o(twn.m(i, "Unknown cell view type: "));
            return null;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_results_grid_text_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvValue);
        if (textView != null) {
            return new z7g0(new bdu0((FrameLayout) viewInflate, textView, (byte) 0));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 3) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_results_grid_column_image_header, viewGroup, false);
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivLogo);
            if (roundCornerImageView != null) {
                return new t6g0(new nq8((FrameLayout) viewInflate, roundCornerImageView, (byte) 17));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.ivLogo)));
            return null;
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_results_grid_column_text_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate2, R.id.tvTitle);
        if (textView != null) {
            return new u6g0(new d5e0((FrameLayout) viewInflate2, textView, (byte) 29));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.tvTitle)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_results_grid_corner_cell, viewGroup, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.size_50)));
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_results_grid_row_header, viewGroup, false);
        int i2 = R.id.arrow;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.arrow);
        if (imageView != null) {
            i2 = R.id.image;
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.image);
            if (roundCornerImageView != null) {
                i2 = R.id.position;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.position);
                if (textView != null) {
                    i2 = R.id.title;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.title);
                    if (textView2 != null) {
                        return new s7g0(new jk3((ConstraintLayout) viewInflate, imageView, roundCornerImageView, textView, textView2, (byte) 15), this.m);
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
