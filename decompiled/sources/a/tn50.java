package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tn50 extends q4 {
    public final p0z f;
    public final b530 g;

    public tn50(p0z p0zVar, b530 b530Var) {
        super(new pn20((byte) 4));
        this.f = p0zVar;
        this.g = b530Var;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return ((qn50) A(i)).a();
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        Object objA = A(i);
        objA.getClass();
        ((v46) xhe0Var).t(objA);
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        View viewInflate = viewGroup;
        if (i != 0) {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        }
        p0z p0zVar = this.f;
        if (i == R.layout.item_catalog_top_layout) {
            viewInflate.getClass();
            return new v70(viewInflate, p0zVar);
        }
        if (i == R.layout.item_catalog_other_layout) {
            viewInflate.getClass();
            return new zr50(viewInflate, p0zVar, this.g);
        }
        viewInflate.getClass();
        return new gw3(viewInflate);
    }
}
