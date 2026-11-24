package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cpk implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4751a;
    public final String b;

    public cpk(long j, String str) {
        str.getClass();
        this.f4751a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpk)) {
            return false;
        }
        cpk cpkVar = (cpk) obj;
        return this.f4751a == cpkVar.f4751a && Intrinsics.d(this.b, cpkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f4751a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4751a, "OnPartnerTeamClick(teamId=", ", teamName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
