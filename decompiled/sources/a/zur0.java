package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zur0 implements ivr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45022a;
    public final String b;
    public final String c;

    public zur0(String str, String str2, String str3) {
        this.f45022a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zur0)) {
            return false;
        }
        zur0 zur0Var = (zur0) obj;
        return this.f45022a.equals(zur0Var.f45022a) && this.b.equals(zur0Var.b) && this.c.equals(zur0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f45022a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OnDownloadTirageClick(tiragePath=", this.f45022a, ", fileName=", this.b, ", fileSizeText="), this.c, Separators.RPAREN);
    }
}
