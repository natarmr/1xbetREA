package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wal0 implements abl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38834a;

    public wal0(int i) {
        this.f38834a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wal0) && this.f38834a == ((wal0) obj).f38834a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38834a);
    }

    public final String toString() {
        return ua80.e(this.f38834a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
