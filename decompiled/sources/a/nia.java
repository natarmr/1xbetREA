package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23574a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final boolean g;

    public nia(long j, long j2, long j3, long j4, long j5, String str, boolean z) {
        this.f23574a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nia)) {
            return false;
        }
        nia niaVar = (nia) obj;
        return this.f23574a == niaVar.f23574a && this.b == niaVar.b && this.c == niaVar.c && this.d == niaVar.d && this.e == niaVar.e && this.f.equals(niaVar.f) && this.g == niaVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f23574a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f23574a, "CardGameNotificationClickUiModel(gameId=", ", mainId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", constId=", this.c, ", sportId=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", subSportId=", this.e, ", matchName=");
        sbQ.append((Object) this.f);
        sbQ.append(", live=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
