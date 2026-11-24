package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dod0 implements jod0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6410a;

    public dod0(String str) {
        this.f6410a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dod0) && this.f6410a.equals(((dod0) obj).f6410a);
    }

    public final int hashCode() {
        return this.f6410a.hashCode();
    }

    public final String toString() {
        return kng0.l("SetErrorText(message=", this.f6410a, Separators.RPAREN);
    }
}
