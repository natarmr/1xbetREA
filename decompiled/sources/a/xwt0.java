package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xwt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f41627a;

    public final boolean equals(Object obj) {
        if (obj instanceof xwt0) {
            return this.f41627a.equals(((xwt0) obj).f41627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41627a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f41627a + Separators.RPAREN;
    }
}
