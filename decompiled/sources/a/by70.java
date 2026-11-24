package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class by70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3403a;
    public final String b;
    public final wul c;
    public final wul d;
    public final boolean e;

    public by70(String str, String str2, wul wulVar, wul wulVar2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f3403a = str;
        this.b = str2;
        this.c = wulVar;
        this.d = wulVar2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by70)) {
            return false;
        }
        by70 by70Var = (by70) obj;
        return Intrinsics.d(this.f3403a, by70Var.f3403a) && Intrinsics.d(this.b, by70Var.b) && this.c.equals(by70Var.c) && this.d.equals(by70Var.d) && this.e == by70Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + i8i.a(this.d, i8i.a(this.c, ua80.b(this.f3403a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OpenTelegramBotBottomSheetUiModel(title=", this.f3403a, ", description=", this.b, ", positiveButtonText=");
        sbN.append(this.c);
        sbN.append(", negativeButtonText=");
        sbN.append(this.d);
        sbN.append(", isLoading=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
