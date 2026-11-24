package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sms implements ans {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32462a;

    public sms(String str) {
        this.f32462a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sms) && this.f32462a.equals(((sms) obj).f32462a);
    }

    public final int hashCode() {
        return this.f32462a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBackClick(screenName=", this.f32462a, Separators.RPAREN);
    }
}
