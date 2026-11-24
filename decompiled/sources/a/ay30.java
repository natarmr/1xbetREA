package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ay30 implements fy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f1653a;

    public ay30(m0x m0xVar) {
        this.f1653a = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay30) && this.f1653a.equals(((ay30) obj).f1653a);
    }

    public final int hashCode() {
        return this.f1653a.hashCode() * 31;
    }

    public final String toString() {
        return "ButtonCallEnd(endButtonRes=" + this.f1653a + ", endButtonTint=null)";
    }
}
