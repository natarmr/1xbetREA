package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class llf0 implements mlf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20245a;

    public llf0(String str) {
        this.f20245a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llf0) && this.f20245a.equals(((llf0) obj).f20245a);
    }

    public final int hashCode() {
        return this.f20245a.hashCode();
    }

    public final String toString() {
        return kng0.l("TextMessage(text=", this.f20245a, Separators.RPAREN);
    }
}
