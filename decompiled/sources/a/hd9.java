package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hd9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12859a;
    public final List b;
    public final List c;

    public hd9(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f12859a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd9)) {
            return false;
        }
        hd9 hd9Var = (hd9) obj;
        return Intrinsics.d(this.f12859a, hd9Var.f12859a) && Intrinsics.d(this.b, hd9Var.b) && Intrinsics.d(this.c, hd9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f12859a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("BuiltPicker(wheels=", ", dateOrder=", this.f12859a, ", timeOrder=", this.b), this.c, Separators.RPAREN);
    }
}
