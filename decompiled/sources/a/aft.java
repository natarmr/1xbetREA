package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class aft {
    public static final zet Companion = new zet();
    public static final a8z[] b = {maz.a(wez.f39042a, new tet(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f794a;

    public /* synthetic */ aft(int i, List list) {
        if ((i & 1) == 0) {
            this.f794a = null;
        } else {
            this.f794a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aft) && Intrinsics.d(this.f794a, ((aft) obj).f794a);
    }

    public final int hashCode() {
        List list = this.f794a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f794a, "GemsOdysseyCoefResponse(coeffList=", Separators.RPAREN);
    }
}
