package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f36496a;
    public final bzm b;
    public final azm c;
    public final String d;
    public final String e;
    public final String f;

    public uym(bzm bzmVar, bzm bzmVar2, azm azmVar, String str, String str2, String str3) {
        q6x q6xVar = q6x.f28221a;
        str.getClass();
        this.f36496a = bzmVar;
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
        if (!(obj instanceof uym)) {
            return false;
        }
        uym uymVar = (uym) obj;
        if (!this.f36496a.equals(uymVar.f36496a) || !this.b.equals(uymVar.b) || !this.c.equals(uymVar.c)) {
            return false;
        }
        q6x q6xVar = q6x.f28221a;
        return Intrinsics.d(this.d, uymVar.d) && this.e.equals(uymVar.e) && this.f.equals(uymVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((q6x.f28221a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f36496a.hashCode() * 31)) * 29791)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        q6x q6xVar = q6x.f28221a;
        StringBuilder sb = new StringBuilder("Default(teamOne=");
        sb.append(this.f36496a);
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
