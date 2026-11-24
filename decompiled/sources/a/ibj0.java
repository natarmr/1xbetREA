package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ibj0 implements kbj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vvi0 f14490a;

    public final boolean equals(Object obj) {
        if (obj instanceof ibj0) {
            return this.f14490a == ((ibj0) obj).f14490a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14490a.hashCode();
    }

    public final String toString() {
        return "OnUserLogin(settingDestinationType=" + this.f14490a + Separators.RPAREN;
    }
}
