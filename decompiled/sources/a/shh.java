package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class shh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32211a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final a4x f;

    public shh(long j, long j2, String str, String str2, int i, a4x a4xVar) {
        a4xVar.getClass();
        this.f32211a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shh)) {
            return false;
        }
        shh shhVar = (shh) obj;
        return this.f32211a == shhVar.f32211a && this.b == shhVar.b && this.c.equals(shhVar.c) && this.d.equals(shhVar.d) && this.e == shhVar.e && Intrinsics.d(this.f, shhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f32211a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32211a, "CyberTeamUiModel(id=", ", feedId=");
        kng0.z(sbQ, this.b, ", teamLogoUrl=", this.c);
        axq.s(this.e, ", teamName=", this.d, ", topBadgeIconRes=", sbQ);
        sbQ.append(", bottomBadgesIconResList=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
