package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rtk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f31083a;
    public final List b;

    public rtk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f31083a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtk0)) {
            return false;
        }
        rtk0 rtk0Var = (rtk0) obj;
        return this.f31083a.equals(rtk0Var.f31083a) && Intrinsics.d(this.b, rtk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31083a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("SpecialEventTabPromotionsStateModel(contentStatus=", this.f31083a, ", content=", this.b, Separators.RPAREN);
    }
}
