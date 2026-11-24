package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19715a;
    public final pao0 b;

    public lao0(List list, pao0 pao0Var) {
        list.getClass();
        this.f19715a = list;
        this.b = pao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lao0)) {
            return false;
        }
        lao0 lao0Var = (lao0) obj;
        return Intrinsics.d(this.f19715a, lao0Var.f19715a) && this.b == lao0Var.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.f19715a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "TabBarDSModel(tabs=" + this.f19715a + ", type=" + this.b + ", colors=null)";
    }
}
