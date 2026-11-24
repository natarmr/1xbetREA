package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ibk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14491a;
    public final String b;
    public final imm c;
    public final mtl d;

    public ibk(String str, String str2, imm immVar, mtl mtlVar) {
        str.getClass();
        str2.getClass();
        this.f14491a = str;
        this.b = str2;
        this.c = immVar;
        this.d = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibk)) {
            return false;
        }
        ibk ibkVar = (ibk) obj;
        return Intrinsics.d(this.f14491a, ibkVar.f14491a) && Intrinsics.d(this.b, ibkVar.b) && this.c.equals(ibkVar.c) && this.d.equals(ibkVar.d);
    }

    public final int hashCode() {
        return this.d.f22376a.hashCode() + h97.a(this.c, ua80.b(this.f14491a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DepositLockScreenUiState(title=", this.f14491a, ", subtitle=", this.b, ", navigationBarUiModel=");
        sbN.append(this.c);
        sbN.append(", bottomBarModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
