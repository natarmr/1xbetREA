package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24944a;
    public final String b;
    public final List c;
    public final List d;
    public final Integer e;

    public oas(Long l, String str, List list, List list2, Integer num) {
        this.f24944a = l;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oas)) {
            return false;
        }
        oas oasVar = (oas) obj;
        return Intrinsics.d(this.f24944a, oasVar.f24944a) && Intrinsics.d(this.b, oasVar.b) && Intrinsics.d(this.c, oasVar.c) && Intrinsics.d(this.d, oasVar.d) && Intrinsics.d(this.e, oasVar.e);
    }

    public final int hashCode() {
        Long l = this.f24944a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f24944a, "GameEventOpponentModel(id=", ", name=", this.b, ", idsList=");
        b1j.y(", imageList=", ", countryId=", sbS, this.c, this.d);
        return dw9.q(sbS, this.e, Separators.RPAREN);
    }
}
