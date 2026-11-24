package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rzi0 implements szi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31363a;

    public final boolean equals(Object obj) {
        if (obj instanceof rzi0) {
            return this.f31363a.equals(((rzi0) obj).f31363a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31363a.hashCode();
    }

    public final String toString() {
        return kng0.l("SubTitle(value=", this.f31363a, Separators.RPAREN);
    }
}
