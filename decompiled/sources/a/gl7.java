package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gl7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11476a;
    public final String b;
    public final int c;

    public gl7(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f11476a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl7)) {
            return false;
        }
        gl7 gl7Var = (gl7) obj;
        return Intrinsics.d(this.f11476a, gl7Var.f11476a) && Intrinsics.d(this.b, gl7Var.b) && this.c == gl7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f11476a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("ShowPushSnackBar(title=", this.f11476a, ", subtitle=", this.b, ", icon="));
    }
}
