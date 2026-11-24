package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x56 implements y56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0l0 f40298a;
    public final String b;

    public x56(l0l0 l0l0Var, String str) {
        str.getClass();
        this.f40298a = l0l0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x56)) {
            return false;
        }
        x56 x56Var = (x56) obj;
        return Intrinsics.d(this.f40298a, x56Var.f40298a) && Intrinsics.d(this.b, x56Var.b);
    }

    @Override // a.a2n
    public final String getKey() {
        return this.f40298a + this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40298a.hashCode() * 31);
    }

    public final String toString() {
        return "Shimmer(type=" + this.f40298a + ", id=" + this.b + Separators.RPAREN;
    }

    public /* synthetic */ x56(l0l0 l0l0Var) {
        this(l0l0Var, axq.g());
    }
}
