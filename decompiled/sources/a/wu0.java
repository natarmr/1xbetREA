package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39768a;
    public final boolean b;
    public final List c;

    public wu0(String str, List list, boolean z) {
        list.getClass();
        this.f39768a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0)) {
            return false;
        }
        wu0 wu0Var = (wu0) obj;
        return this.f39768a.equals(wu0Var.f39768a) && this.b == wu0Var.b && Intrinsics.d(this.c, wu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f39768a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(brm0.u("AggregatorGameModePickerStateModel(title=", this.f39768a, ", isAuth=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}
