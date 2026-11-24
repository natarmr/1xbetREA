package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class iar {
    public static final har Companion = new har();
    public static final a8z[] b = {maz.a(wez.f39042a, new s9r(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14452a;

    public /* synthetic */ iar(int i, List list) {
        if ((i & 1) == 0) {
            this.f14452a = null;
        } else {
            this.f14452a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iar) && Intrinsics.d(this.f14452a, ((iar) obj).f14452a);
    }

    public final int hashCode() {
        List list = this.f14452a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f14452a, "FullDescriptionDataResponse(divisions=", Separators.RPAREN);
    }
}
