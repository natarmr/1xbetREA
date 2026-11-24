package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vrb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37892a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final fsb f;

    public vrb(boolean z, boolean z2, String str, String str2, String str3, fsb fsbVar) {
        this.f37892a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = fsbVar;
    }

    public static vrb a(vrb vrbVar, boolean z, boolean z2, String str, String str2, String str3, fsb fsbVar, int i) {
        if ((i & 1) != 0) {
            z = vrbVar.f37892a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = vrbVar.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            str = vrbVar.c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = vrbVar.d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = vrbVar.e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            fsbVar = vrbVar.f;
        }
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new vrb(z3, z4, str4, str5, str6, fsbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrb)) {
            return false;
        }
        vrb vrbVar = (vrb) obj;
        return this.f37892a == vrbVar.f37892a && this.b == vrbVar.b && this.c.equals(vrbVar.c) && this.d.equals(vrbVar.d) && this.e.equals(vrbVar.e) && this.f.equals(vrbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f37892a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ChangePinCodeState(confirmButtonEnable=", ", focusOnError=", ", oldPin=", this.f37892a, this.b);
        f140.v(sbQ, this.c, ", newPin=", this.d, ", newPinConfirm=");
        sbQ.append(this.e);
        sbQ.append(", errorModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
