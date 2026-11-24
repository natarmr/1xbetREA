package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a8n0 {
    public static final z7n0 Companion = new z7n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f435a;
    public final String b;
    public final Integer c;

    public /* synthetic */ a8n0(int i, Integer num, Long l, String str) {
        if ((i & 1) == 0) {
            this.f435a = null;
        } else {
            this.f435a = l;
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
        if (!(obj instanceof a8n0)) {
            return false;
        }
        a8n0 a8n0Var = (a8n0) obj;
        return Intrinsics.d(this.f435a, a8n0Var.f435a) && Intrinsics.d(this.b, a8n0Var.b) && Intrinsics.d(this.c, a8n0Var.c);
    }

    public final int hashCode() {
        Long l = this.f435a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(cs0.s(this.f435a, "SubscriptionLigaResponse(id=", ", name=", this.b, ", cyberType="), this.c, Separators.RPAREN);
    }
}
