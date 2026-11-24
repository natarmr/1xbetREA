package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wqq0 implements xqq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final arq0 f39604a;

    public wqq0(arq0 arq0Var) {
        this.f39604a = arq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqq0) && this.f39604a.equals(((wqq0) obj).f39604a);
    }

    public final int hashCode() {
        return this.f39604a.hashCode();
    }

    public final String toString() {
        return "Success(tableContent=" + this.f39604a + Separators.RPAREN;
    }
}
