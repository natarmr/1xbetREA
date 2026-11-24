package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h4b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12427a;

    public h4b0(int i) {
        this.f12427a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4b0) && this.f12427a == ((h4b0) obj).f12427a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12427a);
    }

    public final String toString() {
        return ua80.e(this.f12427a, "ShowErrorMessage(messageResId=", Separators.RPAREN);
    }
}
