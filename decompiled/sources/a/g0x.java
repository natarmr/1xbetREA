package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qos0 f10481a;
    public final String b;
    public final long c;
    public final String d;
    public final yos0 e;

    public g0x(qos0 qos0Var, String str, long j, String str2, yos0 yos0Var) {
        qos0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f10481a = qos0Var;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = yos0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0x)) {
            return false;
        }
        g0x g0xVar = (g0x) obj;
        return Intrinsics.d(this.f10481a, g0xVar.f10481a) && Intrinsics.d(this.b, g0xVar.b) && this.c == g0xVar.c && Intrinsics.d(this.d, g0xVar.d) && this.e.equals(g0xVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(rw2.b(ua80.b(this.f10481a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageInfoUiModel(transportFileKey=");
        sb.append(this.f10481a);
        sb.append(", fileName=");
        sb.append(this.b);
        sb.append(", size=");
        kng0.z(sb, this.c, ", preview=", this.d);
        sb.append(", fileState=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
