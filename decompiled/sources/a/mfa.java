package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21685a;
    public final m0x b;
    public final chl0 c;

    public mfa(String str, m0x m0xVar, chl0 chl0Var) {
        str.getClass();
        this.f21685a = str;
        this.b = m0xVar;
        this.c = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfa)) {
            return false;
        }
        mfa mfaVar = (mfa) obj;
        return Intrinsics.d(this.f21685a, mfaVar.f21685a) && this.b.equals(mfaVar.b) && this.c.equals(mfaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.a(this.b, this.f21685a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CardExpressFooter(title=" + this.f21685a + ", icon=" + this.b + ", sportMarket=" + this.c + Separators.RPAREN;
    }
}
