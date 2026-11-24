package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kl70 extends ll70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18472a;

    public kl70(boolean z) {
        this.f18472a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl70) && this.f18472a == ((kl70) obj).f18472a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18472a);
    }

    public final String toString() {
        return defpackage.c.d("ShowRejectBetDialog(minBet=", Separators.RPAREN, this.f18472a);
    }
}
