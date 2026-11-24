package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a1j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72a;
    public final String b;
    public final wul c;
    public final wul d;

    public a1j(String str, String str2, wul wulVar, wul wulVar2) {
        str.getClass();
        str2.getClass();
        wulVar.getClass();
        wulVar2.getClass();
        this.f72a = str;
        this.b = str2;
        this.c = wulVar;
        this.d = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1j)) {
            return false;
        }
        a1j a1jVar = (a1j) obj;
        return Intrinsics.d(this.f72a, a1jVar.f72a) && Intrinsics.d(this.b, a1jVar.b) && Intrinsics.d(this.c, a1jVar.c) && Intrinsics.d(this.d, a1jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, ua80.b(this.f72a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DailyTaskMoreInfoUiState(title=", this.f72a, ", label=", this.b, ", btnFirstModel=");
        sbN.append(this.c);
        sbN.append(", btnSecondModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
