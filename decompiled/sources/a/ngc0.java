package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ngc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23478a;
    public final q4f b;
    public final int c;

    public ngc0(List list, q4f q4fVar, int i) {
        list.getClass();
        q4fVar.getClass();
        this.f23478a = list;
        this.b = q4fVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngc0)) {
            return false;
        }
        ngc0 ngc0Var = (ngc0) obj;
        return Intrinsics.d(this.f23478a, ngc0Var.f23478a) && this.b == ngc0Var.b && this.c == ngc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vqd.b(this.b, this.f23478a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodesParamsModel(betEvents=");
        sb.append(this.f23478a);
        sb.append(", couponTypeModel=");
        sb.append(this.b);
        sb.append(", vid=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
