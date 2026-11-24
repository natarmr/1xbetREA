package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class en50 {
    public static final an50 Companion = new an50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8076a;
    public final String b;
    public final dn50 c;

    public /* synthetic */ en50(int i, String str, String str2, dn50 dn50Var) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, zm50.f44608a.getDescriptor());
            throw null;
        }
        this.f8076a = str;
        this.b = str2;
        this.c = dn50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en50)) {
            return false;
        }
        en50 en50Var = (en50) obj;
        return Intrinsics.d(this.f8076a, en50Var.f8076a) && Intrinsics.d(this.b, en50Var.b) && Intrinsics.d(this.c, en50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f8076a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NewPlaceAuthRequest(id=", this.f8076a, ", rt=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public en50(String str, String str2, dn50 dn50Var) {
        str.getClass();
        this.f8076a = str;
        this.b = str2;
        this.c = dn50Var;
    }
}
