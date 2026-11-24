package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dfh0 implements efh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6002a;

    @Override // a.efh0
    public final mdm a() {
        return this.f6002a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dfh0) {
            return this.f6002a.equals(((dfh0) obj).f6002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6002a.hashCode();
    }

    public final String toString() {
        return b1j.j("SearchEmptyContent(config=", this.f6002a, Separators.RPAREN);
    }
}
