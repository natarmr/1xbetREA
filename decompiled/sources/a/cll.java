package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4565a;
    public final n0x b;
    public final String c;
    public final String d;

    public cll(long j, n0x n0xVar, String str, String str2) {
        str.getClass();
        this.f4565a = j;
        this.b = n0xVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cll)) {
            return false;
        }
        cll cllVar = (cll) obj;
        return this.f4565a == cllVar.f4565a && this.b.equals(cllVar.b) && Intrinsics.d(this.c, cllVar.c) && this.d.equals(cllVar.d);
    }

    public final int hashCode() {
        return ua80.b(ua80.b(f140.f(this.b, Long.hashCode(this.f4565a) * 31, 31), 31, this.c), 961, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(bannerId=");
        sb.append(this.f4565a);
        sb.append(", image=");
        sb.append(this.b);
        f140.v(sb, ", title=", this.c, ", subtitle=", this.d);
        sb.append(", generalTitle=, generalSubTitle=)");
        return sb.toString();
    }
}
