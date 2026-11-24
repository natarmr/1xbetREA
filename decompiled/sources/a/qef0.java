package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qef0 implements ref0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28580a;
    public final String b;

    public qef0(String str, String str2) {
        str.getClass();
        this.f28580a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qef0)) {
            return false;
        }
        qef0 qef0Var = (qef0) obj;
        return Intrinsics.d(this.f28580a, qef0Var.f28580a) && this.b.equals(qef0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28580a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TimerMessage(message=", this.f28580a, ", timerText=", this.b, Separators.RPAREN);
    }
}
