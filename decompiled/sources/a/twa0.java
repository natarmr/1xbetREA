package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class twa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34641a;
    public final a4x b;
    public final wul c;
    public final wul d;

    public twa0(i4 i4Var, i4 i4Var2, wul wulVar, wul wulVar2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f34641a = i4Var;
        this.b = i4Var2;
        this.c = wulVar;
        this.d = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twa0)) {
            return false;
        }
        twa0 twa0Var = (twa0) obj;
        return Intrinsics.d(this.f34641a, twa0Var.f34641a) && Intrinsics.d(this.b, twa0Var.b) && this.c.equals(twa0Var.c) && this.d.equals(twa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, cs0.b(this.b, this.f34641a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("PopUpBonusUiState(bannerPresetUiModels=", this.f34641a, ", contentItems=", this.b, ", firstButtonUiModel=");
        sbQ.append(this.c);
        sbQ.append(", secondButtonUiModel=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
