package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11590a;

    public gnj(String str) {
        this.f11590a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnj) && this.f11590a.equals(((gnj) obj).f11590a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f11590a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("InfoWeb(url=", this.f11590a, ", hasBackStack=false)");
    }
}
