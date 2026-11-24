package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zi8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44429a;
    public final List b;

    public zi8(List list, boolean z) {
        list.getClass();
        this.f44429a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi8)) {
            return false;
        }
        zi8 zi8Var = (zi8) obj;
        return this.f44429a == zi8Var.f44429a && Intrinsics.d(this.b, zi8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f44429a) * 31);
    }

    public final String toString() {
        return "BonusesInfoBottomSheetState(isLoading=" + this.f44429a + ", items=" + this.b + Separators.RPAREN;
    }
}
