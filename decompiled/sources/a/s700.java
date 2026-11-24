package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s700 extends u700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31727a;

    public s700(String str) {
        this.f31727a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s700) && this.f31727a.equals(((s700) obj).f31727a);
    }

    @Override // a.u700
    public final String h() {
        return this.f31727a;
    }

    public final int hashCode() {
        return this.f31727a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneHeader(description=", this.f31727a, Separators.RPAREN);
    }
}
