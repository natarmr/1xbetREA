package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qlr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28949a;
    public final String b;

    public qlr0(List list, String str) {
        list.getClass();
        str.getClass();
        this.f28949a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlr0)) {
            return false;
        }
        qlr0 qlr0Var = (qlr0) obj;
        return Intrinsics.d(this.f28949a, qlr0Var.f28949a) && Intrinsics.d(this.b, qlr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28949a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoBetTirageModel(tiragesList=" + this.f28949a + ", currencySymbol=" + this.b + Separators.RPAREN;
    }
}
