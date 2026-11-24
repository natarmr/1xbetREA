package a;

/* JADX INFO: loaded from: classes.dex */
public final class cgr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4327a;

    public final boolean equals(Object obj) {
        if (obj instanceof cgr0) {
            return this.f4327a == ((cgr0) obj).f4327a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4327a);
    }

    public final String toString() {
        return brm0.l("TorchMode(value=", this.f4327a, ')');
    }
}
