package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t2y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33239a;
    public final String b;
    public final String c;

    public t2y(String str, String str2, String str3) {
        this.f33239a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2y)) {
            return false;
        }
        t2y t2yVar = (t2y) obj;
        return this.f33239a.equals(t2yVar.f33239a) && this.b.equals(t2yVar.b) && this.c.equals(t2yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f33239a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("JackpotImageUrlsModel(backUrl=", this.f33239a, ", frontUrl=", this.b, ", pictureUrl="), this.c, Separators.RPAREN);
    }
}
