package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w7v0 implements x7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38692a;

    public w7v0(mdm mdmVar) {
        this.f38692a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7v0) && this.f38692a.equals(((w7v0) obj).f38692a);
    }

    public final int hashCode() {
        return this.f38692a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f38692a, Separators.RPAREN);
    }
}
