package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a9h {
    public static final z8h Companion = new z8h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f476a;
    public final Long b;
    public final Integer c;

    public /* synthetic */ a9h(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f476a = null;
        } else {
            this.f476a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
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
        if (!(obj instanceof a9h)) {
            return false;
        }
        a9h a9hVar = (a9h) obj;
        return Intrinsics.d(this.f476a, a9hVar.f476a) && Intrinsics.d(this.b, a9hVar.b) && Intrinsics.d(this.c, a9hVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.f476a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberMlbbDraftResponse(isBan=");
        sb.append(this.f476a);
        sb.append(", heroId=");
        sb.append(this.b);
        sb.append(", teamNumber=");
        return dw9.q(sb, this.c, Separators.RPAREN);
    }
}
