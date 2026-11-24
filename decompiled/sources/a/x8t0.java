package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x8t0 implements z8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40479a;
    public final cpm b;

    public x8t0(String str, cpm cpmVar) {
        str.getClass();
        this.f40479a = str;
        this.b = cpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8t0)) {
            return false;
        }
        x8t0 x8t0Var = (x8t0) obj;
        return Intrinsics.d(this.f40479a, x8t0Var.f40479a) && this.b.equals(x8t0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f40479a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40479a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(key=" + this.f40479a + ", model=" + this.b + Separators.RPAREN;
    }
}
