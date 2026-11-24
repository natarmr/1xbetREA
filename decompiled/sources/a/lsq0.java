package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20593a;

    public lsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        this.f20593a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsq0) || !this.f20593a.equals(((lsq0) obj).f20593a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f20593a;
    }

    public final int hashCode() {
        return uwx.c.hashCode() + (this.f20593a.hashCode() * 31);
    }

    public final String toString() {
        return "TestToolsTitle(title=" + this.f20593a + ", itemPosition=" + uwx.c + Separators.RPAREN;
    }
}
