package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xge implements fie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40834a;
    public final boolean b;

    public xge(mdm mdmVar, boolean z) {
        this.f40834a = mdmVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xge)) {
            return false;
        }
        xge xgeVar = (xge) obj;
        return this.f40834a.equals(xgeVar.f40834a) && this.b == xgeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f40834a.hashCode() * 31);
    }

    public final String toString() {
        return "DataIsEmpty(config=" + this.f40834a + ", refreshing=" + this.b + Separators.RPAREN;
    }
}
