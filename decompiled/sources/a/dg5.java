package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dg5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6031a;

    public final boolean equals(Object obj) {
        if (obj instanceof dg5) {
            return this.f6031a == ((dg5) obj).f6031a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6031a);
    }

    public final String toString() {
        return defpackage.c.d("BalanceDescriptionVisibilityStateModel(isVisible=", Separators.RPAREN, this.f6031a);
    }
}
