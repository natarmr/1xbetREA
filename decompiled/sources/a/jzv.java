package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jzv extends w3k {
    public final r2w c;
    public final z4w d;
    public final q5w e;

    public jzv(vzg0 vzg0Var, r2w r2wVar, z4w z4wVar, q5w q5wVar) {
        super(vzg0Var, q3d.j(r2wVar, z4wVar, q5wVar));
        this.c = r2wVar;
        this.d = z4wVar;
        this.e = q5wVar;
    }

    public final void w() {
        i1w0 i1w0Var = this.e.v;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
