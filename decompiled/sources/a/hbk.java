package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hbk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12774a;
    public final String b;

    public hbk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f12774a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbk)) {
            return false;
        }
        hbk hbkVar = (hbk) obj;
        return Intrinsics.d(this.f12774a, hbkVar.f12774a) && Intrinsics.d(this.b, hbkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12774a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DepositLockScreenState(title=", this.f12774a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
