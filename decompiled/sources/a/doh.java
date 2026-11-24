package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class doh implements foh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6415a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;

    public doh(long j, n0x n0xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        ohs0.z(str, str3, str4, str5, str6);
        brm0.B(str7, str8, str9);
        this.f6415a = j;
        this.b = n0xVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = z;
    }

    @Override // a.foh
    public final String a() {
        return this.c;
    }

    @Override // a.foh
    public final String b() {
        return this.d;
    }

    @Override // a.foh
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doh)) {
            return false;
        }
        doh dohVar = (doh) obj;
        return this.f6415a == dohVar.f6415a && this.b.equals(dohVar.b) && Intrinsics.d(this.c, dohVar.c) && this.d.equals(dohVar.d) && Intrinsics.d(this.e, dohVar.e) && Intrinsics.d(this.f, dohVar.f) && Intrinsics.d(this.g, dohVar.g) && Intrinsics.d(this.h, dohVar.h) && Intrinsics.d(this.i, dohVar.i) && Intrinsics.d(this.j, dohVar.j) && Intrinsics.d(this.k, dohVar.k) && this.l == dohVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(f140.f(this.b, Long.hashCode(this.f6415a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Inert(id=");
        sb.append(this.f6415a);
        sb.append(", fighterPicture=");
        sb.append(this.b);
        f140.v(sb, ", categoryLabel=", this.c, ", fighterNameLabel=", this.d);
        f140.v(sb, ", championLabel=", this.e, ", winLabel=", this.f);
        f140.v(sb, ", numberOfWin=", this.g, ", loseLabel=", this.h);
        f140.v(sb, ", numberOfLose=", this.i, ", drawLabel=", this.j);
        w6x.z(", numberOfDraw=", this.k, ", showStatistics=", sb, this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
