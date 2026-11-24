package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nrp0 implements prp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f24015a;

    public nrp0(jkm jkmVar) {
        this.f24015a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrp0) && this.f24015a.equals(((nrp0) obj).f24015a);
    }

    public final int hashCode() {
        return Long.hashCode(10000L) + (this.f24015a.hashCode() * 31);
    }

    public final String toString() {
        return twn.o("Error(config=", this.f24015a, ", countDownTimeMillis=10000)");
    }
}
