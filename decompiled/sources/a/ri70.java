package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ri70 extends si70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30527a;

    public ri70(boolean z) {
        this.f30527a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri70) && this.f30527a == ((ri70) obj).f30527a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30527a);
    }

    public final String toString() {
        return defpackage.c.d("ShowRejectBetDialog(minBet=", Separators.RPAREN, this.f30527a);
    }
}
