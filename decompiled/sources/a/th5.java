package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class th5 implements vh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33946a;

    public final boolean equals(Object obj) {
        if (obj instanceof th5) {
            return this.f33946a.equals(((th5) obj).f33946a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33946a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnTopUpBalanceClick(deviceId=", this.f33946a, Separators.RPAREN);
    }
}
