package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zh9 implements th9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44381a;
    public final String b;

    public zh9(String str, boolean z) {
        this.f44381a = z;
        this.b = str;
    }

    @Override // a.th9
    public final boolean a(drg0 drg0Var) {
        int i;
        boolean z = this.f44381a;
        String strN = this.b;
        if (z && strN == null) {
            strN = drg0Var.n();
        }
        brg0 brg0Var = drg0Var.b;
        if (brg0Var != null) {
            Iterator it = brg0Var.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                drg0 drg0Var2 = (drg0) ((frg0) it.next());
                if (strN == null || drg0Var2.n().equals(strN)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f44381a ? kng0.l("only-of-type <", this.b, Separators.GREATER_THAN) : "only-child";
    }
}
