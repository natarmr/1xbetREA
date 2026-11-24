package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ems implements ims {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8062a;
    public final long b;
    public final List c;
    public final m9s d;

    public ems(long j, long j2, List list, m9s m9sVar) {
        list.getClass();
        this.f8062a = j;
        this.b = j2;
        this.c = list;
        this.d = m9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ems)) {
            return false;
        }
        ems emsVar = (ems) obj;
        return this.f8062a == emsVar.f8062a && this.b == emsVar.b && Intrinsics.d(this.c, emsVar.c) && this.d.equals(emsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(rw2.b(Long.hashCode(this.f8062a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8062a, "OnSetParams(sportId=", ", subSportId=");
        hne.x(sbQ, this.b, ", favoriteTeams=", this.c);
        sbQ.append(", gameDetails=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
