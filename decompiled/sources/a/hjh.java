package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hjh extends jjh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f13159a;

    public hjh(mdm mdmVar) {
        this.f13159a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjh) && this.f13159a.equals(((hjh) obj).f13159a);
    }

    public final int hashCode() {
        return this.f13159a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f13159a, Separators.RPAREN);
    }
}
