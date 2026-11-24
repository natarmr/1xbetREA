package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kpl implements mpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18682a;
    public final String b;
    public final String c;

    public kpl(a4x a4xVar, String str, String str2) {
        a4xVar.getClass();
        str.getClass();
        this.f18682a = a4xVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpl)) {
            return false;
        }
        kpl kplVar = (kpl) obj;
        return Intrinsics.d(this.f18682a, kplVar.f18682a) && Intrinsics.d(this.b, kplVar.b) && Intrinsics.d(this.c, kplVar.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f18682a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(items=");
        sb.append(this.f18682a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", subTitle=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
