package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qlf0 implements rlf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28932a;
    public final String b;
    public final String c;
    public final boolean d;

    public qlf0(int i, String str, String str2, boolean z) {
        str.getClass();
        this.f28932a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlf0)) {
            return false;
        }
        qlf0 qlf0Var = (qlf0) obj;
        return this.f28932a == qlf0Var.f28932a && Intrinsics.d(this.b, qlf0Var.b) && this.c.equals(qlf0Var.c) && this.d == qlf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Integer.hashCode(this.f28932a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", quote=", Separators.RPAREN, vqd.r(this.f28932a, "Text(parentMessageId=", ", name=", this.b, ", text="), this.d);
    }
}
