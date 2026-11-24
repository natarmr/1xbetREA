package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class urd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36159a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public urd0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        str5.getClass();
        str7.getClass();
        this.f36159a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urd0)) {
            return false;
        }
        urd0 urd0Var = (urd0) obj;
        return this.f36159a.equals(urd0Var.f36159a) && this.b.equals(urd0Var.b) && this.c.equals(urd0Var.c) && this.d.equals(urd0Var.d) && Intrinsics.d(this.e, urd0Var.e) && this.f.equals(urd0Var.f) && Intrinsics.d(this.g, urd0Var.g) && this.h.equals(urd0Var.h) && this.i.equals(urd0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f36159a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RaceResultModel(pilotName=", this.f36159a, ", countryImage=", this.b, ", teamName=");
        f140.v(sbN, this.c, ", place=", this.d, ", startPosition=");
        f140.v(sbN, this.e, ", laps=", this.f, ", lapTime=");
        f140.v(sbN, this.g, ", pits=", this.h, ", points=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
