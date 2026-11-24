package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bmr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2851a;
    public final List b;

    public bmr0(String str, List list) {
        str.getClass();
        list.getClass();
        this.f2851a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmr0)) {
            return false;
        }
        bmr0 bmr0Var = (bmr0) obj;
        return Intrinsics.d(this.f2851a, bmr0Var.f2851a) && Intrinsics.d(this.b, bmr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2851a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("TotoBetTypeBottomSheetState(title=", this.f2851a, ", totoBetTypeModelList=", this.b, Separators.RPAREN);
    }
}
