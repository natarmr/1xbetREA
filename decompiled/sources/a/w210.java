package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38429a;

    public w210(int i) {
        this.f38429a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w210) && this.f38429a == ((w210) obj).f38429a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38429a);
    }

    public final String toString() {
        return ua80.e(this.f38429a, "ShowSnackbar(message=", Separators.RPAREN);
    }
}
