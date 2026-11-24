package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qos0 f17427a;
    public final String b;
    public final long c;
    public final String d;
    public final yos0 e;
    public final String f;

    public jzp(qos0 qos0Var, String str, long j, String str2, yos0 yos0Var, String str3) {
        qos0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f17427a = qos0Var;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = yos0Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzp)) {
            return false;
        }
        jzp jzpVar = (jzp) obj;
        return Intrinsics.d(this.f17427a, jzpVar.f17427a) && Intrinsics.d(this.b, jzpVar.b) && this.c == jzpVar.c && Intrinsics.d(this.d, jzpVar.d) && this.e.equals(jzpVar.e) && this.f.equals(jzpVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(rw2.b(ua80.b(this.f17427a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileInfoUiModel(transportFileKey=");
        sb.append(this.f17427a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", size=");
        kng0.z(sb, this.c, ", mimeType=", this.d);
        sb.append(", state=");
        sb.append(this.e);
        sb.append(", fileDescription=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
