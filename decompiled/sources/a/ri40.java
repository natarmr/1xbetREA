package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ri40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30521a;
    public final String b;
    public final boolean c;

    public ri40(String str, int i, boolean z) {
        str.getClass();
        this.f30521a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri40)) {
            return false;
        }
        ri40 ri40Var = (ri40) obj;
        return this.f30521a == ri40Var.f30521a && Intrinsics.d(this.b, ri40Var.b) && this.c == ri40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f30521a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f30521a, "MlbbGameTeamInfoStatUiModel(icon=", ", value=", this.b, ", active="), this.c, Separators.RPAREN);
    }
}
