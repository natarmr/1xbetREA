package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class g6a {
    public static final f6a Companion = new f6a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10752a;
    public final String b;

    public /* synthetic */ g6a(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f10752a = null;
        } else {
            this.f10752a = str;
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
        if (!(obj instanceof g6a)) {
            return false;
        }
        g6a g6aVar = (g6a) obj;
        return Intrinsics.d(this.f10752a, g6aVar.f10752a) && Intrinsics.d(this.b, g6aVar.b);
    }

    public final int hashCode() {
        String str = this.f10752a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Captcha(text=", this.f10752a, ", guid=", this.b, Separators.RPAREN);
    }

    public g6a(ynb0 ynb0Var) {
        ynb0Var.getClass();
        String str = ynb0Var.b;
        String str2 = ynb0Var.f42933a;
        this.f10752a = str;
        this.b = str2;
    }
}
