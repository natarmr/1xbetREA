package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vu7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38035a;

    public vu7(String str) {
        this.f38035a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu7) && this.f38035a.equals(((vu7) obj).f38035a);
    }

    public final int hashCode() {
        return this.f38035a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShakeTeams(data=", this.f38035a, Separators.RPAREN);
    }
}
