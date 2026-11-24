package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hpj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13445a;
    public final boolean b;
    public final String c;
    public final String d;

    public hpj(String str, String str2, boolean z, boolean z2) {
        this.f13445a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpj)) {
            return false;
        }
        hpj hpjVar = (hpj) obj;
        return this.f13445a == hpjVar.f13445a && this.b == hpjVar.b && this.c.equals(hpjVar.c) && this.d.equals(hpjVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f13445a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return ua80.m(f140.q("TvBetJackpot(fromAggregator=", ", showNavBar=", ", imageUrl=", this.f13445a, this.b), this.c, ", translateId=", this.d, ", hasBackStack=false)");
    }
}
