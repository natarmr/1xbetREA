package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16440a;
    public final String b;

    public jfp0(int i, String str) {
        this.f16440a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfp0)) {
            return false;
        }
        jfp0 jfp0Var = (jfp0) obj;
        return this.f16440a == jfp0Var.f16440a && this.b.equals(jfp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f16440a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f16440a, "TeamMenuItemModel(type=", ", name=", this.b, Separators.RPAREN);
    }
}
