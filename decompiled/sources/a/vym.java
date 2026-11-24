package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f38255a;
    public final bzm b;
    public final azm c;
    public final String d;
    public final String e;
    public final String f;

    public vym(bzm bzmVar, bzm bzmVar2, azm azmVar, String str, String str2, String str3) {
        q6x q6xVar = q6x.f28221a;
        str.getClass();
        this.f38255a = bzmVar;
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
        if (!(obj instanceof vym)) {
            return false;
        }
        vym vymVar = (vym) obj;
        if (!this.f38255a.equals(vymVar.f38255a) || !this.b.equals(vymVar.b) || !Intrinsics.d(this.c, vymVar.c)) {
            return false;
        }
        q6x q6xVar = q6x.f28221a;
        return Intrinsics.d(this.d, vymVar.d) && this.e.equals(vymVar.e) && this.f.equals(vymVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f38255a.hashCode() * 31)) * 29791;
        azm azmVar = this.c;
        return this.f.hashCode() + ua80.b(ua80.b((q6x.f28221a.hashCode() + ((iHashCode + (azmVar == null ? 0 : azmVar.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        q6x q6xVar = q6x.f28221a;
        StringBuilder sb = new StringBuilder("V3(teamOne=");
        sb.append(this.f38255a);
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
