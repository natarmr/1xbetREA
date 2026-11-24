package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ood implements znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcp0 f25591a;
    public final mcp0 b;
    public final j83 c;
    public final j83 d;

    public ood(mcp0 mcp0Var, mcp0 mcp0Var2, j83 j83Var, j83 j83Var2) {
        this.f25591a = mcp0Var;
        this.b = mcp0Var2;
        this.c = j83Var;
        this.d = j83Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ood)) {
            return false;
        }
        ood oodVar = (ood) obj;
        return this.f25591a.equals(oodVar.f25591a) && this.b.equals(oodVar.b) && this.c.equals(oodVar.c) && this.d.equals(oodVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.f(this.c, ua80.b(this.f25591a.f21563a.hashCode() * 31, 31, this.b.f21563a), 31);
    }

    public final String toString() {
        return "MultiTeam(teamOne=" + this.f25591a + ", teamTwo=" + this.b + ", score=" + ((Object) this.c) + ", matchInfo=" + ((Object) this.d) + Separators.RPAREN;
    }
}
