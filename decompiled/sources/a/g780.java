package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g780 implements p780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10805a;

    public final boolean equals(Object obj) {
        if (obj instanceof g780) {
            return this.f10805a.equals(((g780) obj).f10805a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10805a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnChangePhoneNumber(value=", this.f10805a, Separators.RPAREN);
    }
}
