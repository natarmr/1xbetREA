package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qci0 implements tci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28484a;

    public qci0(String str) {
        this.f28484a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qci0) && this.f28484a.equals(((qci0) obj).f28484a);
    }

    public final int hashCode() {
        return this.f28484a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f28484a, Separators.RPAREN);
    }
}
