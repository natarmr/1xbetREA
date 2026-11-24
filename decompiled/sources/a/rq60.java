package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rq60 implements Serializable {
    public static final qq60 Companion = new qq60();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new fq60(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30917a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;

    public /* synthetic */ rq60(int i, int i2, String str, String str2, boolean z, List list) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, pq60.f27400a.getDescriptor());
            throw null;
        }
        this.f30917a = i2;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq60)) {
            return false;
        }
        rq60 rq60Var = (rq60) obj;
        return this.f30917a == rq60Var.f30917a && Intrinsics.d(this.b, rq60Var.b) && Intrinsics.d(this.c, rq60Var.c) && this.d == rq60Var.d && Intrinsics.d(this.e, rq60Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f30917a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f30917a, "OneXGamesActionResult(id=", ", name=", this.b, ", desc=");
        brm0.C(this.c, ", underMaintenance=", ", fGActionList=", sbR, this.d);
        return dw9.r(sbR, this.e, Separators.RPAREN);
    }

    public rq60(int i, String str, String str2, List list, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f30917a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }
}
