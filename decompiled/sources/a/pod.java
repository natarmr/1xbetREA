package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pod implements sod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gex f27324a;
    public final ddp0 b;
    public final ddp0 c;
    public final j83 d;
    public final j83 e;
    public final j83 f;

    public pod(gex gexVar, ddp0 ddp0Var, ddp0 ddp0Var2, j83 j83Var, j83 j83Var2, j83 j83Var3) {
        this.f27324a = gexVar;
        this.b = ddp0Var;
        this.c = ddp0Var2;
        this.d = j83Var;
        this.e = j83Var2;
        this.f = j83Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pod)) {
            return false;
        }
        pod podVar = (pod) obj;
        return this.f27324a == podVar.f27324a && this.b.equals(podVar.b) && this.c.equals(podVar.c) && this.d.equals(podVar.d) && this.e.equals(podVar.e) && this.f.equals(podVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.f(this.e, brm0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f27324a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "LineScore(inningType=" + this.f27324a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", teamOneScore=" + ((Object) this.d) + ", teamTwoScore=" + ((Object) this.e) + ", matchInfo=" + ((Object) this.f) + Separators.RPAREN;
    }
}
