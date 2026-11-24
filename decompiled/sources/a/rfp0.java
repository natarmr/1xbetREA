package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30400a;
    public final int b;
    public final String c;
    public final String d;

    public rfp0(String str, int i, String str2, String str3) {
        this.f30400a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfp0)) {
            return false;
        }
        rfp0 rfp0Var = (rfp0) obj;
        return this.f30400a.equals(rfp0Var.f30400a) && this.b == rfp0Var.b && this.c.equals(rfp0Var.c) && this.d.equals(rfp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f30400a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ua80.m(kng0.p(this.b, "TeamModel(id=", this.f30400a, ", teamClId=", ", title="), this.c, ", image=", this.d, Separators.RPAREN);
    }
}
