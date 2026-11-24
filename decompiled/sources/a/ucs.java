package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ucs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35445a;
    public final Integer b;
    public final Integer c;

    public ucs(List list, Integer num, Integer num2) {
        list.getClass();
        this.f35445a = list;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucs)) {
            return false;
        }
        ucs ucsVar = (ucs) obj;
        return Intrinsics.d(this.f35445a, ucsVar.f35445a) && Intrinsics.d(this.b, ucsVar.b) && Intrinsics.d(this.c, ucsVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f35445a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(cs0.r(this.b, "GameHeaderBackgroundUiModel(backgroundUrls=", ", backgroundHeight=", ", backgroundWidth=", this.f35445a), this.c, Separators.RPAREN);
    }
}
