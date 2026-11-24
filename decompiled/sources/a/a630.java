package a;

import android.app.Dialog;

/* JADX INFO: loaded from: classes5.dex */
public final class a630 extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f299a;
    public final /* synthetic */ by5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a630(by5 by5Var, kxq kxqVar, int i, byte b) {
        super(kxqVar, i);
        this.f299a = b;
        this.b = by5Var;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        byte b = this.f299a;
        by5 by5Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = b630.m2;
                ((b630) by5Var).T0().w();
                break;
            case 1:
                evz evzVar = i630.k2;
                ((i630) by5Var).T0().w();
                break;
            default:
                iiy[] iiyVarArr = wgk0.d2;
                ((wgk0) by5Var).S0();
                break;
        }
    }
}
