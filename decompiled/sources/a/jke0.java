package a;

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
public final class jke0 extends k5 {
    public TableViewImpl l;

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarA = a(i, i2);
        return (y8bVarA instanceof bke0 ? (bke0) y8bVarA : null) instanceof ake0 ? 2 : 1;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if ((w5Var instanceof k4q0) && (y8bVar instanceof ake0)) {
            ((k4q0) w5Var).u.c.setText(((ake0) y8bVar).d);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof bke0) {
            v5d v5dVar = w5Var instanceof v5d ? (v5d) w5Var : null;
            if (v5dVar != null) {
                bke0 bke0Var = (bke0) y8bVar;
                adu0 adu0Var = v5dVar.u;
                AppCompatImageView appCompatImageView = adu0Var.c;
                TextView textView = adu0Var.d;
                if (bke0Var instanceof xje0) {
                    textView.setVisibility(0);
                    appCompatImageView.setVisibility(8);
                    textView.setText(((xje0) bke0Var).d);
                } else if (bke0Var instanceof yje0) {
                    textView.setVisibility(8);
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setImageResource(((yje0) bke0Var).d);
                } else {
                    if ((bke0Var instanceof zje0) || (bke0Var instanceof ake0)) {
                        return;
                    }
                    t9f.b();
                }
            }
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof zje0) {
            nip0 nip0Var = w5Var instanceof nip0 ? (nip0) w5Var : null;
            if (nip0Var != null) {
                zje0 zje0Var = (zje0) y8bVar;
                vd7 vd7Var = nip0Var.u;
                ((TextView) vd7Var.d).setText(zje0Var.d);
                List list = u0d.f34849a;
                u0d.j((RoundCornerImageView) vd7Var.c, zje0Var.e, R.drawable.ic_no_country, 0, null, null, null, 508);
            }
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) throws Exception {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            throw new Exception("");
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_referee_teams_text_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTextValue);
        if (textView != null) {
            return new k4q0(new d5e0((FrameLayout) viewInflate, textView, (byte) 26));
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTextValue)));
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_referee_teams_column_header, viewGroup, false);
        int i2 = R.id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.ivIcon);
        if (appCompatImageView != null) {
            i2 = R.id.tvTitle;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTitle);
            if (textView != null) {
                return new v5d(new adu0((FrameLayout) viewInflate, appCompatImageView, textView, (byte) 0));
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_referee_teams_corner_cell, viewGroup, false);
        viewInflate.getClass();
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(0, vqd.d(viewGroup, R.dimen.size_50)));
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_referee_teams_team_row_header, viewGroup, false);
        int i2 = R.id.ivTeam;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.ivTeam);
        if (roundCornerImageView != null) {
            i2 = R.id.tvTeamTitle;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTeamTitle);
            if (textView != null) {
                return new nip0(new vd7((ConstraintLayout) viewInflate, roundCornerImageView, textView, (byte) 26));
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
