package a;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rhg0 extends q4 {
    public final k5 f;
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhg0(Context context, List list, k5 k5Var, boolean z) {
        super(context, list);
        list.getClass();
        this.f = k5Var;
        this.g = z;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return this.f.f(i);
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        w5 w5Var = (w5) xhe0Var;
        y8b y8bVar = (y8b) A(i);
        if (y8bVar != null) {
            if (this.g) {
                q4.z(i, w5Var);
            }
            this.f.l(w5Var, y8bVar);
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return this.f.p(viewGroup, i);
    }
}
