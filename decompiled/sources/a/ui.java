package a;

import android.content.Context;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ui extends yz30 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ xi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(xi xiVar, Context context, fzm0 fzm0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, fzm0Var, context, view, false);
        this.n = xiVar;
        if ((fzm0Var.A.x & 32) != 32) {
            View view2 = xiVar.i;
            this.f = view2 == null ? (View) xiVar.h : view2;
        }
        do20 do20Var = xiVar.w;
        this.i = do20Var;
        wz30 wz30Var = this.j;
        if (wz30Var != null) {
            wz30Var.d(do20Var);
        }
    }

    @Override // a.yz30
    public final void c() {
        byte b = this.m;
        xi xiVar = this.n;
        switch (b) {
            case 0:
                xiVar.t = null;
                super.c();
                break;
            default:
                ox30 ox30Var = xiVar.c;
                if (ox30Var != null) {
                    ox30Var.c(true);
                }
                xiVar.s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(xi xiVar, Context context, ox30 ox30Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, ox30Var, context, view, true);
        this.n = xiVar;
        this.g = 8388613;
        do20 do20Var = xiVar.w;
        this.i = do20Var;
        wz30 wz30Var = this.j;
        if (wz30Var != null) {
            wz30Var.d(do20Var);
        }
    }
}
