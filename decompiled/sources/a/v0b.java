package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class v0b implements x0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f36573a;
    public final String b;
    public final String c;
    public final String d;
    public final u0b e;

    public v0b(o0x o0xVar, String str, String str2, String str3, u0b u0bVar) {
        brm0.B(str, str2, str3);
        this.f36573a = o0xVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = u0bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0b)) {
            return false;
        }
        v0b v0bVar = (v0b) obj;
        return this.f36573a.equals(v0bVar.f36573a) && Intrinsics.d(this.b, v0bVar.b) && Intrinsics.d(this.c, v0bVar.c) && Intrinsics.d(this.d, v0bVar.d) && this.e.equals(v0bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f36573a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(levelImage=");
        sb.append(this.f36573a);
        sb.append(", levelName=");
        sb.append(this.b);
        sb.append(", levelCashback=");
        f140.v(sb, this.c, ", levelCoefficient=", this.d, ", progressState=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
