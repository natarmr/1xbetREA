package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class agt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f842a;

    public agt(int i) {
        this.f842a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agt) && this.f842a == ((agt) obj).f842a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f842a);
    }

    public final String toString() {
        return ua80.e(this.f842a, "GenderChoiceState(currentGenderId=", Separators.RPAREN);
    }
}
