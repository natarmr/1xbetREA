package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z78 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43905a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public z78(String str, String str2, String str3, boolean z, boolean z2) {
        this.f43905a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z78)) {
            return false;
        }
        z78 z78Var = (z78) obj;
        return this.f43905a == z78Var.f43905a && this.b.equals(z78Var.b) && this.c.equals(z78Var.c) && this.d.equals(z78Var.d) && this.e == z78Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f43905a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("BlockFullRuleModel(hidden=", ", title=", this.b, this.f43905a, ", content=");
        f140.v(sbQ, this.c, ", subContent=", this.d, ", isShowGame=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
