package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yjt implements yjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdr f42756a;

    public yjt(xdr xdrVar) {
        this.f42756a = xdrVar;
    }

    @Override // a.yjj0
    public final x1x a(long j, k6z k6zVar, w6k w6kVar) {
        w03 w03VarA = z03.a();
        this.f42756a.F(w03VarA, new h7k0(j), k6zVar);
        w03VarA.c();
        return new ne80(w03VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        yjt yjtVar = obj instanceof yjt ? (yjt) obj : null;
        return (yjtVar != null ? yjtVar.f42756a : null) == this.f42756a;
    }

    public final int hashCode() {
        return this.f42756a.hashCode();
    }
}
