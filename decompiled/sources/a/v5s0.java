package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v5s0 implements y5s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36840a;
    public final String b;

    public v5s0(long j, String str) {
        this.f36840a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5s0)) {
            return false;
        }
        v5s0 v5s0Var = (v5s0) obj;
        return this.f36840a == v5s0Var.f36840a && this.b.equals(v5s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f36840a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36840a, "OnCardClick(stageId=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
