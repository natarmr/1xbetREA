package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ndd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr1 f23335a;

    public ndd0(lr1 lr1Var) {
        this.f23335a = lr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndd0) && this.f23335a.equals(((ndd0) obj).f23335a);
    }

    public final int hashCode() {
        return this.f23335a.hashCode();
    }

    public final String toString() {
        return "Virtual(tab=" + this.f23335a + Separators.RPAREN;
    }
}
