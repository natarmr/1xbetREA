package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class sew {
    public static final rew Companion = new rew();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new kdw(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32092a;
    public final List b;

    public /* synthetic */ sew(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f32092a = null;
        } else {
            this.f32092a = str;
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
        if (!(obj instanceof sew)) {
            return false;
        }
        sew sewVar = (sew) obj;
        return Intrinsics.d(this.f32092a, sewVar.f32092a) && Intrinsics.d(this.b, sewVar.b);
    }

    public final int hashCode() {
        String str = this.f32092a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("HltvAwardsStatisticResponse(title=", this.f32092a, ", categories=", this.b, Separators.RPAREN);
    }
}
