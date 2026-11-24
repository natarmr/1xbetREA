package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iy80 implements ly80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15577a;
    public final long b;

    public iy80(String str, long j) {
        this.f15577a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy80)) {
            return false;
        }
        iy80 iy80Var = (iy80) obj;
        return this.f15577a.equals(iy80Var.f15577a) && this.b == iy80Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f15577a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnDisciplineClick(partnerName=", this.f15577a, ", disciplineId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
