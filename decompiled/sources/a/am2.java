package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class am2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyl f1090a;
    public final ih2 b;

    public am2(fyl fylVar, ih2 ih2Var) {
        this.f1090a = fylVar;
        this.b = ih2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am2)) {
            return false;
        }
        am2 am2Var = (am2) obj;
        return this.f1090a.equals(am2Var.f1090a) && this.b == am2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1090a.hashCode() * 31);
    }

    public final String toString() {
        return "AltSportsContainerUiState(chipsModel=" + this.f1090a + ", altSportTab=" + this.b + Separators.RPAREN;
    }
}
