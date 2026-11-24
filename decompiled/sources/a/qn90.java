package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qn90 implements un90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29021a;

    public final boolean equals(Object obj) {
        if (obj instanceof qn90) {
            return this.f29021a.equals(((qn90) obj).f29021a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29021a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPhoneCodeValueChange(phoneCodeValue=", this.f29021a, Separators.RPAREN);
    }
}
