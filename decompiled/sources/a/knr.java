package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class knr implements pnr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18598a;

    public knr(int i) {
        this.f18598a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knr) && this.f18598a == ((knr) obj).f18598a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18598a);
    }

    public final String toString() {
        return ua80.e(this.f18598a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
