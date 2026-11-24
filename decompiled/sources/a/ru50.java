package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ru50 implements uu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31109a;
    public final List b;
    public final int c;
    public final boolean d;

    public ru50(List list, List list2, int i, boolean z) {
        list.getClass();
        list2.getClass();
        this.f31109a = list;
        this.b = list2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru50)) {
            return false;
        }
        ru50 ru50Var = (ru50) obj;
        return Intrinsics.d(this.f31109a, ru50Var.f31109a) && Intrinsics.d(this.b, ru50Var.b) && this.c == ru50Var.c && this.d == ru50Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, dw9.a(this.f31109a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ohs0.k(this.c, ", actionButtonNeeded=", Separators.RPAREN, w6x.t("Content(banners=", ", containers=", this.f31109a, ", currentBannerIndex=", this.b), this.d);
    }
}
