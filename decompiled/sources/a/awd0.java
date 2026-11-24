package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class awd0 implements cwd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1569a;
    public final String b;

    public awd0(long j, String str) {
        this.f1569a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awd0)) {
            return false;
        }
        awd0 awd0Var = (awd0) obj;
        return this.f1569a == awd0Var.f1569a && this.b.equals(awd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f1569a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f1569a, "InfoClick(champId=", ", champName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
