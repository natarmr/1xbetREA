package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30478a;

    public rh8(long j) {
        this.f30478a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh8) && this.f30478a == ((rh8) obj).f30478a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30478a) * 31;
    }

    public final String toString() {
        return axq.h(this.f30478a, "OnWildFreeBetGameSelect(gameId=", ", loadedPictureUrl=null)");
    }
}
