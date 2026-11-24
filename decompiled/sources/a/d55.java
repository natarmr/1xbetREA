package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e55 f5487a;
    public final g55 b;
    public final f55 c;

    public d55(e55 e55Var, g55 g55Var, f55 f55Var) {
        this.f5487a = e55Var;
        this.b = g55Var;
        this.c = f55Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d55)) {
            return false;
        }
        d55 d55Var = (d55) obj;
        return this.f5487a.equals(d55Var.f5487a) && this.b.equals(d55Var.b) && this.c.equals(d55Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f5487a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f5487a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
