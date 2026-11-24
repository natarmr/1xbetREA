package a;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class v1v0 extends hgd {
    public final /* synthetic */ byte e;
    public final /* synthetic */ by5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1v0(by5 by5Var, Context context, int i, byte b) {
        super(context, i);
        this.e = b;
        this.f = by5Var;
    }

    @Override // a.hgd, android.app.Dialog
    public final void onBackPressed() {
        byte b = this.e;
        by5 by5Var = this.f;
        switch (b) {
            case 0:
                w1v0 w1v0Var = (w1v0) by5Var;
                bzs0 bzs0Var = w1v0.j2;
                vcc.f0(i120.U(), w1v0Var, w1v0Var.S0());
                w1v0Var.z0(false, false, false);
                super.onBackPressed();
                break;
            default:
                a2v0 a2v0Var = (a2v0) by5Var;
                svs0 svs0Var = a2v0.g2;
                vcc.f0(i120.U(), a2v0Var, a2v0Var.S0().f3643a);
                a2v0Var.z0(false, false, false);
                super.onBackPressed();
                break;
        }
    }
}
