package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class awj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv6 f1577a;
    public final hxo0 b;
    public final knd0 c;
    public final f9x d;
    public final wul e;

    public awj0(zv6 zv6Var, hxo0 hxo0Var, knd0 knd0Var, f9x f9xVar, wul wulVar) {
        this.f1577a = zv6Var;
        this.b = hxo0Var;
        this.c = knd0Var;
        this.d = f9xVar;
        this.e = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awj0)) {
            return false;
        }
        awj0 awj0Var = (awj0) obj;
        return this.f1577a.equals(awj0Var.f1577a) && this.b.equals(awj0Var.b) && Intrinsics.d(this.c, awj0Var.c) && this.d.equals(awj0Var.d) && this.e.equals(awj0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f1577a.hashCode() * 31)) * 31;
        knd0 knd0Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (knd0Var == null ? 0 : knd0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SimpleBetTabUiState(betFieldContentUiState=" + this.f1577a + ", taxesUiState=" + this.b + ", quickBetState=" + this.c + ", infoLineUiState=" + this.d + ", makeBetBtnUiState=" + this.e + Separators.RPAREN;
    }
}
