package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cgt extends i3t0 {
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        sft sftVar = (sft) obj;
        sftVar.getClass();
        if (!(sftVar instanceof rft)) {
            if (sftVar.equals(qft.f28653a)) {
                E();
                return;
            }
            return;
        }
        ok90 ok90Var = ((rft) sftVar).f30404a;
        byte b = ok90Var.f25397a;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, new agt(b)));
        G(new zft(new nk90(b, ok90Var.b)));
    }
}
