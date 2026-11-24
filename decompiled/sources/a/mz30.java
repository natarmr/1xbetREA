package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mz30 {
    public static final lz30 Companion = new lz30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22634a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ mz30(int i, Integer num, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.f22634a = null;
        } else {
            this.f22634a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz30)) {
            return false;
        }
        mz30 mz30Var = (mz30) obj;
        return Intrinsics.d(this.f22634a, mz30Var.f22634a) && Intrinsics.d(this.b, mz30Var.b) && Intrinsics.d(this.c, mz30Var.c);
    }

    public final int hashCode() {
        Integer num = this.f22634a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(h97.n(this.f22634a, "MenuItemResponse(type=", ", name=", this.b, ", hidden="), this.c, Separators.RPAREN);
    }
}
