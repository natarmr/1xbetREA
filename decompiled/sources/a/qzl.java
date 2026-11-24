package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29583a;
    public final long b;
    public final long c;
    public final String d;
    public final uzl e;
    public final tzl f;

    public qzl(long j, long j2, long j3, String str, uzl uzlVar, tzl tzlVar) {
        str.getClass();
        this.f29583a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = uzlVar;
        this.f = tzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzl)) {
            return false;
        }
        qzl qzlVar = (qzl) obj;
        return this.f29583a == qzlVar.f29583a && this.b == qzlVar.b && this.c == qzlVar.c && Intrinsics.d(this.d, qzlVar.d) && this.e == qzlVar.e && this.f.equals(qzlVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(rw2.b(rw2.b(Long.hashCode(this.f29583a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29583a, "DsCompactEventCardBottomBlockModel(gameId=", ", groupId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", betGameId=", this.c, ", marketHeader=");
        sbQ.append(this.d);
        sbQ.append(", favoriteButtonState=");
        sbQ.append(this.e);
        sbQ.append(", bottomBlockType=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
