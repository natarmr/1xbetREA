package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class jhf {
    public static final ihf Companion = new ihf();
    public static final a8z[] b = {maz.a(wez.f39042a, new x5f(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16523a;

    public /* synthetic */ jhf(int i, List list) {
        if ((i & 1) == 0) {
            this.f16523a = null;
        } else {
            this.f16523a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhf) && Intrinsics.d(this.f16523a, ((jhf) obj).f16523a);
    }

    public final int hashCode() {
        List list = this.f16523a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f16523a, "CrystalRoundsState(rounds=", Separators.RPAREN);
    }
}
