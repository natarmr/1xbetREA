package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10434a;
    public final List b;

    public fzz(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f10434a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzz)) {
            return false;
        }
        fzz fzzVar = (fzz) obj;
        return Intrinsics.d(this.f10434a, fzzVar.f10434a) && Intrinsics.d(this.b, fzzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10434a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("LimitsModel(financialLimitModels=", ", timeLimitModels=", this.f10434a, Separators.RPAREN, this.b);
    }
}
