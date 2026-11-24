package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class awp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1586a;
    public final String b;
    public final wul c;
    public final wul d;

    public awp0(String str, String str2, wul wulVar, wul wulVar2) {
        str.getClass();
        str2.getClass();
        this.f1586a = str;
        this.b = str2;
        this.c = wulVar;
        this.d = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awp0)) {
            return false;
        }
        awp0 awp0Var = (awp0) obj;
        return Intrinsics.d(this.f1586a, awp0Var.f1586a) && Intrinsics.d(this.b, awp0Var.b) && this.c.equals(awp0Var.c) && this.d.equals(awp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, ua80.b(this.f1586a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TelegramFailPairBottomSheetUiModel(title=", this.f1586a, ", description=", this.b, ", positiveButton=");
        sbN.append(this.c);
        sbN.append(", negativeButton=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
