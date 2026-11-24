package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class cwu0 implements ewu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5096a;

    public cwu0(String str) {
        this.f5096a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwu0) && this.f5096a.equals(((cwu0) obj).f5096a);
    }

    public final int hashCode() {
        return this.f5096a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSmsCodeConfirmed(message=", this.f5096a, Separators.RPAREN);
    }
}
