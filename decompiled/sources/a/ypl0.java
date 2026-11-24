package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ypl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43037a;
    public final String b;
    public final lel0 c;

    public ypl0(long j, String str, lel0 lel0Var) {
        str.getClass();
        lel0Var.getClass();
        this.f43037a = j;
        this.b = str;
        this.c = lel0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypl0)) {
            return false;
        }
        ypl0 ypl0Var = (ypl0) obj;
        return this.f43037a == ypl0Var.f43037a && Intrinsics.d(this.b, ypl0Var.b) && Intrinsics.d(this.c, ypl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f43037a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43037a, "SportSimpleModel(id=", ", name=", this.b);
        sbO.append(", sportImageModel=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
