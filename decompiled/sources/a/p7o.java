package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p7o implements r7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5s0 f26515a;

    public p7o(o5s0 o5s0Var) {
        this.f26515a = o5s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7o) && this.f26515a.equals(((p7o) obj).f26515a);
    }

    public final int hashCode() {
        return this.f26515a.hashCode();
    }

    public final String toString() {
        return "OnSocialNetworkClick(item=" + this.f26515a + Separators.RPAREN;
    }
}
