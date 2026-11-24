package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ctn0 implements gtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4947a;

    public final boolean equals(Object obj) {
        if (obj instanceof ctn0) {
            return this.f4947a.equals(((ctn0) obj).f4947a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4947a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coef(value=", this.f4947a, Separators.RPAREN);
    }
}
