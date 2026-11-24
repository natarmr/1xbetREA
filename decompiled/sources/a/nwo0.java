package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nwo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24244a;
    public final boolean b;
    public final String c;

    public nwo0(String str, boolean z, boolean z2) {
        this.f24244a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwo0)) {
            return false;
        }
        nwo0 nwo0Var = (nwo0) obj;
        return this.f24244a == nwo0Var.f24244a && this.b == nwo0Var.b && this.c.equals(nwo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f24244a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(f140.q("TaxStatusModel(isEnabled=", ", isError=", ", message=", this.f24244a, this.b), this.c, Separators.RPAREN);
    }
}
