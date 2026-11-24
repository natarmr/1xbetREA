package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vmp implements wmp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37683a;

    public vmp(int i) {
        this.f37683a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmp) && this.f37683a == ((vmp) obj).f37683a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37683a);
    }

    public final String toString() {
        return ua80.e(this.f37683a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
