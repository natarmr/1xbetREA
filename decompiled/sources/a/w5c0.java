package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38576a;
    public final String b;
    public final String c;
    public final m0x d;

    public w5c0(String str, String str2, String str3, m0x m0xVar) {
        str.getClass();
        this.f38576a = str;
        this.b = str2;
        this.c = str3;
        this.d = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5c0)) {
            return false;
        }
        w5c0 w5c0Var = (w5c0) obj;
        return Intrinsics.d(this.f38576a, w5c0Var.f38576a) && Intrinsics.d(this.b, w5c0Var.b) && Intrinsics.d(this.c, w5c0Var.c) && this.d.equals(w5c0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f38576a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(label=", this.f38576a, ", amount=", this.b, ", currency=");
        sbN.append(this.c);
        sbN.append(", image=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
