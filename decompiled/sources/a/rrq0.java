package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rrq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30996a;
    public final String b;

    public rrq0(long j, String str) {
        this.f30996a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrq0)) {
            return false;
        }
        rrq0 rrq0Var = (rrq0) obj;
        return this.f30996a == rrq0Var.f30996a && this.b.equals(rrq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f30996a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30996a, "TitleRatingValueColModel(id=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
