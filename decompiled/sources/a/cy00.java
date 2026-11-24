package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5150a;
    public final String b;
    public final boolean c;

    public cy00(String str, boolean z, boolean z2) {
        this.f5150a = z;
        this.b = str;
        this.c = z2;
    }

    public static cy00 a(cy00 cy00Var, boolean z) {
        boolean z2 = cy00Var.f5150a;
        String str = cy00Var.b;
        cy00Var.getClass();
        return new cy00(str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy00)) {
            return false;
        }
        cy00 cy00Var = (cy00) obj;
        return this.f5150a == cy00Var.f5150a && this.b.equals(cy00Var.b) && this.c == cy00Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Boolean.hashCode(this.f5150a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(axq.q("LogoutStateModel(isInvisibleDialog=", ", customMessage=", this.b, this.f5150a, ", isButtonsEnable="), this.c, Separators.RPAREN);
    }
}
