package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class h680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0d f12519a;
    public final m0d b;

    public h680(m0d m0dVar, m0d m0dVar2) {
        this.f12519a = m0dVar;
        this.b = m0dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h680)) {
            return false;
        }
        h680 h680Var = (h680) obj;
        return this.f12519a.equals(h680Var.f12519a) && this.b.equals(h680Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12519a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionBetStateModel(maxCoefStateModel=" + this.f12519a + ", optionCoefStateModel=" + this.b + Separators.RPAREN;
    }
}
