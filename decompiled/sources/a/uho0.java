package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uho0 implements who0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35691a;
    public final sek0 b;

    public uho0(sek0 sek0Var, String str) {
        str.getClass();
        this.f35691a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uho0)) {
            return false;
        }
        uho0 uho0Var = (uho0) obj;
        return Intrinsics.d(this.f35691a, uho0Var.f35691a) && this.b.equals(uho0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35691a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f35691a + ", type=" + this.b + Separators.RPAREN;
    }
}
