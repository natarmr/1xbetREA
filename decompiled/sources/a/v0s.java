package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v0s implements x0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f36596a;
    public final j83 b;

    public v0s(j83 j83Var, j83 j83Var2) {
        this.f36596a = j83Var;
        this.b = j83Var2;
    }

    @Override // a.x0s
    public final j83 a() {
        return this.f36596a;
    }

    @Override // a.x0s
    public final j83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0s)) {
            return false;
        }
        v0s v0sVar = (v0s) obj;
        return this.f36596a.equals(v0sVar.f36596a) && this.b.equals(v0sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36596a.hashCode() * 31);
    }

    public final String toString() {
        return "WithoutTitle(teamOneScore=" + ((Object) this.f36596a) + ", teamTwoScore=" + ((Object) this.b) + Separators.RPAREN;
    }
}
