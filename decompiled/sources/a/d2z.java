package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d2z implements f2z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5378a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public d2z(String str, String str2, String str3, String str4, String str5) {
        brm0.B(str2, str4, str5);
        this.f5378a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2z)) {
            return false;
        }
        d2z d2zVar = (d2z) obj;
        return this.f5378a.equals(d2zVar.f5378a) && Intrinsics.d(this.b, d2zVar.b) && this.c.equals(d2zVar.c) && Intrinsics.d(this.d, d2zVar.d) && Intrinsics.d(this.e, d2zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f5378a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HeadToHead(firstTeamIcon=", this.f5378a, ", firstTeamNumberOfWin=", this.b, ", secondTeamIcon=");
        f140.v(sbN, this.c, ", secondTeamNumberOfWin=", this.d, ", overtimesCount=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
