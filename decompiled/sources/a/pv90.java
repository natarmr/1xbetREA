package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pv90 {
    public static final nv90 Companion = new nv90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27652a;
    public final String b;

    public /* synthetic */ pv90(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f27652a = null;
        } else {
            this.f27652a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv90)) {
            return false;
        }
        pv90 pv90Var = (pv90) obj;
        return Intrinsics.d(this.f27652a, pv90Var.f27652a) && Intrinsics.d(this.b, pv90Var.b);
    }

    public final int hashCode() {
        String str = this.f27652a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Platform(name=", this.f27652a, ", version=", this.b, Separators.RPAREN);
    }

    public pv90() {
        String str = Build.VERSION.RELEASE;
        this.f27652a = "Android";
        this.b = str;
    }
}
