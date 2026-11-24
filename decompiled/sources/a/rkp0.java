package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30659a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;

    public rkp0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        ohs0.z(str2, str4, str5, str6, str7);
        str8.getClass();
        this.f30659a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkp0)) {
            return false;
        }
        rkp0 rkp0Var = (rkp0) obj;
        if (!this.f30659a.equals(rkp0Var.f30659a) || !Intrinsics.d(this.b, rkp0Var.b) || !this.c.equals(rkp0Var.c) || !Intrinsics.d(this.d, rkp0Var.d) || !Intrinsics.d(this.e, rkp0Var.e) || !Intrinsics.d(this.f, rkp0Var.f) || !Intrinsics.d(this.g, rkp0Var.g) || !Intrinsics.d(this.h, rkp0Var.h)) {
            return false;
        }
        long j = rkp0Var.i;
        int i = y3d.h;
        return h2t0.a(this.i, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f30659a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.i) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.i);
        StringBuilder sbN = b1j.n("TeamSquadFootballPlayerStatisticUiModel(id=", this.f30659a, ", number=", this.b, ", name=");
        f140.v(sbN, this.c, ", age=", this.d, ", games=");
        f140.v(sbN, this.e, ", goals=", this.f, ", redCards=");
        f140.v(sbN, this.g, ", yellowCards=", this.h, ", backgroundColor=");
        return axq.n(sbN, strI, Separators.RPAREN);
    }
}
