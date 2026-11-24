package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34949a;

    public final boolean equals(Object obj) {
        if (obj instanceof u2j0) {
            return this.f34949a == ((u2j0) obj).f34949a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34949a);
    }

    public final String toString() {
        return defpackage.c.d("ConfirmTransactionFromLineToLive(hasEnable=", Separators.RPAREN, this.f34949a);
    }
}
