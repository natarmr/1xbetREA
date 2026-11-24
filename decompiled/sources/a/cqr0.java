package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cqr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4811a;
    public final String b;

    public cqr0(String str, ArrayList arrayList) {
        str.getClass();
        this.f4811a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqr0)) {
            return false;
        }
        cqr0 cqr0Var = (cqr0) obj;
        return this.f4811a.equals(cqr0Var.f4811a) && Intrinsics.d(this.b, cqr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4811a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoJackpotHistoryModel(totoHistories=" + this.f4811a + ", currencySymbol=" + this.b + Separators.RPAREN;
    }
}
