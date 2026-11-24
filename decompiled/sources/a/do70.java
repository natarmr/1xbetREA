package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class do70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6403a;

    public do70(boolean z) {
        this.f6403a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof do70) && this.f6403a == ((do70) obj).f6403a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6403a);
    }

    public final String toString() {
        return defpackage.c.d("ShowInsufficientBalanceDialog(needReplenishButton=", Separators.RPAREN, this.f6403a);
    }
}
