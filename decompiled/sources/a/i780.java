package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i780 implements p780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f14281a;

    public final boolean equals(Object obj) {
        if (obj instanceof i780) {
            return this.f14281a.equals(((i780) obj).f14281a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14281a.hashCode();
    }

    public final String toString() {
        return "OnConfirmCaptcha(userActionCaptcha=" + this.f14281a + Separators.RPAREN;
    }
}
