package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10893a;
    public final boolean b;
    public final boolean c;
    public final x1o d;
    public final hq8 e;
    public final a4x f;

    public g94(String str, boolean z, boolean z2, x1o x1oVar, hq8 hq8Var, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f10893a = str;
        this.b = z;
        this.c = z2;
        this.d = x1oVar;
        this.e = hq8Var;
        this.f = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g94)) {
            return false;
        }
        g94 g94Var = (g94) obj;
        return Intrinsics.d(this.f10893a, g94Var.f10893a) && this.b == g94Var.b && this.c == g94Var.c && this.d.equals(g94Var.d) && this.e.equals(g94Var.e) && Intrinsics.d(this.f, g94Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(this.f10893a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("AuthHistoryUiState(headerTitle=", this.f10893a, ", refreshing=", this.b, ", showShimmers=");
        sbU.append(this.c);
        sbU.append(", errorState=");
        sbU.append(this.d);
        sbU.append(", bottomSheetState=");
        sbU.append(this.e);
        sbU.append(", uiItems=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
