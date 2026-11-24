package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lai0 extends RuntimeException implements alx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19706a;

    public lai0(String str) {
        super(str);
        this.f19706a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lai0) && this.f19706a.equals(((lai0) obj).f19706a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f19706a;
    }

    public final int hashCode() {
        return this.f19706a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return kng0.l("SellCouponException(message=", this.f19706a, Separators.RPAREN);
    }
}
