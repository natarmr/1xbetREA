package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class up1 {
    public static final tp1 Companion = new tp1();
    public static final a8z[] b = {maz.a(wez.f39042a, new c51(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36039a;

    public /* synthetic */ up1(int i, List list) {
        if ((i & 1) == 0) {
            this.f36039a = null;
        } else {
            this.f36039a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up1) && Intrinsics.d(this.f36039a, ((up1) obj).f36039a);
    }

    public final int hashCode() {
        List list = this.f36039a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36039a, "AggregatorSortingOptionsResponse(items=", Separators.RPAREN);
    }
}
