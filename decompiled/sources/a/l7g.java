package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19556a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public l7g(long j, long j2, String str, String str2, String str3, String str4, String str5) {
        this.f19556a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7g)) {
            return false;
        }
        l7g l7gVar = (l7g) obj;
        return this.f19556a.equals(l7gVar.f19556a) && this.b.equals(l7gVar.b) && this.c.equals(l7gVar.c) && this.d.equals(l7gVar.d) && this.e.equals(l7gVar.e) && this.f == l7gVar.f && this.g == l7gVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f19556a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberCalendarEventInfoUiModel(date=", this.f19556a, ", disciplineName=", this.b, ", disciplineIcon=");
        f140.v(sbN, this.c, ", prizePool=", this.d, ", location=");
        defpackage.c.i(sbN, this.f, this.e, ", feedId=");
        return rw2.n(sbN, this.g, ", subSportId=", Separators.RPAREN);
    }
}
