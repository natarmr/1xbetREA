package a;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class r860 extends q860 {
    @Override // a.q860, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
