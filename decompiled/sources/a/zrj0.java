package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zrj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44857a;
    public final gdp0 b;
    public final gdp0 c;

    public zrj0(ArrayList arrayList, gdp0 gdp0Var, gdp0 gdp0Var2) {
        this.f44857a = arrayList;
        this.b = gdp0Var;
        this.c = gdp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrj0)) {
            return false;
        }
        zrj0 zrj0Var = (zrj0) obj;
        return this.f44857a.equals(zrj0Var.f44857a) && Intrinsics.d(this.b, zrj0Var.b) && Intrinsics.d(this.c, zrj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f44857a.hashCode() * 31;
        gdp0 gdp0Var = this.b;
        int iHashCode2 = (iHashCode + (gdp0Var == null ? 0 : gdp0Var.hashCode())) * 31;
        gdp0 gdp0Var2 = this.c;
        return iHashCode2 + (gdp0Var2 != null ? gdp0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ShortStatisticUiModel(infoList=" + this.f44857a + ", teamOne=" + this.b + ", teamTwo=" + this.c + Separators.RPAREN;
    }
}
