package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class p5i0 {
    public static final o5i0 Companion = new o5i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f26406a;
    public final String b;
    public final String c;

    public /* synthetic */ p5i0(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f26406a = null;
        } else {
            this.f26406a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5i0)) {
            return false;
        }
        p5i0 p5i0Var = (p5i0) obj;
        return Intrinsics.d(this.f26406a, p5i0Var.f26406a) && Intrinsics.d(this.b, p5i0Var.b) && Intrinsics.d(this.c, p5i0Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.f26406a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectorOptionResponse(isDefault=");
        sb.append(this.f26406a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", value=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
