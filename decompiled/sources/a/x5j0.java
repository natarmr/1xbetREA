package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40321a;
    public final boolean b;
    public final String c;

    public x5j0(String str, boolean z, boolean z2) {
        this.f40321a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5j0)) {
            return false;
        }
        x5j0 x5j0Var = (x5j0) obj;
        return this.f40321a == x5j0Var.f40321a && this.b == x5j0Var.b && this.c.equals(x5j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f40321a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(f140.q("SettingsMakeBetVipBetStateModel(hasSectionEnabled=", ", hasVipBetToggleEnabled=", ", subTitle=", this.f40321a, this.b), this.c, Separators.RPAREN);
    }
}
