package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qa50 implements sa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28379a;
    public final hpe b;

    public qa50(int i, hpe hpeVar) {
        this.f28379a = i;
        this.b = hpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa50)) {
            return false;
        }
        qa50 qa50Var = (qa50) obj;
        return this.f28379a == qa50Var.f28379a && this.b.equals(qa50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f28379a) * 31);
    }

    public final String toString() {
        return "Counter(value=" + this.f28379a + ", counterStyle=" + this.b + Separators.RPAREN;
    }
}
