package a;

/* JADX INFO: loaded from: classes.dex */
public final class inf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15072a;

    public final boolean equals(Object obj) {
        if (obj instanceof inf0) {
            return this.f15072a == ((inf0) obj).f15072a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15072a);
    }

    public final String toString() {
        return "RequestNumber(value=" + this.f15072a + ')';
    }
}
