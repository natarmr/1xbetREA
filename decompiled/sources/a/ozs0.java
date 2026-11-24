package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ozs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hzs0 f26114a;
    public final fay b;

    public ozs0(hzs0 hzs0Var, fay fayVar) {
        hzs0Var.getClass();
        fayVar.getClass();
        this.f26114a = hzs0Var;
        this.b = fayVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ozs0)) {
            return false;
        }
        ozs0 ozs0Var = (ozs0) obj;
        return Intrinsics.d(ozs0Var.f26114a, this.f26114a) && Intrinsics.d(ozs0Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.f26114a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f26114a + ", typeAttr=" + this.b + ')';
    }
}
