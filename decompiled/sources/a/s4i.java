package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31606a;
    public final int b;
    public final Integer c;
    public final boolean d;

    public s4i(String str, int i, Integer num, boolean z, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        num = (i2 & 4) != 0 ? null : num;
        z = (i2 & 8) != 0 ? true : z;
        str.getClass();
        this.f31606a = str;
        this.b = i;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4i)) {
            return false;
        }
        s4i s4iVar = (s4i) obj;
        return Intrinsics.d(this.f31606a, s4iVar.f31606a) && this.b == s4iVar.b && Intrinsics.d(this.c, s4iVar.c) && this.d == s4iVar.d;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f31606a.hashCode() * 31, 31);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "DSTabModel(label=", this.f31606a, ", icon=", ", count=");
        sbP.append(this.c);
        sbP.append(", iconIsTintable=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
