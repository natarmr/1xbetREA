package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zw20 implements cx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45087a;

    public final boolean equals(Object obj) {
        if (obj instanceof zw20) {
            return this.f45087a.equals(((zw20) obj).f45087a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45087a.hashCode();
    }

    public final String toString() {
        return kng0.l("GraphName(value=", this.f45087a, Separators.RPAREN);
    }
}
