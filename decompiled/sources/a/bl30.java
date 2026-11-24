package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bl30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2777a;
    public final String b;

    public bl30(int i, String str) {
        this.f2777a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl30)) {
            return false;
        }
        bl30 bl30Var = (bl30) obj;
        return this.f2777a == bl30Var.f2777a && this.b.equals(bl30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f2777a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f2777a, "MedalUiModel(image=", ", count=", this.b, Separators.RPAREN);
    }
}
