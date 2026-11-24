package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ypr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43045a;
    public final xpr0 b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final long h;
    public final long i;

    public ypr0(int i, xpr0 xpr0Var, String str, String str2, int i2, String str3, int i3, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.f43045a = i;
        this.b = xpr0Var;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = str3;
        this.g = i3;
        this.h = j;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypr0)) {
            return false;
        }
        ypr0 ypr0Var = (ypr0) obj;
        return this.f43045a == ypr0Var.f43045a && this.b == ypr0Var.b && Intrinsics.d(this.c, ypr0Var.c) && Intrinsics.d(this.d, ypr0Var.d) && this.e == ypr0Var.e && this.f.equals(ypr0Var.f) && this.g == ypr0Var.g && this.h == ypr0Var.h && this.i == ypr0Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + rw2.b(twn.a(this.g, ua80.b(twn.a(this.e, ua80.b(ua80.b((this.b.hashCode() + (Integer.hashCode(this.f43045a) * 31)) * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoJackpotHistoryItemModel(tiragNumber=");
        sb.append(this.f43045a);
        sb.append(", tiragStatus=");
        sb.append(this.b);
        sb.append(", stringTiragStatus=");
        f140.v(sb, this.c, ", jackpot=", this.d, ", countBets=");
        kng0.w(this.e, ", countVariants=", this.f, ", countUnique=", sb);
        sb.append(this.g);
        sb.append(", timeUntilEndReception=");
        sb.append(this.h);
        return rw2.n(sb, this.i, ", updateDate=", Separators.RPAREN);
    }
}
