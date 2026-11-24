package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1w0 f18087a;
    public final mi70 b;
    public final zn00 c;

    public kd4(i1w0 i1w0Var, svs0 svs0Var, mi70 mi70Var, zn00 zn00Var, kwd kwdVar) {
        this.f18087a = i1w0Var;
        this.b = mi70Var;
        this.c = zn00Var;
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        c8d c8dVar = new c8d(y7d.f42146a, m0w0.f20976a);
        i1w0 i1w0Var = this.f18087a;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, c8dVar, i1w0Var, copyOnWriteArrayList, 0);
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
