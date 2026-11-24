package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lln implements oln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0d f20255a;

    public lln(e0d e0dVar) {
        this.f20255a = e0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lln) && this.f20255a.equals(((lln) obj).f20255a);
    }

    public final int hashCode() {
        return this.f20255a.hashCode();
    }

    public final String toString() {
        return "CoefficientState(coefficientParams=" + this.f20255a + Separators.RPAREN;
    }
}
