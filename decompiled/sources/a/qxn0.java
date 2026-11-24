package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qxn0 implements uxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29493a;
    public final String b;

    public qxn0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f29493a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxn0)) {
            return false;
        }
        qxn0 qxn0Var = (qxn0) obj;
        return Intrinsics.d(this.f29493a, qxn0Var.f29493a) && Intrinsics.d(this.b, qxn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29493a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowSuccessBet(coef=", this.f29493a, ", betSum=", this.b, Separators.RPAREN);
    }
}
