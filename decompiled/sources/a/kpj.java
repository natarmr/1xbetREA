package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kpj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18678a;

    public kpj(long j) {
        this.f18678a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpj) && this.f18678a == ((kpj) obj).f18678a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.f18678a) * 31);
    }

    public final String toString() {
        return axq.h(this.f18678a, "UfcFighter(id=", ", hasBackStack=false)");
    }
}
