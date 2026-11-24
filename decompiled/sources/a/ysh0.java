package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ysh0 implements bth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43168a;

    public final boolean equals(Object obj) {
        if (obj instanceof ysh0) {
            return this.f43168a.equals(((ysh0) obj).f43168a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43168a.hashCode();
    }

    public final String toString() {
        return kng0.l("Description(value=", this.f43168a, Separators.RPAREN);
    }
}
