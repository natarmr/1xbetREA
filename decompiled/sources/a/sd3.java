package a;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class sd3 extends sik {
    @Override // a.sik
    public Dialog C0(Bundle bundle) {
        return new rd3(D(), B0());
    }

    @Override // a.sik
    public final void G0(Dialog dialog, int i) {
        if (!(dialog instanceof rd3)) {
            super.G0(dialog, i);
            return;
        }
        rd3 rd3Var = (rd3) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rd3Var.e().y(1);
    }
}
