package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f22229a;
    public final vvs b;

    public mqk0(bem bemVar, vvs vvsVar) {
        this.f22229a = bemVar;
        this.b = vvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqk0)) {
            return false;
        }
        mqk0 mqk0Var = (mqk0) obj;
        return this.f22229a.equals(mqk0Var.f22229a) && this.b == mqk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22229a.hashCode() * 31);
    }

    public final String toString() {
        return "EventCardAction(action=" + this.f22229a + ", gameType=" + this.b + Separators.RPAREN;
    }
}
