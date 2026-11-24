package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w3k extends w46 {
    public final List b;

    public w3k(vzg0 vzg0Var, List list) {
        vzg0Var.getClass();
        list.getClass();
        this.b = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((eiu0) it.next()).u(this, vzg0Var);
        }
    }

    @Override // a.diu0
    public void v() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eiu0) it.next()).t();
        }
    }
}
