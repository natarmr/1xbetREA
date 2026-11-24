package a;

/* JADX INFO: loaded from: classes3.dex */
public final class loj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20393a;

    public loj(String str) {
        this.f20393a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loj) && this.f20393a.equals(((loj) obj).f20393a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f20393a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("PromoWebAggregator(url=", this.f20393a, ", hasBackStack=false)");
    }
}
