package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class urt0 extends xrt0 {
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urt0(String str, String str2, String str3) {
        super(str);
        str.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // a.xrt0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urt0)) {
            return false;
        }
        urt0 urt0Var = (urt0) obj;
        return Intrinsics.d(this.b, urt0Var.b) && this.c.equals(urt0Var.c) && Intrinsics.d(this.d, urt0Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(b1j.n("Operator(id=", this.b, ", name=", this.c, ", avatarLink="), this.d, Separators.RPAREN);
    }
}
