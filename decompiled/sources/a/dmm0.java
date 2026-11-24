package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dmm0 implements gmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f6328a;
    public final bzm b;
    public final azm c;
    public final String d;
    public final String e;
    public final String f;
    public final wgm g;
    public final wgm h;

    public dmm0(bzm bzmVar, bzm bzmVar2, azm azmVar, String str, String str2, String str3, wgm wgmVar, wgm wgmVar2) {
        q6x q6xVar = q6x.f28221a;
        str.getClass();
        this.f6328a = bzmVar;
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
        if (!(obj instanceof dmm0)) {
            return false;
        }
        dmm0 dmm0Var = (dmm0) obj;
        if (!this.f6328a.equals(dmm0Var.f6328a) || !this.b.equals(dmm0Var.b) || !this.c.equals(dmm0Var.c)) {
            return false;
        }
        q6x q6xVar = q6x.f28221a;
        return Intrinsics.d(this.d, dmm0Var.d) && this.e.equals(dmm0Var.e) && this.f.equals(dmm0Var.f) && this.g.equals(dmm0Var.g) && this.h.equals(dmm0Var.h);
    }

    public final int hashCode() {
        return this.h.f39123a.hashCode() + ((this.g.f39123a.hashCode() + ua80.b(ua80.b(ua80.b((q6x.f28221a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f6328a.hashCode() * 31)) * 29791)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        q6x q6xVar = q6x.f28221a;
        StringBuilder sb = new StringBuilder("Tennis(teamOne=");
        sb.append(this.f6328a);
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
