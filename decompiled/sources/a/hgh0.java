package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hgh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13018a;

    public hgh0(String str) {
        this.f13018a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgh0) && this.f13018a.equals(((hgh0) obj).f13018a);
    }

    public final int hashCode() {
        return this.f13018a.hashCode() * 31;
    }

    public final String toString() {
        return kng0.l("SearchParams(sortType=", this.f13018a, ", searchQuery=)");
    }
}
