package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fkt0 {
    public static final bkt0 Companion = new bkt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9710a;
    public final String b;
    public final ekt0 c;

    public /* synthetic */ fkt0(int i, String str, String str2, ekt0 ekt0Var) {
        if ((i & 1) == 0) {
            this.f9710a = null;
        } else {
            this.f9710a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ekt0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkt0)) {
            return false;
        }
        fkt0 fkt0Var = (fkt0) obj;
        return Intrinsics.d(this.f9710a, fkt0Var.f9710a) && Intrinsics.d(this.b, fkt0Var.b) && Intrinsics.d(this.c, fkt0Var.c);
    }

    public final int hashCode() {
        String str = this.f9710a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ekt0 ekt0Var = this.c;
        return iHashCode2 + (ekt0Var != null ? ekt0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UpdateFeedbackRequiredWSEvent(chatId=", this.f9710a, ", dialogId=", this.b, ", previousFeedback=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
