package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7048a;
    public final String b;

    public e1q0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7048a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1q0)) {
            return false;
        }
        e1q0 e1q0Var = (e1q0) obj;
        return Intrinsics.d(this.f7048a, e1q0Var.f7048a) && Intrinsics.d(this.b, e1q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7048a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TestCredUiModel(login=", this.f7048a, ", password=", this.b, Separators.RPAREN);
    }
}
