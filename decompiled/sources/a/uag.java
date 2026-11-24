package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35326a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final int h;
    public final List i;
    public final String j;
    public final long k;
    public final long l;
    public final long m;
    public final boolean n;

    public uag(long j, long j2, long j3, String str, String str2, String str3, long j4, int i, List list, String str4, long j5, long j6, long j7, boolean z) {
        list.getClass();
        this.f35326a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = j4;
        this.h = i;
        this.i = list;
        this.j = str4;
        this.k = j5;
        this.l = j6;
        this.m = j7;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uag)) {
            return false;
        }
        uag uagVar = (uag) obj;
        return this.f35326a == uagVar.f35326a && this.b == uagVar.b && this.c == uagVar.c && this.d.equals(uagVar.d) && this.e.equals(uagVar.e) && this.f.equals(uagVar.f) && this.g == uagVar.g && this.h == uagVar.h && Intrinsics.d(this.i, uagVar.i) && this.j.equals(uagVar.j) && this.k == uagVar.k && this.l == uagVar.l && this.m == uagVar.m && this.n == uagVar.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + rw2.b(rw2.b(rw2.b(ua80.b(dw9.a(twn.a(this.h, rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f35326a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f35326a, "CyberCalendarTournamentModel(id=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", feedId=", this.c, ", leagueName=");
        f140.v(sbQ, this.d, ", type=", this.e, ", location=");
        defpackage.c.i(sbQ, this.g, this.f, ", prizePool=");
        sbQ.append(", tier=");
        sbQ.append(this.h);
        sbQ.append(", teams=");
        sbQ.append(this.i);
        hne.B(sbQ, ", image=", this.j, ", startTimestamp=");
        sbQ.append(this.k);
        kng0.A(sbQ, ", endTimestamp=", this.l, ", globalId=");
        hne.t(this.m, ", isCurrencySymbolOnLeft=", sbQ, this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
