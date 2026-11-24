package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l1o implements m1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19264a;

    public final boolean equals(Object obj) {
        if (obj instanceof l1o) {
            return this.f19264a == ((l1o) obj).f19264a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19264a);
    }

    public final String toString() {
        return ua80.e(this.f19264a, "SentMessage(messageId=", Separators.RPAREN);
    }
}
