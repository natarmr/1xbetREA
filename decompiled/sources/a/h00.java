package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12208a;
    public final String b;

    public h00(int i, String str) {
        this.f12208a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        return this.f12208a == h00Var.f12208a && this.b.equals(h00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f12208a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f12208a, "AdditionalItemParams(iconRes=", ", title=", this.b, Separators.RPAREN);
    }
}
