package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class s3j implements z3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31561a;
    public final int b;

    public s3j(long j, int i) {
        this.f31561a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3j)) {
            return false;
        }
        s3j s3jVar = (s3j) obj;
        return this.f31561a == s3jVar.f31561a && this.b == s3jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f31561a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f31561a, "OnClickGames(productId=", ", progress=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
