package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class it5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15339a;
    public final List b;

    public it5(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f15339a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it5)) {
            return false;
        }
        it5 it5Var = (it5) obj;
        return Intrinsics.d(this.f15339a, it5Var.f15339a) && Intrinsics.d(this.b, it5Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + dw9.a(this.f15339a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.l("BannersModel(bannerTypes=", ", banners=", this.f15339a, ", ref=1)", this.b);
    }
}
