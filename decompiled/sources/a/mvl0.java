package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22462a;
    public final String b;
    public final String c;
    public final String d;

    public mvl0(long j, String str, String str2, String str3) {
        this.f22462a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvl0)) {
            return false;
        }
        mvl0 mvl0Var = (mvl0) obj;
        return this.f22462a == mvl0Var.f22462a && this.b.equals(mvl0Var.b) && Intrinsics.d(this.c, mvl0Var.c) && this.d.equals(mvl0Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f22462a) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f22462a, "StadiumCellLUiModel(id=", ", name=", this.b);
        f140.v(sbO, ", info=", this.c, ", image=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
