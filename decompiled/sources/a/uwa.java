package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uwa implements wwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36383a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;
    public final qol g;

    public uwa(String str, String str2, String str3, String str4, boolean z, long j, qol qolVar) {
        str.getClass();
        str4.getClass();
        this.f36383a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
        this.g = qolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwa)) {
            return false;
        }
        uwa uwaVar = (uwa) obj;
        return Intrinsics.d(this.f36383a, uwaVar.f36383a) && this.b.equals(uwaVar.b) && Intrinsics.d(this.c, uwaVar.c) && Intrinsics.d(this.d, uwaVar.d) && this.e == uwaVar.e && this.f == uwaVar.f && this.g.equals(uwaVar.g);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f36383a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + rw2.b(brm0.e(ua80.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f36383a, ", amount=", this.b, ", euroAmount=");
        f140.v(sbN, this.c, ", withdrawButtonLabel=", this.d, ", withdrawAvailable=");
        rw2.v(this.f, ", timerEndMillis=", sbN, this.e);
        sbN.append(", timerLabels=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
