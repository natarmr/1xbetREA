package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31493a;
    public final u6n b;
    public final String c;
    public final boolean d;

    public s2a0(long j, u6n u6nVar, String str, boolean z) {
        str.getClass();
        this.f31493a = j;
        this.b = u6nVar;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2a0)) {
            return false;
        }
        s2a0 s2a0Var = (s2a0) obj;
        return this.f31493a == s2a0Var.f31493a && this.b.equals(s2a0Var.b) && Intrinsics.d(this.c, s2a0Var.c) && this.d == s2a0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b((this.b.hashCode() + (Long.hashCode(this.f31493a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerDuelTeamMemberUiModel(playerId=");
        sb.append(this.f31493a);
        sb.append(", icon=");
        sb.append(this.b);
        w6x.z(", playerName=", this.c, ", isEnable=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
