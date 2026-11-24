package a;

/* JADX INFO: loaded from: classes3.dex */
public final class roj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30840a;

    public roj(String str) {
        this.f30840a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof roj) && this.f30840a.equals(((roj) obj).f30840a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f30840a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("Scanner(type=", this.f30840a, ", hasBackStack=false)");
    }
}
