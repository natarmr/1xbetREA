package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e2v0 implements g2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7105a;

    public e2v0(String str) {
        this.f7105a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2v0) && this.f7105a.equals(((e2v0) obj).f7105a);
    }

    public final int hashCode() {
        return this.f7105a.hashCode();
    }

    public final String toString() {
        return kng0.l("ReadyScript(script=", this.f7105a, Separators.RPAREN);
    }
}
