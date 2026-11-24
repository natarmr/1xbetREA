package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nkb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5l0 f23674a;

    public final boolean equals(Object obj) {
        if (obj instanceof nkb0) {
            return this.f23674a.equals(((nkb0) obj).f23674a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23674a.hashCode();
    }

    public final String toString() {
        return "SportItem(delegateAction=" + this.f23674a + Separators.RPAREN;
    }
}
