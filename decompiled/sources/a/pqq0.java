package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableImageView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class pqq0 extends k5 {
    public nmo0 l;

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        if (y8bVarA == null) {
            return 4;
        }
        if (y8bVarA instanceof h4q0) {
            return 0;
        }
        if (y8bVarA instanceof r5d) {
            return 1;
        }
        if (y8bVarA instanceof q5d) {
            return 2;
        }
        return y8bVarA instanceof tjb ? 3 : 4;
    }

    @Override // a.k5
    public final int d(int i) {
        y8b y8bVarC = c(i);
        if (y8bVarC == null) {
            return 7;
        }
        if (y8bVarC instanceof r5d) {
            return 5;
        }
        return y8bVarC instanceof q5d ? 6 : 7;
    }

    @Override // a.k5
    public final int f(int i) {
        y8b y8bVarE = e(i);
        if (y8bVarE == null) {
            return 4;
        }
        if (y8bVarE instanceof phg0) {
            return 9;
        }
        return y8bVarE instanceof nhg0 ? 8 : 4;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if (w5Var instanceof j4q0) {
            TextView textView = ((j4q0) w5Var).u.c;
            textView.setText(((h4q0) y8bVar).d);
            aem0.r(textView, textView.getResources().getDimensionPixelSize(R.dimen.text_10), textView.getResources().getDimensionPixelSize(R.dimen.text_12), textView.getResources().getDimensionPixelSize(R.dimen.text_1), 0);
            return;
        }
        if (w5Var instanceof u5d) {
            ((u5d) w5Var).v((s5d) y8bVar);
            return;
        }
        if (w5Var instanceof ujb) {
            tjb tjbVar = (tjb) y8bVar;
            String str = tjbVar.j;
            uk5 uk5Var = ((ujb) w5Var).u;
            TextView textView2 = (TextView) uk5Var.d;
            vd7 vd7Var = (vd7) uk5Var.g;
            vd7 vd7Var2 = (vd7) uk5Var.f;
            aem0.r(textView2, textView2.getResources().getDimensionPixelSize(R.dimen.text_10), textView2.getResources().getDimensionPixelSize(R.dimen.text_12), textView2.getResources().getDimensionPixelSize(R.dimen.text_1), 0);
            String str2 = tjbVar.i;
            String str3 = tjbVar.h;
            textView2.setText(str);
            textView2.setVisibility(str.length() > 0 ? 0 : 8);
            TextView textView3 = (TextView) uk5Var.c;
            textView3.setText(str3);
            textView3.setVisibility(str3.length() > 0 ? 0 : 8);
            TextView textView4 = (TextView) uk5Var.e;
            textView4.setText(str2);
            textView4.setVisibility(str2.length() > 0 ? 0 : 8);
            LoadableShapeableImageView.i((DsTeamLogo) vd7Var2.c, tjbVar.d, null, 14);
            TextView textView5 = (TextView) vd7Var2.d;
            textView5.setText(tjbVar.f);
            aem0.r(textView5, textView5.getResources().getDimensionPixelSize(R.dimen.text_10), textView5.getResources().getDimensionPixelSize(R.dimen.text_12), textView5.getResources().getDimensionPixelSize(R.dimen.text_1), 0);
            LoadableShapeableImageView.i((DsTeamLogo) vd7Var.c, tjbVar.e, null, 14);
            TextView textView6 = (TextView) vd7Var.d;
            textView6.setText(tjbVar.g);
            aem0.r(textView6, textView6.getResources().getDimensionPixelSize(R.dimen.text_10), textView6.getResources().getDimensionPixelSize(R.dimen.text_12), textView6.getResources().getDimensionPixelSize(R.dimen.text_1), 0);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        u5d u5dVar = w5Var instanceof u5d ? (u5d) w5Var : null;
        if (u5dVar != null) {
            u5dVar.v((s5d) y8bVar);
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if (w5Var instanceof ohg0) {
            List list = u0d.f34849a;
            u0d.k((LoadableImageView) ((ohg0) w5Var).u.c, ((nhg0) y8bVar).d);
        } else if (w5Var instanceof qhg0) {
            ((qhg0) w5Var).u.c.setText(((phg0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Throwable {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_text_cell, viewGroup, false);
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvContent);
            if (textView != null) {
                return new j4q0(new bdu0((FrameLayout) viewInflate, textView, (byte) 3));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvContent)));
            return null;
        }
        if (i == 1 || i == 2) {
            return new u5d(d5e0.d(layoutInflaterFrom, viewGroup));
        }
        if (i != 3) {
            throw new Throwable(ua80.e(i, "ViewHolder for ", " wasn't found"));
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_championship_cell_content, viewGroup, false);
        int i2 = R.id.firstTeam;
        View viewF = yum0.f(viewInflate2, R.id.firstTeam);
        if (viewF != null) {
            vd7 vd7VarB = vd7.b(viewF);
            i2 = R.id.secondTeam;
            View viewF2 = yum0.f(viewInflate2, R.id.secondTeam);
            if (viewF2 != null) {
                vd7 vd7VarB2 = vd7.b(viewF2);
                i2 = R.id.tvDate;
                TextView textView2 = (TextView) yum0.f(viewInflate2, R.id.tvDate);
                if (textView2 != null) {
                    i2 = R.id.tvPeriod;
                    TextView textView3 = (TextView) yum0.f(viewInflate2, R.id.tvPeriod);
                    if (textView3 != null) {
                        i2 = R.id.tvTime;
                        TextView textView4 = (TextView) yum0.f(viewInflate2, R.id.tvTime);
                        if (textView4 != null) {
                            return new ujb(new uk5((ConstraintLayout) viewInflate2, vd7VarB, vd7VarB2, textView2, textView3, textView4));
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) throws Throwable {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 5 || i == 6) {
            return new u5d(d5e0.d(layoutInflaterFrom, viewGroup));
        }
        throw new Throwable(ua80.e(i, "ViewHolder for ", " wasn't found"));
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(vqd.d(viewGroup, R.dimen.space_36), 0));
        return frameLayout;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) throws Throwable {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 8) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_row_header_cell_icon, viewGroup, false);
            LoadableImageView loadableImageView = (LoadableImageView) yum0.f(viewInflate, R.id.ivSport);
            if (loadableImageView != null) {
                return new ohg0(new nq8((FrameLayout) viewInflate, loadableImageView, (byte) 18));
            }
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.ivSport)));
            return null;
        }
        if (i != 9) {
            throw new Throwable(ua80.e(i, "ViewHolder for ", " wasn't found"));
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_row_header_cell_number, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate2, R.id.tvNumber);
        if (textView != null) {
            return new qhg0(new bdu0((FrameLayout) viewInflate2, textView, (byte) 1));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.tvNumber)));
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
