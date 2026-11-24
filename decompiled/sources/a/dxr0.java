package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6861a;
    public final zwr0 b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    public dxr0(long j, zwr0 zwr0Var, String str, String str2, long j2, String str3) {
        str.getClass();
        str2.getClass();
        this.f6861a = j;
        this.b = zwr0Var;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxr0)) {
            return false;
        }
        dxr0 dxr0Var = (dxr0) obj;
        if (this.f6861a != dxr0Var.f6861a || this.b != dxr0Var.b || !Intrinsics.d(this.c, dxr0Var.c) || !Intrinsics.d(this.d, dxr0Var.d)) {
            return false;
        }
        long j = dxr0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && this.f.equals(dxr0Var.f);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b((this.b.hashCode() + (Long.hashCode(this.f6861a) * 31)) * 31, 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + rw2.b(iB, 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("TournamentBracketMatchTeamUiModel(teamId=");
        sb.append(this.f6861a);
        sb.append(", selectedType=");
        sb.append(this.b);
        f140.v(sb, ", name=", this.c, ", score=", this.d);
        f140.v(sb, ", textColor=", strI, ", logoUrl=", this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
