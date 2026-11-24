package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z860 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43952a;
    public final int b;
    public final List c;

    public z860(int i, int i2, List list) {
        list.getClass();
        this.f43952a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z860)) {
            return false;
        }
        z860 z860Var = (z860) obj;
        return this.f43952a == z860Var.f43952a && this.b == z860Var.b && Intrinsics.d(this.c, z860Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f43952a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("NumberPickerUiModel(min=", this.f43952a, ", max=", ", displayedList=", this.b), this.c, Separators.RPAREN);
    }
}
