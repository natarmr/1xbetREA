package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class f3n0 {
    public static final c3n0 Companion = new c3n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8872a;
    public final String b;
    public final lel0 c;

    public /* synthetic */ f3n0(int i, long j, String str, lel0 lel0Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, b3n0.f1916a.getDescriptor());
            throw null;
        }
        this.f8872a = j;
        this.b = str;
        this.c = lel0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3n0)) {
            return false;
        }
        f3n0 f3n0Var = (f3n0) obj;
        return this.f8872a == f3n0Var.f8872a && Intrinsics.d(this.b, f3n0Var.b) && Intrinsics.d(this.c, f3n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f8872a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8872a, "SubSportModel(subSportId=", ", name=", this.b);
        sbO.append(", sportImageModel=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public f3n0(long j, String str, lel0 lel0Var) {
        str.getClass();
        lel0Var.getClass();
        this.f8872a = j;
        this.b = str;
        this.c = lel0Var;
    }
}
