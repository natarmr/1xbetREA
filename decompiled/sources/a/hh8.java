package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hh8 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13049a;
    public final String b;
    public final rqm c;

    public hh8(int i, String str, rqm rqmVar) {
        str.getClass();
        this.f13049a = i;
        this.b = str;
        this.c = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh8)) {
            return false;
        }
        hh8 hh8Var = (hh8) obj;
        return this.f13049a == hh8Var.f13049a && Intrinsics.d(this.b, hh8Var.b) && this.c.equals(hh8Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return f140.i(this.f13049a, this.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f13049a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f13049a, "BonusUiModel(bonusId=", ", title=", this.b, ", cellStyle=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
