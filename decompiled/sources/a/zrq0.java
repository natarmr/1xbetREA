package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zrq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44870a;

    public zrq0(String str) {
        uwx uwxVar = uwx.f36413a;
        this.f44870a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrq0) || !this.f44870a.equals(((zrq0) obj).f44870a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f44870a;
    }

    public final int hashCode() {
        return uwx.d.hashCode() + (this.f44870a.hashCode() * 31);
    }

    public final String toString() {
        return "CertificateSerialNumber(title=" + this.f44870a + ", itemPosition=" + uwx.d + Separators.RPAREN;
    }
}
