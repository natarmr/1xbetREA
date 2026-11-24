package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sh7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32198a;
    public final String b;

    public sh7(long j, String str) {
        this.f32198a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh7)) {
            return false;
        }
        sh7 sh7Var = (sh7) obj;
        return this.f32198a == sh7Var.f32198a && this.b.equals(sh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f32198a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32198a, "BetPlayerResult(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
