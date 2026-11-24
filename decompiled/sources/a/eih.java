package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7859a;
    public final long b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;

    public eih(long j, long j2, String str, String str2, String str3, ArrayList arrayList) {
        str2.getClass();
        str3.getClass();
        this.f7859a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = arrayList;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eih)) {
            return false;
        }
        eih eihVar = (eih) obj;
        return this.f7859a == eihVar.f7859a && this.b == eihVar.b && this.c.equals(eihVar.c) && Intrinsics.d(this.d, eihVar.d) && this.e.equals(eihVar.e) && Intrinsics.d(this.f, eihVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.g(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f7859a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f7859a, "CyberTopEventsModel(sportId=", ", subSportId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        sbQ.append(", smallImage=");
        sbQ.append(this.d);
        sbQ.append(", gameEvents=");
        sbQ.append(this.e);
        return rw2.o(sbQ, ", champImageUrl=", this.f, Separators.RPAREN);
    }
}
