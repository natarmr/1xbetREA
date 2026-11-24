package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tbj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33667a;

    public tbj0(String str) {
        this.f33667a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbj0) && this.f33667a.equals(((tbj0) obj).f33667a);
    }

    public final int hashCode() {
        return this.f33667a.hashCode();
    }

    public final String toString() {
        return kng0.l("CopyTextInBuffer(text=", this.f33667a, Separators.RPAREN);
    }
}
