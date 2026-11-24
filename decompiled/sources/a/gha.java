package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xha f11287a;
    public final eha b;

    public gha(xha xhaVar, eha ehaVar) {
        this.f11287a = xhaVar;
        this.b = ehaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gha)) {
            return false;
        }
        gha ghaVar = (gha) obj;
        return this.f11287a.equals(ghaVar.f11287a) && this.b.equals(ghaVar.b);
    }

    public final int hashCode() {
        return this.b.f7797a.hashCode() + (this.f11287a.hashCode() * 31);
    }

    public final String toString() {
        return "CardFootballAttackUiModel(attackTeams=" + this.f11287a + ", attackResult=" + this.b + Separators.RPAREN;
    }
}
