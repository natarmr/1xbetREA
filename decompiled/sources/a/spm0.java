package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class spm0 extends k5 {
    public final /* synthetic */ byte l;
    public nmo0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spm0(nmo0 nmo0Var, boolean z, int i, byte b) {
        super(nmo0Var, z, i);
        this.l = b;
    }

    @Override // a.k5
    public final nmo0 g() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        switch (this.l) {
            case 0:
                break;
            default:
                lpq0 lpq0Var = w5Var instanceof lpq0 ? (lpq0) w5Var : null;
                if (lpq0Var != null) {
                    String str = ((qur0) y8bVar).d;
                    str.getClass();
                    lpq0Var.u.c.setText(str);
                }
                break;
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        switch (this.l) {
            case 0:
                yzr0 yzr0Var = w5Var instanceof yzr0 ? (yzr0) w5Var : null;
                if (yzr0Var != null) {
                    d5e0 d5e0Var = yzr0Var.u;
                    d5e0Var.c.setText(((xzr0) y8bVar).d);
                    d5e0Var.b.getLayoutParams().width = -2;
                }
                break;
            default:
                lpq0 lpq0Var = w5Var instanceof lpq0 ? (lpq0) w5Var : null;
                if (lpq0Var != null) {
                    String str = ((qur0) y8bVar).d;
                    str.getClass();
                    lpq0Var.u.c.setText(str);
                }
                break;
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        switch (this.l) {
            case 0:
                break;
            default:
                lpq0 lpq0Var = w5Var instanceof lpq0 ? (lpq0) w5Var : null;
                if (lpq0Var != null) {
                    String str = ((qur0) y8bVar).d;
                    str.getClass();
                    lpq0Var.u.c.setText(str);
                }
                break;
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        switch (this.l) {
            case 0:
                uzr0 uzr0Var = new uzr0(iab.c(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                uzr0Var.f40887a.setVisibility(8);
                return uzr0Var;
            default:
                return new lpq0(d5e0.b(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        switch (this.l) {
            case 0:
                return new yzr0(d5e0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            default:
                return new lpq0(d5e0.b(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        byte b = this.l;
        y8bVar.getClass();
        switch (b) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tournament_table_title_cell, viewGroup, false);
                viewInflate.getClass();
                return viewInflate;
            default:
                lpq0 lpq0Var = new lpq0(d5e0.b(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, vqd.d(viewGroup, R.dimen.space_44));
                View view = lpq0Var.f40887a;
                view.setLayoutParams(layoutParams);
                String string = viewGroup.getContext().getResources().getString(R.string.lattice_sign);
                string.getClass();
                lpq0Var.u.c.setText(string);
                return view;
        }
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        switch (this.l) {
            case 0:
                m5s0 m5s0Var = new m5s0(dc3.f(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                m5s0Var.f40887a.setVisibility(8);
                return m5s0Var;
            default:
                return new lpq0(d5e0.b(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        switch (this.l) {
            case 0:
                this.m = tableViewImpl;
                break;
            default:
                this.m = tableViewImpl;
                break;
        }
    }

    private final void s(w5 w5Var, y8b y8bVar) {
    }

    private final void t(w5 w5Var, y8b y8bVar) {
    }
}
