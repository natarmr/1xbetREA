package a;

import android.content.Context;
import android.util.TypedValue;
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
public final class iu90 extends k5 {
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
            return 11;
        }
        return y8bVarE instanceof eva ? 12 : 5;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if (w5Var instanceof qun) {
            w8b w8bVar = y8bVar instanceof w8b ? (w8b) y8bVar : null;
            if (w8bVar != null) {
                ((qun) w5Var).u.c.setText(w8bVar.f38714a.f12665a);
                return;
            }
            return;
        }
        if (w5Var instanceof pun) {
            bva bvaVar = y8bVar instanceof bva ? (bva) y8bVar : null;
            if (bvaVar != null) {
                jk30 jk30Var = ((pun) w5Var).u;
                jk30Var.d.setText(bvaVar.d);
                List list = u0d.f34849a;
                u0d.n(jk30Var.c, bvaVar.e, 0, 11);
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
        fva fvaVar = y8bVar instanceof fva ? (fva) y8bVar : null;
        if (fvaVar != null) {
            ogr0 ogr0Var = w5Var instanceof ogr0 ? (ogr0) w5Var : null;
            if (ogr0Var != null) {
                ogr0Var.v(fvaVar);
            }
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1 || i == 2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_empty_pinned_value, viewGroup, false);
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvData);
            if (textView != null) {
                return new qun(new d5e0((FrameLayout) viewInflate, textView, (byte) 10));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvData)));
            return null;
        }
        if (i != 3) {
            if (i != 4) {
                return i != 10 ? new sun(auh.a(layoutInflaterFrom, viewGroup).b) : new ttq(d5e0.e(layoutInflaterFrom, viewGroup));
            }
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_footer_empty_cell, viewGroup, false);
            if (viewInflate2 != null) {
                return new itq((FrameLayout) viewInflate2);
            }
            hny.u("rootView");
            return null;
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.vh_pinned_team_cell, viewGroup, false);
        int i2 = R.id.ivTeamLogo;
        ImageView imageView = (ImageView) yum0.f(viewInflate3, R.id.ivTeamLogo);
        if (imageView != null) {
            i2 = R.id.tvTeamTitle;
            TextView textView2 = (TextView) yum0.f(viewInflate3, R.id.tvTeamTitle);
            if (textView2 != null) {
                return new pun(new jk30((LinearLayout) viewInflate3, imageView, textView2, (byte) 3));
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) throws Throwable {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 6) {
            return new mrq0(bdu0.a(layoutInflaterFrom, viewGroup));
        }
        if (i == 7) {
            return new aww(nq8.b(layoutInflaterFrom, viewGroup));
        }
        throw new Throwable("Unknown column type");
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        return frameLayout;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i == 11 ? new ogr0(bdu0.b(layoutInflaterFrom, viewGroup)) : new sun(auh.a(layoutInflaterFrom, viewGroup).b);
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
