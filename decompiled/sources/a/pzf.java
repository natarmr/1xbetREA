package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27841a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public pzf(long j, String str, boolean z, boolean z2) {
        this.f27841a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzf)) {
            return false;
        }
        pzf pzfVar = (pzf) obj;
        return this.f27841a == pzfVar.f27841a && this.b.equals(pzfVar.b) && this.c == pzfVar.c && this.d == pzfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(Long.hashCode(this.f27841a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27841a, "CustomerIOUpdateDataModel(customerId=", ", customerEmail=", this.b);
        w6x.A(", pushDeviceEnabled=", ", needSendPushAttribute=", sbO, this.c, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
