package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lmd0 implements qmd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20290a;

    public lmd0(String str) {
        this.f20290a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmd0) && this.f20290a.equals(((lmd0) obj).f20290a);
    }

    public final int hashCode() {
        return this.f20290a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNotEnoughMoneyDialog(message=", this.f20290a, Separators.RPAREN);
    }
}
