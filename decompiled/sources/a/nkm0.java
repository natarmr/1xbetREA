package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nkm0 implements okm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f23687a;
    public final bzm b;
    public final azm c;
    public final String d;
    public final String e;
    public final String f;

    public nkm0(bzm bzmVar, bzm bzmVar2, azm azmVar, String str, String str2, String str3) {
        q6x q6xVar = q6x.f28221a;
        str.getClass();
        this.f23687a = bzmVar;
        this.b = bzmVar2;
        this.c = azmVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkm0)) {
            return false;
        }
        nkm0 nkm0Var = (nkm0) obj;
        if (!this.f23687a.equals(nkm0Var.f23687a) || !this.b.equals(nkm0Var.b) || !this.c.equals(nkm0Var.c)) {
            return false;
        }
        q6x q6xVar = q6x.f28221a;
        return Intrinsics.d(this.d, nkm0Var.d) && this.e.equals(nkm0Var.e) && this.f.equals(nkm0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((q6x.f28221a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f23687a.hashCode() * 31)) * 29791)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        q6x q6xVar = q6x.f28221a;
        StringBuilder sb = new StringBuilder("TwoPairs(teamOne=");
        sb.append(this.f23687a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", scoreRoundOne=null, scoreRoundTwo=null, scoreResult=");
        sb.append(this.c);
        sb.append(", indicatorState=");
        sb.append(q6xVar);
        sb.append(", info=");
        f140.v(sb, this.d, ", seedingLeft=", this.e, ", seedingRight=");
        return axq.n(sb, this.f, Separators.RPAREN);
    }
}
