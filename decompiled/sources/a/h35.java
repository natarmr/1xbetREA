package a;

/* JADX INFO: loaded from: classes2.dex */
public final class h35 extends p9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12368a;

    public h35(String str) {
        this.f12368a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p9f)) {
            return false;
        }
        return this.f12368a.equals(((h35) ((p9f) obj)).f12368a);
    }

    public final int hashCode() {
        return this.f12368a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return axq.n(new StringBuilder("User{identifier="), this.f12368a, "}");
    }
}
