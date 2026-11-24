package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uup0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36312a;
    public final String b;
    public final String c;
    public final String d;
    public final wul e;
    public final wul f;

    public uup0(String str, String str2, String str3, String str4, wul wulVar, wul wulVar2) {
        cs0.x(str, str2, str3, str4);
        this.f36312a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = wulVar;
        this.f = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uup0)) {
            return false;
        }
        uup0 uup0Var = (uup0) obj;
        return Intrinsics.d(this.f36312a, uup0Var.f36312a) && Intrinsics.d(this.b, uup0Var.b) && Intrinsics.d(this.c, uup0Var.c) && Intrinsics.d(this.d, uup0Var.d) && this.e.equals(uup0Var.e) && this.f.equals(uup0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i8i.a(this.e, ua80.b(ua80.b(ua80.b(this.f36312a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TelegramBonusCodeBottomSheetUiModel(title=", this.f36312a, ", subTitle=", this.b, ", description=");
        f140.v(sbN, this.c, ", code=", this.d, ", positiveButton=");
        sbN.append(this.e);
        sbN.append(", negativeButton=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
