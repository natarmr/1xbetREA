package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class syi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vvi0 f33025a;

    public syi0(vvi0 vvi0Var) {
        this.f33025a = vvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syi0) && this.f33025a == ((syi0) obj).f33025a;
    }

    public final int hashCode() {
        return this.f33025a.hashCode();
    }

    public final String toString() {
        return "OnUserLogin(settingDestinationType=" + this.f33025a + Separators.RPAREN;
    }
}
