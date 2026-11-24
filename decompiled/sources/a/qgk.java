package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qgk {
    public static final pgk Companion = new pgk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28689a;
    public final String b;

    public /* synthetic */ qgk(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f28689a = null;
        } else {
            this.f28689a = str;
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
        if (!(obj instanceof qgk)) {
            return false;
        }
        qgk qgkVar = (qgk) obj;
        return Intrinsics.d(this.f28689a, qgkVar.f28689a) && Intrinsics.d(this.b, qgkVar.b);
    }

    public final int hashCode() {
        String str = this.f28689a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Device(vendor=", this.f28689a, ", model=", this.b, Separators.RPAREN);
    }

    public qgk(String str) {
        this.f28689a = Build.MANUFACTURER;
        this.b = str;
    }
}
