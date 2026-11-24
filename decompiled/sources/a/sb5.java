package a;

/* JADX INFO: loaded from: classes6.dex */
public final class sb5 extends df50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31915a;
    public final long b;

    public sb5(Object obj, long j) {
        this.f31915a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb5)) {
            return false;
        }
        sb5 sb5Var = (sb5) obj;
        return this.f31915a.equals(sb5Var.f31915a) && this.b == sb5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f31915a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f31915a + ", compositeKey=" + this.b + ')';
    }
}
