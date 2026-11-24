package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ivc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uvc f15439a;
    public final boolean b;

    public ivc(uvc uvcVar, boolean z) {
        this.f15439a = uvcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivc)) {
            return false;
        }
        ivc ivcVar = (ivc) obj;
        return this.f15439a.equals(ivcVar.f15439a) && this.b == ivcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15439a.hashCode() * 31);
    }

    public final String toString() {
        return "CmsBannerCatalogModel(banner=" + this.f15439a + ", new=" + this.b + Separators.RPAREN;
    }
}
