package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ve2 implements ye2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37261a;

    public ve2(String str) {
        lme0 lme0Var = b9g0.f2207a;
        this.f37261a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve2)) {
            return false;
        }
        lme0 lme0Var = b9g0.f2207a;
        return this.f37261a.equals(((ve2) obj).f37261a);
    }

    public final int hashCode() {
        return this.f37261a.hashCode() + (b9g0.d.hashCode() * 31);
    }

    public final String toString() {
        return "OnQueryChangedFromTab(tab=" + b9g0.d + ", query=" + this.f37261a + Separators.RPAREN;
    }
}
