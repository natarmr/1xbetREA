package a;

/* JADX INFO: loaded from: classes.dex */
public final class x6d0 implements y6d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl f40359a;

    public x6d0(rl rlVar) {
        this.f40359a = rlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6d0) && this.f40359a == ((x6d0) obj).f40359a;
    }

    public final int hashCode() {
        return this.f40359a.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.f40359a + ')';
    }
}
