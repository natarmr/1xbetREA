package a;

/* JADX INFO: loaded from: classes2.dex */
public final class k4x implements vde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm40 f17690a;

    public k4x(wm40 wm40Var) {
        this.f17690a = wm40Var;
    }

    public final boolean equals(Object obj) {
        k4x k4xVar = obj instanceof k4x ? (k4x) obj : null;
        return this.f17690a.equals(k4xVar != null ? k4xVar.f17690a : null);
    }

    @Override // a.vde0, a.b3u0
    public final wsy getType() {
        kzj0 kzj0VarI = this.f17690a.I();
        kzj0VarI.getClass();
        return kzj0VarI;
    }

    public final int hashCode() {
        return this.f17690a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        kzj0 kzj0VarI = this.f17690a.I();
        kzj0VarI.getClass();
        sb.append(kzj0VarI);
        sb.append('}');
        return sb.toString();
    }
}
