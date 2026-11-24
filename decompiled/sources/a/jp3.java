package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jp3 {
    public static final ip3 Companion = new ip3();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new f33(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16882a;
    public final List b;

    public /* synthetic */ jp3(String str, List list, int i) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, hp3.f13423a.getDescriptor());
            throw null;
        }
        this.f16882a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp3)) {
            return false;
        }
        jp3 jp3Var = (jp3) obj;
        return Intrinsics.d(this.f16882a, jp3Var.f16882a) && Intrinsics.d(this.b, jp3Var.b);
    }

    public final int hashCode() {
        String str = this.f16882a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("AppleFortuneActiveGameRequest(lng=", this.f16882a, ", gameType=", this.b, Separators.RPAREN);
    }

    public jp3(String str, List list) {
        this.f16882a = str;
        this.b = list;
    }
}
