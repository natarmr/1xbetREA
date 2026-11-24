package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rft implements sft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok90 f30404a;

    public rft(ok90 ok90Var) {
        this.f30404a = ok90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rft) && this.f30404a.equals(((rft) obj).f30404a);
    }

    public final int hashCode() {
        return this.f30404a.hashCode();
    }

    public final String toString() {
        return "OnGenderItemClick(genderUiModel=" + this.f30404a + Separators.RPAREN;
    }
}
