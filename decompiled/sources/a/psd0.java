package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class psd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27511a;
    public final String b;

    public psd0(int i, String str) {
        this.f27511a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psd0)) {
            return false;
        }
        psd0 psd0Var = (psd0) obj;
        return this.f27511a == psd0Var.f27511a && this.b.equals(psd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27511a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f27511a, "RacesMenuModel(type=", ", name=", this.b, Separators.RPAREN);
    }
}
