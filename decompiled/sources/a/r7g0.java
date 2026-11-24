package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class r7g0 {
    public static final q7g0 Companion = new q7g0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new j6g0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29974a;
    public final List b;

    public /* synthetic */ r7g0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f29974a = null;
        } else {
            this.f29974a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7g0)) {
            return false;
        }
        r7g0 r7g0Var = (r7g0) obj;
        return Intrinsics.d(this.f29974a, r7g0Var.f29974a) && Intrinsics.d(this.b, r7g0Var.b);
    }

    public final int hashCode() {
        String str = this.f29974a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("ResultsGridResponse(title=", this.f29974a, ", rows=", this.b, Separators.RPAREN);
    }
}
