package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ll {
    public static final kl Companion = new kl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20224a;
    public final Double b;
    public final String c;

    public /* synthetic */ ll(int i, Double d, Long l, String str) {
        if ((i & 1) == 0) {
            this.f20224a = null;
        } else {
            this.f20224a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return Intrinsics.d(this.f20224a, llVar.f20224a) && Intrinsics.d(this.b, llVar.b) && Intrinsics.d(this.c, llVar.c);
    }

    public final int hashCode() {
        Long l = this.f20224a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveBonusSumDataResponse(bonusId=");
        sb.append(this.f20224a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", currency=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
