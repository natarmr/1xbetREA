package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mg3 implements og3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21722a;
    public final String b;

    public mg3(String str, boolean z) {
        this.f21722a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3)) {
            return false;
        }
        mg3 mg3Var = (mg3) obj;
        return this.f21722a == mg3Var.f21722a && this.b.equals(mg3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f21722a) * 31);
    }

    public final String toString() {
        return ua80.k("ResolveFailed(showProxy=", this.f21722a, ", message=", this.b, Separators.RPAREN);
    }
}
