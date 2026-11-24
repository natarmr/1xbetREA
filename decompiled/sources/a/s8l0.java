package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31808a;
    public final String b;
    public final r8l0 c;
    public final boolean d;

    public s8l0(long j, String str, r8l0 r8l0Var, boolean z) {
        str.getClass();
        this.f31808a = j;
        this.b = str;
        this.c = r8l0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8l0)) {
            return false;
        }
        s8l0 s8l0Var = (s8l0) obj;
        return this.f31808a == s8l0Var.f31808a && Intrinsics.d(this.b, s8l0Var.b) && this.c.equals(s8l0Var.c) && this.d == s8l0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f31808a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31808a, "SportFilterItemUiModel(filterId=", ", title=", this.b);
        sbO.append(", image=");
        sbO.append(this.c);
        sbO.append(", isSelected=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
