package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31349a;
    public final String b;
    public final String c;
    public final float d;

    public rza(String str, String str2, String str3, float f) {
        str.getClass();
        this.f31349a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rza)) {
            return false;
        }
        rza rzaVar = (rza) obj;
        return Intrinsics.d(this.f31349a, rzaVar.f31349a) && this.b.equals(rzaVar.b) && this.c.equals(rzaVar.c) && Float.compare(this.d, rzaVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ua80.b(ua80.b(this.f31349a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CashbackProgressUiState(title=", this.f31349a, ", currentValue=", this.b, ", limitValue=");
        sbN.append(this.c);
        sbN.append(", progress=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
