package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k3s0 implements o3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17636a;
    public final String b;

    public k3s0(long j, String str) {
        this.f17636a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3s0)) {
            return false;
        }
        k3s0 k3s0Var = (k3s0) obj;
        return this.f17636a == k3s0Var.f17636a && this.b.equals(k3s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f17636a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f17636a, "OnCardClick(stageId=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
