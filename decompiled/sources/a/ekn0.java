package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ekn0 implements gkn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7961a;

    public ekn0(String str) {
        this.f7961a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekn0) && this.f7961a.equals(((ekn0) obj).f7961a);
    }

    public final int hashCode() {
        return this.f7961a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnErrorMessage(message=", this.f7961a, Separators.RPAREN);
    }
}
