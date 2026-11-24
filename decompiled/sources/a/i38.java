package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i38 implements l38 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14084a;

    public i38(int i) {
        this.f14084a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i38) && this.f14084a == ((i38) obj).f14084a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14084a);
    }

    @Override // a.l38
    public final int p() {
        return this.f14084a;
    }

    public final String toString() {
        return ua80.e(this.f14084a, "BindPhone(confirmTypeAlias=", Separators.RPAREN);
    }
}
