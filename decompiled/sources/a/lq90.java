package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20476a;
    public final boolean b;
    public final String c;

    public lq90(String str, int i, boolean z) {
        str.getClass();
        this.f20476a = i;
        this.b = z;
        this.c = str;
    }

    @Override // a.nq90
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq90)) {
            return false;
        }
        lq90 lq90Var = (lq90) obj;
        return this.f20476a == lq90Var.f20476a && this.b == lq90Var.b && Intrinsics.d(this.c, lq90Var.c);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f20476a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f20476a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(h97.l(this.f20476a, "Region(id=", ", isRecommend=", ", title=", this.b), this.c, Separators.RPAREN);
    }
}
