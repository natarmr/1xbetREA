package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zof implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44717a;

    public /* synthetic */ zof(String str) {
        this.f44717a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zof) {
            return this.f44717a.equals(((zof) obj).f44717a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44717a.hashCode();
    }

    public final String toString() {
        return kng0.l("MapImage(value=", this.f44717a, Separators.RPAREN);
    }
}
