package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class yc5 {
    public static final xc5 Companion = new xc5();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o85(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42369a;
    public final List b;

    public /* synthetic */ yc5(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f42369a = null;
        } else {
            this.f42369a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc5)) {
            return false;
        }
        yc5 yc5Var = (yc5) obj;
        return Intrinsics.d(this.f42369a, yc5Var.f42369a) && Intrinsics.d(this.b, yc5Var.b);
    }

    public final int hashCode() {
        String str = this.f42369a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("BackgroundResourcesRulesDataResponse(error=", this.f42369a, ", data=", this.b, Separators.RPAREN);
    }
}
