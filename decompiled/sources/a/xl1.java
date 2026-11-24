package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xl1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41052a;
    public final long b;
    public final String c;
    public final String d;
    public final short e;
    public final List f;
    public final String g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public xl1(int i, long j, long j2, String str, String str2, String str3, List list, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.f41052a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = list;
        this.g = str3;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl1)) {
            return false;
        }
        xl1 xl1Var = (xl1) obj;
        return this.f41052a == xl1Var.f41052a && this.b == xl1Var.b && Intrinsics.d(this.c, xl1Var.c) && this.d.equals(xl1Var.d) && this.e == xl1Var.e && Intrinsics.d(this.f, xl1Var.f) && this.g.equals(xl1Var.g) && this.h == xl1Var.h && this.i == xl1Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + brm0.e(ua80.b(dw9.a(twn.a(this.e, ua80.b(ua80.b(rw2.b(Long.hashCode(this.f41052a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f41052a, "BrandGamesScreen(partitionId=", ", brandId=");
        kng0.z(sbQ, this.b, ", brandName=", this.c);
        axq.s(this.e, ", imgBanner=", this.d, ", subCategoryId=", sbQ);
        sbQ.append(", partitions=");
        sbQ.append(this.f);
        sbQ.append(", description=");
        sbQ.append(this.g);
        w6x.A(", fullInfoEnabled=", ", fromPopularSearch=", sbQ, this.h, this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
