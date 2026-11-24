package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13926a;
    public final boolean b;

    public i0(String str, boolean z) {
        this.f13926a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f13926a.equals(i0Var.f13926a) && this.b == i0Var.b;
    }

    @Override // a.k0
    public final String getValue() {
        return this.f13926a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13926a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Expandable(value=", this.f13926a, ", isExpanded=", this.b, Separators.RPAREN);
    }
}
