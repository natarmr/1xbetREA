package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ubw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35403a;

    public ubw0(String str) {
        wcw0 wcw0Var = wcw0.b;
        this.f35403a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ubw0)) {
            return false;
        }
        wcw0 wcw0Var = wcw0.b;
        return this.f35403a.equals(((ubw0) obj).f35403a);
    }

    public final int hashCode() {
        return this.f35403a.hashCode() ^ wcw0.b.hashCode();
    }
}
