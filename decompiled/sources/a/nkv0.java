package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nkv0 {
    public static final mkv0 Companion = new mkv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f23700a;
    public final String b;
    public final String c;

    public /* synthetic */ nkv0(int i, Double d, String str, String str2) {
        if ((i & 1) == 0) {
            this.f23700a = null;
        } else {
            this.f23700a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkv0)) {
            return false;
        }
        nkv0 nkv0Var = (nkv0) obj;
        return Intrinsics.d(this.f23700a, nkv0Var.f23700a) && Intrinsics.d(this.b, nkv0Var.b) && Intrinsics.d(this.c, nkv0Var.c);
    }

    public final int hashCode() {
        Double d = this.f23700a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinsJackpotInfoResponse(winSum=");
        sb.append(this.f23700a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", id=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
