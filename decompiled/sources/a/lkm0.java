package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lkm0 implements okm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f20207a;
    public final bzm b;
    public final azm c;
    public final String d;
    public final String e;
    public final String f;

    public lkm0(bzm bzmVar, bzm bzmVar2, azm azmVar, String str, String str2, String str3) {
        q6x q6xVar = q6x.f28221a;
        str.getClass();
        this.f20207a = bzmVar;
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
        if (!(obj instanceof lkm0)) {
            return false;
        }
        lkm0 lkm0Var = (lkm0) obj;
        if (!this.f20207a.equals(lkm0Var.f20207a) || !this.b.equals(lkm0Var.b) || !this.c.equals(lkm0Var.c)) {
            return false;
        }
        q6x q6xVar = q6x.f28221a;
        return Intrinsics.d(this.d, lkm0Var.d) && this.e.equals(lkm0Var.e) && this.f.equals(lkm0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((q6x.f28221a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f20207a.hashCode() * 31)) * 29791)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        q6x q6xVar = q6x.f28221a;
        StringBuilder sb = new StringBuilder("Tennis(teamOne=");
        sb.append(this.f20207a);
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
