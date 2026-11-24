package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x1z implements y1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40142a;
    public final String b;
    public final String c;
    public final jb30 d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;

    public x1z(String str, String str2, String str3, jb30 jb30Var, String str4, String str5, long j, boolean z) {
        brm0.B(str3, str4, str5);
        this.f40142a = str;
        this.b = str2;
        this.c = str3;
        this.d = jb30Var;
        this.e = str4;
        this.f = str5;
        this.g = j;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1z)) {
            return false;
        }
        x1z x1zVar = (x1z) obj;
        if (!this.f40142a.equals(x1zVar.f40142a) || !this.b.equals(x1zVar.b) || !Intrinsics.d(this.c, x1zVar.c) || !this.d.equals(x1zVar.d) || !Intrinsics.d(this.e, x1zVar.e) || !Intrinsics.d(this.f, x1zVar.f)) {
            return false;
        }
        long j = x1zVar.g;
        int i = y3d.h;
        return h2t0.a(this.g, j) && this.h == x1zVar.h;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b((this.d.hashCode() + ua80.b(ua80.b(this.f40142a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.h) + rw2.b(iB, 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.g);
        StringBuilder sbN = b1j.n("Team(gameId=", this.f40142a, ", teamIcon=", this.b, ", teamName=");
        sbN.append(this.c);
        sbN.append(", matchInfo=");
        sbN.append(this.d);
        sbN.append(", firstTeamScore=");
        f140.v(sbN, this.e, ", secondTeamScore=", this.f, ", scoreBackgroundColor=");
        return defpackage.c.c(strI, ", lastMatch=", Separators.RPAREN, sbN, this.h);
    }
}
