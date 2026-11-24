package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class stq {
    public static final rtq Companion = new rtq();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32784a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new v9q((byte) 18)), maz.a(wezVar, new v9q((byte) 19)), maz.a(wezVar, new v9q((byte) 20))};
    }

    public /* synthetic */ stq(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f32784a = null;
        } else {
            this.f32784a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stq)) {
            return false;
        }
        stq stqVar = (stq) obj;
        return Intrinsics.d(this.f32784a, stqVar.f32784a) && Intrinsics.d(this.b, stqVar.b) && Intrinsics.d(this.c, stqVar.c);
    }

    public final int hashCode() {
        List list = this.f32784a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("FooterTableResponse(tag=", ", tableTitlesList=", this.f32784a, ", tableBodyList=", this.b), this.c, Separators.RPAREN);
    }
}
