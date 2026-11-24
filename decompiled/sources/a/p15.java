package a;

/* JADX INFO: loaded from: classes.dex */
public final class p15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26183a;

    public p15(int i) {
        this.f26183a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof p15) && this.f26183a == ((p15) obj).f26183a;
    }

    public final int hashCode() {
        return (this.f26183a ^ 1000003) * 1000003;
    }

    public final String toString() {
        return rz4.j(this.f26183a, ", cause=null}", new StringBuilder("StateError{code="));
    }
}
