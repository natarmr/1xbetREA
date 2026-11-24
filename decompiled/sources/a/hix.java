package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iix f13136a;
    public final String b;

    public hix(iix iixVar, String str) {
        this.f13136a = iixVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hix)) {
            return false;
        }
        hix hixVar = (hix) obj;
        return this.f13136a.equals(hixVar.f13136a) && this.b.equals(hixVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + 2080091964;
    }

    public final String toString() {
        return "InsightsTipModel(screen=" + this.f13136a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
