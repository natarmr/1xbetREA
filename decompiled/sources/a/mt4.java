package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mt4 implements tt4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22353a;

    public mt4(int i) {
        this.f22353a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt4) && this.f22353a == ((mt4) obj).f22353a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22353a);
    }

    public final String toString() {
        return ua80.e(this.f22353a, "CancelNotifications(id=", Separators.RPAREN);
    }
}
