package a;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lza extends qv5 {
    public List f;

    @Override // a.zz3
    public final void A(List list) {
        list.getClass();
        cy2.w(new kza(this.f, list), false).b(new s88(this, (byte) 4));
        this.f = list;
    }

    @Override // a.zz3, a.yge0
    public final int d() {
        return this.f.size();
    }

    @Override // a.zz3, a.yge0
    public final int f(int i) {
        return this.d.d(i, this.f);
    }

    @Override // a.zz3, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        this.d.e(this.f, i, xhe0Var, iun.f15405a);
    }

    @Override // a.zz3, a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        list.getClass();
        if (list.isEmpty()) {
            n(xhe0Var, i);
        } else {
            this.d.e(this.f, i, xhe0Var, list);
        }
    }

    @Override // a.zz3, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return this.d.f(viewGroup, i);
    }

    @Override // a.zz3
    public final List z() {
        return this.f;
    }
}
