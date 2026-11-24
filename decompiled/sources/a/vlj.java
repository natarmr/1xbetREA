package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vlj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37626a;

    public vlj(int i) {
        this.f37626a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlj) && this.f37626a == ((vlj) obj).f37626a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f37626a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f37626a, "Banner(id=", ", hasBackStack=false)");
    }
}
