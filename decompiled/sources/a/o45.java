package a;

/* JADX INFO: loaded from: classes.dex */
public final class o45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24616a;
    public final q55 b;
    public final q35 c;

    public o45(long j, q55 q55Var, q35 q35Var) {
        this.f24616a = j;
        this.b = q55Var;
        this.c = q35Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o45)) {
            return false;
        }
        o45 o45Var = (o45) obj;
        return this.f24616a == o45Var.f24616a && this.b.equals(o45Var.b) && this.c.equals(o45Var.c);
    }

    public final int hashCode() {
        long j = this.f24616a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f24616a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
