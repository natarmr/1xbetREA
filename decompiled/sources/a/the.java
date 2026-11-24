package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class the implements cie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aml f33957a;

    public the(aml amlVar) {
        this.f33957a = amlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof the) && this.f33957a.equals(((the) obj).f33957a);
    }

    public final int hashCode() {
        return this.f33957a.hashCode();
    }

    public final String toString() {
        return "Shimmers(content=" + this.f33957a + Separators.RPAREN;
    }
}
