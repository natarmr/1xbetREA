package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9516a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;

    public fgx(List list, long j, long j2, String str, String str2, String str3, long j3, long j4) {
        list.getClass();
        str3.getClass();
        this.f9516a = list;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgx)) {
            return false;
        }
        fgx fgxVar = (fgx) obj;
        return Intrinsics.d(this.f9516a, fgxVar.f9516a) && this.b == fgxVar.b && this.c == fgxVar.c && this.d.equals(fgxVar.d) && this.e.equals(fgxVar.e) && Intrinsics.d(this.f, fgxVar.f) && this.g == fgxVar.g && this.h == fgxVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + rw2.b(brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(this.f9516a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, false), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightGroupModel(bets=");
        sb.append(this.f9516a);
        sb.append(", id=");
        sb.append(this.b);
        kng0.A(sb, ", subGameId=", this.c, ", subGameName=");
        f140.v(sb, this.d, ", title=", this.e, ", appBonusLabel=");
        defpackage.c.i(sb, this.g, this.f, ", live=false, gameId=");
        return rw2.n(sb, this.h, ", sportId=", Separators.RPAREN);
    }
}
