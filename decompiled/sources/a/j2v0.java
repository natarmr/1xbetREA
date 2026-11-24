package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j2v0 implements l2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15802a;

    public j2v0(String str) {
        this.f15802a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2v0) && this.f15802a.equals(((j2v0) obj).f15802a);
    }

    public final int hashCode() {
        return this.f15802a.hashCode();
    }

    public final String toString() {
        return kng0.l("ReadyScript(script=", this.f15802a, Separators.RPAREN);
    }
}
