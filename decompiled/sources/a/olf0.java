package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class olf0 implements rlf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25452a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public olf0(int i, String str, String str2, String str3, String str4, boolean z) {
        str3.getClass();
        str4.getClass();
        this.f25452a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olf0)) {
            return false;
        }
        olf0 olf0Var = (olf0) obj;
        return this.f25452a == olf0Var.f25452a && this.b.equals(olf0Var.b) && this.c.equals(olf0Var.c) && Intrinsics.d(this.d, olf0Var.d) && Intrinsics.d(this.e, olf0Var.e) && this.f == olf0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f25452a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f25452a, "Image(replyMessageId=", ", thumbBase64=", this.b, ", filePath=");
        f140.v(sbR, this.c, ", name=", this.d, ", text=");
        return defpackage.c.c(this.e, ", quote=", Separators.RPAREN, sbR, this.f);
    }
}
