package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fq8 implements hq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao4 f9960a;
    public final String b;
    public final String c;
    public final String d;

    public fq8(ao4 ao4Var, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f9960a = ao4Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq8)) {
            return false;
        }
        fq8 fq8Var = (fq8) obj;
        return this.f9960a.equals(fq8Var.f9960a) && Intrinsics.d(this.b, fq8Var.b) && Intrinsics.d(this.c, fq8Var.c) && Intrinsics.d(this.d, fq8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f9960a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseSessionBottomSheetUiModel(item=");
        sb.append(this.f9960a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", cancelButtonTitle=");
        return ua80.m(sb, this.c, ", confirmButtonTitle=", this.d, Separators.RPAREN);
    }
}
