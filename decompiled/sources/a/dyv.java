package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6913a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public dyv(List list, List list2, boolean z, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f6913a = list;
        this.b = z;
        this.c = list2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyv)) {
            return false;
        }
        dyv dyvVar = (dyv) obj;
        return Intrinsics.d(this.f6913a, dyvVar.f6913a) && this.b == dyvVar.b && Intrinsics.d(this.c, dyvVar.c) && this.d == dyvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dw9.a(brm0.e(this.f6913a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "HistoryAdditionalInfo(specialEvents=" + this.f6913a + ", marketGroupIdEnable=" + this.b + ", eventModelList=" + this.c + ", showParsingNumber=" + this.d + Separators.RPAREN;
    }
}
