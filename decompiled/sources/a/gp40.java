package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gp40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f11666a;
    public final pcq b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final boolean i;

    public gp40(xrz xrzVar, pcq pcqVar, boolean z, String str, boolean z2, int i, int i2, long j, boolean z3) {
        xrzVar.getClass();
        this.f11666a = xrzVar;
        this.b = pcqVar;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = z3;
    }

    public static gp40 a(gp40 gp40Var, pcq pcqVar, boolean z, String str, int i, int i2, long j, boolean z2, int i3) {
        xrz xrzVar = gp40Var.f11666a;
        if ((i3 & 2) != 0) {
            pcqVar = gp40Var.b;
        }
        pcq pcqVar2 = pcqVar;
        if ((i3 & 4) != 0) {
            z = gp40Var.c;
        }
        boolean z3 = z;
        String str2 = (i3 & 8) != 0 ? gp40Var.d : str;
        boolean z4 = (i3 & 16) != 0 ? gp40Var.e : true;
        int i4 = (i3 & 32) != 0 ? gp40Var.f : i;
        int i5 = (i3 & 64) != 0 ? gp40Var.g : i2;
        long j2 = (i3 & 128) != 0 ? gp40Var.h : j;
        boolean z5 = (i3 & 256) != 0 ? gp40Var.i : z2;
        gp40Var.getClass();
        xrzVar.getClass();
        str2.getClass();
        return new gp40(xrzVar, pcqVar2, z3, str2, z4, i4, i5, j2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp40)) {
            return false;
        }
        gp40 gp40Var = (gp40) obj;
        return Intrinsics.d(this.f11666a, gp40Var.f11666a) && Intrinsics.d(this.b, gp40Var.b) && this.c == gp40Var.c && this.d.equals(gp40Var.d) && this.e == gp40Var.e && this.f == gp40Var.f && this.g == gp40Var.g && this.h == gp40Var.h && this.i == gp40Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.f11666a.hashCode() * 31;
        pcq pcqVar = this.b;
        return Boolean.hashCode(this.i) + rw2.b(twn.a(this.g, twn.a(this.f, brm0.e(ua80.b(brm0.e((iHashCode + (pcqVar == null ? 0 : pcqVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyLimitRsState(limitType=");
        sb.append(this.f11666a);
        sb.append(", limitModel=");
        sb.append(this.b);
        sb.append(", isLoading=");
        f140.s(", textFieldError=", this.d, ", hasErrorWhileLoadingLimits=", sb, this.c);
        ua80.q(this.f, ", initialValueIndex=", ", selectedValueIndex=", sb, this.e);
        sb.append(this.g);
        sb.append(", inputValue=");
        sb.append(this.h);
        return f140.n(sb, ", exitAfterErrorDialog=", this.i, Separators.RPAREN);
    }
}
