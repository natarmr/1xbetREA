package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29936a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6k) && this.f29936a == ((r6k) obj).f29936a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29936a);
    }

    public final String toString() {
        return brm0.n(new StringBuilder("DeltaCounter(count="), this.f29936a, ')');
    }
}
