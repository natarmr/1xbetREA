package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class knm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18593a;
    public final String b;
    public final bm90 c;
    public final Integer d;
    public final yu90 e;

    public knm(String str, String str2, bm90 bm90Var, Integer num, yu90 yu90Var) {
        str.getClass();
        str2.getClass();
        this.f18593a = str;
        this.b = str2;
        this.c = bm90Var;
        this.d = num;
        this.e = yu90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knm)) {
            return false;
        }
        knm knmVar = (knm) obj;
        return Intrinsics.d(this.f18593a, knmVar.f18593a) && Intrinsics.d(this.b, knmVar.b) && this.c.equals(knmVar.c) && Intrinsics.d(this.d, knmVar.d) && this.e.equals(knmVar.e);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(this.f18593a.hashCode() * 31, 31, this.b), 31, this.c.f2826a);
        Integer num = this.d;
        return this.e.f43258a.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DsPhoneUiModel(number=", this.f18593a, ", label=", this.b, ", mask=");
        sbN.append(this.c);
        sbN.append(", maxLength=");
        sbN.append(this.d);
        sbN.append(", placeholder=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
