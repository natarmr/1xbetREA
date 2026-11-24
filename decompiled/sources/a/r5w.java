package a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class r5w extends gl80 {
    public final dp h;
    public final ens i;

    public r5w(ens ensVar) {
        ek5 ek5Var = ek5.c;
        dp dpVar = new dp();
        super(ek5Var);
        this.h = dpVar;
        this.i = ensVar;
    }

    @Override // a.yge0
    public final int f(int i) {
        try {
            return this.h.d(i, C().d);
        } catch (Exception e) {
            this.i.invoke(e, C().d);
            return 2147483646;
        }
    }

    @Override // a.yge0
    public final void m(RecyclerView recyclerView) {
        recyclerView.setItemAnimator(null);
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        o(xhe0Var, i, new ArrayList());
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        list.getClass();
        if (xhe0Var.f40887a.getId() != R.id.view_fallback) {
            A(i);
            this.h.e(C().d, i, xhe0Var, list);
        }
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return this.h.f(viewGroup, i);
    }

    @Override // a.yge0
    public final boolean r(xhe0 xhe0Var) {
        return this.h.g(xhe0Var);
    }

    @Override // a.yge0
    public final void s(xhe0 xhe0Var) {
        this.h.h(xhe0Var);
    }

    @Override // a.yge0
    public final void t(xhe0 xhe0Var) {
        this.h.i(xhe0Var);
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        xhe0Var.getClass();
        this.h.j(xhe0Var);
    }
}
