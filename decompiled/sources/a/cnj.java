package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j700 f4659a;

    public cnj(j700 j700Var) {
        this.f4659a = j700Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnj) && this.f4659a == ((cnj) obj).f4659a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f4659a.hashCode() * 31);
    }

    public final String toString() {
        return "Group(lineLiveScreenType=" + this.f4659a + ", hasBackStack=false)";
    }
}
