package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e2h {
    public static final d2h Companion = new d2h();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7085a;
    public final b2h b;

    static {
        a2h a2hVar = b2h.Companion;
        c = new a8z[]{maz.a(wez.f39042a, new xng((byte) 28)), null};
    }

    public /* synthetic */ e2h(int i, List list, b2h b2hVar) {
        if ((i & 1) == 0) {
            this.f7085a = null;
        } else {
            this.f7085a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b2hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2h)) {
            return false;
        }
        e2h e2hVar = (e2h) obj;
        return Intrinsics.d(this.f7085a, e2hVar.f7085a) && Intrinsics.d(this.b, e2hVar.b);
    }

    public final int hashCode() {
        List list = this.f7085a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        b2h b2hVar = this.b;
        return iHashCode + (b2hVar != null ? b2hVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyberLastMatchesStatisticResponse(teams=" + this.f7085a + ", response=" + this.b + Separators.RPAREN;
    }
}
