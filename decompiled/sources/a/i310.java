package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i310 implements l310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f14075a;

    public final boolean equals(Object obj) {
        if (obj instanceof i310) {
            return this.f14075a.equals(((i310) obj).f14075a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14075a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f14075a + Separators.RPAREN;
    }
}
