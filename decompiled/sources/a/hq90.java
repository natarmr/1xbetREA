package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13474a;
    public final boolean b;
    public final String c;
    public final String d;

    public hq90(int i, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f13474a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // a.nq90
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq90)) {
            return false;
        }
        hq90 hq90Var = (hq90) obj;
        return this.f13474a == hq90Var.f13474a && this.b == hq90Var.b && Intrinsics.d(this.c, hq90Var.c) && Intrinsics.d(this.d, hq90Var.d);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f13474a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(brm0.e(Integer.hashCode(this.f13474a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(h97.l(this.f13474a, "Currency(id=", ", isRecommend=", ", title=", this.b), this.c, ", code=", this.d, Separators.RPAREN);
    }
}
