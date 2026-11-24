package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c98 {
    public static final b98 Companion = new b98();
    public static final a8z[] b = {maz.a(wez.f39042a, new os7(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3950a;

    public /* synthetic */ c98(int i, List list) {
        if ((i & 1) == 0) {
            this.f3950a = null;
        } else {
            this.f3950a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c98) && Intrinsics.d(this.f3950a, ((c98) obj).f3950a);
    }

    public final int hashCode() {
        List list = this.f3950a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f3950a, "BlockProductResponse(items=", Separators.RPAREN);
    }
}
