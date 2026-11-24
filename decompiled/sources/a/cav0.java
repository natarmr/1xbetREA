package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4033a;
    public final String b;
    public final boolean c;

    public cav0(String str, String str2, boolean z) {
        str2.getClass();
        this.f4033a = str;
        this.b = str2;
        this.c = z;
    }

    public static cav0 a(cav0 cav0Var, boolean z) {
        String str = cav0Var.f4033a;
        String str2 = cav0Var.b;
        cav0Var.getClass();
        str2.getClass();
        return new cav0(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cav0)) {
            return false;
        }
        cav0 cav0Var = (cav0) obj;
        return this.f4033a.equals(cav0Var.f4033a) && Intrinsics.d(this.b, cav0Var.b) && this.c == cav0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f4033a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("WheelItemUiModel(id=", this.f4033a, ", label=", this.b, ", enabled="), this.c, Separators.RPAREN);
    }
}
