package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d470 f36454a;

    public uxq0(d470 d470Var) {
        this.f36454a = d470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxq0) && this.f36454a.equals(((uxq0) obj).f36454a);
    }

    public final int hashCode() {
        return this.f36454a.hashCode();
    }

    public final String toString() {
        return "OneXTape(delegateAction=" + this.f36454a + Separators.RPAREN;
    }
}
