package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xeh {
    public static final weh Companion = new weh();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40746a;
    public final List b;
    public final teh c;

    static {
        seh sehVar = teh.Companion;
        d = new a8z[]{null, maz.a(wez.f39042a, new gch((byte) 6)), null};
    }

    public /* synthetic */ xeh(int i, Integer num, List list, teh tehVar) {
        if ((i & 1) == 0) {
            this.f40746a = null;
        } else {
            this.f40746a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = tehVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeh)) {
            return false;
        }
        xeh xehVar = (xeh) obj;
        return Intrinsics.d(this.f40746a, xehVar.f40746a) && Intrinsics.d(this.b, xehVar.b) && Intrinsics.d(this.c, xehVar.c);
    }

    public final int hashCode() {
        Integer num = this.f40746a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        teh tehVar = this.c;
        return iHashCode2 + (tehVar != null ? tehVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyberStageTableResponse(sportId=" + this.f40746a + ", teams=" + this.b + ", responseInfo=" + this.c + Separators.RPAREN;
    }
}
