package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ceb {
    public static final beb Companion = new beb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4202a;
    public final String b;

    public /* synthetic */ ceb(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f4202a = null;
        } else {
            this.f4202a = str;
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
        if (!(obj instanceof ceb)) {
            return false;
        }
        ceb cebVar = (ceb) obj;
        return Intrinsics.d(this.f4202a, cebVar.f4202a) && Intrinsics.d(this.b, cebVar.b);
    }

    public final int hashCode() {
        String str = this.f4202a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("ChampMenuSelectorResponse(title=", this.f4202a, ", id=", this.b, Separators.RPAREN);
    }
}
