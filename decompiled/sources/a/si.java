package a;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class si extends lwq {
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // a.lwq
    public final tsj0 b() {
        ui uiVar;
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 0:
                ti tiVar = ((ActionMenuItemView) view).n;
                if (tiVar == null || (uiVar = ((vi) tiVar).f37452a.t) == null) {
                    return null;
                }
                return uiVar.a();
            default:
                ui uiVar2 = ((wi) view).d.s;
                if (uiVar2 == null) {
                    return null;
                }
                return uiVar2.a();
        }
    }

    @Override // a.lwq
    public final boolean c() {
        tsj0 tsj0VarB;
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                nx30 nx30Var = actionMenuItemView.l;
                return nx30Var != null && nx30Var.a(actionMenuItemView.i) && (tsj0VarB = b()) != null && tsj0VarB.f();
            default:
                ((wi) view).d.l();
                return true;
        }
    }

    @Override // a.lwq
    public boolean d() {
        switch (this.j) {
            case 1:
                xi xiVar = ((wi) this.k).d;
                if (xiVar.u != null) {
                    return false;
                }
                xiVar.j();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(wi wiVar, wi wiVar2) {
        super(wiVar2);
        this.k = wiVar;
    }
}
