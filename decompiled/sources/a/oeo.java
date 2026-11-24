package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25133a;
    public final long b;
    public final String c;
    public final int d;
    public final boolean e;
    public final int f;
    public final gho g;
    public final ArrayList h;

    public oeo(long j, long j2, String str, int i, boolean z, int i2, gho ghoVar, ArrayList arrayList) {
        str.getClass();
        this.f25133a = j;
        this.b = j2;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = ghoVar;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeo)) {
            return false;
        }
        oeo oeoVar = (oeo) obj;
        return this.f25133a == oeoVar.f25133a && this.b == oeoVar.b && Intrinsics.d(this.c, oeoVar.c) && this.d == oeoVar.d && this.e == oeoVar.e && this.f == oeoVar.f && this.g == oeoVar.g && this.h.equals(oeoVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, brm0.e(twn.a(this.d, ua80.b(rw2.b(Long.hashCode(this.f25133a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25133a, "EventMarketsGroupModel(sportId=", ", groupId=");
        kng0.z(sbQ, this.b, ", groupName=", this.c);
        dw9.v(this.d, ", columnCount=", ", isPinned=", sbQ, this.e);
        sbQ.append(", columnsCount=");
        sbQ.append(this.f);
        sbQ.append(", eventSpecialBetType=");
        sbQ.append(this.g);
        sbQ.append(", eventMarketModelsList=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
