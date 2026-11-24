package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class da8 implements ha8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5734a;
    public final Object b;
    public final boolean c;

    public da8(Object obj, Object obj2, boolean z) {
        this.f5734a = obj;
        this.b = obj2;
        this.c = z;
    }

    public static da8 b(da8 da8Var, Object obj) {
        Object obj2 = da8Var.f5734a;
        boolean z = da8Var.c;
        da8Var.getClass();
        return new da8(obj2, obj, z);
    }

    @Override // a.ha8
    public final Object a() {
        return this.f5734a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da8)) {
            return false;
        }
        da8 da8Var = (da8) obj;
        return Intrinsics.d(this.f5734a, da8Var.f5734a) && Intrinsics.d(this.b, da8Var.b) && this.c == da8Var.c;
    }

    public final int hashCode() {
        Object obj = this.f5734a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithContent(config=");
        sb.append(this.f5734a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", refreshable=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
