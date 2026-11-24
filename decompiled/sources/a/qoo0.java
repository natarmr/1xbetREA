package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qoo0 extends soo0 {
    public final String c;
    public final String d;
    public final sso0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoo0(String str, String str2, sso0 sso0Var) {
        super(str, sso0Var);
        str.getClass();
        str2.getClass();
        this.c = str;
        this.d = str2;
        this.e = sso0Var;
    }

    @Override // a.uoo0
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoo0)) {
            return false;
        }
        qoo0 qoo0Var = (qoo0) obj;
        return Intrinsics.d(this.c, qoo0Var.c) && Intrinsics.d(this.d, qoo0Var.d) && Intrinsics.d(this.e, qoo0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Promo(tagNamePromo=", this.c, ", tagKey=", this.d, ", tagStyleType=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
