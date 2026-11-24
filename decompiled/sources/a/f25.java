package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f25 extends v8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8796a;

    public f25(int i) {
        this.f8796a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v8f) {
            if (this.f8796a == ((f25) ((v8f) obj)).f8796a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8796a ^ 1000003;
    }

    public final String toString() {
        return rz4.j(this.f8796a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
