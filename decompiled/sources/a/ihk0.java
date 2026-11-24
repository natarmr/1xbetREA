package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ihk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf60 f14785a;
    public final sp10 b;
    public final uuk c;

    public ihk0(qf60 qf60Var, sp10 sp10Var, uuk uukVar) {
        this.f14785a = qf60Var;
        this.b = sp10Var;
        this.c = uukVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihk0)) {
            return false;
        }
        ihk0 ihk0Var = (ihk0) obj;
        return this.f14785a.equals(ihk0Var.f14785a) && this.b.equals(ihk0Var.b) && this.c.equals(ihk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f14785a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SocialKeys(okSocialKeys=" + this.f14785a + ", mailRuKeys=" + this.b + ", discordKeys=" + this.c + Separators.RPAREN;
    }
}
