package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class weo implements xeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rlt f39027a;
    public final boolean b;

    public weo(rlt rltVar, boolean z) {
        this.f39027a = rltVar;
        this.b = z;
    }

    @Override // a.xeo
    public final String a() {
        return weo.class.getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof weo)) {
            return false;
        }
        weo weoVar = (weo) obj;
        return this.f39027a == weoVar.f39027a && this.b == weoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f39027a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowGeoBlock(geoState=" + this.f39027a + ", needGeo=" + this.b + Separators.RPAREN;
    }
}
