package a;

import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z220 f13508a;
    public final hdo0 b;

    public hr00(z220 z220Var, hdo0 hdo0Var) {
        this.f13508a = z220Var;
        this.b = hdo0Var;
    }

    public final ejc a(cb50 cb50Var, boolean z) {
        cb50Var.getClass();
        String str = cb50Var.f4046a;
        hdo0 hdo0Var = this.b;
        ConcurrentHashMap concurrentHashMap = hdo0Var.b;
        ejc ejcVar = (ejc) concurrentHashMap.get(str);
        if (ejcVar != null) {
            return ejcVar;
        }
        o1w0 o1w0Var = hdo0Var.f12879a;
        o1w0Var.getClass();
        i1w0 i1w0Var = new i1w0();
        o1w0Var.a(i1w0Var);
        ejc ejcVar2 = new ejc(i1w0Var);
        concurrentHashMap.put(str, ejcVar2);
        if (z) {
            i1w0 i1w0Var2 = ejcVar2.f7902a;
            k0w0 k0w0Var = new k0w0(i1w0Var2);
            k0w0Var.b(new y0w0(this.f13508a.g(cb50Var)));
            ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var2.a((oe50) pawVar.next());
            }
        }
        return ejcVar2;
    }
}
