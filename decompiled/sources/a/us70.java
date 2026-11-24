package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class us70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36198a;
    public final String b;
    public final boolean c;

    public us70(String str, int i, boolean z) {
        this.f36198a = i;
        this.b = str;
        this.c = z;
    }

    public static us70 a(us70 us70Var, int i, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = us70Var.f36198a;
        }
        if ((i2 & 2) != 0) {
            str = us70Var.b;
        }
        if ((i2 & 4) != 0) {
            z = us70Var.c;
        }
        str.getClass();
        return new us70(str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us70)) {
            return false;
        }
        us70 us70Var = (us70) obj;
        return this.f36198a == us70Var.f36198a && this.b.equals(us70Var.b) && this.c == us70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f36198a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f36198a, "OnlineCallOperatorRatingState(starsRatingValue=", ", commentText=", this.b, ", showCancelWithoutSavingDialog="), this.c, Separators.RPAREN);
    }
}
