package a;

/* JADX INFO: loaded from: classes.dex */
public final class vt00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f37979a;

    public final boolean equals(Object obj) {
        if (obj instanceof vt00) {
            return this.f37979a == ((vt00) obj).f37979a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37979a);
    }

    public final String toString() {
        return brm0.l("Lock3ABehavior(value=", this.f37979a, ')');
    }
}
