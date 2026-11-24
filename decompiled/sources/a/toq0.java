package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class toq0 extends uoq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34298a;
    public final String b;

    public toq0(List list, String str) {
        list.getClass();
        str.getClass();
        this.f34298a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toq0)) {
            return false;
        }
        toq0 toq0Var = (toq0) obj;
        return Intrinsics.d(this.f34298a, toq0Var.f34298a) && Intrinsics.d(this.b, toq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34298a.hashCode() * 31);
    }

    public final String toString() {
        return "Tips(tipsItemList=" + this.f34298a + ", acceptButton=" + this.b + Separators.RPAREN;
    }
}
