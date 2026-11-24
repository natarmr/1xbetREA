package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o0h implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24423a;
    public final long b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final a4x h;

    public o0h(long j, long j2, long j3, boolean z, String str, String str2, String str3, a4x a4xVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        a4xVar.getClass();
        this.f24423a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0h)) {
            return false;
        }
        o0h o0hVar = (o0h) obj;
        return this.f24423a == o0hVar.f24423a && this.b == o0hVar.b && this.c == o0hVar.c && this.d == o0hVar.d && Intrinsics.d(this.e, o0hVar.e) && Intrinsics.d(this.f, o0hVar.f) && Intrinsics.d(this.g, o0hVar.g) && Intrinsics.d(this.h, o0hVar.h);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return Long.valueOf(this.f24423a);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f24423a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f24423a, "CyberGroupUiModel(key=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", feedId=", this.c, ", isLastItem=");
        f140.s(", teamNumber=", this.e, ", teamIconUrl=", sbQ, this.d);
        f140.v(sbQ, this.f, ", teamName=", this.g, ", reversedTeamParameters=");
        return cs0.n(sbQ, this.h, Separators.RPAREN);
    }
}
