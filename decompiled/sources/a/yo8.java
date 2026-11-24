package a;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class yo8 extends sd3 {
    @Override // a.sd3, a.sik
    public Dialog C0(Bundle bundle) {
        return new wo8(D(), B0());
    }

    @Override // a.sik
    public void x0() {
        Dialog dialog = this.S1;
        if (dialog instanceof wo8) {
            wo8 wo8Var = (wo8) dialog;
            if (wo8Var.g == null) {
                wo8Var.g();
            }
            boolean z = wo8Var.g.J;
        }
        z0(false, false, false);
    }

    @Override // a.sik
    public final void y0() {
        Dialog dialog = this.S1;
        if (dialog instanceof wo8) {
            wo8 wo8Var = (wo8) dialog;
            if (wo8Var.g == null) {
                wo8Var.g();
            }
            boolean z = wo8Var.g.J;
        }
        super.y0();
    }
}
