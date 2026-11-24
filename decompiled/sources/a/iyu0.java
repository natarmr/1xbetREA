package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class iyu0 {
    public static final hyu0 Companion = new hyu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15606a;
    public final String b;
    public final String c;

    public /* synthetic */ iyu0(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, gyu0.f12149a.getDescriptor());
            throw null;
        }
        this.f15606a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyu0)) {
            return false;
        }
        iyu0 iyu0Var = (iyu0) obj;
        return Intrinsics.d(this.f15606a, iyu0Var.f15606a) && Intrinsics.d(this.b, iyu0Var.b) && Intrinsics.d(this.c, iyu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f15606a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("WalletResendSmsCodeRequest(guid=", this.f15606a, ", captchaId=", this.b, ", captchaValue="), this.c, Separators.RPAREN);
    }

    public iyu0(String str, String str2, String str3) {
        str.getClass();
        this.f15606a = str;
        this.b = str2;
        this.c = str3;
    }
}
