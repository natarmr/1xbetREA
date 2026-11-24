package a;

/* JADX INFO: loaded from: classes.dex */
public final class gwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12034a;

    public gwn(String str) {
        if (str != null) {
            this.f12034a = str;
        } else {
            hny.u("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwn)) {
            return false;
        }
        return this.f12034a.equals(((gwn) obj).f12034a);
    }

    public final int hashCode() {
        return this.f12034a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return axq.n(new StringBuilder("Encoding{name=\""), this.f12034a, "\"}");
    }
}
