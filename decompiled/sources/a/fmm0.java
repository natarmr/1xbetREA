package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fmm0 implements gmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f9791a;
    public final bzm b;
    public final azm c;
    public final String d;
    public final String e;
    public final String f;
    public final wgm g;
    public final wgm h;

    public fmm0(bzm bzmVar, bzm bzmVar2, azm azmVar, String str, String str2, String str3, wgm wgmVar, wgm wgmVar2) {
        q6x q6xVar = q6x.f28221a;
        str.getClass();
        this.f9791a = bzmVar;
        this.b = bzmVar2;
        this.c = azmVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = wgmVar;
        this.h = wgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmm0)) {
            return false;
        }
        fmm0 fmm0Var = (fmm0) obj;
        if (!this.f9791a.equals(fmm0Var.f9791a) || !this.b.equals(fmm0Var.b) || !this.c.equals(fmm0Var.c)) {
            return false;
        }
        q6x q6xVar = q6x.f28221a;
        return Intrinsics.d(this.d, fmm0Var.d) && this.e.equals(fmm0Var.e) && this.f.equals(fmm0Var.f) && this.g.equals(fmm0Var.g) && this.h.equals(fmm0Var.h);
    }

    public final int hashCode() {
        return this.h.f39123a.hashCode() + ((this.g.f39123a.hashCode() + ua80.b(ua80.b(ua80.b((q6x.f28221a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f9791a.hashCode() * 31)) * 29791)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        q6x q6xVar = q6x.f28221a;
        StringBuilder sb = new StringBuilder("TwoPairs(teamOne=");
        sb.append(this.f9791a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", scoreRoundOne=null, scoreRoundTwo=null, scoreResult=");
        sb.append(this.c);
        sb.append(", indicatorState=");
        sb.append(q6xVar);
        sb.append(", info=");
        f140.v(sb, this.d, ", seedingLeft=", this.e, ", seedingRight=");
        sb.append(this.f);
        sb.append(", startResultIndicator=");
        sb.append(this.g);
        sb.append(", endResultIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
