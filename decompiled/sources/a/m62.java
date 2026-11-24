package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21246a;

    public m62(String str) {
        this.f21246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m62) && this.f21246a.equals(((m62) obj).f21246a);
    }

    public final int hashCode() {
        return this.f21246a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChanged(query=", this.f21246a, Separators.RPAREN);
    }
}
