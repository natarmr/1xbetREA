package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class no60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23855a;
    public final vpv0 b;

    public no60(long j, vpv0 vpv0Var) {
        this.f23855a = j;
        this.b = vpv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no60)) {
            return false;
        }
        no60 no60Var = (no60) obj;
        return this.f23855a == no60Var.f23855a && this.b == no60Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f23855a) * 31);
    }

    public final String toString() {
        return "OneXGameWorkStatusModel(id=" + this.f23855a + ", status=" + this.b + Separators.RPAREN;
    }
}
