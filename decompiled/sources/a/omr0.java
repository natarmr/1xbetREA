package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class omr0 {
    public static final nmr0 Companion = new nmr0();
    public static final a8z[] b = {maz.a(wez.f39042a, new dfr0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25517a;

    public /* synthetic */ omr0(int i, List list) {
        if ((i & 1) == 0) {
            this.f25517a = null;
        } else {
            this.f25517a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omr0) && Intrinsics.d(this.f25517a, ((omr0) obj).f25517a);
    }

    public final int hashCode() {
        List list = this.f25517a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25517a, "TotoBetTypeResponse(totoTypes=", Separators.RPAREN);
    }
}
