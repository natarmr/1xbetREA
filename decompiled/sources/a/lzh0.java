package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lzh0 extends ozh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f20906a;

    public lzh0(l7m0 l7m0Var) {
        this.f20906a = l7m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzh0) && this.f20906a == ((lzh0) obj).f20906a;
    }

    public final int hashCode() {
        return this.f20906a.hashCode();
    }

    public final String toString() {
        return "Content(itemList=" + this.f20906a + Separators.RPAREN;
    }
}
