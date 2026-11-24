package a;

/* JADX INFO: loaded from: classes.dex */
public final class fmf0 extends k2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl f9778a;

    public fmf0(rl rlVar) {
        this.f9778a = rlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmf0) && this.f9778a == ((fmf0) obj).f9778a;
    }

    public final int hashCode() {
        return this.f9778a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.f9778a + ')';
    }
}
