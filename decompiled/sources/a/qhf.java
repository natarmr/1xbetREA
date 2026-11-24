package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qhf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28735a;

    public final boolean equals(Object obj) {
        if (obj instanceof qhf) {
            return this.f28735a.equals(((qhf) obj).f28735a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28735a.hashCode();
    }

    public final String toString() {
        return kng0.l("FieldDescription(value=", this.f28735a, Separators.RPAREN);
    }
}
