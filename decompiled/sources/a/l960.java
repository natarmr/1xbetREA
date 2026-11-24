package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class l960 implements iqg {
    public static final k960 Companion = new k960();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19636a;
    public final String b;

    public /* synthetic */ l960(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f19636a = null;
        } else {
            this.f19636a = str;
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
        if (!(obj instanceof l960)) {
            return false;
        }
        l960 l960Var = (l960) obj;
        return Intrinsics.d(this.f19636a, l960Var.f19636a) && Intrinsics.d(this.b, l960Var.b);
    }

    public final int hashCode() {
        String str = this.f19636a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("NumbersResponse(currentNumber=", this.f19636a, ", allGameNumbers=", this.b, Separators.RPAREN);
    }

    public l960() {
        this.f19636a = null;
        this.b = null;
    }
}
