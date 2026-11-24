package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v030 implements h130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfa0 f36565a;

    public v030(xfa0 xfa0Var) {
        this.f36565a = xfa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v030) && this.f36565a.equals(((v030) obj).f36565a);
    }

    public final int hashCode() {
        return this.f36565a.hashCode();
    }

    public final String toString() {
        return "UpdatePlayersDuelModel(model=" + this.f36565a + Separators.RPAREN;
    }
}
