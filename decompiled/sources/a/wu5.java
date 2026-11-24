package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wu5 extends w46 {
    public final i1w0 b;
    public final vzg0 c;
    public final xae0 d;
    public final p7m0 e;

    public wu5(i1w0 i1w0Var, vzg0 vzg0Var, c8c c8cVar) {
        c8cVar.getClass();
        this.b = i1w0Var;
        this.c = vzg0Var;
        this.d = vzg0Var.c(Boolean.FALSE, "KEY_CAMERA_PERMISSION_REQUESTED");
        this.e = q7m0.a(nu5.f24133a);
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

    public final void x() {
        if (((Boolean) this.d.f40549a.getValue()).booleanValue()) {
            p7m0 p7m0Var = this.e;
            p7m0Var.getClass();
            p7m0Var.o(null, ou5.f25860a);
        }
    }
}
