package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pfn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26913a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public pfn(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f26913a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfn)) {
            return false;
        }
        pfn pfnVar = (pfn) obj;
        return this.f26913a == pfnVar.f26913a && this.b.equals(pfnVar.b) && this.c.equals(pfnVar.c) && this.d.equals(pfnVar.d) && this.e.equals(pfnVar.e) && this.f.equals(pfnVar.f) && this.g.equals(pfnVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f26913a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f26913a, "DynamicBannerModel(gameId=", ", gameName=", this.b, ", header=");
        f140.v(sbR, this.c, ", description=", this.d, ", previewUrl=");
        f140.v(sbR, this.e, ", imageUrl=", this.f, ", info=");
        return axq.n(sbR, this.g, Separators.RPAREN);
    }
}
