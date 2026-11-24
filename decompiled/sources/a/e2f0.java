package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class e2f0 {
    public static final c2f0 Companion = new c2f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7082a;
    public final String b;
    public final String c;
    public final j8f0 d;
    public final jr3 e;
    public final fig0 f;

    public /* synthetic */ e2f0(int i, String str, String str2, String str3, j8f0 j8f0Var, jr3 jr3Var, fig0 fig0Var) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, a2f0.f121a.getDescriptor());
            throw null;
        }
        this.f7082a = str;
        this.b = str2;
        this.c = str3;
        this.d = j8f0Var;
        this.e = jr3Var;
        this.f = fig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2f0)) {
            return false;
        }
        e2f0 e2f0Var = (e2f0) obj;
        return Intrinsics.d(this.f7082a, e2f0Var.f7082a) && Intrinsics.d(this.b, e2f0Var.b) && Intrinsics.d(this.c, e2f0Var.c) && Intrinsics.d(this.d, e2f0Var.d) && Intrinsics.d(this.e, e2f0Var.e) && Intrinsics.d(this.f, e2f0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f7082a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        fig0 fig0Var = this.f;
        return iHashCode + (fig0Var == null ? 0 : fig0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RegistrationRequest(sessionId=", this.f7082a, ", projectId=", this.b, ", language=");
        sbN.append(this.c);
        sbN.append(", user=");
        sbN.append(this.d);
        sbN.append(", application=");
        sbN.append(this.e);
        sbN.append(", rpcProps=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public e2f0(String str, String str2, String str3, j8f0 j8f0Var, jr3 jr3Var, fig0 fig0Var) {
        str.getClass();
        str2.getClass();
        this.f7082a = str;
        this.b = str2;
        this.c = str3;
        this.d = j8f0Var;
        this.e = jr3Var;
        this.f = fig0Var;
    }
}
