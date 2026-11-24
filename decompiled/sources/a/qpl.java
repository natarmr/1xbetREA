package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qpl implements spl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29124a;
    public final String b;
    public final String c;

    public qpl(a4x a4xVar, String str, String str2) {
        a4xVar.getClass();
        str.getClass();
        this.f29124a = a4xVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpl)) {
            return false;
        }
        qpl qplVar = (qpl) obj;
        return Intrinsics.d(this.f29124a, qplVar.f29124a) && Intrinsics.d(this.b, qplVar.b) && Intrinsics.d(this.c, qplVar.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f29124a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(items=");
        sb.append(this.f29124a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", subTitle=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
