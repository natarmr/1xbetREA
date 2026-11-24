package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w6k0 implements x6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38627a;

    public w6k0(String str) {
        this.f38627a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6k0) && this.f38627a.equals(((w6k0) obj).f38627a);
    }

    public final int hashCode() {
        return this.f38627a.hashCode();
    }

    public final String toString() {
        return kng0.l("Failed(reason=", this.f38627a, Separators.RPAREN);
    }
}
