package a;

/* JADX INFO: loaded from: classes.dex */
public final class ssb0 extends df50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32718a;
    public final long b;

    public ssb0(Object obj, long j) {
        this.f32718a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssb0)) {
            return false;
        }
        ssb0 ssb0Var = (ssb0) obj;
        return this.f32718a.equals(ssb0Var.f32718a) && this.b == ssb0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f32718a.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f32718a + ", compositeKey=" + this.b + ')';
    }
}
