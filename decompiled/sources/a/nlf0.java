package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nlf0 implements rlf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23724a;
    public final String b;
    public final String c;
    public final boolean d;

    public nlf0(int i, String str, String str2, boolean z) {
        str.getClass();
        this.f23724a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlf0)) {
            return false;
        }
        nlf0 nlf0Var = (nlf0) obj;
        return this.f23724a == nlf0Var.f23724a && Intrinsics.d(this.b, nlf0Var.b) && this.c.equals(nlf0Var.c) && this.d == nlf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Integer.hashCode(this.f23724a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", quote=", Separators.RPAREN, vqd.r(this.f23724a, "File(replyMessageId=", ", name=", this.b, ", text="), this.d);
    }
}
