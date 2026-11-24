package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class v7c0 implements b8c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36917a;
    public final String b;
    public final int c;

    public v7c0(int i, String str, String str2) {
        str2.getClass();
        this.f36917a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7c0)) {
            return false;
        }
        v7c0 v7c0Var = (v7c0) obj;
        return this.f36917a.equals(v7c0Var.f36917a) && Intrinsics.d(this.b, v7c0Var.b) && this.c == v7c0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f36917a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("Active(id=", this.f36917a, ", title=", this.b, ", icon="));
    }
}
