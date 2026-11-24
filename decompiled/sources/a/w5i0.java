package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class w5i0 {
    public static final t5i0 Companion = new t5i0();
    public static final a8z[] b = {maz.a(wez.f39042a, new igh0(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38587a;

    public /* synthetic */ w5i0(int i, List list) {
        if ((i & 1) == 0) {
            this.f38587a = null;
        } else {
            this.f38587a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5i0) && Intrinsics.d(this.f38587a, ((w5i0) obj).f38587a);
    }

    public final int hashCode() {
        List list = this.f38587a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f38587a, "SelectorResponse(options=", Separators.RPAREN);
    }
}
