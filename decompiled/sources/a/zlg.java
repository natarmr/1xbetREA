package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zlg implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44580a;
    public final String b;
    public final String c;

    public zlg(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f44580a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlg)) {
            return false;
        }
        zlg zlgVar = (zlg) obj;
        return Intrinsics.d(this.f44580a, zlgVar.f44580a) && Intrinsics.d(this.b, zlgVar.b) && Intrinsics.d(this.c, zlgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f44580a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("CyberDicePlayerRoundUiModel(diceOneValue=", this.f44580a, ", diceTwoValue=", this.b, ", roundScore="), this.c, Separators.RPAREN);
    }
}
