package a;

/* JADX INFO: loaded from: classes2.dex */
public final class uaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final taj f35331a;
    public final taj b;
    public final double c;

    public uaj(taj tajVar, taj tajVar2, double d) {
        this.f35331a = tajVar;
        this.b = tajVar2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaj)) {
            return false;
        }
        uaj uajVar = (uaj) obj;
        return this.f35331a == uajVar.f35331a && this.b == uajVar.b && Double.compare(this.c, uajVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.f35331a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f35331a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
