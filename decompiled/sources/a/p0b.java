package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p0b implements r0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26140a;
    public final a4x b;

    public p0b(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f26140a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0b)) {
            return false;
        }
        p0b p0bVar = (p0b) obj;
        return Intrinsics.d(this.f26140a, p0bVar.f26140a) && Intrinsics.d(this.b, p0bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26140a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("Content(title=", this.f26140a, ", items=", this.b, Separators.RPAREN);
    }
}
