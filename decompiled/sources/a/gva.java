package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class gva extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        if (y8bVarA == null) {
            return 5;
        }
        if (y8bVarA instanceof dva) {
            return 1;
        }
        if (y8bVarA instanceof cva) {
            return 2;
        }
        if (y8bVarA instanceof bva) {
            return 3;
        }
        if (y8bVarA instanceof zua) {
            return 4;
        }
        return y8bVarA instanceof ava ? 10 : 5;
    }

    @Override // a.k5
    public final int d(int i) {
        y8b y8bVarC = c(i);
        if (y8bVarC == null) {
            return 5;
        }
        if (y8bVarC instanceof xua) {
            return 7;
        }
        return y8bVarC instanceof yua ? 6 : 5;
    }

    @Override // a.k5
    public final int f(int i) {
        y8b y8bVarE = e(i);
        if (y8bVarE == null) {
            return 5;
        }
        if (y8bVarE instanceof fva) {
            return 9;
        }
        return y8bVarE instanceof eva ? 8 : 5;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if (w5Var instanceof vzr0) {
            cva cvaVar = y8bVar instanceof cva ? (cva) y8bVar : null;
            if (cvaVar != null) {
                ((vzr0) w5Var).u.c.setText(cvaVar.d);
                return;
            }
            return;
        }
        if (w5Var instanceof c5p0) {
            bva bvaVar = y8bVar instanceof bva ? (bva) y8bVar : null;
            if (bvaVar != null) {
                jk30 jk30Var = ((c5p0) w5Var).u;
                jk30Var.d.setText(bvaVar.d);
                List list = u0d.f34849a;
                u0d.n(jk30Var.c, bvaVar.e, 0, 11);
                return;
            }
            return;
        }
        if (w5Var instanceof i2u0) {
            dva dvaVar = y8bVar instanceof dva ? (dva) y8bVar : null;
            if (dvaVar != null) {
                ((i2u0) w5Var).u.c.setText(dvaVar.d);
                return;
            }
            return;
        }
        if (w5Var instanceof ttq) {
            ava avaVar = y8bVar instanceof ava ? (ava) y8bVar : null;
            if (avaVar != null) {
                ((ttq) w5Var).v(avaVar);
                return;
            }
            return;
        }
        if (w5Var instanceof itq) {
            TypedValue typedValue = j5d.f15927a;
            Context context = w5Var.f40887a.getContext();
            context.getClass();
            w5Var.u(j5d.a(context, R.attr.uikitBackgroundLight60, false));
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (w5Var instanceof aww) {
            xua xuaVar = y8bVar instanceof xua ? (xua) y8bVar : null;
            if (xuaVar != null) {
                ((ImageView) ((aww) w5Var).u.c).setImageResource(xuaVar.d);
                return;
            }
            return;
        }
        if (w5Var instanceof mrq0) {
            yua yuaVar = y8bVar instanceof yua ? (yua) y8bVar : null;
            if (yuaVar != null) {
                ((mrq0) w5Var).u.c.setText(yuaVar.d);
            }
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if (w5Var instanceof zih0) {
            eva evaVar = y8bVar instanceof eva ? (eva) y8bVar : null;
            if (evaVar != null) {
                ((zih0) w5Var).u.c.setText(evaVar.d);
                return;
            }
            return;
        }
        if (w5Var instanceof ogr0) {
            fva fvaVar = y8bVar instanceof fva ? (fva) y8bVar : null;
            if (fvaVar != null) {
                ((ogr0) w5Var).v(fvaVar);
            }
        }
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        mrq0 mrq0Var = new mrq0(bdu0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, vqd.d(viewGroup, R.dimen.size_50));
        View view = mrq0Var.f40887a;
        view.setLayoutParams(layoutParams);
        TextView textView = mrq0Var.u.c;
        vih0 vih0Var = y8bVar instanceof vih0 ? (vih0) y8bVar : null;
        textView.setText(vih0Var != null ? vih0Var.d : "");
        return view;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
