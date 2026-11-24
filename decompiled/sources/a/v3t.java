package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v3t implements w3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36746a;
    public final String b;
    public final csr c;

    public v3t(long j, csr csrVar, String str) {
        csrVar.getClass();
        this.f36746a = j;
        this.b = str;
        this.c = csrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3t)) {
            return false;
        }
        v3t v3tVar = (v3t) obj;
        return this.f36746a == v3tVar.f36746a && Intrinsics.d(this.b, v3tVar.b) && Intrinsics.d(this.c, v3tVar.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f36746a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36746a, "Games(gameId=", ", sessionId=", this.b);
        sbO.append(", activeBonus=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
