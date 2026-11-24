package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class esk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8332a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public esk(int i, long j, long j2, String str, String str2, String str3, boolean z, boolean z2) {
        str3.getClass();
        this.f8332a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esk)) {
            return false;
        }
        esk eskVar = (esk) obj;
        return this.f8332a == eskVar.f8332a && this.b == eskVar.b && this.c.equals(eskVar.c) && this.d.equals(eskVar.d) && this.e == eskVar.e && Intrinsics.d(this.f, eskVar.f) && this.g == eskVar.g && this.h == eskVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(ua80.b(twn.a(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f8332a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8332a, "DisciplineDetailsLeaderBoardModel(subSportId=", ", id=");
        kng0.z(sbQ, this.b, ", teamName=", this.c);
        axq.s(this.e, ", teamImage=", this.d, ", place=", sbQ);
        w6x.z(", value=", this.f, ", hasStat=", sbQ, this.g);
        return f140.n(sbQ, ", isCurrencySymbolOnLeft=", this.h, Separators.RPAREN);
    }
}
