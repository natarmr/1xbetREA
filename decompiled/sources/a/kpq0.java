package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kpq0 {
    public static final jpq0 Companion = new jpq0();
    public static final a8z[] b = {maz.a(wez.f39042a, new joq0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18687a;

    public /* synthetic */ kpq0(int i, List list) {
        if ((i & 1) == 0) {
            this.f18687a = null;
        } else {
            this.f18687a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpq0) && Intrinsics.d(this.f18687a, ((kpq0) obj).f18687a);
    }

    public final int hashCode() {
        List list = this.f18687a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f18687a, "TirageCategoryResultResponse(categoriesResponseList=", Separators.RPAREN);
    }
}
