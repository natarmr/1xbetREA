package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dha f7797a;

    public eha(dha dhaVar) {
        this.f7797a = dhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eha) && this.f7797a == ((eha) obj).f7797a;
    }

    public final int hashCode() {
        return this.f7797a.hashCode();
    }

    public final String toString() {
        return "CardFootballAttackResultUiModel(attackResultState=" + this.f7797a + Separators.RPAREN;
    }
}
