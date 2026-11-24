package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class z6w extends ipm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sba0 f43890a;
    public final huo0 b;
    public final suo0 c;
    public final Date d;
    public final String e;
    public final long f;
    public final String g;
    public final wuo0 h;
    public final tba0 i;
    public final double j;

    public z6w(sba0 sba0Var, huo0 huo0Var, suo0 suo0Var, Date date, String str, long j, String str2, wuo0 wuo0Var, tba0 tba0Var, double d) {
        this.f43890a = sba0Var;
        this.b = huo0Var;
        this.c = suo0Var;
        this.d = date;
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = wuo0Var;
        this.i = tba0Var;
        this.j = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6w)) {
            return false;
        }
        z6w z6wVar = (z6w) obj;
        return this.f43890a == z6wVar.f43890a && this.b.equals(z6wVar.b) && this.c.equals(z6wVar.c) && this.d.equals(z6wVar.d) && this.e.equals(z6wVar.e) && this.f == z6wVar.f && this.g.equals(z6wVar.g) && this.h == z6wVar.h && this.i == z6wVar.i && Double.compare(this.j, z6wVar.j) == 0;
    }

    @Override // a.ipm0
    public final huo0 h() {
        return this.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ua80.b(rw2.b(ua80.b(brm0.i(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f43890a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31);
    }

    @Override // a.ipm0
    public final sba0 j() {
        return this.f43890a;
    }

    @Override // a.ipm0
    public final suo0 k() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryTaskModel(kind=");
        sb.append(this.f43890a);
        sb.append(", condition=");
        sb.append(this.b);
        sb.append(", prize=");
        sb.append(this.c);
        sb.append(", dtPlayerStart=");
        sb.append(this.d);
        sb.append(", dtPlayerCompleted=");
        defpackage.c.i(sb, this.f, this.e, ", id=");
        sb.append(", name=");
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(", percentCompleted=");
        return axq.l(sb, this.j, Separators.RPAREN);
    }
}
