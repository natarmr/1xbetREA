package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ylj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42845a;

    public ylj(String str) {
        this.f42845a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ylj) && this.f42845a.equals(((ylj) obj).f42845a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f42845a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("BetsOnYour(screenType=", this.f42845a, ", hasBackStack=false)");
    }
}
