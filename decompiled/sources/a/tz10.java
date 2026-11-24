package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tz10 implements zz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34784a;

    public tz10(String str) {
        this.f34784a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz10) && this.f34784a.equals(((tz10) obj).f34784a);
    }

    public final int hashCode() {
        return this.f34784a.hashCode();
    }

    public final String toString() {
        return kng0.l("CopyTextInBuffer(text=", this.f34784a, Separators.RPAREN);
    }
}
