package a;

/* JADX INFO: loaded from: classes2.dex */
public final class a35 extends j9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156a;

    public a35(String str) {
        this.f156a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j9f)) {
            return false;
        }
        return this.f156a.equals(((a35) ((j9f) obj)).f156a);
    }

    public final int hashCode() {
        return this.f156a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return axq.n(new StringBuilder("Log{content="), this.f156a, "}");
    }
}
