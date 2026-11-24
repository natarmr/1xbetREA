package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uc0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35407a;
    public final long b;
    public final String c;
    public final String d;
    public final short e;
    public final boolean f;
    public final List g;
    public final String h;
    public final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public uc0(int i, long j, long j2, String str, String str2, String str3, List list, boolean z, boolean z2) {
        gz8 gz8Var = gz8.f12169a;
        str.getClass();
        list.getClass();
        this.f35407a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.g = list;
        this.h = str3;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        if (this.f35407a != uc0Var.f35407a || this.b != uc0Var.b || !Intrinsics.d(this.c, uc0Var.c) || !Intrinsics.d(this.d, uc0Var.d) || this.e != uc0Var.e || this.f != uc0Var.f) {
            return false;
        }
        gz8 gz8Var = gz8.f12169a;
        return Intrinsics.d(this.g, uc0Var.g) && this.h.equals(uc0Var.h) && this.i == uc0Var.i;
    }

    public final int hashCode() {
        int iB = ua80.b(rw2.b(Long.hashCode(this.f35407a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.i) + ua80.b(dw9.a((gz8.f12169a.hashCode() + brm0.e(twn.a(this.e, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        gz8 gz8Var = gz8.f12169a;
        StringBuilder sbQ = kng0.q(this.f35407a, "AggregatorBrandItemModel(partitionId=", ", brandId=");
        kng0.z(sbQ, this.b, ", brandName=", this.c);
        axq.s(this.e, ", imgBanner=", this.d, ", subCategoryId=", sbQ);
        sbQ.append(", hasAggregatorBrandsFullInfo=");
        sbQ.append(this.f);
        sbQ.append(", viewType=");
        sbQ.append(gz8Var);
        sbQ.append(", partitions=");
        sbQ.append(this.g);
        sbQ.append(", description=");
        sbQ.append(this.h);
        return f140.n(sbQ, ", fromPopularSearch=", this.i, Separators.RPAREN);
    }
}
