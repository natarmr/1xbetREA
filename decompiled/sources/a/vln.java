package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vln implements amn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37633a;

    public vln(List list) {
        list.getClass();
        this.f37633a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vln) && Intrinsics.d(this.f37633a, ((vln) obj).f37633a);
    }

    public final int hashCode() {
        return this.f37633a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37633a, "Content(editCouponEventModelsList=", Separators.RPAREN);
    }
}
