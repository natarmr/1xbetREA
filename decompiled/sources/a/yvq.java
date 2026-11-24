package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class yvq {
    public static final xvq Companion = new xvq();
    public static final a8z[] b = {maz.a(wez.f39042a, new v9q(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43332a;

    public /* synthetic */ yvq(int i, List list) {
        if ((i & 1) == 0) {
            this.f43332a = null;
        } else {
            this.f43332a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvq) && Intrinsics.d(this.f43332a, ((yvq) obj).f43332a);
    }

    public final int hashCode() {
        List list = this.f43332a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f43332a, "FormResponse(fieldsList=", Separators.RPAREN);
    }
}
