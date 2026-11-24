package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zk4 implements bl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44510a;

    public zk4(String str) {
        this.f44510a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk4) && this.f44510a.equals(((zk4) obj).f44510a);
    }

    public final int hashCode() {
        return this.f44510a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f44510a, Separators.RPAREN);
    }
}
