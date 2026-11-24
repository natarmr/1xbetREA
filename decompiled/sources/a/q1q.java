package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27966a;
    public final String b;

    public q1q(String str, boolean z) {
        this.f27966a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1q)) {
            return false;
        }
        q1q q1qVar = (q1q) obj;
        return this.f27966a == q1qVar.f27966a && this.b.equals(q1qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f27966a) * 31);
    }

    public final String toString() {
        return ua80.k("PassportDateIssue(isRequired=", this.f27966a, ", passportDateIssue=", this.b, Separators.RPAREN);
    }
}
