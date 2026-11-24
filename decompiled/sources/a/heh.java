package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class heh {
    public static final geh Companion = new geh();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gch(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12923a;
    public final List b;

    public /* synthetic */ heh(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f12923a = null;
        } else {
            this.f12923a = num;
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
        if (!(obj instanceof heh)) {
            return false;
        }
        heh hehVar = (heh) obj;
        return Intrinsics.d(this.f12923a, hehVar.f12923a) && Intrinsics.d(this.b, hehVar.b);
    }

    public final int hashCode() {
        Integer num = this.f12923a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f12923a, "CyberStageTableBodyResponse(id=", ", valueColumn=", Separators.RPAREN, this.b);
    }
}
