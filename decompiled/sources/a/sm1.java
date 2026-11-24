package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32424a;

    public sm1(long j) {
        this.f32424a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm1) && this.f32424a == ((sm1) obj).f32424a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.f32424a) * 31);
    }

    public final String toString() {
        return axq.h(this.f32424a, "TournamentsScreen(bannerId=", ", openedFromMenu=false)");
    }
}
