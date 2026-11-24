package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20409a;
    public final boolean b;

    public lov0(Object obj, boolean z) {
        this.f20409a = obj;
        this.b = z;
    }

    public static lov0 a(lov0 lov0Var, Object obj, boolean z, int i) {
        if ((i & 1) != 0) {
            obj = lov0Var.f20409a;
        }
        if ((i & 2) != 0) {
            z = lov0Var.b;
        }
        lov0Var.getClass();
        return new lov0(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lov0)) {
            return false;
        }
        lov0 lov0Var = (lov0) obj;
        return Intrinsics.d(this.f20409a, lov0Var.f20409a) && this.b == lov0Var.b;
    }

    public final int hashCode() {
        Object obj = this.f20409a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.f20409a);
        sb.append(", isForWarningOnly=");
        return brm0.o(sb, this.b, ')');
    }
}
