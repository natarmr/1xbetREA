package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sxg0 implements uxg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final foj0 f32976a;

    public sxg0(foj0 foj0Var) {
        this.f32976a = foj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxg0) && this.f32976a.equals(((sxg0) obj).f32976a);
    }

    public final int hashCode() {
        return (this.f32976a.hashCode() * 31) - 1773452101;
    }

    public final String toString() {
        return "Content(couponImageInfo=" + this.f32976a + ", applicationId=org.xbet.client1)";
    }
}
