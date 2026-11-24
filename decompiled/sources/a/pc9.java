package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pc9 implements r4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26747a;
    public final String b;
    public final String c;
    public final String d;
    public final eb9 e;
    public final i4 f;

    public pc9(long j, String str, String str2, String str3, eb9 eb9Var, i4 i4Var) {
        i4Var.getClass();
        this.f26747a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = eb9Var;
        this.f = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc9)) {
            return false;
        }
        pc9 pc9Var = (pc9) obj;
        return this.f26747a == pc9Var.f26747a && this.b.equals(pc9Var.b) && this.c.equals(pc9Var.c) && this.d.equals(pc9Var.d) && this.e.equals(pc9Var.e) && Intrinsics.d(this.f, pc9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f26747a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26747a, "BuilderSportCouponUiModel(builderId=", ", title=", this.b);
        f140.v(sbO, ", subTitle=", this.c, ", coefLabel=", this.d);
        sbO.append(", builderCoefficient=");
        sbO.append(this.e);
        sbO.append(", couponItemUiModelList=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
