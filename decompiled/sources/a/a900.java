package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class a900 {
    public static final z800 Companion = new z800();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new x800((byte) 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f453a;
    public final List b;

    public /* synthetic */ a900(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f453a = null;
        } else {
            this.f453a = str;
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
        if (!(obj instanceof a900)) {
            return false;
        }
        a900 a900Var = (a900) obj;
        return Intrinsics.d(this.f453a, a900Var.f453a) && Intrinsics.d(this.b, a900Var.b);
    }

    public final int hashCode() {
        String str = this.f453a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("LineUpTeamResponse(title=", this.f453a, ", players=", this.b, Separators.RPAREN);
    }
}
