package a;

/* JADX INFO: loaded from: classes3.dex */
public final class koj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18633a;

    public koj(String str) {
        this.f18633a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof koj) && this.f18633a.equals(((koj) obj).f18633a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f18633a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("PromoWeb(url=", this.f18633a, ", hasBackStack=false)");
    }
}
