package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m52 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psv f21200a;
    public final boo0 b;
    public final jmp0 c;
    public final kmp0 d;
    public final kmp0 e;
    public final o4m0 f;

    public m52(psv psvVar, boo0 boo0Var, jmp0 jmp0Var, kmp0 kmp0Var, kmp0 kmp0Var2, o4m0 o4m0Var) {
        this.f21200a = psvVar;
        this.b = boo0Var;
        this.c = jmp0Var;
        this.d = kmp0Var;
        this.e = kmp0Var2;
        this.f = o4m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m52)) {
            return false;
        }
        m52 m52Var = (m52) obj;
        return this.f21200a.equals(m52Var.f21200a) && this.b.equals(m52Var.b) && this.c.equals(m52Var.c) && Intrinsics.d(this.d, m52Var.d) && Intrinsics.d(this.e, m52Var.e) && this.f.equals(m52Var.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "FIFA_STATISTICS_KEY";
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.f21200a.hashCode() - 1704458820) * 31)) * 31)) * 31;
        kmp0 kmp0Var = this.d;
        int iHashCode2 = (iHashCode + (kmp0Var == null ? 0 : kmp0Var.hashCode())) * 31;
        kmp0 kmp0Var2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (kmp0Var2 != null ? kmp0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AllTeamsStatisticsUiModel(key=FIFA_STATISTICS_KEY, header=" + this.f21200a + ", tabs=" + this.b + ", currentTab=" + this.c + ", firstTeamStatistics=" + this.d + ", secondTeamStatistics=" + this.e + ", standings=" + this.f + Separators.RPAREN;
    }
}
