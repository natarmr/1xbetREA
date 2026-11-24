package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class jbk extends w46 {
    public final i1w0 b;
    public final ctf0 c;
    public final mpi0 d;
    public final duj e;
    public final p7m0 f;
    public final ol60 g;

    public jbk(i1w0 i1w0Var, ctf0 ctf0Var, mpi0 mpi0Var, duj dujVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = ctf0Var;
        this.d = mpi0Var;
        this.e = dujVar;
        this.f = q7m0.a(Boolean.FALSE);
        this.g = new ol60(1, i99.b);
    }

    public final void w() {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void x(pmz pmzVar) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.f;
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
        } while (!p7m0Var.m(value, Boolean.TRUE));
        sac.V(jiu0.a(this), new e3j(this, (byte) 14), new ucj(this, (byte) 12), null, new b1f((Object) this, (Object) pmzVar, (yje) null, (byte) 26), 12);
    }
}
