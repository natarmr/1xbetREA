package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42192a;

    public y8f0(int i) {
        this.f42192a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8f0) && this.f42192a == ((y8f0) obj).f42192a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42192a);
    }

    public final String toString() {
        return ua80.e(this.f42192a, "OnDialogBonusClick(selectedBonusId=", Separators.RPAREN);
    }
}
