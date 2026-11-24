package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jdv implements kdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gdv f16347a;
    public final gmm b;

    public jdv(gdv gdvVar, gmm gmmVar) {
        this.f16347a = gdvVar;
        this.b = gmmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdv)) {
            return false;
        }
        jdv jdvVar = (jdv) obj;
        return this.f16347a.equals(jdvVar.f16347a) && this.b.equals(jdvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16347a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(tableContent=" + this.f16347a + ", appBarRightIconStyle=" + this.b + Separators.RPAREN;
    }
}
