package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8409a;
    public final String b;
    public final boolean c;

    public eu9(String str, int i, boolean z) {
        this.f8409a = i;
        this.b = str;
        this.c = z;
    }

    public static eu9 a(eu9 eu9Var, int i, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = eu9Var.f8409a;
        }
        if ((i2 & 2) != 0) {
            str = eu9Var.b;
        }
        if ((i2 & 4) != 0) {
            z = eu9Var.c;
        }
        str.getClass();
        return new eu9(str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu9)) {
            return false;
        }
        eu9 eu9Var = (eu9) obj;
        return this.f8409a == eu9Var.f8409a && this.b.equals(eu9Var.b) && this.c == eu9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f8409a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f8409a, "CallbackOperatorRatingState(starsRatingValue=", ", commentText=", this.b, ", showCancelWithoutSavingDialog="), this.c, Separators.RPAREN);
    }
}
