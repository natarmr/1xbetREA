package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21729a;
    public final int b;
    public final long c;
    public final boolean d;
    public final List e;
    public final int f;

    public mg8(int i, int i2, long j, boolean z, List list, int i3) {
        list.getClass();
        this.f21729a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
        this.e = list;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg8)) {
            return false;
        }
        mg8 mg8Var = (mg8) obj;
        return this.f21729a == mg8Var.f21729a && this.b == mg8Var.b && this.c == mg8Var.c && this.d == mg8Var.d && Intrinsics.d(this.e, mg8Var.e) && this.f == mg8Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + dw9.a(brm0.e(rw2.b(twn.a(this.b, Integer.hashCode(this.f21729a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BonusSelectionDefaultStateModel(selectedBonusId=", this.f21729a, ", countryId=", ", currencyId=", this.b);
        hne.t(this.c, ", showRules=", sbT, this.d);
        sbT.append(", bonusInfoModelList=");
        sbT.append(this.e);
        sbT.append(", groupId=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
