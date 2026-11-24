package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mxa0 implements iya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22545a;
    public final String b;

    public mxa0(String str, String str2) {
        str2.getClass();
        this.f22545a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxa0)) {
            return false;
        }
        mxa0 mxa0Var = (mxa0) obj;
        return this.f22545a.equals(mxa0Var.f22545a) && Intrinsics.d(this.b, mxa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22545a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ReceiveSecretKey(secretKey=", this.f22545a, ", message=", this.b, Separators.RPAREN);
    }
}
