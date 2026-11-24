package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17066a;

    public jsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        this.f17066a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsq0) || !this.f17066a.equals(((jsq0) obj).f17066a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f17066a;
    }

    public final int hashCode() {
        return uwx.d.hashCode() + (this.f17066a.hashCode() * 31);
    }

    public final String toString() {
        return "ReferralLink(title=" + this.f17066a + ", itemPosition=" + uwx.d + Separators.RPAREN;
    }
}
