package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ik7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14911a;
    public final String b;
    public final a4x c;
    public final tvw d;
    public final boolean e;

    public ik7(String str, String str2, i4 i4Var, tvw tvwVar, boolean z) {
        i4Var.getClass();
        this.f14911a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = tvwVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik7)) {
            return false;
        }
        ik7 ik7Var = (ik7) obj;
        return this.f14911a.equals(ik7Var.f14911a) && this.b.equals(ik7Var.b) && Intrinsics.d(this.c, ik7Var.c) && this.d.equals(ik7Var.d) && this.e == ik7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cs0.b(this.c, ua80.b(this.f14911a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetSaleInfoUiModel(type=", this.f14911a, ", typeDateNumberTitle=", this.b, ", tagList=");
        sbN.append(this.c);
        sbN.append(", iconBetUiModel=");
        sbN.append(this.d);
        sbN.append(", isLive=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
