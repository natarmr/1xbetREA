package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class go3 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11610a;
    public final int b;
    public final int c;

    public go3(int i, int i2, int i3) {
        this.f11610a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(go3 go3Var) {
        go3Var.getClass();
        int iE = Intrinsics.e(this.f11610a, go3Var.f11610a);
        return (iE == 0 && (iE = Intrinsics.e(this.b, go3Var.b)) == 0) ? Intrinsics.e(this.c, go3Var.c) : iE;
    }

    public final boolean equals(Object obj) {
        return toString().equals(String.valueOf(obj));
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f11610a + Separators.DOT + this.b + Separators.DOT + this.c;
    }
}
