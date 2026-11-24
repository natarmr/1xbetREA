package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p6h0 implements r6h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7h0 f26454a;

    public p6h0(c7h0 c7h0Var) {
        this.f26454a = c7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6h0) && this.f26454a.equals(((p6h0) obj).f26454a);
    }

    public final int hashCode() {
        return this.f26454a.hashCode();
    }

    public final String toString() {
        return "ShowGameResult(gameResult=" + this.f26454a + Separators.RPAREN;
    }
}
