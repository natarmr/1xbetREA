package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nln implements oln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0d f23736a;
    public final e0d b;

    public nln(e0d e0dVar, e0d e0dVar2) {
        this.f23736a = e0dVar;
        this.b = e0dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nln)) {
            return false;
        }
        nln nlnVar = (nln) obj;
        return this.f23736a.equals(nlnVar.f23736a) && this.b.equals(nlnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23736a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionBetCoefficientState(maxCoefficientParams=" + this.f23736a + ", optiCoefficientParams=" + this.b + Separators.RPAREN;
    }
}
