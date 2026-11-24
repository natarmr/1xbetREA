package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43946a;
    public final String b;

    public z82(int i, String str) {
        this.f43946a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z82)) {
            return false;
        }
        z82 z82Var = (z82) obj;
        return this.f43946a == z82Var.f43946a && this.b.equals(z82Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f43946a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f43946a, "AltDesignLSpecialEventMainHeaderBackground(placeholder=", ", url=", this.b, Separators.RPAREN);
    }
}
