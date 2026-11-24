package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n7r {
    public static final m7r Companion = new m7r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23055a;
    public final String b;

    public /* synthetic */ n7r(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f23055a = null;
        } else {
            this.f23055a = str;
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
        if (!(obj instanceof n7r)) {
            return false;
        }
        n7r n7rVar = (n7r) obj;
        return Intrinsics.d(this.f23055a, n7rVar.f23055a) && Intrinsics.d(this.b, n7rVar.b);
    }

    public final int hashCode() {
        String str = this.f23055a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Params(comp=", this.f23055a, ", visitor=", this.b, Separators.RPAREN);
    }

    public n7r(String str, String str2) {
        this.f23055a = str;
        this.b = str2;
    }
}
