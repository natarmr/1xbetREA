package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class lyu0 {
    public static final kyu0 Companion = new kyu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20880a;
    public final String b;
    public final String c;

    public /* synthetic */ lyu0(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, jyu0.f17377a.getDescriptor());
            throw null;
        }
        this.f20880a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyu0)) {
            return false;
        }
        lyu0 lyu0Var = (lyu0) obj;
        return this.f20880a == lyu0Var.f20880a && Intrinsics.d(this.b, lyu0Var.b) && Intrinsics.d(this.c, lyu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f20880a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f20880a, "WalletSendSmsCodeRequest(productId=", ", captchaId=", this.b), ", captchaValue=", this.c, Separators.RPAREN);
    }

    public lyu0(long j, String str, String str2) {
        this.f20880a = j;
        this.b = str;
        this.c = str2;
    }
}
