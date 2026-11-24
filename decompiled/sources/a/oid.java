package a;

/* JADX INFO: loaded from: classes3.dex */
public final class oid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25304a;

    public oid(long j) {
        this.f25304a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oid) && this.f25304a == ((oid) obj).f25304a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.f25304a) * 31);
    }

    public final String toString() {
        return axq.h(this.f25304a, "OnFavoriteBtnClick(gameId=", ", postEntrance=false)");
    }
}
