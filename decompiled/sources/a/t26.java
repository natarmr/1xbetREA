package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t26 implements v26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33201a;
    public final boolean b;

    public t26(List list, boolean z) {
        list.getClass();
        this.f33201a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t26)) {
            return false;
        }
        t26 t26Var = (t26) obj;
        return Intrinsics.d(this.f33201a, t26Var.f33201a) && this.b == t26Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f33201a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(data=" + this.f33201a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
