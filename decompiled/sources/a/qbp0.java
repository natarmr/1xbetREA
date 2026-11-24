package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28451a;
    public final hcm b;
    public final String c;
    public final String d;
    public final int e;

    public qbp0(String str, hcm hcmVar, String str2, String str3, int i) {
        str.getClass();
        this.f28451a = str;
        this.b = hcmVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbp0)) {
            return false;
        }
        qbp0 qbp0Var = (qbp0) obj;
        return Intrinsics.d(this.f28451a, qbp0Var.f28451a) && this.b.equals(qbp0Var.b) && this.c.equals(qbp0Var.c) && this.d.equals(qbp0Var.d) && this.e == qbp0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(ua80.b((this.b.hashCode() + (this.f28451a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsToolbarUiModel(title=");
        sb.append(this.f28451a);
        sb.append(", topInfo=");
        sb.append(this.b);
        sb.append(", backgroundImageFirst=");
        f140.v(sb, this.c, ", backgroundImageSecond=", this.d, ", placeholder=");
        return rz4.j(this.e, Separators.RPAREN, sb);
    }
}
