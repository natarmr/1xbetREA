package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41022a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public xka(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, long j, long j2) {
        str2.getClass();
        str5.getClass();
        this.f41022a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xka)) {
            return false;
        }
        xka xkaVar = (xka) obj;
        return this.f41022a.equals(xkaVar.f41022a) && this.b == xkaVar.b && this.c == xkaVar.c && Intrinsics.d(this.d, xkaVar.d) && this.e.equals(xkaVar.e) && this.f.equals(xkaVar.f) && Intrinsics.d(this.g, xkaVar.g) && this.h.equals(xkaVar.h) && this.i.equals(xkaVar.i) && this.j == xkaVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(this.f41022a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CardPeriodModel(timePeriodName=", this.f41022a, ", teamOneId=");
        kng0.A(sbO, ", teamTwoId=", this.c, ", teamOneName=");
        f140.v(sbO, this.d, ", teamOneFirstPlayerImageUrl=", this.e, ", teamOneSecondPlayerImageUrl=");
        f140.v(sbO, this.f, ", teamTwoName=", this.g, ", teamTwoFirstPlayerImageUrl=");
        f140.v(sbO, this.h, ", teamTwoSecondPlayerImageUrl=", this.i, ", hostsVsGuests=");
        return rw2.p(sbO, this.j, Separators.RPAREN);
    }
}
