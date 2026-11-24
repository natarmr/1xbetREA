package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qc10 {
    public static final pc10 Companion = new pc10();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28466a;
    public final String b;
    public final kuw c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new t010((byte) 25)), null, maz.a(wezVar, new t010((byte) 26))};
    }

    public /* synthetic */ qc10(int i, List list, String str, kuw kuwVar) {
        if ((i & 1) == 0) {
            this.f28466a = null;
        } else {
            this.f28466a = list;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kuwVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc10)) {
            return false;
        }
        qc10 qc10Var = (qc10) obj;
        return Intrinsics.d(this.f28466a, qc10Var.f28466a) && Intrinsics.d(this.b, qc10Var.b) && Intrinsics.d(this.c, qc10Var.c);
    }

    public final int hashCode() {
        List list = this.f28466a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kuw kuwVar = this.c;
        return iHashCode2 + (kuwVar != null ? kuwVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("LottoBetHistoryResponse(lotoBetHistoryItemListResponse=", ", error=", this.b, this.f28466a, ", errorCode=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
