package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ft5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xs5 f10094a;
    public final ArrayList b;

    public ft5(xs5 xs5Var, ArrayList arrayList) {
        xs5Var.getClass();
        this.f10094a = xs5Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft5)) {
            return false;
        }
        ft5 ft5Var = (ft5) obj;
        return Intrinsics.d(this.f10094a, ft5Var.f10094a) && this.b.equals(ft5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10094a.hashCode() * 31);
    }

    public final String toString() {
        return "BannersCategoryModel(bannerType=" + this.f10094a + ", banners=" + this.b + Separators.RPAREN;
    }
}
