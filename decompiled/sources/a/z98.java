package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z98 implements ba8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44005a;
    public final Object b;

    public z98(Object obj, String str) {
        this.f44005a = obj;
        this.b = str;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f44005a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z98)) {
            return false;
        }
        z98 z98Var = (z98) obj;
        return Intrinsics.d(this.f44005a, z98Var.f44005a) && Intrinsics.d(this.b, z98Var.b);
    }

    public final int hashCode() {
        Object obj = this.f44005a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "WithContent(config=" + this.f44005a + ", content=" + this.b + Separators.RPAREN;
    }
}
