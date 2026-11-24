package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e2z implements f2z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7109a;

    public e2z(String str) {
        this.f7109a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2z) && this.f7109a.equals(((e2z) obj).f7109a);
    }

    public final int hashCode() {
        return this.f7109a.hashCode();
    }

    public final String toString() {
        return kng0.l("Team(icon=", this.f7109a, Separators.RPAREN);
    }
}
