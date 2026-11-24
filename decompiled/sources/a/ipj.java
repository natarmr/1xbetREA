package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ipj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15166a;

    public ipj(long j) {
        this.f15166a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipj) && this.f15166a == ((ipj) obj).f15166a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.f15166a) * 31);
    }

    public final String toString() {
        return axq.h(this.f15166a, "UfcChamp(id=", ", hasBackStack=false)");
    }
}
