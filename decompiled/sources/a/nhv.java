package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nhv {
    public static final lhv Companion = new lhv();
    public static final a8z[] b = {maz.a(wez.f39042a, new ldv(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23553a;

    public /* synthetic */ nhv(int i, List list) {
        if ((i & 1) == 0) {
            this.f23553a = null;
        } else {
            this.f23553a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhv) && Intrinsics.d(this.f23553a, ((nhv) obj).f23553a);
    }

    public final int hashCode() {
        List list = this.f23553a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f23553a, "GroupResponse(options=", Separators.RPAREN);
    }
}
