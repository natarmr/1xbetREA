package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d9r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5716a;
    public final String b;

    public d9r0(String str, String str2) {
        this.f5716a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9r0)) {
            return false;
        }
        d9r0 d9r0Var = (d9r0) obj;
        return this.f5716a.equals(d9r0Var.f5716a) && this.b.equals(d9r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5716a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TopPlayerStatisticDefaultUiModel(shortTitle=", this.f5716a, ", total=", this.b, Separators.RPAREN);
    }
}
