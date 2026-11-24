package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class su4 implements uu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32804a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public su4(int i, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f32804a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su4)) {
            return false;
        }
        su4 su4Var = (su4) obj;
        return Intrinsics.d(this.f32804a, su4Var.f32804a) && this.b == su4Var.b && Intrinsics.d(this.c, su4Var.c) && Intrinsics.d(this.d, su4Var.d) && Intrinsics.d(this.e, su4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, this.f32804a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Social(userSocialId=", this.f32804a, ", social=", ", socialToken=");
        f140.v(sbP, this.c, ", socialTokenSecret=", this.d, ", socialAppKey=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
