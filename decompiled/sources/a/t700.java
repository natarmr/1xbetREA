package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t700 extends u700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33443a;

    public t700(String str) {
        this.f33443a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t700) && this.f33443a.equals(((t700) obj).f33443a);
    }

    @Override // a.u700
    public final String h() {
        return this.f33443a;
    }

    public final int hashCode() {
        return this.f33443a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoHeader(description=", this.f33443a, Separators.RPAREN);
    }
}
