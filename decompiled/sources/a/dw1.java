package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dw1 implements fw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw1 f6773a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final n0x j;
    public final n0x k;
    public final n0x l;

    public dw1(bw1 bw1Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, n0x n0xVar, n0x n0xVar2, n0x n0xVar3) {
        ohs0.z(str3, str4, str5, str6, str7);
        str8.getClass();
        this.f6773a = bw1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = n0xVar;
        this.k = n0xVar2;
        this.l = n0xVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1Var = (dw1) obj;
        return this.f6773a == dw1Var.f6773a && this.b.equals(dw1Var.b) && this.c.equals(dw1Var.c) && Intrinsics.d(this.d, dw1Var.d) && Intrinsics.d(this.e, dw1Var.e) && Intrinsics.d(this.f, dw1Var.f) && Intrinsics.d(this.g, dw1Var.g) && Intrinsics.d(this.h, dw1Var.h) && Intrinsics.d(this.i, dw1Var.i) && this.j.equals(dw1Var.j) && this.k.equals(dw1Var.k) && this.l.equals(dw1Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + f140.f(this.k, f140.f(this.j, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f6773a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(statusView=");
        sb.append(this.f6773a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", amount=");
        f140.v(sb, this.c, ", startText=", this.d, ", startCountText=");
        f140.v(sb, this.e, ", endText=", this.f, ", endCountText=");
        f140.v(sb, this.g, ", countDay=", this.h, ", status=");
        sb.append(this.i);
        sb.append(", link=");
        sb.append(this.j);
        sb.append(", linkLeft=");
        sb.append(this.k);
        sb.append(", linkRight=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
