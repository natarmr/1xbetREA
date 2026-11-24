package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26268a;
    public final String b;

    public p2s0(String str, String str2) {
        this.f26268a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2s0)) {
            return false;
        }
        p2s0 p2s0Var = (p2s0) obj;
        return this.f26268a.equals(p2s0Var.f26268a) && this.b.equals(p2s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26268a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TournamentModel(id=", this.f26268a, ", title=", this.b, Separators.RPAREN);
    }
}
