package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iy60 extends ly60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4s f15576a;

    public iy60(m4s m4sVar) {
        this.f15576a = m4sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy60) && this.f15576a == ((iy60) obj).f15576a;
    }

    public final int hashCode() {
        return this.f15576a.hashCode();
    }

    public final String toString() {
        return "OnCoefficientRadioButtonClicked(coefficient=" + this.f15576a + Separators.RPAREN;
    }
}
