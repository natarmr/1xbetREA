package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpe f5086a;

    public cwl(rpe rpeVar) {
        this.f5086a = rpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwl) && this.f5086a.equals(((cwl) obj).f5086a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5086a.f30883a);
    }

    public final String toString() {
        return "DsChipCounterModel(value=" + this.f5086a + Separators.RPAREN;
    }
}
