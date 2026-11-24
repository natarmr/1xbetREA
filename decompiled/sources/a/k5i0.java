package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k5i0 {
    public static final k5i0 c = new k5i0(0, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17722a;
    public final String b;

    public k5i0(int i, String str) {
        this.f17722a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5i0)) {
            return false;
        }
        k5i0 k5i0Var = (k5i0) obj;
        return this.f17722a == k5i0Var.f17722a && this.b.equals(k5i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f17722a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f17722a, "SelectorChecked(id=", ", teamId=", this.b, Separators.RPAREN);
    }
}
