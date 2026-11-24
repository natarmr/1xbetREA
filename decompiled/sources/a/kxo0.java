package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kxo0 implements lxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f19066a;

    public kxo0(bop0 bop0Var) {
        this.f19066a = bop0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxo0) && this.f19066a == ((kxo0) obj).f19066a;
    }

    public final int hashCode() {
        return this.f19066a.hashCode();
    }

    public final String toString() {
        return "OnTeamClick(team=" + this.f19066a + Separators.RPAREN;
    }
}
