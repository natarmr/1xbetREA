package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26758a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public pcg(String str, String str2, String str3, String str4, long j) {
        this.f26758a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcg)) {
            return false;
        }
        pcg pcgVar = (pcg) obj;
        return this.f26758a == pcgVar.f26758a && this.b.equals(pcgVar.b) && this.c.equals(pcgVar.c) && this.d.equals(pcgVar.d) && this.e.equals(pcgVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f26758a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26758a, "CyberChampImagesModel(feedId=", ", backgroundImage=", this.b);
        f140.v(sbO, ", backgroundIpadImage=", this.c, ", masterImage=", this.d);
        return rw2.o(sbO, ", masterTabletImage=", this.e, Separators.RPAREN);
    }
}
