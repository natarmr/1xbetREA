package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rrh0 {
    public static final qrh0 Companion = new qrh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final urh0 f30984a;
    public final urh0 b;
    public final urh0 c;
    public final urh0 d;
    public final urh0 e;
    public final urh0 f;

    public /* synthetic */ rrh0(int i, urh0 urh0Var, urh0 urh0Var2, urh0 urh0Var3, urh0 urh0Var4, urh0 urh0Var5, urh0 urh0Var6) {
        if ((i & 1) == 0) {
            this.f30984a = null;
        } else {
            this.f30984a = urh0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = urh0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = urh0Var3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = urh0Var4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = urh0Var5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = urh0Var6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrh0)) {
            return false;
        }
        rrh0 rrh0Var = (rrh0) obj;
        return Intrinsics.d(this.f30984a, rrh0Var.f30984a) && Intrinsics.d(this.b, rrh0Var.b) && Intrinsics.d(this.c, rrh0Var.c) && Intrinsics.d(this.d, rrh0Var.d) && Intrinsics.d(this.e, rrh0Var.e) && Intrinsics.d(this.f, rrh0Var.f);
    }

    public final int hashCode() {
        urh0 urh0Var = this.f30984a;
        int iHashCode = (urh0Var == null ? 0 : urh0Var.hashCode()) * 31;
        urh0 urh0Var2 = this.b;
        int iHashCode2 = (iHashCode + (urh0Var2 == null ? 0 : urh0Var2.hashCode())) * 31;
        urh0 urh0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (urh0Var3 == null ? 0 : urh0Var3.hashCode())) * 31;
        urh0 urh0Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (urh0Var4 == null ? 0 : urh0Var4.hashCode())) * 31;
        urh0 urh0Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (urh0Var5 == null ? 0 : urh0Var5.hashCode())) * 31;
        urh0 urh0Var6 = this.f;
        return iHashCode5 + (urh0Var6 != null ? urh0Var6.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSecurityItemResponse(phone=" + this.f30984a + ", changePass=" + this.b + ", secretQuestion=" + this.c + ", twoFA=" + this.d + ", personalData=" + this.e + ", offAuthEmail=" + this.f + Separators.RPAREN;
    }
}
