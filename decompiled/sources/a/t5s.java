package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t5s implements v5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33383a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final long e;
    public final String f;
    public final boolean g;
    public final m9s h;

    public t5s(boolean z, boolean z2, long j, boolean z3, long j2, String str, boolean z4, m9s m9sVar) {
        str.getClass();
        m9sVar.getClass();
        this.f33383a = z;
        this.b = z2;
        this.c = j;
        this.d = z3;
        this.e = j2;
        this.f = str;
        this.g = z4;
        this.h = m9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5s)) {
            return false;
        }
        t5s t5sVar = (t5s) obj;
        return this.f33383a == t5sVar.f33383a && this.b == t5sVar.b && this.c == t5sVar.c && this.d == t5sVar.d && this.e == t5sVar.e && Intrinsics.d(this.f, t5sVar.f) && this.g == t5sVar.g && Intrinsics.d(this.h, t5sVar.h);
    }

    public final int hashCode() {
        return (this.h.hashCode() + brm0.e(ua80.b(rw2.b(brm0.e(rw2.b(brm0.e(Boolean.hashCode(this.f33383a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Success(hasHeader=", ", hasStatistics=", ", gameId=", this.f33383a, this.b);
        hne.t(this.c, ", live=", sbQ, this.d);
        kng0.A(sbQ, ", champId=", this.e, ", champName=");
        brm0.C(this.f, ", hasMarkets=", ", gameDetails=", sbQ, this.g);
        sbQ.append(this.h);
        sbQ.append(", video=null)");
        return sbQ.toString();
    }
}
