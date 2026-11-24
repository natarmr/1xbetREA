package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v9v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37054a;
    public final int b;
    public final Boolean c;

    public v9v0(int i, Boolean bool, List list) {
        list.getClass();
        this.f37054a = list;
        this.b = i;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9v0)) {
            return false;
        }
        v9v0 v9v0Var = (v9v0) obj;
        return Intrinsics.d(this.f37054a, v9v0Var.f37054a) && this.b == v9v0Var.b && Intrinsics.d(this.c, v9v0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f37054a.hashCode() * 31, 31);
        Boolean bool = this.c;
        return (iA + (bool == null ? 0 : bool.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelData(entries=");
        sb.append(this.f37054a);
        sb.append(", initialBaseIndex=");
        sb.append(this.b);
        sb.append(", isInfinity=");
        return defpackage.c.e(sb, this.c, ", onSettled=null)");
    }
}
