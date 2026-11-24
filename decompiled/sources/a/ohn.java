package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ohn {
    public static final nhn Companion = new nhn();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dcn(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25272a;
    public final List b;

    public /* synthetic */ ohn(String str, List list, int i) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, mhn.f21802a.getDescriptor());
            throw null;
        }
        this.f25272a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohn)) {
            return false;
        }
        ohn ohnVar = (ohn) obj;
        return Intrinsics.d(this.f25272a, ohnVar.f25272a) && Intrinsics.d(this.b, ohnVar.b);
    }

    public final int hashCode() {
        String str = this.f25272a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("EasternNightsActiveGameRequest(lng=", this.f25272a, ", gameType=", this.b, Separators.RPAREN);
    }

    public ohn(String str, List list) {
        this.f25272a = str;
        this.b = list;
    }
}
