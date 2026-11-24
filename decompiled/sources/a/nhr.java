package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nhr extends mir {
    public static final mhr Companion = new mhr();
    public final String c;
    public final String d;

    public /* synthetic */ nhr(String str, int i, String str2, String str3) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = "GPWebAppSetUser";
        } else {
            this.d = str3;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhr)) {
            return false;
        }
        nhr nhrVar = (nhr) obj;
        return Intrinsics.d(this.c, nhrVar.c) && Intrinsics.d(this.d, nhrVar.d);
    }

    public final int hashCode() {
        String str = this.c;
        return this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return b1j.k("GPWebAppSetUser(token=", this.c, ", eventName=", this.d, Separators.RPAREN);
    }

    public nhr(String str) {
        this.c = str;
        this.d = "GPWebAppSetUser";
    }
}
