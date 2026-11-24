package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dsn0 implements fsn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpn0 f6619a;

    public dsn0(bpn0 bpn0Var) {
        bpn0Var.getClass();
        this.f6619a = bpn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsn0) && this.f6619a == ((dsn0) obj).f6619a;
    }

    public final int hashCode() {
        return this.f6619a.hashCode();
    }

    public final String toString() {
        return "OnRequestProcessBet(type=" + this.f6619a + Separators.RPAREN;
    }
}
