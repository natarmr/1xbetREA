package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class utd implements aud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f36250a;
    public final zxj0 b;

    public utd(zxj0 zxj0Var, m0k0 m0k0Var) {
        zxj0Var.getClass();
        this.f36250a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utd)) {
            return false;
        }
        utd utdVar = (utd) obj;
        return this.f36250a.equals(utdVar.f36250a) && Intrinsics.d(this.b, utdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36250a.hashCode() * 31);
    }

    public final String toString() {
        return "EventAlreadyAdded(singleBetGame=" + this.f36250a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
