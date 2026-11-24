package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qpp0 extends rpp0 {
    public final long e;
    public final long f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpp0(long j, long j2, String str, String str2) {
        super(j, j2, str, str2);
        str.getClass();
        str2.getClass();
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = str2;
    }

    @Override // a.rpp0
    public final long a() {
        return this.e;
    }

    @Override // a.rpp0
    public final String b() {
        return this.g;
    }

    @Override // a.rpp0
    public final long c() {
        return this.f;
    }

    @Override // a.rpp0
    public final String d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpp0)) {
            return false;
        }
        qpp0 qpp0Var = (qpp0) obj;
        return this.e == qpp0Var.e && this.f == qpp0Var.f && Intrinsics.d(this.g, qpp0Var.g) && Intrinsics.d(this.h, qpp0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(rw2.b(Long.hashCode(this.e) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.e, "SingleTeamsModel(teamOneId=", ", teamTwoId=");
        kng0.z(sbQ, this.f, ", teamOneName=", this.g);
        return rw2.o(sbQ, ", teamTwoName=", this.h, Separators.RPAREN);
    }
}
