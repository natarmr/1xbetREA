package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogs f35562a;
    public final d480 b;
    public final j43 c;
    public final String d;

    public uf40(ogs ogsVar, d480 d480Var, j43 j43Var, String str) {
        this.f35562a = ogsVar;
        this.b = d480Var;
        this.c = j43Var;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof uf40) {
                uf40 uf40Var = (uf40) obj;
                if (this.f35562a.equals(uf40Var.f35562a) && this.b.equals(uf40Var.b) && Intrinsics.d(this.c, uf40Var.c)) {
                    String str = uf40Var.d;
                    String str2 = this.d;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (!zEquals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f35562a.hashCode() * 31)) * 31;
        j43 j43Var = this.c;
        int iHashCode2 = (iHashCode + (j43Var == null ? 0 : j43Var.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.d;
        return "MiddleLaneUiModel(gameInfoUiModel=" + this.f35562a + ", opponentsUiModel=" + this.b + ", animatedCoefficientModel=" + this.c + ", autoSubUiModel=" + (str == null ? "null" : c15.a(str)) + Separators.RPAREN;
    }
}
