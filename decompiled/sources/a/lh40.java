package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lh40 implements uh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f20037a;

    public final boolean equals(Object obj) {
        if (obj instanceof lh40) {
            return this.f20037a.equals(((lh40) obj).f20037a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20037a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f20037a + Separators.RPAREN;
    }
}
