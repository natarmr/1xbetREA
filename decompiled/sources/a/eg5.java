package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eg5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7745a;

    public final boolean equals(Object obj) {
        if (obj instanceof eg5) {
            return this.f7745a == ((eg5) obj).f7745a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7745a);
    }

    public final String toString() {
        return defpackage.c.d("BalanceDescriptionVisibilityStateModel(isVisible=", Separators.RPAREN, this.f7745a);
    }
}
