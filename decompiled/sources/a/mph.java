package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22180a;
    public final String b;
    public final m0x c;

    public mph(String str, String str2, m0x m0xVar) {
        str.getClass();
        this.f22180a = str;
        this.b = str2;
        this.c = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mph)) {
            return false;
        }
        mph mphVar = (mph) obj;
        return Intrinsics.d(this.f22180a, mphVar.f22180a) && this.b.equals(mphVar.b) && this.c.equals(mphVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f22180a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberUFCStatisticsIconCellUiModel(title=", this.f22180a, ", value=", this.b, ", icon=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
