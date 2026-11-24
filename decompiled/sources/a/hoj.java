package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hoj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13396a;

    public hoj(int i) {
        this.f13396a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoj) && this.f13396a == ((hoj) obj).f13396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f13396a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f13396a, "PromoGroup(bannerIdToOpen=", ", hasBackStack=false)");
    }
}
