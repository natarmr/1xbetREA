package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tct0 {
    public static final sct0 Companion = new sct0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33735a;
    public final String b;

    public /* synthetic */ tct0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33735a = null;
        } else {
            this.f33735a = str;
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
        if (!(obj instanceof tct0)) {
            return false;
        }
        tct0 tct0Var = (tct0) obj;
        return Intrinsics.d(this.f33735a, tct0Var.f33735a) && Intrinsics.d(this.b, tct0Var.b);
    }

    public final int hashCode() {
        String str = this.f33735a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SocialLink(link=", this.f33735a, ", image=", this.b, Separators.RPAREN);
    }
}
