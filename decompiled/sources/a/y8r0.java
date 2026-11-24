package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42208a;
    public final String b;

    public y8r0(String str, String str2) {
        this.f42208a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8r0)) {
            return false;
        }
        y8r0 y8r0Var = (y8r0) obj;
        return this.f42208a.equals(y8r0Var.f42208a) && this.b.equals(y8r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42208a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TopPlayerScoreModel(playerId=", this.f42208a, ", playerScore=", this.b, Separators.RPAREN);
    }
}
