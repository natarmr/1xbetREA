package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rus0 {
    public static final qus0 Companion = new qus0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31141a;
    public final String b;
    public final String c;

    public /* synthetic */ rus0(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, pus0.f27633a.getDescriptor());
            throw null;
        }
        this.f31141a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rus0)) {
            return false;
        }
        rus0 rus0Var = (rus0) obj;
        return Intrinsics.d(this.f31141a, rus0Var.f31141a) && Intrinsics.d(this.b, rus0Var.b) && Intrinsics.d(this.c, rus0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31141a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("TwoFactorAnswerRequest(answer=", this.f31141a, ", token=", this.b, ", language="), this.c, Separators.RPAREN);
    }

    public rus0(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f31141a = str;
        this.b = str2;
        this.c = str3;
    }
}
