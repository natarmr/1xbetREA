package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xqg implements zqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5m f41317a;

    public xqg(o5m o5mVar) {
        this.f41317a = o5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqg) && this.f41317a.equals(((xqg) obj).f41317a);
    }

    public final int hashCode() {
        return this.f41317a.hashCode();
    }

    public final String toString() {
        return "CyberGameHeader(model=" + this.f41317a + Separators.RPAREN;
    }
}
