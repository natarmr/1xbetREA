package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ng8 implements pg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23472a;
    public final String b;
    public final boolean c;
    public final rqm d;

    public ng8(int i, String str, boolean z, rqm rqmVar) {
        str.getClass();
        this.f23472a = i;
        this.b = str;
        this.c = z;
        this.d = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng8)) {
            return false;
        }
        ng8 ng8Var = (ng8) obj;
        return this.f23472a == ng8Var.f23472a && Intrinsics.d(this.b, ng8Var.b) && this.c == ng8Var.c && this.d.equals(ng8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Integer.hashCode(this.f23472a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f23472a, "Bonus(bonusId=", ", bonusName=", this.b, ", showDivider=");
        sbR.append(this.c);
        sbR.append(", cellStyle=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
