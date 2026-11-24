package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ayi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1671a;

    public ayi0(String str) {
        this.f1671a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayi0) && this.f1671a.equals(((ayi0) obj).f1671a);
    }

    public final int hashCode() {
        return this.f1671a.hashCode();
    }

    public final String toString() {
        return kng0.l("CheckTestSectionPass(pass=", this.f1671a, Separators.RPAREN);
    }
}
