package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a7c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azc0 f361a;
    public final wyc0 b;
    public final slc0 c;
    public final String d;
    public final wul e;

    public a7c0(azc0 azc0Var, wyc0 wyc0Var, slc0 slc0Var, String str, wul wulVar) {
        wyc0Var.getClass();
        str.getClass();
        this.f361a = azc0Var;
        this.b = wyc0Var;
        this.c = slc0Var;
        this.d = str;
        this.e = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7c0)) {
            return false;
        }
        a7c0 a7c0Var = (a7c0) obj;
        return this.f361a.equals(a7c0Var.f361a) && this.b == a7c0Var.b && this.c.equals(a7c0Var.c) && Intrinsics.d(this.d, a7c0Var.d) && this.e.equals(a7c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f361a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PromoBetTabUiState(promoCodeFieldUiState=" + this.f361a + ", promoCodeStyle=" + this.b + ", promoInfoUiState=" + this.c + ", infoLineText=" + this.d + ", makeBetBtnUiState=" + this.e + Separators.RPAREN;
    }
}
