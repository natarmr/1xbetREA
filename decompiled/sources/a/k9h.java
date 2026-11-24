package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k9h {
    public static final j9h Companion = new j9h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17915a;
    public final String b;
    public final Integer c;

    public /* synthetic */ k9h(int i, Integer num, Long l, String str) {
        if ((i & 1) == 0) {
            this.f17915a = null;
        } else {
            this.f17915a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9h)) {
            return false;
        }
        k9h k9hVar = (k9h) obj;
        return Intrinsics.d(this.f17915a, k9hVar.f17915a) && Intrinsics.d(this.b, k9hVar.b) && Intrinsics.d(this.c, k9hVar.c);
    }

    public final int hashCode() {
        Long l = this.f17915a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(cs0.s(this.f17915a, "CyberMlbbHeroItemResponse(itemId=", ", itemName=", this.b, ", itemCount="), this.c, Separators.RPAREN);
    }
}
