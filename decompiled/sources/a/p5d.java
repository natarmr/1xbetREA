package a;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p5d extends q4 {
    public final k5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5d(Context context, List list, k5 k5Var) {
        super(context, list);
        context.getClass();
        list.getClass();
        this.f = k5Var;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return this.f.d(i);
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        w5 w5Var = (w5) xhe0Var;
        y8b y8bVar = (y8b) A(i);
        if (y8bVar != null) {
            this.f.k(w5Var, y8bVar);
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return this.f.n(viewGroup, i);
    }
}
