package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ki4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18318a;

    public final boolean equals(Object obj) {
        if (obj instanceof ki4) {
            return this.f18318a.equals(((ki4) obj).f18318a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18318a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPhoneValueChanged(value=", this.f18318a, Separators.RPAREN);
    }
}
