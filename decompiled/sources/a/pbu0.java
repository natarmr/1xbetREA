package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pbu0 {
    public static final obu0 Companion = new obu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26727a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ pbu0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, nbu0.f23259a.getDescriptor());
            throw null;
        }
        this.f26727a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbu0)) {
            return false;
        }
        pbu0 pbu0Var = (pbu0) obj;
        return Intrinsics.d(this.f26727a, pbu0Var.f26727a) && Intrinsics.d(this.b, pbu0Var.b) && Intrinsics.d(this.c, pbu0Var.c) && Intrinsics.d(this.d, pbu0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f26727a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("VerifyAuthenticatorRequest(registrationGuid=", this.f26727a, ", signedSecret=", this.b, ", smsCode="), this.c, ", oneTimeToken=", this.d, Separators.RPAREN);
    }

    public pbu0(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f26727a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
