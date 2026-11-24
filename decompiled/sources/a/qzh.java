package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qzh implements szh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29577a;
    public final String b;
    public final String c;
    public final i4 d;

    public qzh(String str, String str2, String str3, i4 i4Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        i4Var.getClass();
        this.f29577a = str;
        this.b = str2;
        this.c = str3;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzh)) {
            return false;
        }
        qzh qzhVar = (qzh) obj;
        return Intrinsics.d(this.f29577a, qzhVar.f29577a) && Intrinsics.d(this.b, qzhVar.b) && Intrinsics.d(this.c, qzhVar.c) && Intrinsics.d(this.d, qzhVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + f140.c(this.d, ua80.b(ua80.b(this.f29577a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f29577a, ", subtitle=", this.b, ", buttonText=");
        sbN.append(this.c);
        sbN.append(", games=");
        sbN.append(this.d);
        sbN.append(", enabled=true)");
        return sbN.toString();
    }
}
