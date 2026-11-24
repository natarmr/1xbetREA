package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wzw implements gqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f40038a;
    public final boolean b;
    public final ibj c;

    public wzw(dyw dywVar, boolean z, ibj ibjVar) {
        this.f40038a = dywVar;
        this.b = z;
        this.c = ibjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzw)) {
            return false;
        }
        wzw wzwVar = (wzw) obj;
        return this.f40038a.equals(wzwVar.f40038a) && this.b == wzwVar.b && this.c == wzwVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f40038a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f40038a + ", isSampled=" + this.b + ", dataSource=" + this.c + Separators.RPAREN;
    }
}
