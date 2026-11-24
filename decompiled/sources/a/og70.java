package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class og70 extends qg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25203a;

    public og70(boolean z) {
        this.f25203a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og70) && this.f25203a == ((og70) obj).f25203a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25203a);
    }

    public final String toString() {
        return defpackage.c.d("ShowInstantBet(enable=", Separators.RPAREN, this.f25203a);
    }
}
