package a;

/* JADX INFO: loaded from: classes.dex */
public final class kdq0 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18118a;

    public kdq0(long j) {
        this.f18118a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kdq0.class == obj.getClass() && this.f18118a == ((kdq0) obj).f18118a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18118a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f18118a;
    }
}
