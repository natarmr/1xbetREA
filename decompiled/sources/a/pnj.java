package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27290a;

    public pnj(String str) {
        this.f27290a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnj) && this.f27290a.equals(((pnj) obj).f27290a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f27290a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("OneXGamesByCategory(category=", this.f27290a, ", hasBackStack=false)");
    }
}
