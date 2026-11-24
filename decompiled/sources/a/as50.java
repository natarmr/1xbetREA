package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class as50 extends q4 {
    public final ba30 f;

    public as50(ba30 ba30Var) {
        super(new pn20((byte) 5));
        this.f = ba30Var;
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        v46 v46Var = (v46) xhe0Var;
        ct5 ct5Var = (ct5) A(i);
        View view = v46Var.f40887a;
        view.getClass();
        dyb.c0(view, new jl40((Object) this, (Object) ct5Var, (Object) v46Var, (byte) 7));
        ct5Var.getClass();
        v46Var.t(ct5Var);
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_catalog_banner, viewGroup, false);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams((int) (((double) viewGroup.getMeasuredWidth()) * 0.9d), -1));
        return new cs50(viewInflate, this.f);
    }
}
