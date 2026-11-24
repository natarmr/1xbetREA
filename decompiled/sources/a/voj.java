package a;

/* JADX INFO: loaded from: classes3.dex */
public final class voj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37769a;

    public voj(int i) {
        this.f37769a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof voj) && this.f37769a == ((voj) obj).f37769a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f37769a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f37769a, "SpecialEventTopChamp(topChampId=", ", hasBackStack=false)");
    }
}
