package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ltk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f20633a;
    public final List b;

    public ltk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f20633a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltk0)) {
            return false;
        }
        ltk0 ltk0Var = (ltk0) obj;
        return this.f20633a.equals(ltk0Var.f20633a) && Intrinsics.d(this.b, ltk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20633a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabLolPopularChampionsModel(contentStatus=", this.f20633a, ", content=", this.b, Separators.RPAREN);
    }
}
