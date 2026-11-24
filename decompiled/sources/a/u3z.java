package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u3z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35019a;
    public final t3z b;
    public final long c;

    public u3z(long j, t3z t3zVar, long j2) {
        t3zVar.getClass();
        this.f35019a = j;
        this.b = t3zVar;
        this.c = j2;
    }

    public static u3z a(u3z u3zVar, long j) {
        t3z t3zVar = u3zVar.b;
        long j2 = u3zVar.c;
        t3zVar.getClass();
        return new u3z(j, t3zVar, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3z)) {
            return false;
        }
        u3z u3zVar = (u3z) obj;
        return this.f35019a == u3zVar.f35019a && this.b == u3zVar.b && this.c == u3zVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f35019a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchGameScenarioParams(gameId=");
        sb.append(this.f35019a);
        sb.append(", gameConditionType=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", sportId=", Separators.RPAREN);
    }
}
