package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w2g0 implements z2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38446a;

    public w2g0(mdm mdmVar) {
        this.f38446a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2g0) && this.f38446a.equals(((w2g0) obj).f38446a);
    }

    public final int hashCode() {
        return this.f38446a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f38446a, Separators.RPAREN);
    }
}
