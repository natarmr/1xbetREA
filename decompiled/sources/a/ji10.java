package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ji10 implements li10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16555a;

    public ji10(int i) {
        this.f16555a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji10) && this.f16555a == ((ji10) obj).f16555a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16555a);
    }

    public final String toString() {
        return ua80.e(this.f16555a, "IntermediateLevel(levelMaxPoints=", Separators.RPAREN);
    }
}
