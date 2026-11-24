package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ta5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33598a;
    public final String b;

    public ta5(String str, String str2) {
        this.f33598a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta5)) {
            return false;
        }
        ta5 ta5Var = (ta5) obj;
        return this.f33598a.equals(ta5Var.f33598a) && this.b.equals(ta5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33598a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AwardNominantStatInfoUiModel(label=", this.f33598a, ", value=", this.b, Separators.RPAREN);
    }
}
