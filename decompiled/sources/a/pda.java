package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pda implements rda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f26799a;
    public final udp0 b;
    public final udp0 c;
    public final mpm d;
    public final j83 e;

    public pda(j83 j83Var, udp0 udp0Var, udp0 udp0Var2, mpm mpmVar, j83 j83Var2) {
        this.f26799a = j83Var;
        this.b = udp0Var;
        this.c = udp0Var2;
        this.d = mpmVar;
        this.e = j83Var2;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pda)) {
            return false;
        }
        pda pdaVar = (pda) obj;
        return this.f26799a.equals(pdaVar.f26799a) && this.b.equals(pdaVar.b) && this.c.equals(pdaVar.c) && this.d.equals(pdaVar.d) && this.e.equals(pdaVar.e);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.e.hashCode() + ohs0.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f26799a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SimpleScore(topInfo=" + ((Object) this.f26799a) + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", score=" + this.d + ", bottomInfo=" + ((Object) this.e) + Separators.RPAREN;
    }
}
