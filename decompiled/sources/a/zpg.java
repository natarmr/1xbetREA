package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zpg {
    public static final ypg Companion = new ypg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44758a;
    public final Integer b;

    public /* synthetic */ zpg(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f44758a = null;
        } else {
            this.f44758a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpg)) {
            return false;
        }
        zpg zpgVar = (zpg) obj;
        return Intrinsics.d(this.f44758a, zpgVar.f44758a) && Intrinsics.d(this.b, zpgVar.b);
    }

    public final int hashCode() {
        String str = this.f44758a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CyberGameStatisticInfoResponse(gameId=" + this.f44758a + ", status=" + this.b + Separators.RPAREN;
    }
}
