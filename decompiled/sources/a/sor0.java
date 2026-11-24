package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sor0 {
    public static final qor0 Companion = new qor0();
    public static final a8z[] b = {maz.a(wez.f39042a, new dfr0(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32558a;

    public /* synthetic */ sor0(int i, List list) {
        if ((i & 1) == 0) {
            this.f32558a = null;
        } else {
            this.f32558a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sor0) && Intrinsics.d(this.f32558a, ((sor0) obj).f32558a);
    }

    public final int hashCode() {
        List list = this.f32558a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f32558a, "TotoHistoryResponse(totoHistoryList=", Separators.RPAREN);
    }
}
