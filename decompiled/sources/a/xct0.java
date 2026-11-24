package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xct0 {
    public static final hct0 Companion = new hct0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40665a;
    public final String b;

    public /* synthetic */ xct0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f40665a = null;
        } else {
            this.f40665a = str;
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
        if (!(obj instanceof xct0)) {
            return false;
        }
        xct0 xct0Var = (xct0) obj;
        return Intrinsics.d(this.f40665a, xct0Var.f40665a) && Intrinsics.d(this.b, xct0Var.b);
    }

    public final int hashCode() {
        String str = this.f40665a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("UniversalChampSocialMediaResponse(key=", this.f40665a, ", value=", this.b, Separators.RPAREN);
    }
}
