package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v7r0 implements w7r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f36944a;

    public v7r0(vbj vbjVar) {
        this.f36944a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7r0) && this.f36944a.equals(((v7r0) obj).f36944a);
    }

    public final int hashCode() {
        return this.f36944a.hashCode();
    }

    public final String toString() {
        return "Balance(state=" + this.f36944a + Separators.RPAREN;
    }
}
