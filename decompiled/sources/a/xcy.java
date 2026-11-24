package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xcy extends jdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40670a;
    public final ugi0 b;
    public final String c;

    public xcy(Object obj, boolean z, ugi0 ugi0Var) {
        obj.getClass();
        this.f40670a = z;
        this.b = ugi0Var;
        this.c = obj.toString();
        if (ugi0Var == null || ugi0Var.isInline()) {
            return;
        }
        jf4.o("Failed requirement.");
        throw null;
    }

    @Override // a.jdy
    public final String b() {
        return this.c;
    }

    @Override // a.jdy
    public final boolean c() {
        return this.f40670a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xcy.class != obj.getClass()) {
            return false;
        }
        xcy xcyVar = (xcy) obj;
        return this.f40670a == xcyVar.f40670a && Intrinsics.d(this.c, xcyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.f40670a) * 31);
    }

    @Override // a.jdy
    public final String toString() {
        boolean z = this.f40670a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        wsm0.a(str, sb);
        return sb.toString();
    }
}
