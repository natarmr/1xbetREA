package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class om10 implements sm10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25482a;

    public om10(boolean z) {
        this.f25482a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om10) && this.f25482a == ((om10) obj).f25482a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25482a);
    }

    public final String toString() {
        return defpackage.c.d("ShowInsufficientBalanceDialog(needReplenishButton=", Separators.RPAREN, this.f25482a);
    }
}
