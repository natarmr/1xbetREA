package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yta0 implements bua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43209a;

    public yta0(int i) {
        this.f43209a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yta0) && this.f43209a == ((yta0) obj).f43209a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43209a);
    }

    public final String toString() {
        return ua80.e(this.f43209a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
