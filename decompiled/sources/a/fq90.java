package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9963a;
    public final boolean b;
    public final String c;

    public fq90(String str, int i, boolean z) {
        str.getClass();
        this.f9963a = i;
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
        if (!(obj instanceof fq90)) {
            return false;
        }
        fq90 fq90Var = (fq90) obj;
        return this.f9963a == fq90Var.f9963a && this.b == fq90Var.b && Intrinsics.d(this.c, fq90Var.c);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f9963a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f9963a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(h97.l(this.f9963a, "City(id=", ", isRecommend=", ", title=", this.b), this.c, Separators.RPAREN);
    }
}
