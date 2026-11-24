package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ukn implements vkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35836a;

    public final boolean equals(Object obj) {
        if (obj instanceof ukn) {
            return this.f35836a == ((ukn) obj).f35836a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35836a);
    }

    public final String toString() {
        return ua80.e(this.f35836a, "OnSystemTypeSelectClick(position=", Separators.RPAREN);
    }
}
