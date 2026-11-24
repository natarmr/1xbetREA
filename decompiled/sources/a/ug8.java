package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ug8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35612a;

    public ug8(int i) {
        this.f35612a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug8) && this.f35612a == ((ug8) obj).f35612a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35612a);
    }

    public final String toString() {
        return ua80.e(this.f35612a, "CloseDialog(selectedBonusId=", Separators.RPAREN);
    }
}
