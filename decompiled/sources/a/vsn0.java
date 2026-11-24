package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vsn0 implements atn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fzc f37959a;

    public final boolean equals(Object obj) {
        if (obj instanceof vsn0) {
            return this.f37959a == ((vsn0) obj).f37959a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37959a.hashCode();
    }

    public final String toString() {
        return "CoefColor(coefColorType=" + this.f37959a + Separators.RPAREN;
    }
}
