package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lxy implements oxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20838a;
    public final nxy b;

    public lxy(long j, nxy nxyVar) {
        nxyVar.getClass();
        this.f20838a = j;
        this.b = nxyVar;
    }

    public static lxy b(lxy lxyVar, nxy nxyVar) {
        long j = lxyVar.f20838a;
        lxyVar.getClass();
        return new lxy(j, nxyVar);
    }

    @Override // a.oxy
    public final long a() {
        return this.b.f24305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxy)) {
            return false;
        }
        lxy lxyVar = (lxy) obj;
        return this.f20838a == lxyVar.f20838a && Intrinsics.d(this.b, lxyVar.b);
    }

    @Override // a.oxy
    public final long getDate() {
        return this.f20838a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f20838a) * 31);
    }

    public final String toString() {
        return "OneXGame(date=" + this.f20838a + ", game=" + this.b + Separators.RPAREN;
    }
}
