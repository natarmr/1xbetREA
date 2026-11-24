package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b6p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2066a;

    public b6p(int i) {
        this.f2066a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6p) && this.f2066a == ((b6p) obj).f2066a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2066a);
    }

    public final String toString() {
        return ua80.e(this.f2066a, "Message(messageId=", Separators.RPAREN);
    }
}
