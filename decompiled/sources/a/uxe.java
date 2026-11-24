package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class uxe implements aye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36437a;

    public uxe(String str) {
        this.f36437a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxe) && this.f36437a.equals(((uxe) obj).f36437a);
    }

    public final int hashCode() {
        return this.f36437a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(systemTypeText=", this.f36437a, Separators.RPAREN);
    }
}
