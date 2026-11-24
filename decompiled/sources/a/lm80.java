package a;

/* JADX INFO: loaded from: classes.dex */
public final class lm80 extends nm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f20286a;

    public lm80(Throwable th) {
        this.f20286a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm80) && this.f20286a.equals(((lm80) obj).f20286a);
    }

    public final int hashCode() {
        return this.f20286a.hashCode();
    }

    public final String toString() {
        return ntm0.d("LoadResult.Error(\n                    |   throwable: " + this.f20286a + "\n                    |) ");
    }
}
