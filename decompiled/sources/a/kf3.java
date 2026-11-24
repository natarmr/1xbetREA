package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18179a;
    public final String b;
    public final String c;

    public kf3(String str, String str2, String str3) {
        str.getClass();
        this.f18179a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf3)) {
            return false;
        }
        kf3 kf3Var = (kf3) obj;
        return Intrinsics.d(this.f18179a, kf3Var.f18179a) && this.b.equals(kf3Var.b) && this.c.equals(kf3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f18179a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("AppLinkModel(fullText=", this.f18179a, ", androidLink=", this.b, ", iosLink="), this.c, Separators.RPAREN);
    }
}
