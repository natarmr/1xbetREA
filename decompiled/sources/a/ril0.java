package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ril0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30549a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final lel0 g;

    public ril0(long j, String str, String str2, String str3, boolean z, List list, lel0 lel0Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        lel0Var.getClass();
        this.f30549a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = list;
        this.g = lel0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ril0)) {
            return false;
        }
        ril0 ril0Var = (ril0) obj;
        return this.f30549a == ril0Var.f30549a && Intrinsics.d(this.b, ril0Var.b) && Intrinsics.d(this.c, ril0Var.c) && Intrinsics.d(this.d, ril0Var.d) && this.e == ril0Var.e && Intrinsics.d(this.f, ril0Var.f) && Intrinsics.d(this.g, ril0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(brm0.e(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f30549a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30549a, "SportModel(id=", ", name=", this.b);
        f140.v(sbO, ", command=", this.c, ", shortName=", this.d);
        esw0.l(sbO, ", cyber=", this.e, ", subSports=", this.f);
        sbO.append(", sportImageModel=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
