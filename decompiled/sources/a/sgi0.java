package a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class sgi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntRange f32162a;
    public final ar20 b;

    public sgi0(IntRange intRange, ar20 ar20Var) {
        ar20Var.getClass();
        this.f32162a = intRange;
        this.b = ar20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgi0)) {
            return false;
        }
        sgi0 sgi0Var = (sgi0) obj;
        return this.f32162a.equals(sgi0Var.f32162a) && Intrinsics.d(this.b, sgi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32162a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(range=" + this.f32162a + ", type=" + this.b + ')';
    }
}
